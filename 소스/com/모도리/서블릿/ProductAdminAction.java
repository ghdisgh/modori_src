package com.modori.servlet;

import com.modori.model.AdminDAO;
import com.modori.model.ProductSelectDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProductAdminAction implements Action {
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String page = "admin.jsp";
		int category = Integer.parseInt(request.getParameter("category"));
		if (category == 1) {
			request.setAttribute("productSelectCalData", (new AdminDAO()).productSelect1Con());
			request.setAttribute("productSelectData", (new ProductSelectDAO()).productSelect1Con());
		} else if (category == 2) {
			request.setAttribute("productSelectCalData", (new AdminDAO()).productSelect2Con());
			request.setAttribute("productSelectData", (new ProductSelectDAO()).productSelect2Con());
		} else if (category == 3) {
			request.setAttribute("productSelectCalData", (new AdminDAO()).productSelect3Con());
			request.setAttribute("productSelectData", (new ProductSelectDAO()).productSelect3Con());
		} else if (category == 4) {
			request.setAttribute("productSelectCalData", (new AdminDAO()).productSelect4Con());
			request.setAttribute("productSelectData", (new ProductSelectDAO()).productSelect4Con());
		} else if (category == 5) {
			request.setAttribute("productSelectCalData", (new AdminDAO()).productSelect5Con());
			request.setAttribute("productSelectData", (new ProductSelectDAO()).productSelect5Con());
		} else if (category == 6) {
			request.setAttribute("productSelectCalData", (new AdminDAO()).productSelect6Con());
			request.setAttribute("productSelectData", (new ProductSelectDAO()).productSelect6Con());
		} else if (category == 7) {
			request.setAttribute("productSelectCalData", (new AdminDAO()).productSelect7Con());
			request.setAttribute("productSelectData", (new ProductSelectDAO()).productSelect7Con());
		} else if (category == 8) {
			request.setAttribute("productSelectCalData", (new AdminDAO()).productSelect8Con());
			request.setAttribute("productSelectData", (new ProductSelectDAO()).productSelect8Con());
		} else if (category == 9) {
			request.setAttribute("productSelectCalData", (new AdminDAO()).productSelect9Con());
			request.setAttribute("productSelectData", (new ProductSelectDAO()).productSelect9Con());
		} else if (category == 10) {
			request.setAttribute("productSelectCalData", (new AdminDAO()).productSelect10Con());
			request.setAttribute("productSelectData", (new ProductSelectDAO()).productSelect10Con());
		} else if (category == 11) {
			request.setAttribute("productSelectCalData", (new AdminDAO()).productSelect11Con());
			request.setAttribute("productSelectData", (new ProductSelectDAO()).productSelect11Con());
		} else if (category == 12) {
			request.setAttribute("productSelectCalData", (new AdminDAO()).productSelect12Con());
			request.setAttribute("productSelectData", (new ProductSelectDAO()).productSelect12Con());
		} else if (category == 13) {
			request.setAttribute("productSelectCalData", (new AdminDAO()).productSelect13Con());
			request.setAttribute("productSelectData", (new ProductSelectDAO()).productSelect13Con());
		} else if (category == 14) {
			request.setAttribute("productSelectCalData", (new AdminDAO()).productSelect14Con());
			request.setAttribute("productSelectData", (new ProductSelectDAO()).productSelect14Con());
		} else if (category == 15) {
			request.setAttribute("productSelectCalData", (new AdminDAO()).productSelect15Con());
			request.setAttribute("productSelectData", (new ProductSelectDAO()).productSelect15Con());
		} else if (category == 16) {
			request.setAttribute("productSelectCalData", (new AdminDAO()).productSelect16Con());
			request.setAttribute("productSelectData", (new ProductSelectDAO()).productSelect16Con());
		} else if (category == 17) {
			request.setAttribute("productSelectCalData", (new AdminDAO()).productSelect18Con());
			request.setAttribute("productSelectData", (new ProductSelectDAO()).productSelect18Con());
		} else if (category == 18) {
			request.setAttribute("productSelectCalData", (new AdminDAO()).productSelect18Con());
			request.setAttribute("productSelectData", (new ProductSelectDAO()).productSelect18Con());
		}

		page = "productAdmin.jsp";
		return page;
	}
}