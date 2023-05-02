package com.modori.model;

public class StudentCouncilBazaarVO {
	private int bazaar_count;
	private int bazaar_sum;
	private int price;
	private int sale;
	private int bazaar_num;
	private int bazInfo_num;
	private int stu_seller_num;
	private int stu_buyer_num;
	private String name;
	private String img1;
	private int sell_condition;
	private String buyer_condition;
	private String seller_condition;

	public StudentCouncilBazaarVO(int bazaar_count, int bazaar_sum, int price, int sale, int bazaar_num,
			int bazInfo_num, int stu_seller_num, int stu_buyer_num, String name, String img1, int sell_condition,
			String buyer_condition, String seller_condition) {
		this.bazaar_count = bazaar_count;
		this.bazaar_sum = bazaar_sum;
		this.price = price;
		this.sale = sale;
		this.bazaar_num = bazaar_num;
		this.bazInfo_num = bazInfo_num;
		this.stu_seller_num = stu_seller_num;
		this.stu_buyer_num = stu_buyer_num;
		this.name = name;
		this.img1 = img1;
		this.sell_condition = sell_condition;
		this.buyer_condition = buyer_condition;
		this.seller_condition = seller_condition;
	}

	public int getBazaar_count() {
		return this.bazaar_count;
	}

	public void setBazaar_count(int bazaar_count) {
		this.bazaar_count = bazaar_count;
	}

	public int getBazaar_sum() {
		return this.bazaar_sum;
	}

	public void setBazaar_sum(int bazaar_sum) {
		this.bazaar_sum = bazaar_sum;
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

	public int getBazaar_num() {
		return this.bazaar_num;
	}

	public void setBazaar_num(int bazaar_num) {
		this.bazaar_num = bazaar_num;
	}

	public int getBazInfo_num() {
		return this.bazInfo_num;
	}

	public void setBazInfo_num(int bazInfo_num) {
		this.bazInfo_num = bazInfo_num;
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

	public int getSell_condition() {
		return this.sell_condition;
	}

	public void setSell_condition(int sell_condition) {
		this.sell_condition = sell_condition;
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

	public String toString() {
		return "bazaar_count=" + this.bazaar_count + ", bazaar_sum=" + this.bazaar_sum + ", price=" + this.price
				+ ", sale=" + this.sale + ", bazaar_num=" + this.bazaar_num + ", bazInfo_num=" + this.bazInfo_num
				+ ", stu_seller_num=" + this.stu_seller_num + ", stu_buyer_num=" + this.stu_buyer_num + ", name="
				+ this.name + ", img1=" + this.img1 + ", sell_condition=" + this.sell_condition + ", buyer_condition="
				+ this.buyer_condition + ", seller_condition=" + this.seller_condition;
	}
}