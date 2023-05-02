package com.modori.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {
	private Connection conn;

	public LoginDAO() {
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

	public boolean login(int id, String pw) {
		try {
			String sql = "select name from student where stu_num = ? AND pw = ?";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.setString(2, pw);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				return true;
			}
		} catch (Exception var6) {
			var6.printStackTrace();
		}

		return false;
	}

	public boolean deleteLogin(int id) {
		try {
			String sql = "select stu_status from student where stu_num = ? and stu_status = '가입'";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				return true;
			}
		} catch (Exception var5) {
			var5.printStackTrace();
		}

		return false;
	}
}