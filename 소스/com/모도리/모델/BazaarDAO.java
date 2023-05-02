package com.modori.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

public class BazaarDAO {
	private Connection conn;

	public BazaarDAO() {
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

	public Collection<BazaarVO> bazaarCon() {
		ArrayList list = new ArrayList();

		try {
			String sql = "select b.bazaar_num, b.name, b.img1, b.price, b.category, (CASE b.pro_condition WHEN '0' THEN '상' WHEN '1' THEN '중' WHEN '2' THEN '하' END), (CASE b.sell_condition WHEN '0' THEN '등록' WHEN '1' THEN '거래 중' WHEN '2' THEN '거래 완료' END), b.comment, s.total_score from bazaar AS b JOIN student AS s ON b.stu_seller_num = s.stu_num ORDER BY b.bazaar_num DESC";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new BazaarVO(rs.getInt(1), rs.getString(2), rs.getString(3), (String) null, (String) null, 0,
						0, rs.getInt(4), 0, rs.getInt(5), rs.getString(6), rs.getString(7), (String) null,
						rs.getString(8), (String) null, (String) null, (String) null, 0, rs.getFloat(9)));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var5) {
			var5.printStackTrace();
		}

		return list;
	}

	public boolean bazaarEnroll(int stu_seller_num, String name, int category, int price, String kakao, String comment,
			String img1, String img2, String img3, int pro_condition, String deal) {
		try {
			String sql = "insert into bazaar(stu_seller_num, bazInfo_num, name, img1, img2, img3, price, category, pro_condition, deal, comment, kakao, sell_condition, enroll_date) values (?,6,?,?,?,?,?,?,?,?,?,?,0,now())";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			pstmt.setInt(1, stu_seller_num);
			pstmt.setString(2, name);
			pstmt.setString(3, img1);
			pstmt.setString(4, img2);
			pstmt.setString(5, img3);
			pstmt.setInt(6, price);
			pstmt.setInt(7, category);
			pstmt.setInt(8, pro_condition);
			pstmt.setString(9, deal);
			pstmt.setString(10, comment);
			pstmt.setString(11, kakao);
			int num = pstmt.executeUpdate();
			if (num == 1) {
				return true;
			}
		} catch (SQLException var15) {
			var15.printStackTrace();
		}

		return false;
	}

	public Collection<BazaarVO> bazaarPurchaseCon(int num) {
		ArrayList list = new ArrayList();

		try {
			String sql = "select b.bazaar_num, b.name, b.img1, b.img2, b.img3, b.stu_seller_num, b.stu_buyer_num, b.price, b.sale, b.category, (CASE b.pro_condition WHEN '0' THEN '상' WHEN '1' THEN '중' WHEN '2' THEN '하' END), (CASE b.sell_condition WHEN '0' THEN '등록' WHEN '1' THEN '거래 중' WHEN '2' THEN '거래 완료' END), b.deal, b.comment, b.kakao, s.total_score from bazaar AS b JOIN student AS s ON b.stu_seller_num = s.stu_num where b.bazaar_num = ?";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new BazaarVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getInt(6), rs.getInt(7), rs.getInt(8), rs.getInt(9), rs.getInt(10), rs.getString(11),
						rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), (String) null,
						(String) null, 0, rs.getFloat(16)));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var6) {
			var6.printStackTrace();
		}

		return list;
	}

	public static void main(String[] args) {
		System.out.println((new BazaarDAO()).bazaarCon());
	}
}