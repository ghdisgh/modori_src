package com.modori.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

public class TotalScoreDAO {
	private Connection conn;

	public TotalScoreDAO() {
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

	public Collection<ProductVO> totalScoreCon(int id) {
		ArrayList list = new ArrayList();

		try {
			String sql = "select p.pro_num, p.stu_seller_num, p.name, p.img1, p.score, s.total_score from product AS p JOIN student AS s ON p.stu_seller_num = s.stu_num where p.stu_seller_num=? ORDER BY p.pro_num DESC";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new ProductVO(rs.getInt(1), rs.getString(3), rs.getString(4), (String) null, (String) null,
						(String) null, (String) null, (String) null, (String) null, (String) null, (String) null,
						(String) null, rs.getInt(2), 0, 0, 0, 0, (String) null, (String) null, (String) null,
						(String) null, (String) null, (String) null, (String) null, rs.getInt(5), rs.getFloat(6)));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var6) {
			var6.printStackTrace();
		}

		return list;
	}
}