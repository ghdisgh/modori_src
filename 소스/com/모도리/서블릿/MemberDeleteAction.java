package com.modori.servlet;

import com.modori.model.MemberDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MemberDeleteAction implements Action {
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String page = "memberDelete.jsp";
		HttpSession session = request.getSession(true);
		int id = (Integer) session.getAttribute("loginOK");
		String pw = request.getParameter("pw");
		if ((new MemberDAO()).delete(pw, id)) {
			page = "login.jsp";
		} else {
			page = "memberDelete.jsp";
		}

		return page;
	}
}