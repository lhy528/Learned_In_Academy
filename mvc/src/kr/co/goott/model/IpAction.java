package kr.co.goott.model;

import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.goott.action.Action;

public class IpAction implements Action{
	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		try {
			req.setAttribute("ip", InetAddress.getLocalHost().getHostAddress());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "/ip.jsp";
	}
}
