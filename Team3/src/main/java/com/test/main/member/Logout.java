package com.test.main.member;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/member/logout.do")
public class Logout extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
				
		HttpSession session = req.getSession();
		
		session.removeAttribute("id");
		session.removeAttribute("name");
		session.removeAttribute("grade");
		session.removeAttribute("mileage");
		
		
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/member/logout.jsp");
		dispatcher.forward(req, resp);
	}
}

