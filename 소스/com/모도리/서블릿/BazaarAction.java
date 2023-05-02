package com.modori.servlet;

import com.modori.model.BazaarDAO;
import com.modori.model.BookDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BazaarAction implements Action {
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String page = "main.jsp";
		request.setAttribute("bazaarData", (new BazaarDAO()).bazaarCon());
		request.setAttribute("bookData", (new BookDAO()).bookCon());
		page = "book.jsp";
		return page;
	}
}