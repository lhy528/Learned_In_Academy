package kr.co.goott.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Action {
	public String execute(HttpServletRequest req, HttpServletResponse resp);
}

// controller : Mycontroller2.java - mc2.do

/*
 * kr.co.goott.model Model : 현재 시각, ip를 각각 페이지에서 출력할 수 있도록 view : time.jsp,
 * ip.jsp에서 그 결과를 출력
 */
