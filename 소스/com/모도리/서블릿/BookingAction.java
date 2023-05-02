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

public class BookingAction implements Action {
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String page = "rentalBook.jsp";
		int num = Integer.parseInt(request.getParameter("number"));
		HttpSession session = request.getSession(true);
		int stu_num = (Integer) session.getAttribute("loginOK");
		String date = request.getParameter("rental_date");
		SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date rental_date = null;

		try {
			rental_date = transFormat.parse(date);
		} catch (ParseException var12) {
			page = "rentalBook.jsp";
			var12.printStackTrace();
		}

		Calendar cal = Calendar.getInstance();
		cal.setTime(rental_date);
		cal.add(5, 14);
		Date return_date = cal.getTime();
		if ((new BookDAO()).bookingEnroll(num, stu_num, rental_date, return_date)) {
			request.setAttribute("bookUpdateData", (new BookDAO()).bookUpdateCon(num));
			page = "rentalBook.jsp";
		}

		request.setAttribute("bookData", (new BookDAO()).rentalBookCon(num));
		request.setAttribute("rentalBookData", (new BookDAO()).rentalBookingCon(num));
		return page;
	}
}