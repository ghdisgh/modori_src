package com.modori.servlet;

import com.modori.model.FindDAO;
import com.modori.model.RandomDAO;
import java.io.IOException;
import java.util.UUID;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FindAction implements Action {
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String page = "find.jsp";
		int id = Integer.parseInt(request.getParameter("id"));
		String email = request.getParameter("email");
		String uuid = UUID.randomUUID().toString().replaceAll("-", "");
		uuid = uuid.substring(0, 8);
		request.setAttribute("STR", uuid);
		if ((new FindDAO()).find(id, email)) {
			(new RandomDAO()).random(uuid, id);
			page = "find2.jsp";
		}

		return page;
	}
}