package com.modori.servlet;

import com.modori.model.StudentCouncilDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentAdminAction implements Action {
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("studentBazaarData", (new StudentCouncilDAO()).studentBazaarCon());
		request.setAttribute("bookInfoCalData", (new StudentCouncilDAO()).studentBookInfoCalCon());
		request.setAttribute("bookInfoCalData2", (new StudentCouncilDAO()).studentBookInfoCalCon2());
		String page = "studentAdmin.jsp";
		return page;
	}
}