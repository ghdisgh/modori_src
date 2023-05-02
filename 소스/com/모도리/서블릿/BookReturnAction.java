package com.modori.servlet;

import com.modori.model.BookDAO;
import com.modori.model.StudentCouncilDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BookReturnAction implements Action {
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String page = "studentBookCountAdmin.jsp";
		int num = Integer.parseInt(request.getParameter("number"));
		int num2 = Integer.parseInt(request.getParameter("number2"));
		int condition = Integer.parseInt(request.getParameter("condition"));
		if (condition == 1) {
			request.setAttribute("bookReturnData", (new BookDAO()).bookReturnCon(num));
			request.setAttribute("updateBookEnrollData", (new BookDAO()).returnUpdateCon(num2));
		} else if(condition == 2) {
			request.setAttribute("bookReturnData", (new BookDAO()).bookReturnCon(num));
		}
		
		request.setAttribute("bookInfoData", (new StudentCouncilDAO()).studentBookInfoCon());
		request.setAttribute("bookInfoCalData", (new StudentCouncilDAO()).studentBookInfoCalCon());
		page = "studentBookCountAdmin.jsp";
		return page;
	}
}