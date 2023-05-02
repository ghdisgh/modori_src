package com.modori.servlet;

import com.modori.model.MyPageDAO;
import com.modori.model.MypageProductDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class BuyProductAction implements Action {
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String page = "mypage.jsp";
		HttpSession session = request.getSession(true);
		int id = (Integer) session.getAttribute("loginOK");
		request.setAttribute("myData", (new MyPageDAO()).myPageCon(id));
		request.setAttribute("buyProductData", (new MypageProductDAO()).buyProductCon(id));
		request.setAttribute("buyBazaarData", (new MypageProductDAO()).buyBazaarCon(id));
		page = "buyProduct.jsp";
		return page;
	}
}