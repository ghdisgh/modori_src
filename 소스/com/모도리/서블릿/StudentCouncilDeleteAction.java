package com.modori.servlet;

import com.modori.model.StudentCouncilDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentCouncilDeleteAction implements Action {
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String page = "studentBookEnrollCountAdmin.jsp";
		int num = Integer.parseInt(request.getParameter("info_num"));
		int num2 = Integer.parseInt(request.getParameter("number"));
		if (num != 0 && num2 >= 21900001 && num2 < 31900001) {
			request.setAttribute("bazaarDeleteData", (new StudentCouncilDAO()).studentbazaarDeleteCon(num2));
			request.setAttribute("bazaarData", (new StudentCouncilDAO()).studentBazaarInfoCon(num));
			request.setAttribute("bazaarCalData", (new StudentCouncilDAO()).studentBazaarInfoCalCon(num));
			page = "studentBazaarAdmin.jsp";
		} else if (num == 0 && num2 >= 31900001 && num2 < 41900001) {
			request.setAttribute("bookDeleteData", (new StudentCouncilDAO()).studentBookEnrollDeleteCon(num2));
			request.setAttribute("bookEnrollInfoData", (new StudentCouncilDAO()).studentBookEnrollInfoCon());
			request.setAttribute("bookEnrollInfoCalData", (new StudentCouncilDAO()).studentBookEnrollInfoCalCon());
			page = "studentBookEnrollCountAdmin.jsp";
		}

		return page;
	}
}