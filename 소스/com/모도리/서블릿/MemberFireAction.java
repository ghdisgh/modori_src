package com.modori.servlet;

import com.modori.model.AdminDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberFireAction implements Action {
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String page = "declareAdmin.jsp";
		int reporter_stu_num = Integer.parseInt(request.getParameter("reporter_stu_num"));
		if ((new AdminDAO()).delete(reporter_stu_num)) {
			request.setAttribute("studentFireData", (new AdminDAO()).studentFireCon());
			request.setAttribute("studentFireCalData", (new AdminDAO()).studentFireCalCon());
			page = "memberFireAdmin.jsp";
		}

		page = "memberFireAdmin.jsp";
		return page;
	}
}