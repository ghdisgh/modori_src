package com.modori.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class AdminDAO {
	private Connection conn;

	public AdminDAO() {
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

	public Collection<StudentCouncilBazaarCountVO> productCalCon() {
		Collection<StudentCouncilBazaarCountVO> list = new ArrayList<>();

		try {
			String sql = "select sum(case when category >= 1101 and category<=1807 then price-sale else 0 end), sum(case when category >= 2101 and category<=2607 then price-sale else 0 end), sum(case when category >= 3101 and category<=4303 then price-sale else 0 end), sum(case when category >= 5101 and category<=5112 then price-sale else 0 end), sum(case when category >= 6101 and category<=6111 then price-sale else 0 end), sum(case when category >= 7101 and category<=7107 then price-sale else 0 end) from product where sell_condition=2";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new StudentCouncilBazaarCountVO(0, rs.getInt(1), 0, rs.getInt(2), 0, rs.getInt(3), 0,
						rs.getInt(4), 0, rs.getInt(5), 0, rs.getInt(6)));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var5) {
			var5.printStackTrace();
		}

		return list;
	}

	public Collection<StudentCouncilBazaarCountVO> touchCon() {
		Collection<StudentCouncilBazaarCountVO> list = new ArrayList<>();

		try {
			String sql = "select count(case when buy_date >= '2017-01-01' and buy_date <= '2017-12-31' then 0 end), sum(case when buy_date >= '2017-01-01' and buy_date <= '2017-12-31' then (price-sale)*0.1 else 0 end), count(case when buy_date >= '2018-01-01' and buy_date <= '2018-12-31' then 0 end), sum(case when buy_date >= '2018-01-01' and buy_date <= '2018-12-31' then (price-sale)*0.1 else 0 end), count(case when buy_date >= '2019-01-01' and buy_date <= '2019-12-31' then 0 end), sum(case when buy_date >= '2019-01-01' and buy_date <= '2019-12-31' then (price-sale)*0.1 else 0 end) from product where sell_condition=2";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new StudentCouncilBazaarCountVO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4),
						rs.getInt(5), rs.getInt(6), 0, 0, 0, 0, 0, 0));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var5) {
			var5.printStackTrace();
		}

		return list;
	}

	public Collection<StudentCouncilBazaarCountVO> productSelect1Con() {
		Collection<StudentCouncilBazaarCountVO> list = new ArrayList<>();

		try {
			String sql = "select count(*), sum(case when category >= 1101 and category<=1109 then price-sale else 0 end) from product where category >= 1101 and category<=1109 ORDER BY pro_num DESC";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new StudentCouncilBazaarCountVO(rs.getInt(1), rs.getInt(2), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var5) {
			var5.printStackTrace();
		}

		return list;
	}

	public Collection<StudentCouncilBazaarCountVO> productSelect2Con() {
		Collection<StudentCouncilBazaarCountVO> list = new ArrayList<>();

		try {
			String sql = "select count(*), sum(case when category >= 1201 and category<=1206 then price-sale else 0 end) from product where category >= 1201 and category<=1206 ORDER BY pro_num DESC";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new StudentCouncilBazaarCountVO(rs.getInt(1), rs.getInt(2), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var5) {
			var5.printStackTrace();
		}

		return list;
	}

	public Collection<StudentCouncilBazaarCountVO> productSelect3Con() {
		Collection<StudentCouncilBazaarCountVO> list = new ArrayList<>();

		try {
			String sql = "select count(*), sum(case when category >= 1301 and category<=1306 then price-sale else 0 end) from product where category >= 1301 and category<=1306 ORDER BY p.pro_num DESC";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new StudentCouncilBazaarCountVO(rs.getInt(1), rs.getInt(2), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var5) {
			var5.printStackTrace();
		}

		return list;
	}

	public Collection<StudentCouncilBazaarCountVO> productSelect4Con() {
		Collection<StudentCouncilBazaarCountVO> list = new ArrayList<>();

		try {
			String sql = "select count(*), sum(case when category >= 1401 and category<=1406 then price-sale else 0 end) from product where category >= 1401 and category<=1406 ORDER BY p.pro_num DESC";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new StudentCouncilBazaarCountVO(rs.getInt(1), rs.getInt(2), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var5) {
			var5.printStackTrace();
		}

		return list;
	}

	public Collection<StudentCouncilBazaarCountVO> productSelect5Con() {
		Collection<StudentCouncilBazaarCountVO> list = new ArrayList<>();

		try {
			String sql = "select count(*), sum(case when category >= 1501 and category<=1503 then price-sale else 0 end) from product where category >= 1501 and category<=1503 ORDER BY p.pro_num DESC";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new StudentCouncilBazaarCountVO(rs.getInt(1), rs.getInt(2), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var5) {
			var5.printStackTrace();
		}

		return list;
	}

	public Collection<StudentCouncilBazaarCountVO> productSelect6Con() {
		Collection<StudentCouncilBazaarCountVO> list = new ArrayList<>();

		try {
			String sql = "select count(*), sum(case when category >= 1601 and category<=1606 then price-sale else 0 end) from product where category >= 1601 and category<=1606 ORDER BY p.pro_num DESC";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new StudentCouncilBazaarCountVO(rs.getInt(1), rs.getInt(2), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var5) {
			var5.printStackTrace();
		}

		return list;
	}

	public Collection<StudentCouncilBazaarCountVO> productSelect7Con() {
		Collection<StudentCouncilBazaarCountVO> list = new ArrayList<>();

		try {
			String sql = "select count(*), sum(case when category >= 1701 and category<=1703 then price-sale else 0 end) from product where category >= 1701 and category<=1703 ORDER BY p.pro_num DESC";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new StudentCouncilBazaarCountVO(rs.getInt(1), rs.getInt(2), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var5) {
			var5.printStackTrace();
		}

		return list;
	}

	public Collection<StudentCouncilBazaarCountVO> productSelect8Con() {
		Collection<StudentCouncilBazaarCountVO> list = new ArrayList<>();

		try {
			String sql = "select count(*), sum(case when category >= 1801 and category<=1807 then price-sale else 0 end) from product where category >= 1801 and category<=1807 ORDER BY p.pro_num DESC";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new StudentCouncilBazaarCountVO(rs.getInt(1), rs.getInt(2), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var5) {
			var5.printStackTrace();
		}

		return list;
	}

	public Collection<StudentCouncilBazaarCountVO> productSelect9Con() {
		Collection<StudentCouncilBazaarCountVO> list = new ArrayList<>();

		try {
			String sql = "select count(*), sum(case when category >= 2101 and category<=2110 then price-sale else 0 end) from product where category >= 2101 and category<=2110 ORDER BY p.pro_num DESC";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new StudentCouncilBazaarCountVO(rs.getInt(1), rs.getInt(2), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var5) {
			var5.printStackTrace();
		}

		return list;
	}

	public Collection<StudentCouncilBazaarCountVO> productSelect10Con() {
		Collection<StudentCouncilBazaarCountVO> list = new ArrayList<>();

		try {
			String sql = "select count(*), sum(case when category >= 2201 and category<=2205 then price-sale else 0 end) from product where category >= 2201 and category<=2205 ORDER BY p.pro_num DESC";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new StudentCouncilBazaarCountVO(rs.getInt(1), rs.getInt(2), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var5) {
			var5.printStackTrace();
		}

		return list;
	}

	public Collection<StudentCouncilBazaarCountVO> productSelect11Con() {
		Collection<StudentCouncilBazaarCountVO> list = new ArrayList<>();

		try {
			String sql = "select count(*), sum(case when category >= 2301 and category<=2305 then price-sale else 0 end) from product where category >= 2301 and category<=2305 ORDER BY p.pro_num DESC";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new StudentCouncilBazaarCountVO(rs.getInt(1), rs.getInt(2), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var5) {
			var5.printStackTrace();
		}

		return list;
	}

	public Collection<StudentCouncilBazaarCountVO> productSelect12Con() {
		Collection<StudentCouncilBazaarCountVO> list = new ArrayList<>();

		try {
			String sql = "select count(*), sum(case when category >= 2401 and category<=2403 then price-sale else 0 end) from product where category >= 2401 and category<=2403 ORDER BY p.pro_num DESC";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new StudentCouncilBazaarCountVO(rs.getInt(1), rs.getInt(2), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var5) {
			var5.printStackTrace();
		}

		return list;
	}

	public Collection<StudentCouncilBazaarCountVO> productSelect13Con() {
		Collection<StudentCouncilBazaarCountVO> list = new ArrayList<>();

		try {
			String sql = "select count(*), sum(case when category >= 2501 and category<=2505 then price-sale else 0 end) from product where category >= 2501 and category<=2505 ORDER BY p.pro_num DESC";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new StudentCouncilBazaarCountVO(rs.getInt(1), rs.getInt(2), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var5) {
			var5.printStackTrace();
		}

		return list;
	}

	public Collection<StudentCouncilBazaarCountVO> productSelect14Con() {
		Collection<StudentCouncilBazaarCountVO> list = new ArrayList<>();

		try {
			String sql = "select count(*), sum(case when category >= 2601 and category<=2607 then price-sale else 0 end) from product where category >= 2601 and category<=2607 ORDER BY p.pro_num DESC";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new StudentCouncilBazaarCountVO(rs.getInt(1), rs.getInt(2), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var5) {
			var5.printStackTrace();
		}

		return list;
	}

	public Collection<StudentCouncilBazaarCountVO> productSelect15Con() {
		Collection<StudentCouncilBazaarCountVO> list = new ArrayList<>();

		try {
			String sql = "select count(*), sum(case when category >= 3101 and category<=4303 then price-sale else 0 end) from product where category >= 3101 and category<=4303 ORDER BY p.pro_num DESC";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new StudentCouncilBazaarCountVO(rs.getInt(1), rs.getInt(2), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var5) {
			var5.printStackTrace();
		}

		return list;
	}

	public Collection<StudentCouncilBazaarCountVO> productSelect16Con() {
		Collection<StudentCouncilBazaarCountVO> list = new ArrayList<>();

		try {
			String sql = "select count(*), sum(case when category >= 5101 and category<=5112 then price-sale else 0 end) from product where category >= 5101 and category<=5112 ORDER BY p.pro_num DESC";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new StudentCouncilBazaarCountVO(rs.getInt(1), rs.getInt(2), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var5) {
			var5.printStackTrace();
		}

		return list;
	}

	public Collection<StudentCouncilBazaarCountVO> productSelect17Con() {
		Collection<StudentCouncilBazaarCountVO> list = new ArrayList<>();

		try {
			String sql = "select count(*), sum(case when category >= 6101 and category<=6111 then price-sale else 0 end) from product where category >= 6101 and category<=6111 ORDER BY p.pro_num DESC";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new StudentCouncilBazaarCountVO(rs.getInt(1), rs.getInt(2), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var5) {
			var5.printStackTrace();
		}

		return list;
	}

	public Collection<StudentCouncilBazaarCountVO> productSelect18Con() {
		Collection<StudentCouncilBazaarCountVO> list = new ArrayList<>();

		try {
			String sql = "select count(*), sum(case when category >= 7101 and category<=71071 then price-sale else 0 end) from product where category >= 7101 and category<=7107 ORDER BY p.pro_num DESC";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new StudentCouncilBazaarCountVO(rs.getInt(1), rs.getInt(2), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var5) {
			var5.printStackTrace();
		}

		return list;
	}

	public Collection<DeclareAdminVO> declareCon() {
		Collection<DeclareAdminVO> list = new ArrayList<>();

		try {
			String sql = "select d.declare_num, d.declare_stu_num, d.reporter_stu_num, d.declare_pro_name, d.declare_category, d.declare_date, s.stu_status from declareStudent AS d JOIN student AS s ON d.reporter_stu_num = s.stu_num group by d.declare_num, d.reporter_stu_num, s.stu_status ORDER BY d.reporter_stu_num";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new DeclareAdminVO(0, rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4),
						rs.getString(5), rs.getDate(6), rs.getString(7)));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var5) {
			var5.printStackTrace();
		}

		return list;
	}

	public Collection<DeclareAdminVO> declareCalCon() {
		Collection<DeclareAdminVO> list = new ArrayList<>();

		try {
			String sql = "select count(*) from declareStudent";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new DeclareAdminVO(rs.getInt(1), 0, 0, 0, (String) null, (String) null, (Date) null,
						(String) null));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var5) {
			var5.printStackTrace();
		}

		return list;
	}

	public boolean delete(int reporter_stu_num) {
		try {
			String sql = "UPDATE student set stu_status = '탈퇴' where stu_num = ?";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			pstmt.setInt(1, reporter_stu_num);
			int rs = pstmt.executeUpdate();
			return true;
		} catch (SQLException var5) {
			var5.printStackTrace();
			return false;
		}
	}

	public boolean fireCancleDataCon(int reporter_stu_num) {
		try {
			String sql = "UPDATE student set stu_status = '가입' where stu_num = ?";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			pstmt.setInt(1, reporter_stu_num);
			int rs = pstmt.executeUpdate();
			return true;
		} catch (SQLException var5) {
			var5.printStackTrace();
			return false;
		}
	}

	public Collection<DeclareAdminVO> studentFireCalCon() {
		Collection<DeclareAdminVO> list = new ArrayList<>();

		try {
			String sql = "select count(*) from declareStudent, student where declareStudent.reporter_stu_num=student.stu_num and student.stu_status='탈퇴'";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new DeclareAdminVO(rs.getInt(1), 0, 0, 0, (String) null, (String) null, (Date) null,
						(String) null));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var5) {
			var5.printStackTrace();
		}

		return list;
	}
	
	public Collection<DeclareAdminVO> studentFireCon() {
		Collection<DeclareAdminVO> list=new ArrayList<>();
		try { 
			String sql = "select d.declare_num, d.declare_stu_num, d.reporter_stu_num, d.declare_pro_name, d.declare_category, d.declare_date, s.stu_status" +
					" from declareStudent AS d" +
					" JOIN student AS s" + 
					" ON d.reporter_stu_num = s.stu_num" +
					" where stu_status='탈퇴'" +
					" group by d.declare_num, d.reporter_stu_num, s.stu_status" +
					" ORDER BY d.reporter_stu_num";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) { 
				list.add(new DeclareAdminVO(0, rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getDate(6), rs.getString(7)));
			}
			rs.close();
			pstmt.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return list;

	}

	public Collection<MyPageVO> memberInfoCon(int reporter_stu_num) {
		Collection<MyPageVO> list = new ArrayList<>();

		try {
			String sql = "select stu_num, pw, name, phone, email, department, total_score, bank, account, stu_status from student where stu_num=?";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			pstmt.setInt(1, reporter_stu_num);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new MyPageVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getFloat(7), rs.getString(8), rs.getString(9), rs.getString(10)));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var5) {
			var5.printStackTrace();
		}

		return list;
	}
}