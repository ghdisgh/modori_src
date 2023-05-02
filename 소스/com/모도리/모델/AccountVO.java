package com.modori.model;

public class AccountVO {
	private int num;
	private String stu_name;
	private String pro_name;
	private int price;
	private int sale;
	private String deal;
	private String bank;
	private String account;

	public AccountVO(int num, String stu_name, String pro_name, int price, int sale, String deal, String bank,
			String account) {
		this.num = num;
		this.stu_name = stu_name;
		this.pro_name = pro_name;
		this.price = price;
		this.sale = sale;
		this.deal = deal;
		this.bank = bank;
		this.account = account;
	}

	public int getNum() {
		return this.num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getStu_name() {
		return this.stu_name;
	}

	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}

	public String getPro_name() {
		return this.pro_name;
	}

	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
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

	public String getDeal() {
		return this.deal;
	}

	public void setDeal(String deal) {
		this.deal = deal;
	}

	public String getBank() {
		return this.bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String toString() {
		return "num=" + this.num + ", stu_name=" + this.stu_name + ", pro_name=" + this.pro_name + ", price="
				+ this.price + ", sale=" + this.sale + ", deal=" + this.deal + ", bank=" + this.bank + ", account="
				+ this.account;
	}
}