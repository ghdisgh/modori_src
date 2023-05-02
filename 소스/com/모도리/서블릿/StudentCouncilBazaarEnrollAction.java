package com.modori.servlet;

import com.modori.model.StudentCouncilDAO;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentCouncilBazaarEnrollAction implements Action {
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String page = "studentBazaarEnroll.jsp";
		String name = new String(request.getParameter("name").getBytes("8859_1"), "UTF-8");
		String bank = new String(request.getParameter("bank").getBytes("8859_1"), "UTF-8");
		String account = new String(request.getParameter("account").getBytes("8859_1"), "UTF-8");
		String date1 = request.getParameter("startDate");
		String date2 = request.getParameter("endDate");
		SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date startDate = null;
		Date endDate = null;

		try {
			startDate = transFormat.parse(date1);
			endDate = transFormat.parse(date2);
		} catch (ParseException var13) {
			page = "studentBazaarInfoAdmin.jsp";
			var13.printStackTrace();
		}

		if ((new StudentCouncilDAO()).studentBazzarEnroll(name, bank, account, startDate, endDate)) {
			request.setAttribute("bazaarInfoData", (new StudentCouncilDAO()).bazaarInfoCon());
			page = "studentBazaarInfoAdmin.jsp";
		}

		return page;
	}
}