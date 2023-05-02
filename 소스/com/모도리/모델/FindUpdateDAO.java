package com.modori.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FindUpdateDAO {
	private Connection conn;

	public FindUpdateDAO() {
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

	public boolean update(String pw, int id) {
		try {
			String sql = "UPDATE student set pw =? where stu_num =?";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			pstmt.setString(1, pw);
			pstmt.setInt(2, id);
			int rs = pstmt.executeUpdate();
			return true;
		} catch (SQLException var6) {
			var6.printStackTrace();
			return false;
		}
	}
}