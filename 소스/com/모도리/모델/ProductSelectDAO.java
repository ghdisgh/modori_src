package com.modori.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

public class ProductSelectDAO {
	private Connection conn;

	public ProductSelectDAO() {
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

	public Collection<ProductVO> productSelect1Con() {
		ArrayList list = new ArrayList();

		try {
			String sql = "select p.pro_num, p.name, p.img1, p.stu_seller_num, p.stu_buyer_num, p.price, p.sale, p.category, (CASE p.pro_condition WHEN '0' THEN '상' WHEN '1' THEN '중' WHEN '2' THEN '하' END), (CASE p.sell_condition WHEN '0' THEN '등록' WHEN '1' THEN '거래 중' WHEN '2' THEN '거래 완료' END), p.comment, s.total_score from product AS p JOIN student AS s ON p.stu_seller_num = s.stu_num where category >= 1101 and category<=1109 ORDER BY p.pro_num DESC";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new ProductVO(rs.getInt(1), rs.getString(2), rs.getString(3), (String) null, (String) null,
						(String) null, (String) null, (String) null, (String) null, (String) null, (String) null,
						(String) null, rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getInt(8),
						rs.getString(9), rs.getString(10), (String) null, rs.getString(11), (String) null,
						(String) null, (String) null, 0, rs.getFloat(12)));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var5) {
			var5.printStackTrace();
		}

		return list;
	}

	public Collection<ProductVO> productSelect2Con() {
		ArrayList list = new ArrayList();

		try {
			String sql = "select p.pro_num, p.name, p.img1, p.stu_seller_num, p.stu_buyer_num, p.price, p.sale, p.category, (CASE p.pro_condition WHEN '0' THEN '상' WHEN '1' THEN '중' WHEN '2' THEN '하' END), (CASE p.sell_condition WHEN '0' THEN '등록' WHEN '1' THEN '거래 중' WHEN '2' THEN '거래 완료' END), p.comment, s.total_score from product AS p JOIN student AS s ON p.stu_seller_num = s.stu_num where category >= 1201 and category<=1206 ORDER BY p.pro_num DESC";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new ProductVO(rs.getInt(1), rs.getString(2), rs.getString(3), (String) null, (String) null,
						(String) null, (String) null, (String) null, (String) null, (String) null, (String) null,
						(String) null, rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getInt(8),
						rs.getString(9), rs.getString(10), (String) null, rs.getString(11), (String) null,
						(String) null, (String) null, 0, rs.getFloat(12)));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var5) {
			var5.printStackTrace();
		}

		return list;
	}

	public Collection<ProductVO> productSelect3Con() {
		ArrayList list = new ArrayList();

		try {
			String sql = "select p.pro_num, p.name, p.img1, p.stu_seller_num, p.stu_buyer_num, p.price, p.sale, p.category, (CASE p.pro_condition WHEN '0' THEN '상' WHEN '1' THEN '중' WHEN '2' THEN '하' END), (CASE p.sell_condition WHEN '0' THEN '등록' WHEN '1' THEN '거래 중' WHEN '2' THEN '거래 완료' END), p.comment, s.total_score from product AS p JOIN student AS s ON p.stu_seller_num = s.stu_num where category >= 1301 and category<=1306 ORDER BY p.pro_num DESC";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new ProductVO(rs.getInt(1), rs.getString(2), rs.getString(3), (String) null, (String) null,
						(String) null, (String) null, (String) null, (String) null, (String) null, (String) null,
						(String) null, rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getInt(8),
						rs.getString(9), rs.getString(10), (String) null, rs.getString(11), (String) null,
						(String) null, (String) null, 0, rs.getFloat(12)));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var5) {
			var5.printStackTrace();
		}

		return list;
	}

	public Collection<ProductVO> productSelect4Con() {
		ArrayList list = new ArrayList();

		try {
			String sql = "select p.pro_num, p.name, p.img1, p.stu_seller_num, p.stu_buyer_num, p.price, p.sale, p.category, (CASE p.pro_condition WHEN '0' THEN '상' WHEN '1' THEN '중' WHEN '2' THEN '하' END), (CASE p.sell_condition WHEN '0' THEN '등록' WHEN '1' THEN '거래 중' WHEN '2' THEN '거래 완료' END), p.comment, s.total_score from product AS p JOIN student AS s ON p.stu_seller_num = s.stu_num where category >= 1401 and category<=1406 ORDER BY p.pro_num DESC";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new ProductVO(rs.getInt(1), rs.getString(2), rs.getString(3), (String) null, (String) null,
						(String) null, (String) null, (String) null, (String) null, (String) null, (String) null,
						(String) null, rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getInt(8),
						rs.getString(9), rs.getString(10), (String) null, rs.getString(11), (String) null,
						(String) null, (String) null, 0, rs.getFloat(12)));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var5) {
			var5.printStackTrace();
		}

		return list;
	}

	public Collection<ProductVO> productSelect5Con() {
		ArrayList list = new ArrayList();

		try {
			String sql = "select p.pro_num, p.name, p.img1, p.stu_seller_num, p.stu_buyer_num, p.price, p.sale, p.category, (CASE p.pro_condition WHEN '0' THEN '상' WHEN '1' THEN '중' WHEN '2' THEN '하' END), (CASE p.sell_condition WHEN '0' THEN '등록' WHEN '1' THEN '거래 중' WHEN '2' THEN '거래 완료' END), p.comment, s.total_score from product AS p JOIN student AS s ON p.stu_seller_num = s.stu_num where category >= 1501 and category<=1503 ORDER BY p.pro_num DESC";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new ProductVO(rs.getInt(1), rs.getString(2), rs.getString(3), (String) null, (String) null,
						(String) null, (String) null, (String) null, (String) null, (String) null, (String) null,
						(String) null, rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getInt(8),
						rs.getString(9), rs.getString(10), (String) null, rs.getString(11), (String) null,
						(String) null, (String) null, 0, rs.getFloat(12)));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var5) {
			var5.printStackTrace();
		}

		return list;
	}

	public Collection<ProductVO> productSelect6Con() {
		ArrayList list = new ArrayList();

		try {
			String sql = "select p.pro_num, p.name, p.img1, p.stu_seller_num, p.stu_buyer_num, p.price, p.sale, p.category, (CASE p.pro_condition WHEN '0' THEN '상' WHEN '1' THEN '중' WHEN '2' THEN '하' END), (CASE p.sell_condition WHEN '0' THEN '등록' WHEN '1' THEN '거래 중' WHEN '2' THEN '거래 완료' END), p.comment, s.total_score from product AS p JOIN student AS s ON p.stu_seller_num = s.stu_num where category >= 1601 and category<=1606 ORDER BY p.pro_num DESC";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new ProductVO(rs.getInt(1), rs.getString(2), rs.getString(3), (String) null, (String) null,
						(String) null, (String) null, (String) null, (String) null, (String) null, (String) null,
						(String) null, rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getInt(8),
						rs.getString(9), rs.getString(10), (String) null, rs.getString(11), (String) null,
						(String) null, (String) null, 0, rs.getFloat(12)));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var5) {
			var5.printStackTrace();
		}

		return list;
	}

	public Collection<ProductVO> productSelect7Con() {
		ArrayList list = new ArrayList();

		try {
			String sql = "select p.pro_num, p.name, p.img1, p.stu_seller_num, p.stu_buyer_num, p.price, p.sale, p.category, (CASE p.pro_condition WHEN '0' THEN '상' WHEN '1' THEN '중' WHEN '2' THEN '하' END), (CASE p.sell_condition WHEN '0' THEN '등록' WHEN '1' THEN '거래 중' WHEN '2' THEN '거래 완료' END), p.comment, s.total_score from product AS p JOIN student AS s ON p.stu_seller_num = s.stu_num where category >= 1701 and category<=1703 ORDER BY p.pro_num DESC";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new ProductVO(rs.getInt(1), rs.getString(2), rs.getString(3), (String) null, (String) null,
						(String) null, (String) null, (String) null, (String) null, (String) null, (String) null,
						(String) null, rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getInt(8),
						rs.getString(9), rs.getString(10), (String) null, rs.getString(11), (String) null,
						(String) null, (String) null, 0, rs.getFloat(12)));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var5) {
			var5.printStackTrace();
		}

		return list;
	}

	public Collection<ProductVO> productSelect8Con() {
		ArrayList list = new ArrayList();

		try {
			String sql = "select p.pro_num, p.name, p.img1, p.stu_seller_num, p.stu_buyer_num, p.price, p.sale, p.category, (CASE p.pro_condition WHEN '0' THEN '상' WHEN '1' THEN '중' WHEN '2' THEN '하' END), (CASE p.sell_condition WHEN '0' THEN '등록' WHEN '1' THEN '거래 중' WHEN '2' THEN '거래 완료' END), p.comment, s.total_score from product AS p JOIN student AS s ON p.stu_seller_num = s.stu_num where category >= 1801 and category<=1807 ORDER BY p.pro_num DESC";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new ProductVO(rs.getInt(1), rs.getString(2), rs.getString(3), (String) null, (String) null,
						(String) null, (String) null, (String) null, (String) null, (String) null, (String) null,
						(String) null, rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getInt(8),
						rs.getString(9), rs.getString(10), (String) null, rs.getString(11), (String) null,
						(String) null, (String) null, 0, rs.getFloat(12)));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var5) {
			var5.printStackTrace();
		}

		return list;
	}

	public Collection<ProductVO> productSelect9Con() {
		ArrayList list = new ArrayList();

		try {
			String sql = "select p.pro_num, p.name, p.img1, p.stu_seller_num, p.stu_buyer_num, p.price, p.sale, p.category, (CASE p.pro_condition WHEN '0' THEN '상' WHEN '1' THEN '중' WHEN '2' THEN '하' END), (CASE p.sell_condition WHEN '0' THEN '등록' WHEN '1' THEN '거래 중' WHEN '2' THEN '거래 완료' END), p.comment, s.total_score from product AS p JOIN student AS s ON p.stu_seller_num = s.stu_num where category >= 2101 and category<=2110 ORDER BY p.pro_num DESC";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new ProductVO(rs.getInt(1), rs.getString(2), rs.getString(3), (String) null, (String) null,
						(String) null, (String) null, (String) null, (String) null, (String) null, (String) null,
						(String) null, rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getInt(8),
						rs.getString(9), rs.getString(10), (String) null, rs.getString(11), (String) null,
						(String) null, (String) null, 0, rs.getFloat(12)));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var5) {
			var5.printStackTrace();
		}

		return list;
	}

	public Collection<ProductVO> productSelect10Con() {
		ArrayList list = new ArrayList();

		try {
			String sql = "select p.pro_num, p.name, p.img1, p.stu_seller_num, p.stu_buyer_num, p.price, p.sale, p.category, (CASE p.pro_condition WHEN '0' THEN '상' WHEN '1' THEN '중' WHEN '2' THEN '하' END), (CASE p.sell_condition WHEN '0' THEN '등록' WHEN '1' THEN '거래 중' WHEN '2' THEN '거래 완료' END), p.comment, s.total_score from product AS p JOIN student AS s ON p.stu_seller_num = s.stu_num where category >= 2201 and category<=2205 ORDER BY p.pro_num DESC";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new ProductVO(rs.getInt(1), rs.getString(2), rs.getString(3), (String) null, (String) null,
						(String) null, (String) null, (String) null, (String) null, (String) null, (String) null,
						(String) null, rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getInt(8),
						rs.getString(9), rs.getString(10), (String) null, rs.getString(11), (String) null,
						(String) null, (String) null, 0, rs.getFloat(12)));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var5) {
			var5.printStackTrace();
		}

		return list;
	}

	public Collection<ProductVO> productSelect11Con() {
		ArrayList list = new ArrayList();

		try {
			String sql = "select p.pro_num, p.name, p.img1, p.stu_seller_num, p.stu_buyer_num, p.price, p.sale, p.category, (CASE p.pro_condition WHEN '0' THEN '상' WHEN '1' THEN '중' WHEN '2' THEN '하' END), (CASE p.sell_condition WHEN '0' THEN '등록' WHEN '1' THEN '거래 중' WHEN '2' THEN '거래 완료' END), p.comment, s.total_score from product AS p JOIN student AS s ON p.stu_seller_num = s.stu_num where category >= 2301 and category<=2305 ORDER BY p.pro_num DESC";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new ProductVO(rs.getInt(1), rs.getString(2), rs.getString(3), (String) null, (String) null,
						(String) null, (String) null, (String) null, (String) null, (String) null, (String) null,
						(String) null, rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getInt(8),
						rs.getString(9), rs.getString(10), (String) null, rs.getString(11), (String) null,
						(String) null, (String) null, 0, rs.getFloat(12)));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var5) {
			var5.printStackTrace();
		}

		return list;
	}

	public Collection<ProductVO> productSelect12Con() {
		ArrayList list = new ArrayList();

		try {
			String sql = "select p.pro_num, p.name, p.img1, p.stu_seller_num, p.stu_buyer_num, p.price, p.sale, p.category, (CASE p.pro_condition WHEN '0' THEN '상' WHEN '1' THEN '중' WHEN '2' THEN '하' END), (CASE p.sell_condition WHEN '0' THEN '등록' WHEN '1' THEN '거래 중' WHEN '2' THEN '거래 완료' END), p.comment, s.total_score from product AS p JOIN student AS s ON p.stu_seller_num = s.stu_num where category >= 2401 and category<=2403 ORDER BY p.pro_num DESC";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new ProductVO(rs.getInt(1), rs.getString(2), rs.getString(3), (String) null, (String) null,
						(String) null, (String) null, (String) null, (String) null, (String) null, (String) null,
						(String) null, rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getInt(8),
						rs.getString(9), rs.getString(10), (String) null, rs.getString(11), (String) null,
						(String) null, (String) null, 0, rs.getFloat(12)));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var5) {
			var5.printStackTrace();
		}

		return list;
	}

	public Collection<ProductVO> productSelect13Con() {
		ArrayList list = new ArrayList();

		try {
			String sql = "select p.pro_num, p.name, p.img1, p.stu_seller_num, p.stu_buyer_num, p.price, p.sale, p.category, (CASE p.pro_condition WHEN '0' THEN '상' WHEN '1' THEN '중' WHEN '2' THEN '하' END), (CASE p.sell_condition WHEN '0' THEN '등록' WHEN '1' THEN '거래 중' WHEN '2' THEN '거래 완료' END), p.comment, s.total_score from product AS p JOIN student AS s ON p.stu_seller_num = s.stu_num where category >= 2501 and category<=2505 ORDER BY p.pro_num DESC";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new ProductVO(rs.getInt(1), rs.getString(2), rs.getString(3), (String) null, (String) null,
						(String) null, (String) null, (String) null, (String) null, (String) null, (String) null,
						(String) null, rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getInt(8),
						rs.getString(9), rs.getString(10), (String) null, rs.getString(11), (String) null,
						(String) null, (String) null, 0, rs.getFloat(12)));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var5) {
			var5.printStackTrace();
		}

		return list;
	}

	public Collection<ProductVO> productSelect14Con() {
		ArrayList list = new ArrayList();

		try {
			String sql = "select p.pro_num, p.name, p.img1, p.stu_seller_num, p.stu_buyer_num, p.price, p.sale, p.category, (CASE p.pro_condition WHEN '0' THEN '상' WHEN '1' THEN '중' WHEN '2' THEN '하' END), (CASE p.sell_condition WHEN '0' THEN '등록' WHEN '1' THEN '거래 중' WHEN '2' THEN '거래 완료' END), p.comment, s.total_score from product AS p JOIN student AS s ON p.stu_seller_num = s.stu_num where category >= 2601 and category<=2607 ORDER BY p.pro_num DESC";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new ProductVO(rs.getInt(1), rs.getString(2), rs.getString(3), (String) null, (String) null,
						(String) null, (String) null, (String) null, (String) null, (String) null, (String) null,
						(String) null, rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getInt(8),
						rs.getString(9), rs.getString(10), (String) null, rs.getString(11), (String) null,
						(String) null, (String) null, 0, rs.getFloat(12)));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var5) {
			var5.printStackTrace();
		}

		return list;
	}

	public Collection<ProductVO> productSelect15Con() {
		ArrayList list = new ArrayList();

		try {
			String sql = "select p.pro_num, p.name, p.img1, p.stu_seller_num, p.stu_buyer_num, p.price, p.sale, p.category, (CASE p.pro_condition WHEN '0' THEN '상' WHEN '1' THEN '중' WHEN '2' THEN '하' END), (CASE p.sell_condition WHEN '0' THEN '등록' WHEN '1' THEN '거래 중' WHEN '2' THEN '거래 완료' END), p.comment, s.total_score from product AS p JOIN student AS s ON p.stu_seller_num = s.stu_num where category >= 3101 and category<=4303 ORDER BY p.pro_num DESC";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new ProductVO(rs.getInt(1), rs.getString(2), rs.getString(3), (String) null, (String) null,
						(String) null, (String) null, (String) null, (String) null, (String) null, (String) null,
						(String) null, rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getInt(8),
						rs.getString(9), rs.getString(10), (String) null, rs.getString(11), (String) null,
						(String) null, (String) null, 0, rs.getFloat(12)));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var5) {
			var5.printStackTrace();
		}

		return list;
	}

	public Collection<ProductVO> productSelect16Con() {
		ArrayList list = new ArrayList();

		try {
			String sql = "select p.pro_num, p.name, p.img1, p.stu_seller_num, p.stu_buyer_num, p.price, p.sale, p.category, (CASE p.pro_condition WHEN '0' THEN '상' WHEN '1' THEN '중' WHEN '2' THEN '하' END), (CASE p.sell_condition WHEN '0' THEN '등록' WHEN '1' THEN '거래 중' WHEN '2' THEN '거래 완료' END), p.comment, s.total_score from product AS p JOIN student AS s ON p.stu_seller_num = s.stu_num where category >= 5101 and category<=5112 ORDER BY p.pro_num DESC";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new ProductVO(rs.getInt(1), rs.getString(2), rs.getString(3), (String) null, (String) null,
						(String) null, (String) null, (String) null, (String) null, (String) null, (String) null,
						(String) null, rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getInt(8),
						rs.getString(9), rs.getString(10), (String) null, rs.getString(11), (String) null,
						(String) null, (String) null, 0, rs.getFloat(12)));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var5) {
			var5.printStackTrace();
		}

		return list;
	}

	public Collection<ProductVO> productSelect17Con() {
		ArrayList list = new ArrayList();

		try {
			String sql = "select p.pro_num, p.name, p.img1, p.stu_seller_num, p.stu_buyer_num, p.price, p.sale, p.category, (CASE p.pro_condition WHEN '0' THEN '상' WHEN '1' THEN '중' WHEN '2' THEN '하' END), (CASE p.sell_condition WHEN '0' THEN '등록' WHEN '1' THEN '거래 중' WHEN '2' THEN '거래 완료' END), p.comment, s.total_score from product AS p JOIN student AS s ON p.stu_seller_num = s.stu_num where category >= 6101 and category<=6111 ORDER BY p.pro_num DESC";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new ProductVO(rs.getInt(1), rs.getString(2), rs.getString(3), (String) null, (String) null,
						(String) null, (String) null, (String) null, (String) null, (String) null, (String) null,
						(String) null, rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getInt(8),
						rs.getString(9), rs.getString(10), (String) null, rs.getString(11), (String) null,
						(String) null, (String) null, 0, rs.getFloat(12)));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var5) {
			var5.printStackTrace();
		}

		return list;
	}

	public Collection<ProductVO> productSelect18Con() {
		ArrayList list = new ArrayList();

		try {
			String sql = "select p.pro_num, p.name, p.img1, p.stu_seller_num, p.stu_buyer_num, p.price, p.sale, p.category, (CASE p.pro_condition WHEN '0' THEN '상' WHEN '1' THEN '중' WHEN '2' THEN '하' END), (CASE p.sell_condition WHEN '0' THEN '등록' WHEN '1' THEN '거래 중' WHEN '2' THEN '거래 완료' END), p.comment, s.total_score from product AS p JOIN student AS s ON p.stu_seller_num = s.stu_num where category >= 7101 and category<=7107 ORDER BY p.pro_num DESC";
			PreparedStatement pstmt = this.conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new ProductVO(rs.getInt(1), rs.getString(2), rs.getString(3), (String) null, (String) null,
						(String) null, (String) null, (String) null, (String) null, (String) null, (String) null,
						(String) null, rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getInt(8),
						rs.getString(9), rs.getString(10), (String) null, rs.getString(11), (String) null,
						(String) null, (String) null, 0, rs.getFloat(12)));
			}

			rs.close();
			pstmt.close();
		} catch (Exception var5) {
			var5.printStackTrace();
		}

		return list;
	}
}