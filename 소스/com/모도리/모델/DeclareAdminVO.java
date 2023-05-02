package com.modori.model;

import java.util.Date;

public class DeclareAdminVO {
	private int count;
	private int declare_num;
	private int declare_stu_num;
	private int reporter_stu_num;
	private String declare_pro_name;
	private String declare_category;
	private Date declare_date;
	private String stu_status;

	public DeclareAdminVO(int count, int declare_num, int declare_stu_num, int reporter_stu_num,
			String declare_pro_name, String declare_category, Date declare_date, String stu_status) {
		this.count = count;
		this.declare_num = declare_num;
		this.declare_stu_num = declare_stu_num;
		this.reporter_stu_num = reporter_stu_num;
		this.declare_pro_name = declare_pro_name;
		this.declare_category = declare_category;
		this.declare_date = declare_date;
		this.stu_status = stu_status;
	}

	public int getCount() {
		return this.count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getDeclare_num() {
		return this.declare_num;
	}

	public void setDeclare_num(int declare_num) {
		this.declare_num = declare_num;
	}

	public int getDeclare_stu_num() {
		return this.declare_stu_num;
	}

	public void setDeclare_stu_num(int declare_stu_num) {
		this.declare_stu_num = declare_stu_num;
	}

	public int getReporter_stu_num() {
		return this.reporter_stu_num;
	}

	public void setReporter_stu_num(int reporter_stu_num) {
		this.reporter_stu_num = reporter_stu_num;
	}

	public String getDeclare_pro_name() {
		return this.declare_pro_name;
	}

	public void setDeclare_pro_name(String declare_pro_name) {
		this.declare_pro_name = declare_pro_name;
	}

	public String getDeclare_category() {
		return this.declare_category;
	}

	public void setDeclare_category(String declare_category) {
		this.declare_category = declare_category;
	}

	public Date getDeclare_date() {
		return this.declare_date;
	}

	public void setDeclare_date(Date declare_date) {
		this.declare_date = declare_date;
	}

	public String getStu_status() {
		return this.stu_status;
	}

	public void setStu_status(String stu_status) {
		this.stu_status = stu_status;
	}

	public String toString() {
		return "count=" + this.count + ", declare_num=" + this.declare_num + ", declare_stu_num=" + this.declare_stu_num
				+ ", reporter_stu_num=" + this.reporter_stu_num + ", declare_pro_name=" + this.declare_pro_name
				+ ", declare_category=" + this.declare_category + ", declare_date=" + this.declare_date
				+ ", stu_status=" + this.stu_status;
	}
}