package com.modori.model;

public class ProductVO {
	private int num;
	private String name;
	private String img1;
	private String img2;
	private String img3;
	private String img4;
	private String img5;
	private String img6;
	private String img7;
	private String img8;
	private String img9;
	private String img10;
	private int stu_seller_num;
	private int stu_buyer_num;
	private int price;
	private int sale;
	private int category;
	private String pro_condition;
	private String sell_condition;
	private String deal;
	private String comment;
	private String kakao;
	private String buyer_condition;
	private String seller_condition;
	private int score;
	private float total_score;

	public ProductVO(int num, String name, String img1, String img2, String img3, String img4, String img5, String img6,
			String img7, String img8, String img9, String img10, int stu_seller_num, int stu_buyer_num, int price,
			int sale, int category, String pro_condition, String sell_condition, String deal, String comment,
			String kakao, String buyer_condition, String seller_condition, int score, float total_score) {
		this.num = num;
		this.name = name;
		this.img1 = img1;
		this.img2 = img2;
		this.img3 = img3;
		this.img4 = img4;
		this.img5 = img5;
		this.img6 = img6;
		this.img7 = img7;
		this.img8 = img8;
		this.img9 = img9;
		this.img10 = img10;
		this.stu_seller_num = stu_seller_num;
		this.stu_buyer_num = stu_buyer_num;
		this.price = price;
		this.sale = sale;
		this.category = category;
		this.pro_condition = pro_condition;
		this.sell_condition = sell_condition;
		this.deal = deal;
		this.comment = comment;
		this.kakao = kakao;
		this.buyer_condition = buyer_condition;
		this.seller_condition = seller_condition;
		this.score = score;
		this.total_score = total_score;
	}

	public int getNum() {
		return this.num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImg1() {
		return this.img1;
	}

	public void setImg1(String img1) {
		this.img1 = img1;
	}

	public String getImg2() {
		return this.img2;
	}

	public void setImg2(String img2) {
		this.img2 = img2;
	}

	public String getImg3() {
		return this.img3;
	}

	public void setImg3(String img3) {
		this.img3 = img3;
	}

	public String getImg4() {
		return this.img4;
	}

	public void setImg4(String img4) {
		this.img4 = img4;
	}

	public String getImg5() {
		return this.img5;
	}

	public void setImg5(String img5) {
		this.img5 = img5;
	}

	public String getImg6() {
		return this.img6;
	}

	public void setImg6(String img6) {
		this.img6 = img6;
	}

	public String getImg7() {
		return this.img7;
	}

	public void setImg7(String img7) {
		this.img7 = img7;
	}

	public String getImg8() {
		return this.img8;
	}

	public void setImg8(String img8) {
		this.img8 = img8;
	}

	public String getImg9() {
		return this.img9;
	}

	public void setImg9(String img9) {
		this.img9 = img9;
	}

	public String getImg10() {
		return this.img10;
	}

	public void setImg10(String img10) {
		this.img10 = img10;
	}

	public int getStu_seller_num() {
		return this.stu_seller_num;
	}

	public void setStu_seller_num(int stu_seller_num) {
		this.stu_seller_num = stu_seller_num;
	}

	public int getStu_buyer_num() {
		return this.stu_buyer_num;
	}

	public void setStu_buyer_num(int stu_buyer_num) {
		this.stu_buyer_num = stu_buyer_num;
	}

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getSale() {
		return this.sale;
	}

	public void setSale(int sale) {
		this.sale = sale;
	}

	public int getCategory() {
		return this.category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public String getPro_condition() {
		return this.pro_condition;
	}

	public void setPro_condition(String pro_condition) {
		this.pro_condition = pro_condition;
	}

	public String getSell_condition() {
		return this.sell_condition;
	}

	public void setSell_condition(String sell_condition) {
		this.sell_condition = sell_condition;
	}

	public String getDeal() {
		return this.deal;
	}

	public void setDeal(String deal) {
		this.deal = deal;
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

	public String getBuyer_condition() {
		return this.buyer_condition;
	}

	public void setBuyer_condition(String buyer_condition) {
		this.buyer_condition = buyer_condition;
	}

	public String getSeller_condition() {
		return this.seller_condition;
	}

	public void setSeller_condition(String seller_condition) {
		this.seller_condition = seller_condition;
	}

	public int getScore() {
		return this.score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public float getTotal_score() {
		return this.total_score;
	}

	public void setTotal_score(float total_score) {
		this.total_score = total_score;
	}

	public String toString() {
		return "num=" + this.num + ", name=" + this.name + ", img1=" + this.img1 + ", img2=" + this.img2 + ", img3="
				+ this.img3 + ", img4=" + this.img4 + ", img5=" + this.img5 + ", img6=" + this.img6 + ", img7="
				+ this.img7 + ", img8=" + this.img8 + ", img9=" + this.img9 + ", img10=" + this.img10
				+ ", stu_seller_num=" + this.stu_seller_num + ", stu_buyer_num=" + this.stu_buyer_num + ", price="
				+ this.price + ", sale=" + this.sale + ", category=" + this.category + ", pro_condition="
				+ this.pro_condition + ", sell_condition=" + this.sell_condition + ", deal=" + this.deal + ", comment="
				+ this.comment + ", kakao=" + this.kakao + ", buyer_condition=" + this.buyer_condition
				+ ", seller_condition=" + this.seller_condition + ", score=" + this.score + ", total_score="
				+ this.total_score;
	}
}