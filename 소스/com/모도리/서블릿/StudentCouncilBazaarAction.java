package com.modori.servlet;

import com.modori.model.StudentCouncilDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentCouncilBazaarAction implements Action {
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String page = "studentAdmin.jsp";
		int num = Integer.parseInt(request.getParameter("number"));
		request.setAttribute("bazaarData", (new StudentCouncilDAO()).studentBazaarInfoCon(num));
		request.setAttribute("bazaarCalData", (new StudentCouncilDAO()).studentBazaarInfoCalCon(num));
		page = "studentBazaarAdmin.jsp";
		return page;
	}
}