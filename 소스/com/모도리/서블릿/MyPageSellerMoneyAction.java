package com.modori.servlet;

import com.modori.model.MyPagePurchaseDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyPageSellerMoneyAction implements Action {
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String page = "myPageEnrollPurchase.jsp";
		int num = Integer.parseInt(request.getParameter("number"));
		if (num >= 11900001 && num < 21900001) {
			request.setAttribute("myPageProductMoneyData", (new MyPagePurchaseDAO()).myPageProductMoneyCon(num));
			request.setAttribute("myPageEnrollProductData", (new MyPagePurchaseDAO()).myPageEnrollProductCon(num));
			request.setAttribute("myPageEnrollGroupData", (new MyPagePurchaseDAO()).myPageEnrollGroupCon(num));
		}

		page = "myPageEnrollPurchase.jsp";
		return page;
	}
}