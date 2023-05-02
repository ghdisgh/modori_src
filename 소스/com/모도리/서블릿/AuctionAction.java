package com.modori.servlet;

import com.modori.model.AuctionDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuctionAction implements Action {
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String page = "main.jsp";
		request.setAttribute("auctionData", (new AuctionDAO()).auctionCon());
		page = "auction.jsp";
		return page;
	}
}