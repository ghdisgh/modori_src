package com.modori.servlet;

import com.modori.model.GroupBuyingDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GroupBuyingAction implements Action {
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String page = "main.jsp";
		request.setAttribute("groupBuyingData", (new GroupBuyingDAO()).groupCon());
		page = "groupBuying.jsp";
		return page;
	}
}