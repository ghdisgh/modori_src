package com.modori.model;

import java.util.Date;

public class BookVO {
	private int book_num;
	private int stu_num;
	private String book_name;
	private String book_img;
	private String kakao;
	private int category;
	private Date date;
	private int book_enroll_condition;
	private float total_score;

	public BookVO(int book_num, int stu_num, String book_name, String book_img, String kakao, int category, Date date,
			int book_enroll_condition, float total_score) {
		this.book_num = book_num;
		this.stu_num = stu_num;
		this.book_name = book_name;
		this.book_img = book_img;
		this.kakao = kakao;
		this.category = category;
		this.date = date;
		this.book_enroll_condition = book_enroll_condition;
		this.total_score = total_score;
	}

	public int getBook_num() {
		return this.book_num;
	}

	public void setBook_num(int book_num) {
		this.book_num = book_num;
	}

	public int getStu_num() {
		return this.stu_num;
	}

	public void setStu_num(int stu_num) {
		this.stu_num = stu_num;
	}

	public String getBook_name() {
		return this.book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public String getBook_img() {
		return this.book_img;
	}

	public void setBook_img(String book_img) {
		this.book_img = book_img;
	}

	public String getKakao() {
		return this.kakao;
	}

	public void setKakao(String kakao) {
		this.kakao = kakao;
	}

	public int getCategory() {
		return this.category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getBook_enroll_condition() {
		return this.book_enroll_condition;
	}

	public void setBook_enroll_condition(int book_enroll_condition) {
		this.book_enroll_condition = book_enroll_condition;
	}

	public float getTotal_score() {
		return this.total_score;
	}

	public void setTotal_score(float total_score) {
		this.total_score = total_score;
	}

	public String toString() {
		return "book_num=" + this.book_num + ", stu_num=" + this.stu_num + ", book_name=" + this.book_name
				+ ", book_img=" + this.book_img + ", kakao=" + this.kakao + ", category=" + this.category + ", date="
				+ this.date + ", book_enroll_condition=" + this.book_enroll_condition + ", total_score="
				+ this.total_score;
	}
}