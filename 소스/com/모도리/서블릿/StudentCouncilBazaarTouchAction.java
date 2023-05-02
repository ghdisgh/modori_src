package com.modori.servlet;

import com.modori.model.StudentCouncilDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentCouncilBazaarTouchAction implements Action {
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String page = "studentAdmin.jsp";
		request.setAttribute("studentBazaarData", (new StudentCouncilDAO()).studentBazaarCon());
		page = "studentBazaarTouchAdmin.jsp";
		return page;
	}
}