package com.modori.servlet;

import com.modori.model.MyPagePurchaseDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyPageEnrollPurchaseAction implements Action {
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String page = "myPage.jsp";
		int num = Integer.parseInt(request.getParameter("number"));
		System.out.println(num);
		request.setAttribute("myPageEnrollProductData", (new MyPagePurchaseDAO()).myPageEnrollProductCon(num));
		request.setAttribute("myPageEnrollGroupData", (new MyPagePurchaseDAO()).myPageEnrollGroupCon(num));
		request.setAttribute("myPageEnrollAuctionData", (new MyPagePurchaseDAO()).myPageEnrollAuctionCon(num));
		page = "myPageEnrollPurchase.jsp";
		return page;
	}
}