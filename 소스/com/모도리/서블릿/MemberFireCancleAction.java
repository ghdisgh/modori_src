package com.modori.servlet;

import com.modori.model.AdminDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberFireCancleAction implements Action {
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String page = "memberFireAdmin.jsp";
		int reporter_stu_num = Integer.parseInt(request.getParameter("reporter_stu_num"));
		request.setAttribute("fireCancleData", (new AdminDAO()).fireCancleDataCon(reporter_stu_num));
		request.setAttribute("declareData", (new AdminDAO()).declareCon());
		request.setAttribute("declareCalData", (new AdminDAO()).declareCalCon());
		page = "declareAdmin.jsp";
		return page;
	}
}