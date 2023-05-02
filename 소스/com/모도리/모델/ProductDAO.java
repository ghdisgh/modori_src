package com.modori.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

public class ProductDAO {
	private Connection conn;

	public ProductDAO() {
		try {
			String cs = "com.mysql.jdbc.Driver";
			Class.forName(cs);
			String url = "jdbc:mysql://localhost:3306/best9076?useSSL=false&characterEncoding=utf-8";
			String id = "best9076";
			String pw = "modori@97";
			this.conn = DriverManager.getConnection(url, id, pw);
		} catch (Exception var5) {
			var5.printStackTrace();
		}

	}

	public Collection<ProductVO> productCon() {
		ArrayList list = new ArrayList();

		try {
			String sql = "select p.pro_num, p.name, p.img1, p.price, p.category, (CASE p.pro_condition WHEN '0' THEN '상' WHEN '1' THEN '중' WHEN '2' THEN '하' END), (CASE p.sell_condition WHEN '0' THEN '등록' WHEN '1' THEN '거래 중' WHEN '2' THEN '거래 완료' END), p.comment, s.total_score from product AS p JOIN student AS s ON p.stu_seller_num = s.stu_num ORDER BY p.pro_num DESC";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new ProductVO(rs.getInt(1), rs.getString(2), rs.getString(3), (String) null, (String) null,
						(String) null, (String) null, (String) null, (String) null, (String) null, (String) null,
						(String) null, 0, 0, rs.getInt(4), 0, rs.getInt(5), rs.getString(6), rs.getString(7),
						(String) null, rs.getString(8), (String) null, (String) null, (String) null, 0,
						rs.getFloat(9)));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var5) {
			var5.printStackTrace();
		}

		return list;
	}

	public boolean productEnroll(int stu_seller_num, String name, int category, int price, String kakao, String comment,
			String img1, String img2, String img3, String img4, String img5, String img6, String img7, String img8,
			String img9, String img10, int pro_condition, String deal) {
		try {
			String sql = "insert into product(stu_seller_num, name, img1, img2, img3, img4, img5, img6, img7, img8, img9, img10, price, category, pro_condition, deal, comment, kakao, sell_condition, enroll_date) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,0,now())";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			pstmt.setInt(1, stu_seller_num);
			pstmt.setString(2, name);
			pstmt.setString(3, img1);
			pstmt.setString(4, img2);
			pstmt.setString(5, img3);
			pstmt.setString(6, img4);
			pstmt.setString(7, img5);
			pstmt.setString(8, img6);
			pstmt.setString(9, img7);
			pstmt.setString(10, img8);
			pstmt.setString(11, img9);
			pstmt.setString(12, img10);
			pstmt.setInt(13, price);
			pstmt.setInt(14, category);
			pstmt.setInt(15, pro_condition);
			pstmt.setString(16, deal);
			pstmt.setString(17, comment);
			pstmt.setString(18, kakao);
			int num = pstmt.executeUpdate();
			if (num == 1) {
				return true;
			}
		} catch (SQLException var22) {
			var22.printStackTrace();
		}

		return false;
	}

	public Collection<ProductVO> productPurchaseCon(int num) {
		ArrayList list = new ArrayList();

		try {
			String sql = "select p.pro_num, p.name, p.img1, p.img2, p.img3, p.img4, p.img5, p.img6, p.img7, p.img8, p.img9, p.img10, p.stu_seller_num, p.stu_buyer_num, p.price, p.sale, p.category, (CASE p.pro_condition WHEN '0' THEN '상' WHEN '1' THEN '중' WHEN '2' THEN '하' END), (CASE p.sell_condition WHEN '0' THEN '등록' WHEN '1' THEN '거래 중' WHEN '2' THEN '거래 완료' END), p.deal, p.comment, p.kakao, s.total_score from product AS p JOIN student AS s ON p.stu_seller_num = s.stu_num where p.pro_num = ?";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new ProductVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10),
						rs.getString(11), rs.getString(12), rs.getInt(13), rs.getInt(14), rs.getInt(15), rs.getInt(16),
						rs.getInt(17), rs.getString(18), rs.getString(19), rs.getString(20), rs.getString(21),
						rs.getString(22), (String) null, (String) null, 0, rs.getFloat(23)));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var6) {
			var6.printStackTrace();
		}

		return list;
	}
}