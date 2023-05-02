package com.modori.servlet;

import com.modori.model.AuctionDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AuctionEnrollAction implements Action {
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String page = "auction.jsp";
		HttpSession session = request.getSession(true);
		int stu_enroll_num = (Integer) session.getAttribute("loginOK");
		String comment = new String(request.getParameter("comment").getBytes("8859_1"), "UTF-8");
		String kakao = new String(request.getParameter("kakao").getBytes("8859_1"), "UTF-8");
		if ((new AuctionDAO()).auction(stu_enroll_num, comment, kakao)) {
			request.setAttribute("auctionData", (new AuctionDAO()).auctionCon());
			page = "auction.jsp";
		}

		return page;
	}
}