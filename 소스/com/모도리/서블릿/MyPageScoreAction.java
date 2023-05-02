package com.modori.servlet;

import com.modori.model.MyPagePurchaseDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyPageScoreAction implements Action {
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String page = "myPage.jsp";
		int num = Integer.parseInt(request.getParameter("number"));
		int sellerId = Integer.parseInt(request.getParameter("sellerId"));
		int score = Integer.parseInt(request.getParameter("rating"));
		System.out.println(sellerId);
		if (num >= 11900001 && num < 21900001) {
			request.setAttribute("myPageProductScoreData", (new MyPagePurchaseDAO()).myPageProductScoreCon(score, num));
			request.setAttribute("myPageProductAvgScoreData",
					(new MyPagePurchaseDAO()).myPageProductAvgScoreCon(sellerId));
			request.setAttribute("myPageBuyProductData", (new MyPagePurchaseDAO()).myPageBuyProductCon(num));
			request.setAttribute("myPageBuyBazaarData", (new MyPagePurchaseDAO()).myPageBuyBazaarCon(num));
		} else if (num >= 21900001 && num < 31900001) {
			request.setAttribute("myPageBazaarScoreData", (new MyPagePurchaseDAO()).myPageBazaarScoreCon(score, num));
			request.setAttribute("myPageBazaarAvgScoreData",
					(new MyPagePurchaseDAO()).myPageBazaarAvgScoreCon(sellerId));
			request.setAttribute("myPageBuyProductData", (new MyPagePurchaseDAO()).myPageBuyProductCon(num));
			request.setAttribute("myPageBuyBazaarData", (new MyPagePurchaseDAO()).myPageBuyBazaarCon(num));
		}

		page = "myPageBuyPurchase.jsp";
		return page;
	}
}