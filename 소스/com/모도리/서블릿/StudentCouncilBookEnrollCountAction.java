package com.modori.servlet;

import com.modori.model.StudentCouncilDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentCouncilBookEnrollCountAction implements Action {
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String page = "studentAdmin.jsp";
		request.setAttribute("bookEnrollInfoData", (new StudentCouncilDAO()).studentBookEnrollInfoCon());
		request.setAttribute("bookEnrollInfoCalData", (new StudentCouncilDAO()).studentBookEnrollInfoCalCon());
		page = "studentBookEnrollCountAdmin.jsp";
		return page;
	}
}