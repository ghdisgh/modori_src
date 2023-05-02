package com.modori.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

public class AccountDAO {
	private Connection conn;

	public AccountDAO() {
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

	public Collection<AccountVO> accountP(int id, int num) {
		ArrayList list = new ArrayList();

		try {
			String sql = "select pro_num, student.name, product.name, price, sale, deal, bank, account from student, product where stu_num=? and pro_num=?";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.setInt(2, num);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new AccountVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5),
						rs.getString(6), rs.getString(7), rs.getString(8)));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var7) {
			var7.printStackTrace();
		}

		return list;
	}

	public Collection<AccountVO> accountB(int id, int num) {
		ArrayList list = new ArrayList();

		try {
			String sql = "select bazaar_num, student.name, bazaar.name, price, sale, deal, bank, account from student, bazaar where stu_num=? and bazaar_num=?";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.setInt(2, num);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new AccountVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5),
						rs.getString(6), rs.getString(7), rs.getString(8)));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var7) {
			var7.printStackTrace();
		}

		return list;
	}

	public boolean updateP(int id, int num) {
		try {
			String sql = "UPDATE product SET stu_buyer_num=?, sell_condition=1, buyer_condition='입금완료', buy_date=now() WHERE (stu_buyer_num IS NULL) and sell_condition=0 and buyer_condition='' and buy_date='0000-00-00' and pro_num=?";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.setInt(2, num);
			int ps = pstmt.executeUpdate();
			if (ps == 1) {
				return true;
			}
		} catch (SQLException var6) {
			var6.printStackTrace();
		}

		return false;
	}

	public boolean updateB(int id, int num) {
		try {
			String sql = "UPDATE bazaar SET stu_buyer_num=?, sell_condition=1, buyer_condition='입금완료', buy_date=now() WHERE (stu_buyer_num IS NULL) and sell_condition=0 and buyer_condition='' and buy_date='0000-00-00' and bazaar_num=?";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.setInt(2, num);
			int ps = pstmt.executeUpdate();
			if (ps == 1) {
				return true;
			}
		} catch (SQLException var6) {
			var6.printStackTrace();
		}

		return false;
	}
}