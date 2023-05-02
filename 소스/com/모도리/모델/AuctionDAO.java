package com.modori.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

public class AuctionDAO {
	private Connection conn;

	public AuctionDAO() {
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

	public Collection<AuctionVO> auctionCon() {
		ArrayList list = new ArrayList();

		try {
			String sql = "select a.auction_num, a.stu_enroll_num, a.comment, a.kakao, s.total_score from auction AS a JOIN student AS s ON a.stu_enroll_num = s.stu_num ORDER BY a.auction_num DESC";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new AuctionVO(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getFloat(5)));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var5) {
			var5.printStackTrace();
		}

		return list;
	}

	public boolean auction(int stu_enroll_num, String comment, String kakao) {
		try {
			String sql = "insert into auction(stu_enroll_num, comment, kakao) values (?,?,?)";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			pstmt.setInt(1, stu_enroll_num);
			pstmt.setString(2, comment);
			pstmt.setString(3, kakao);
			int num = pstmt.executeUpdate();
			if (num == 1) {
				return true;
			}
		} catch (SQLException var7) {
			var7.printStackTrace();
		}

		return false;
	}

	public Collection<AuctionVO> auctionPurchaseCon(int num) {
		ArrayList list = new ArrayList();

		try {
			String sql = "select a.auction_num, a.stu_enroll_num, a.comment, a.kakao, s.total_score from auction AS a JOIN student AS s ON a.stu_enroll_num = s.stu_num where a.auction_num = ?";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new AuctionVO(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getFloat(5)));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var6) {
			var6.printStackTrace();
		}

		return list;
	}
}