package com.modori.servlet;

import com.modori.model.ProductDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProductAction implements Action {
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String page = "main.jsp";
		request.setAttribute("productData", (new ProductDAO()).productCon());
		page = "product.jsp";
		return page;
	}
}