package com.modori.servlet;

import com.modori.model.StudentCouncilDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentCouncilBazaarInfoUpdateAction implements Action {
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String page = "studentBazaarInfoAdmin.jsp";
		int num = Integer.parseInt(request.getParameter("number"));
		request.setAttribute("bazaarInfoUpdateData", (new StudentCouncilDAO()).bazaarInfoUpdateCon(num));
		page = "studentBazaarInfoUpdateAdmin.jsp";
		return page;
	}
}