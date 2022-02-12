package com.test.main.healthcare;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/healthcare/chart.do")
public class test extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 멤버시퀀스, 시작날짜, 끝날짜를 주고 그 멤버의 날짜사이 데이터를 리턴한다
		String start = req.getParameter("start"); 	//2022-01-10
		String end = req.getParameter("end");		//2022-01-28
//		String start = "2022-01-10";	//2022-01-10
//		String end = "2022-01-28";		//2022-01-28
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

		LocalDate dBefore = LocalDate.parse(start, DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate dAfter = LocalDate.parse(end, DateTimeFormatter.ISO_LOCAL_DATE);

        //날짜차이 diff
        long diff = dBefore.until(dAfter,ChronoUnit.DAYS);
        
        
        
        
		
		
		
		
		
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/healthcare/chart.jsp");
		dispatcher.forward(req, resp);

	}

}