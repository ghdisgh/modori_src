package com.modori.servlet;

import com.modori.model.BazaarDAO;
import com.modori.model.GroupBuyingDAO;
import com.modori.model.ProductDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainAction implements Action {
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("productData", (new ProductDAO()).productCon());
		request.setAttribute("bazaarData", (new BazaarDAO()).bazaarCon());
		request.setAttribute("groupBuyingData", (new GroupBuyingDAO()).groupCon());
		String page = "main.jsp";
		return page;
	}
}