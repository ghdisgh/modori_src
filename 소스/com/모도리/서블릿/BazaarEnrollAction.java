package com.modori.servlet;

import com.modori.model.BazaarDAO;
import com.modori.model.StudentCouncilDAO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import java.io.IOException;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BazaarEnrollAction implements Action {
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String page = "bazaarEnroll.jsp";
		String uploadPath = request.getSession().getServletContext().getRealPath("img");
		int maxFileSize = 5242880;
		MultipartRequest multi = new MultipartRequest(request, uploadPath, maxFileSize, "UTF-8",
				new DefaultFileRenamePolicy());
		int stu_seller_num = Integer.parseInt(multi.getParameter("stu_seller_num"));
		String name = multi.getParameter("name");
		int category = Integer.parseInt(multi.getParameter("category"));
		int price = Integer.parseInt(multi.getParameter("price"));
		String comment = multi.getParameter("comment");
		String kakao = multi.getParameter("kakao");
		int pro_condition = Integer.parseInt(multi.getParameter("pro_condition"));
		String deal = multi.getParameter("deal");
		int num = 6;
		Enumeration<?> files = multi.getFileNames();
		String file1 = (String) files.nextElement();
		String img3 = multi.getFilesystemName(file1);
		String file2 = (String) files.nextElement();
		String img2 = multi.getFilesystemName(file2);
		String file3 = (String) files.nextElement();
		String img1 = multi.getFilesystemName(file3);
		if (img2 == null && img3 == null) {
			img2 = "";
			img3 = "";
		} else if (img3 == null) {
			img3 = "";
		}

		if ((new BazaarDAO()).bazaarEnroll(stu_seller_num, name, category, price, kakao, comment, img1, img2, img3,
				pro_condition, deal)) {
			request.setAttribute("bazaarData", (new BazaarDAO()).bazaarCon());
			request.setAttribute("bazaarData", (new StudentCouncilDAO()).studentBazaarInfoCon(num));
			request.setAttribute("bazaarCalData", (new StudentCouncilDAO()).studentBazaarInfoCalCon(num));
			page = "studentBazaarAdmin.jsp";
		}

		return page;
	}
}