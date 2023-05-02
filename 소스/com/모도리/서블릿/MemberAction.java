package com.modori.servlet;

import com.modori.model.MemberDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberAction implements Action {
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String page = "login.jsp";
		String name = new String(request.getParameter("name").getBytes("8859_1"), "UTF-8");
		String number = request.getParameter("number");
		String pw = request.getParameter("pw").trim();
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String department = new String(request.getParameter("department").getBytes("8859_1"), "UTF-8");
		String bank = new String(request.getParameter("bank").getBytes("8859_1"), "UTF-8");
		String bankNumber = request.getParameter("bankNumber");
		System.out.println(name);
		if ((new MemberDAO()).member(number, pw, name, phone, email, department, bank, bankNumber)) {
			page = "login.jsp";
		}

		return page;
	}
}