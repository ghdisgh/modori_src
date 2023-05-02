package com.modori.servlet;

import com.modori.model.DeclareDAO;
import com.modori.model.MyPageDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DeclareBazaarEnrollAction implements Action {
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String page = "declare.jsp";
		HttpSession session = request.getSession(true);
		int id = (Integer) session.getAttribute("loginOK");
		int student_num_bazaar = Integer.parseInt(request.getParameter("student_num_bazaar"));
		String bazaar_name = new String(request.getParameter("bazaar_name").getBytes("8859_1"), "UTF-8");
		String comment = new String(request.getParameter("comment").getBytes("8859_1"), "UTF-8");
		if ((new DeclareDAO()).declareBazaar(id, student_num_bazaar, bazaar_name, comment)) {
			request.setAttribute("myData", (new MyPageDAO()).myPageCon(id));
			request.setAttribute("declareListData", (new DeclareDAO()).declareListCon(id));
			page = "myPageDeclareList.jsp";
		}

		return page;
	}
}