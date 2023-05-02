package com.modori.model;

public class AuctionVO {
	private int auction_num;
	private int stu_enroll_num;
	private String comment;
	private String kakao;
	private float total_score;

	public AuctionVO(int auction_num, int stu_enroll_num, String comment, String kakao, float total_score) {
		this.auction_num = auction_num;
		this.stu_enroll_num = stu_enroll_num;
		this.comment = comment;
		this.kakao = kakao;
		this.total_score = total_score;
	}

	public int getAuction_num() {
		return this.auction_num;
	}

	public void setAuction_num(int auction_num) {
		this.auction_num = auction_num;
	}

	public int getStu_enroll_num() {
		return this.stu_enroll_num;
	}

	public void setStu_enroll_num(int stu_enroll_num) {
		this.stu_enroll_num = stu_enroll_num;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getKakao() {
		return this.kakao;
	}

	public void setKakao(String kakao) {
		this.kakao = kakao;
	}

	public float getTotal_score() {
		return this.total_score;
	}

	public void setTotal_score(float total_score) {
		this.total_score = total_score;
	}

	public String toString() {
		return "auction_num=" + this.auction_num + ", stu_enroll_num=" + this.stu_enroll_num + ", comment="
				+ this.comment + ", kakao=" + this.kakao + ", total_score=" + this.total_score;
	}
}