package com.modori.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class StudentCouncilDAO {
	private Connection conn;

	public StudentCouncilDAO() {
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

	public Collection<StudentCouncilBazaarCountVO> studentBazaarCon() {
		ArrayList list = new ArrayList();

		try {
			String sql = "select count(case when bazInfo_num=1 then 1 end), sum(case when bazInfo_num=1 then price-sale end), count(case when bazInfo_num=2 then 1 end), sum(case when bazInfo_num=2 then price-sale end), count(case when bazInfo_num=3 then 1 end), sum(case when bazInfo_num=3 then price-sale end), count(case when bazInfo_num=4 then 1 end), sum(case when bazInfo_num=4 then price-sale end), count(case when bazInfo_num=5 then 1 end), sum(case when bazInfo_num=5 then price-sale end), count(case when bazInfo_num=6 then 1 end), sum(case when bazInfo_num=6 then price-sale end) from bazaar";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new StudentCouncilBazaarCountVO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4),
						rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getInt(8), rs.getInt(9), rs.getInt(10),
						rs.getInt(11), rs.getInt(12)));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var5) {
			var5.printStackTrace();
		}

		return list;
	}

	public Collection<StudentCouncilBazaarVO> studentBazaarInfoCon(int num) {
		ArrayList list = new ArrayList();

		try {
			String sql = "select count(*), price, sale, bazaar_num, bazInfo_num, stu_seller_num, stu_buyer_num, name, img1, sell_condition, buyer_condition, seller_condition from bazaar  where bazInfo_num=? group by bazaar_num, bazInfo_num, stu_seller_num, stu_buyer_num, name, img1, sell_condition order by bazaar_num desc";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new StudentCouncilBazaarVO(rs.getInt(1), 0, rs.getInt(2), rs.getInt(3), rs.getInt(4),
						rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getString(8), rs.getString(9), rs.getInt(10),
						rs.getString(11), rs.getString(12)));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var6) {
			var6.printStackTrace();
		}

		return list;
	}

	public Collection<StudentCouncilBazaarVO> studentBazaarInfoCalCon(int num) {
		ArrayList list = new ArrayList();

		try {
			String sql = "select count(*), sum(price-sale), bazInfo_num from bazaar where bazInfo_num=?";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new StudentCouncilBazaarVO(rs.getInt(1), rs.getInt(2), 0, 0, 0, rs.getInt(3), 0, 0,
						(String) null, (String) null, 0, (String) null, (String) null));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var6) {
			var6.printStackTrace();
		}

		return list;
	}

	public Collection<StudentCouncilBookVO> studentBookInfoCon() {
		ArrayList list = new ArrayList();

		try {
			String sql = "select reservation_num, book.book_num, book.stu_num, rental_date, return_date, book_condition, book_name, book_img, book_enroll_condition from book, book_enroll where book.book_num=book_enroll.book_num order by rental_date desc, reservation_num desc, book_num desc";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new StudentCouncilBookVO(0, 0, 0, 0, 0, rs.getInt(1), rs.getInt(2), rs.getInt(3),
						rs.getDate(4), rs.getDate(5), rs.getInt(6), rs.getString(7), rs.getString(8), rs.getInt(9)));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var5) {
			var5.printStackTrace();
		}

		return list;
	}

	public Collection<StudentCouncilBookVO> studentBookInfoCalCon() {
		ArrayList list = new ArrayList();

		try {
			String sql = "select count(case when book_condition=1 then 1 end), count(case when book_condition=2 then 1 end), count(case when book_condition=0 then 1 end) from book";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new StudentCouncilBookVO(0, rs.getInt(1), rs.getInt(2), rs.getInt(3), 0, 0, 0, 0, (Date) null,
						(Date) null, 0, (String) null, (String) null, 0));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var5) {
			var5.printStackTrace();
		}

		return list;
	}

	public Collection<StudentCouncilBookVO> studentBookInfoCalCon2() {
		ArrayList list = new ArrayList();

		try {
			String sql = "select count(*)-count(case when book_enroll_condition=3 then 1 end), count(case when book_enroll_condition=3 then 1 end) from book_enroll";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new StudentCouncilBookVO(rs.getInt(1), 0, 0, 0, rs.getInt(5), 0, 0, 0, (Date) null,
						(Date) null, 0, (String) null, (String) null, 0));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var5) {
			var5.printStackTrace();
		}

		return list;
	}

	public boolean studentBookUpdateCon(int num) {
		try {
			String sql = "UPDATE book_enroll SET book_enroll_condition=3 WHERE book_num = ?";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			int ps = pstmt.executeUpdate();
			if (ps == 1) {
				return true;
			}
		} catch (SQLException var5) {
			var5.printStackTrace();
		}

		return false;
	}

	public boolean studentbazaarDeleteCon(int num2) {
		try {
			String sql = "delete from bazaar where bazaar_num=?";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			pstmt.setInt(1, num2);
			int rs = pstmt.executeUpdate();
			return true;
		} catch (SQLException var5) {
			var5.printStackTrace();
			return false;
		}
	}

	public boolean studentBazaarMoneyCon(int num2) {
		try {
			String sql = "update bazaar set seller_condition='입금완료', sell_condition=2 where bazaar_num=?";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			pstmt.setInt(1, num2);
			int rs = pstmt.executeUpdate();
			return true;
		} catch (SQLException var5) {
			var5.printStackTrace();
			return false;
		}
	}

	public Collection<StudentCouncilBookVO> studentBookEnrollInfoCon() {
		ArrayList list = new ArrayList();

		try {
			String sql = "select book_num, stu_num, category, book_name, book_img, book_enroll_condition from book_enroll order by book_num desc";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new StudentCouncilBookVO(0, 0, 0, 0, 0, 0, rs.getInt(1), rs.getInt(2), (Date) null,
						(Date) null, rs.getInt(3), rs.getString(4), rs.getString(5), rs.getInt(6)));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var5) {
			var5.printStackTrace();
		}

		return list;
	}

	public Collection<StudentCouncilBookVO> studentBookEnrollInfoCalCon() {
		ArrayList list = new ArrayList();

		try {
			String sql = "select count(*), count(case when book_enroll_condition=3 then 1 end) from book_enroll";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new StudentCouncilBookVO(rs.getInt(1), 0, 0, 0, rs.getInt(2), 0, 0, 0, (Date) null,
						(Date) null, 0, (String) null, (String) null, 0));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var5) {
			var5.printStackTrace();
		}

		return list;
	}

	public boolean studentBookEnrollDeleteCon(int num2) {
		try {
			String sql = "delete from book_enroll where book_num=?";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			pstmt.setInt(1, num2);
			int rs = pstmt.executeUpdate();
			return true;
		} catch (SQLException var5) {
			var5.printStackTrace();
			return false;
		}
	}

	public Collection<StudentCouncilBookVO> studentBookDamageCon() {
		ArrayList list = new ArrayList();

		try {
			String sql = "select book_num, stu_num, book_name, book_img, book_enroll_condition from book_enroll where book_enroll_condition=3 order by book_num desc";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new StudentCouncilBookVO(0, 0, 0, 0, 0, 0, rs.getInt(1), rs.getInt(2), (Date) null,
						(Date) null, rs.getInt(5), rs.getString(3), rs.getString(4), 0));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var5) {
			var5.printStackTrace();
		}

		return list;
	}

	public Collection<StudentCouncilBookVO> studentBookDamageCalCon() {
		ArrayList list = new ArrayList();

		try {
			String sql = "select count(*) from book_enroll where book_enroll_condition=3";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new StudentCouncilBookVO(rs.getInt(1), 0, 0, 0, 0, 0, 0, 0, (Date) null, (Date) null, 0,
						(String) null, (String) null, 0));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var5) {
			var5.printStackTrace();
		}

		return list;
	}

	public Collection<bazaarInfoVO> bazaarInfoCon() {
		ArrayList list = new ArrayList();

		try {
			String sql = "select bazInfo_num, name, bank, account, start, end from bazaar_info order by bazInfo_num desc";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new bazaarInfoVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getDate(5), rs.getDate(6)));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var5) {
			var5.printStackTrace();
		}

		return list;
	}

	public boolean studentBazzarEnroll(String name, String bank, String account, Date startDate, Date endDate) {
		try {
			String sql = "insert into bazaar_info(name, bank, account, start, end) values (?, ?, ?, ?, ?)";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, bank);
			pstmt.setString(3, account);
			pstmt.setDate(4, new java.sql.Date(startDate.getTime()));
			pstmt.setDate(5, new java.sql.Date(endDate.getTime()));
			int num = pstmt.executeUpdate();
			if (num == 1) {
				return true;
			}
		} catch (SQLException var9) {
			var9.printStackTrace();
		}

		return false;
	}

	public Collection<bazaarInfoVO> bazaarInfoUpdateCon(int num) {
		ArrayList list = new ArrayList();

		try {
			String sql = "select bazInfo_num, name, bank, account, start, end from bazaar_info where bazInfo_num = ?";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new bazaarInfoVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getDate(5), rs.getDate(6)));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var6) {
			var6.printStackTrace();
		}

		return list;
	}

	public boolean bazaarUpdateCon(int num, String name, String bank, String account, Date startDate, Date endDate) {
		try {
			String sql = "UPDATE bazaar_info SET name=?, bank=?, account=?, start=?, end=? WHERE bazInfo_num = ?";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, bank);
			pstmt.setString(3, account);
			pstmt.setDate(4, new java.sql.Date(startDate.getTime()));
			pstmt.setDate(5, new java.sql.Date(endDate.getTime()));
			pstmt.setInt(6, num);
			int ps = pstmt.executeUpdate();
			if (ps == 1) {
				return true;
			}
		} catch (SQLException var10) {
			var10.printStackTrace();
		}

		return false;
	}
}