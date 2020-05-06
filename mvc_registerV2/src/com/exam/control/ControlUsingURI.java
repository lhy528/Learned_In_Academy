package com.exam.control;

import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.exam.handler.Action;
import com.exam.handler.NullHandler;

public class ControlUsingURI extends HttpServlet{
	// <커맨드, 핸들러인스턴스> 매핑 정보 저장
	private Map<String, Action> cmdHandlerMap = new HashMap<String, Action>();
	
	@Override
	public void init() throws ServletException {
		String configFile = getInitParameter("configFile"); // 매칭정보 들어가있는 파일이름
		Properties prop = new Properties();
		
		String configFilePath = getServletContext().getRealPath(configFile);
		try {
			FileReader fis = new FileReader(configFilePath);
			prop.load(fis);
		} catch (IOException e) {
			throw new ServletException(e);
		} 
		
		Iterator keyIter = prop.keySet().iterator(); // 반복자를 만들어놓는다
		while(keyIter.hasNext()) {
			String cmd = (String)keyIter.next();
			String handlerClassName = prop.getProperty(cmd);
			
			try {
				Class handlerClass = Class.forName(handlerClassName);
				Action handlerInstance = 
						(Action)handlerClass.newInstance();
				
				cmdHandlerMap.put(cmd, handlerInstance);
				
			} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
				e.printStackTrace();
			}
		}
	} // init() end
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doProcess(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doProcess(req, resp);
	}
	
	private void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String command = req.getRequestURI();
		if(command.indexOf(req.getContextPath())==0) {
			command = command.substring(req.getContextPath().length());
		}
		
		Action handler = cmdHandlerMap.get(command);
		if(handler == null) {
			handler = new NullHandler();
		}
		String viewPage = null;
		
		try {
			viewPage = handler.process(req, resp);
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}
		
		if(viewPage != null) {
			RequestDispatcher rd = req.getRequestDispatcher(viewPage);
			rd.forward(req, resp);
		}
	} // doProcess() end
}
