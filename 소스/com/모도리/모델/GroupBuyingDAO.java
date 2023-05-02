package com.modori.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

public class GroupBuyingDAO {
	private Connection conn;

	public GroupBuyingDAO() {
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

	public Collection<GroupBuyingVO> groupCon() {
		ArrayList list = new ArrayList();

		try {
			String sql = "select g.groupBuying_num, g.student_num, g.product_name, g.groupBuying_img, g.price, g.comment, s.total_score from groupBuying AS g JOIN student AS s ON g.student_num = s.stu_num ORDER BY g.groupBuying_num DESC";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new GroupBuyingVO(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getInt(5),
						rs.getString(6), rs.getFloat(7)));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var5) {
			var5.printStackTrace();
		}

		return list;
	}

	public boolean groupBuying(int student_num, String product_name, int price, String comment,
			String groupBuying_img) {
		try {
			String sql = "insert into groupBuying(student_num, product_name, groupBuying_img, price, comment) values (?,?,?,?,?)";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			pstmt.setInt(1, student_num);
			pstmt.setString(2, product_name);
			pstmt.setString(3, groupBuying_img);
			pstmt.setInt(4, price);
			pstmt.setString(5, comment);
			int num = pstmt.executeUpdate();
			if (num == 1) {
				return true;
			}
		} catch (SQLException var9) {
			var9.printStackTrace();
		}

		return false;
	}

	public Collection<GroupBuyingVO> groupPurchaseCon(int num) {
		ArrayList list = new ArrayList();

		try {
			String sql = "select g.groupBuying_num, g.student_num, g.product_name, g.groupBuying_img, g.price, g.comment, s.total_score from groupBuying AS g JOIN student AS s ON g.student_num = s.stu_num where g.groupBuying_num = ?";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new GroupBuyingVO(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getInt(5),
						rs.getString(6), rs.getFloat(7)));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var6) {
			var6.printStackTrace();
		}

		return list;
	}

	public static void main(String[] args) {
		System.out.println((new GroupBuyingDAO()).groupCon());
	}
}