package com.modori.servlet;

import com.modori.model.LoginDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FindUpdateAction implements Action {
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String page = "find.jsp";
		int id = Integer.parseInt(request.getParameter("id2"));
		String pw = request.getParameter("pw");
		if ((new LoginDAO()).login(id, pw)) {
			HttpSession session = request.getSession(true);
			session.setAttribute("findOK", id);
			page = "find3.jsp";
		}

		return page;
	}
}