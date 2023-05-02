package com.modori.servlet;

import com.modori.model.AuctionDAO;
import com.modori.model.BazaarDAO;
import com.modori.model.GroupBuyingDAO;
import com.modori.model.ProductDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeclareAction implements Action {
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String page = "main.jsp";
		int num = Integer.parseInt(request.getParameter("number"));
		if (num >= 11900001 && num < 21900001) {
			request.setAttribute("detailData", (new ProductDAO()).productPurchaseCon(num));
			page = "declareProduct.jsp";
		} else if (num >= 21900001 && num < 31900001) {
			request.setAttribute("bazaarDetailData", (new BazaarDAO()).bazaarPurchaseCon(num));
			page = "declareBazaar.jsp";
		} else if (num >= 51900001 && num < 61900001) {
			request.setAttribute("groupDetailData", (new GroupBuyingDAO()).groupPurchaseCon(num));
			page = "declareGroupBuying.jsp";
		} else if (num >= 71900001 && num < 81900001) {
			request.setAttribute("auctionDetailData", (new AuctionDAO()).auctionPurchaseCon(num));
			page = "declareAuction.jsp";
		}

		return page;
	}
}