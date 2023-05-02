package com.modori.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MemberDAO {
	private Connection conn;

	public MemberDAO() {
		try {
			String cs = "com.mysql.jdbc.Driver";
			Class.forName(cs);
			System.out.println("1. ok");
			String url = "jdbc:mysql://localhost:3306/best9076?useSSL=false&characterEncoding=utf-8";
			String id = "best9076";
			String pw = "modori@97";
			this.conn = DriverManager.getConnection(url, id, pw);
			System.out.println("2. conn");
		} catch (Exception var5) {
			var5.printStackTrace();
		}

	}

	public boolean member(String number, String pw, String name, String phone, String email, String department,
			String bank, String bankNumber) {
		try {
			String sql = "insert into student(stu_num, pw, name, phone, email, department, total_score, bank, account, stu_status) values (?,?,?,?,?,?,0,?,?,\"가입\")";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			pstmt.setString(1, number);
			pstmt.setString(2, pw);
			pstmt.setString(3, name);
			pstmt.setString(4, phone);
			pstmt.setString(5, email);
			pstmt.setString(6, department);
			pstmt.setString(7, bank);
			pstmt.setString(8, bankNumber);
			int num = pstmt.executeUpdate();
			if (num == 1) {
				return true;
			}
		} catch (SQLException var12) {
			var12.printStackTrace();
		}

		return false;
	}

	public boolean delete(String pw, int id) {
		try {
			String sql = "UPDATE student set stu_status = '탈퇴' where stu_num = ? and pw = ?";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.setString(2, pw);
			int rs = pstmt.executeUpdate();
			return true;
		} catch (SQLException var6) {
			var6.printStackTrace();
			return false;
		}
	}
}