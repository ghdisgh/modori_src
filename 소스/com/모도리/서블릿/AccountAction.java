package com.modori.servlet;

import com.modori.model.AccountDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AccountAction implements Action {
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String page = "account.jsp";
		HttpSession session = request.getSession(true);
		int id = (Integer) session.getAttribute("loginOK");
		int num = Integer.parseInt(request.getParameter("number"));
		System.out.println(num);
		if (num >= 11900001 && num < 21900001) {
			request.setAttribute("buyPData", (new AccountDAO()).accountP(id, num));
		} else if (num >= 21900001 && num < 31900001) {
			request.setAttribute("buyBData", (new AccountDAO()).accountB(id, num));
		}

		page = "account.jsp";
		return page;
	}
}