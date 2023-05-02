package com.modori.servlet;

import com.modori.model.FindUpdateDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FindUpdate2Action implements Action {
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String page = "find3.jsp";
		HttpSession session = request.getSession(true);
		int id = (Integer) session.getAttribute("findOK");
		String pw = request.getParameter("pw");
		if ((new FindUpdateDAO()).update(pw, id)) {
			page = "login.jsp";
		}

		return page;
	}
}