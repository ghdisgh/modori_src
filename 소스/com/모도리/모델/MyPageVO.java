package com.modori.model;

public class MyPageVO {
	private int stu_num;
	private String pw;
	private String name;
	private String phone;
	private String email;
	private String department;
	private float total_score;
	private String bank;
	private String account;
	private String stu_status;
	
	public MyPageVO(int stu_num, String pw, String name, String phone, String email, String department,
			float total_score, String bank, String account, String stu_status) {
		super();
		this.stu_num = stu_num;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.department = department;
		this.total_score = total_score;
		this.bank = bank;
		this.account = account;
		this.stu_status = stu_status;
	}

	public int getStu_num() {
		return stu_num;
	}

	public void setStu_num(int stu_num) {
		this.stu_num = stu_num;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public float getTotal_score() {
		return total_score;
	}

	public void setTotal_score(float total_score) {
		this.total_score = total_score;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getStu_status() {
		return stu_status;
	}

	public void setStu_status(String stu_status) {
		this.stu_status = stu_status;
	}

	@Override
	public String toString() {
		return "MyPageVO [stu_num=" + stu_num + ", pw=" + pw + ", name=" + name + ", phone=" + phone + ", email="
				+ email + ", department=" + department + ", total_score=" + total_score + ", bank=" + bank
				+ ", account=" + account + ", stu_status=" + stu_status + "]";
	}

	
}