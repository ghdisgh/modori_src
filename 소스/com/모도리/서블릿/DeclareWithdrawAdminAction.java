package com.modori.servlet;

import com.modori.model.AdminDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeclareWithdrawAdminAction implements Action {
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String page = "admin.jsp";
		request.setAttribute("studentFireData", (new AdminDAO()).studentFireCon());
		request.setAttribute("studentFireCalData", (new AdminDAO()).studentFireCalCon());
		page = "memberFireAdmin.jsp";
		return page;
	}
}