package com.modori.servlet;

import com.modori.model.BookDAO;
import com.modori.model.MyPageDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class BookingCancleAction implements Action {
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String page = "myPageReturnBook.jsp";
		HttpSession session = request.getSession(true);
		int id = (Integer) session.getAttribute("loginOK");
		int num = Integer.parseInt(request.getParameter("number"));
		int num2 = Integer.parseInt(request.getParameter("number2"));
		request.setAttribute("bookCancleData", (new BookDAO()).bookCancleCon(num));
		request.setAttribute("updateBookEnrollData", (new BookDAO()).updateBookEnrollCon(num2));
		request.setAttribute("myData", (new MyPageDAO()).myPageCon(id));
		request.setAttribute("myRentalBookData", (new BookDAO()).myRentalBookCon(id));
		page = "myPageBook.jsp";
		return page;
	}
}