package com.modori.servlet;

import com.modori.model.ProductDAO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import java.io.IOException;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ProductEnrollAction implements Action {
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String page = "productEnroll.jsp";
		HttpSession session = request.getSession(true);
		int stu_seller_num = (Integer) session.getAttribute("loginOK");
		String uploadPath = request.getSession().getServletContext().getRealPath("img");
		int maxFileSize = 5242880;
		MultipartRequest multi = new MultipartRequest(request, uploadPath, maxFileSize, "UTF-8",
				new DefaultFileRenamePolicy());
		String name = multi.getParameter("name");
		int category = Integer.parseInt(multi.getParameter("category2"));
		int price = Integer.parseInt(multi.getParameter("price"));
		String comment = multi.getParameter("comment");
		String kakao = multi.getParameter("kakao");
		int pro_condition = Integer.parseInt(multi.getParameter("pro_condition"));
		String deal = multi.getParameter("deal");
		Enumeration<?> files = multi.getFileNames();
		String file1 = (String) files.nextElement();
		String img8 = multi.getFilesystemName(file1);
		String file2 = (String) files.nextElement();
		String img7 = multi.getFilesystemName(file2);
		String file3 = (String) files.nextElement();
		String img6 = multi.getFilesystemName(file3);
		String file4 = (String) files.nextElement();
		String img5 = multi.getFilesystemName(file4);
		String file5 = (String) files.nextElement();
		String img4 = multi.getFilesystemName(file5);
		String file6 = (String) files.nextElement();
		String img3 = multi.getFilesystemName(file6);
		String file7 = (String) files.nextElement();
		String img2 = multi.getFilesystemName(file7);
		String file8 = (String) files.nextElement();
		String img1 = multi.getFilesystemName(file8);
		String file9 = (String) files.nextElement();
		String img10 = multi.getFilesystemName(file9);
		String file10 = (String) files.nextElement();
		String img9 = multi.getFilesystemName(file10);
		if (img10 == null && img9 == null && img8 == null && img7 == null && img6 == null && img5 == null
				&& img4 == null && img3 == null && img2 == null) {
			img10 = "";
			img9 = "";
			img8 = "";
			img7 = "";
			img6 = "";
			img5 = "";
			img4 = "";
			img3 = "";
			img2 = "";
		} else if (img10 == null && img9 == null && img8 == null && img7 == null && img6 == null && img5 == null
				&& img4 == null && img3 == null) {
			img10 = "";
			img9 = "";
			img8 = "";
			img7 = "";
			img6 = "";
			img5 = "";
			img4 = "";
			img3 = "";
		} else if (img10 == null && img9 == null && img8 == null && img7 == null && img6 == null && img5 == null
				&& img4 == null) {
			img10 = "";
			img9 = "";
			img8 = "";
			img7 = "";
			img6 = "";
			img5 = "";
			img4 = "";
		} else if (img10 == null && img9 == null && img8 == null && img7 == null && img6 == null && img5 == null) {
			img10 = "";
			img9 = "";
			img8 = "";
			img7 = "";
			img6 = "";
			img5 = "";
		} else if (img10 == null && img9 == null && img8 == null && img7 == null && img6 == null) {
			img10 = "";
			img9 = "";
			img8 = "";
			img7 = "";
			img6 = "";
		} else if (img10 == null && img9 == null && img8 == null && img7 == null) {
			img10 = "";
			img9 = "";
			img8 = "";
			img7 = "";
		} else if (img10 == null && img9 == null && img8 == null) {
			img10 = "";
			img9 = "";
			img8 = "";
		} else if (img10 == null && img9 == null) {
			img10 = "";
			img9 = "";
		} else if (img10 == null) {
			img10 = "";
		}

		System.out.println(img1);
		System.out.println(img2);
		System.out.println(img3);
		System.out.println(img4);
		System.out.println(img5);
		System.out.println(img6);
		System.out.println(img7);
		System.out.println(img8);
		System.out.println(img9);
		System.out.println(img10);
		if ((new ProductDAO()).productEnroll(stu_seller_num, name, category, price, kakao, comment, img1, img2, img3,
				img4, img5, img6, img7, img8, img9, img10, pro_condition, deal)) {
			request.setAttribute("productData", (new ProductDAO()).productCon());
			page = "main.jsp";
		}

		return page;
	}
}