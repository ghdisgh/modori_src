package com.modori.servlet;

import com.modori.model.SearchDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SearchAction implements Action {
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String word = new String(request.getParameter("word").getBytes("8859_1"), "UTF-8");
		HttpSession session = request.getSession(true);
		session.setAttribute("word", word);
		String category1 = request.getParameter("category1");
		String category2 = request.getParameter("category2");
		System.out.println(category1 + "/" + category2);
		if (category2 == null) {
			request.setAttribute("search", (new SearchDAO()).searchCategory(word));
		} else {
			request.setAttribute("searchProductData",
					(new SearchDAO()).searchProduct(word, Integer.parseInt(category2)));
			request.setAttribute("searchBazaarData", (new SearchDAO()).searchBazaar(word));
			request.setAttribute("searchGroupData", (new SearchDAO()).searchGroup(word));
		}

		String page = "search.jsp";
		return page;
	}
}