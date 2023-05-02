package com.modori.model;

import java.util.Date;

public class bazaarInfoVO {
	private int bazInfo_num;
	private String name;
	private String bank;
	private String account;
	private Date start;
	private Date end;

	public bazaarInfoVO(int bazInfo_num, String name, String bank, String account, Date start, Date end) {
		this.bazInfo_num = bazInfo_num;
		this.name = name;
		this.bank = bank;
		this.account = account;
		this.start = start;
		this.end = end;
	}

	public int getBazInfo_num() {
		return this.bazInfo_num;
	}

	public void setBazInfo_num(int bazInfo_num) {
		this.bazInfo_num = bazInfo_num;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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

	public Date getStart() {
		return this.start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return this.end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public String toString() {
		return "bazInfo_num=" + this.bazInfo_num + ", name=" + this.name + ", bank=" + this.bank + ", account="
				+ this.account + ", start=" + this.start + ", end=" + this.end;
	}
}