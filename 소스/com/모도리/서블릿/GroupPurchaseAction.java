package com.modori.servlet;

import com.modori.model.GroupBuyingDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GroupPurchaseAction implements Action {
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String page = "groupBuying.jsp";
		int num = Integer.parseInt(request.getParameter("number"));
		System.out.println(num);
		request.setAttribute("groupDetailData", (new GroupBuyingDAO()).groupPurchaseCon(num));
		page = "groupPurchase.jsp";
		return page;
	}
}