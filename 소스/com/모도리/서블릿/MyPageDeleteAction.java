package com.modori.servlet;

import com.modori.model.MyPageDAO;
import com.modori.model.MyPagePurchaseDAO;
import com.modori.model.MypageProductDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MyPageDeleteAction implements Action {
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String page = "myPageEnrollPurchase.jsp";
		int num = Integer.parseInt(request.getParameter("number"));
		HttpSession session = request.getSession(true);
		int id = (Integer) session.getAttribute("loginOK");
		if (num >= 11900001 && num < 21900001) {
			request.setAttribute("myPageProductDeleteData", (new MyPagePurchaseDAO()).myPageProductDelete(num));
			request.setAttribute("myData", (new MyPageDAO()).myPageCon(id));
			request.setAttribute("enrollProductData", (new MypageProductDAO()).enrollProductCon(id));
			request.setAttribute("enrollGroupData", (new MypageProductDAO()).enrollGroupCon(id));
		} else if (num >= 51900001 && num < 61900001) {
			request.setAttribute("myPageGroupDeleteData", (new MyPagePurchaseDAO()).myPageGroupDelete(num));
			request.setAttribute("myData", (new MyPageDAO()).myPageCon(id));
			request.setAttribute("enrollProductData", (new MypageProductDAO()).enrollProductCon(id));
			request.setAttribute("enrollGroupData", (new MypageProductDAO()).enrollGroupCon(id));
		} else if (num >= 71900001 && num < 81900001) {
			request.setAttribute("myPageAuctionDeleteData", (new MyPagePurchaseDAO()).myPageAuctionDelete(num));
			request.setAttribute("myData", (new MyPageDAO()).myPageCon(id));
			request.setAttribute("enrollProductData", (new MypageProductDAO()).enrollProductCon(id));
			request.setAttribute("enrollGroupData", (new MypageProductDAO()).enrollGroupCon(id));
		}

		page = "enrollProduct.jsp";
		return page;
	}
}