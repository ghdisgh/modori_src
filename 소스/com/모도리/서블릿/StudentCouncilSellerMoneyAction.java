package com.modori.servlet;

import com.modori.model.StudentCouncilDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentCouncilSellerMoneyAction implements Action {
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String page = "studentAdmin.jsp";
		int num = Integer.parseInt(request.getParameter("info_num"));
		int num2 = Integer.parseInt(request.getParameter("number"));
		if (num2 >= 21900001 && num2 < 31900001) {
			request.setAttribute("bazaarMoneyData", (new StudentCouncilDAO()).studentBazaarMoneyCon(num2));
			request.setAttribute("bazaarData", (new StudentCouncilDAO()).studentBazaarInfoCon(num));
			request.setAttribute("bazaarCalData", (new StudentCouncilDAO()).studentBazaarInfoCalCon(num));
		}

		page = "studentBazaarAdmin.jsp";
		return page;
	}
}