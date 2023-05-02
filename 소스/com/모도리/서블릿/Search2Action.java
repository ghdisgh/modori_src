package com.modori.servlet;

import com.modori.model.SearchDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Search2Action implements Action {
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String page = "search.jsp";
		HttpSession session = request.getSession(true);
		String word = (String) session.getAttribute("word");
		String category1 = request.getParameter("category1");
		String category2 = request.getParameter("category2");
		System.out.println(category1 + "/" + category2);
		request.setAttribute("searchProductData", (new SearchDAO()).searchProduct(word, Integer.parseInt(category2)));
		return page;
	}
}