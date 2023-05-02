package com.modori.model;

public class AdminVO {
	private int AllCount;
	private int Allprice;

	public AdminVO(int allCount, int allprice) {
		this.AllCount = allCount;
		this.Allprice = allprice;
	}

	public int getAllCount() {
		return this.AllCount;
	}

	public void setAllCount(int allCount) {
		this.AllCount = allCount;
	}

	public int getAllprice() {
		return this.Allprice;
	}

	public void setAllprice(int allprice) {
		this.Allprice = allprice;
	}

	public String toString() {
		return "AllCount=" + this.AllCount + ", Allprice=" + this.Allprice;
	}
}