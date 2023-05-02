package com.modori.servlet;

import com.modori.model.AdminDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdminAction implements Action {
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("productCalData", (new AdminDAO()).productCalCon());
		request.setAttribute("touchData", (new AdminDAO()).touchCon());
		String page = "admin.jsp";
		return page;
	}
}