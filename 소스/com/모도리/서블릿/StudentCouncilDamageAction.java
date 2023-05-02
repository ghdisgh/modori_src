package com.modori.servlet;

import com.modori.model.StudentCouncilDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentCouncilDamageAction implements Action {
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String page = "studentDamageAdmin.jsp";
		int num = Integer.parseInt(request.getParameter("number"));
		if (num == 1) {
			request.setAttribute("bookDamageData", (new StudentCouncilDAO()).studentBookDamageCon());
			request.setAttribute("bookDamageCalData", (new StudentCouncilDAO()).studentBookDamageCalCon());
		} else {
			request.setAttribute("bazaarData", (new StudentCouncilDAO()).studentBookUpdateCon(num));
			request.setAttribute("bookDamageData", (new StudentCouncilDAO()).studentBookDamageCon());
			request.setAttribute("bookDamageCalData", (new StudentCouncilDAO()).studentBookDamageCalCon());
		}

		page = "studentDamageAdmin.jsp";
		return page;
	}
}