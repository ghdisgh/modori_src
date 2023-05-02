package com.modori.servlet;

import com.modori.model.AdminDAO;
import com.modori.model.AuctionDAO;
import com.modori.model.BazaarDAO;
import com.modori.model.GroupBuyingDAO;
import com.modori.model.LoginDAO;
import com.modori.model.ProductDAO;
import com.modori.model.StudentCouncilDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginAction implements Action {
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String page = "error.jsp";
		int id = Integer.parseInt(request.getParameter("id"));
		String pw = request.getParameter("pw");
		if (id == 971617 && pw.equals("qwer1234")) {
			request.setAttribute("productCalData", (new AdminDAO()).productCalCon());
			request.setAttribute("touchData", (new AdminDAO()).touchCon());
			page = "admin.jsp";
		} else if (id == 1900430 && pw.equals("20191234")) {
			request.setAttribute("studentBazaarData", (new StudentCouncilDAO()).studentBazaarCon());
			request.setAttribute("bookInfoCalData", (new StudentCouncilDAO()).studentBookInfoCalCon());
			request.setAttribute("bookInfoCalData2", (new StudentCouncilDAO()).studentBookInfoCalCon2());
			page = "studentAdmin.jsp";
		} else if ((new LoginDAO()).login(id, pw)) {
			if ((new LoginDAO()).deleteLogin(id)) {
				HttpSession session = request.getSession(true);
				session.setAttribute("loginOK", id);
				request.setAttribute("productData", (new ProductDAO()).productCon());
				request.setAttribute("bazaarData", (new BazaarDAO()).bazaarCon());
				request.setAttribute("auctionData", (new AuctionDAO()).auctionCon());
				request.setAttribute("groupBuyingData", (new GroupBuyingDAO()).groupCon());
				page = "main.jsp";
			} else {
				page = "noMember.jsp";
			}
		} else {
			page = "error.jsp";
		}

		return page;
	}
}