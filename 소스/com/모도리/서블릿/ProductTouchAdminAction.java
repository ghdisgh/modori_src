package com.modori.servlet;

import com.modori.model.AdminDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProductTouchAdminAction implements Action {
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String page = "admin.jsp";
		request.setAttribute("touchData", (new AdminDAO()).touchCon());
		page = "productTouchAdmin.jsp";
		return page;
	}
}