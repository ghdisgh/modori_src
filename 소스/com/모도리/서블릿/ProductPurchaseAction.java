package com.modori.servlet;

import com.modori.model.ProductDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProductPurchaseAction implements Action {
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String page = "product.jsp";
		int num = Integer.parseInt(request.getParameter("number"));
		System.out.println(num);
		request.setAttribute("detailData", (new ProductDAO()).productPurchaseCon(num));
		page = "productPurchase.jsp";
		return page;
	}
}