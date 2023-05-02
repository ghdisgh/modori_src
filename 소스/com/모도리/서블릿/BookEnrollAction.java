package com.modori.servlet;

import com.modori.model.BookDAO;
import com.modori.model.StudentCouncilDAO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import java.io.IOException;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BookEnrollAction implements Action {
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String page = "book.jsp";
		String uploadPath = request.getSession().getServletContext().getRealPath("img");
		int maxFileSize = 5242880;
		MultipartRequest multi = new MultipartRequest(request, uploadPath, maxFileSize, "UTF-8",
				new DefaultFileRenamePolicy());
		int stu_num = Integer.parseInt(multi.getParameter("stu_num"));
		String name = multi.getParameter("name");
		int category = Integer.parseInt(multi.getParameter("category"));
		String kakao = multi.getParameter("kakao");
		Enumeration<?> files = multi.getFileNames();
		String file1 = (String) files.nextElement();
		String book_img = multi.getFilesystemName(file1);
		if ((new BookDAO()).bookEnroll(stu_num, name, kakao, category, book_img)) {
			request.setAttribute("bookData", (new BookDAO()).bookCon());
			request.setAttribute("bookInfoData", (new StudentCouncilDAO()).studentBookInfoCon());
			request.setAttribute("bookInfoCalData", (new StudentCouncilDAO()).studentBookInfoCalCon());
			page = "studentCountAdmin.jsp";
		}

		return page;
	}
}