package com.modori.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.modori.model.AdminDAO;

public class MemberInfoAction implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page = "declareAdmin.jsp";
		int reporter_stu_num = Integer.parseInt(request.getParameter("reporter_stu_num"));
		System.out.println(reporter_stu_num);
		request.setAttribute("memberInfoData", (new AdminDAO()).memberInfoCon(reporter_stu_num));
		page = "memberInfoAdmin.jsp";
		return page;
	}

}
