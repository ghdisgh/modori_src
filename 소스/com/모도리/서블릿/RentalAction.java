package com.modori.servlet;

import com.modori.model.BookDAO;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RentalAction implements Action {
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String page = "rentalBook.jsp";
		int num = Integer.parseInt(request.getParameter("number"));
		HttpSession session = request.getSession(true);
		int stu_num = (Integer) session.getAttribute("loginOK");
		String today = (new SimpleDateFormat("yyyy-MM-dd")).format(new Date());
		SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date rental_date = null;

		try {
			rental_date = transFormat.parse(today);
		} catch (ParseException var12) {
			page = "rentalBook.jsp";
			var12.printStackTrace();
		}

		Calendar cal = Calendar.getInstance();
		cal.setTime(rental_date);
		cal.add(5, 14);
		Date return_date = cal.getTime();
		if ((new BookDAO()).rentalEnroll(num, stu_num, rental_date, return_date)) {
			request.setAttribute("rentalUpdateData", (new BookDAO()).rentalBookUpdateCon(num));
			page = "rentalBook.jsp";
		}

		request.setAttribute("bookData", (new BookDAO()).rentalBookCon(num));
		request.setAttribute("rentalBookData", (new BookDAO()).rentalBookingCon(num));
		return page;
	}
}