package com.roomMgr.model;

import java.util.Date;

public class CustomerLivingInfo {
	private String Cno;
	public String getCno() {
		return Cno;
	}
	public void setCno(String cno) {
		Cno = cno;
	}
	public String getRno() {
		return Rno;
	}
	public void setRno(String rno) {
		Rno = rno;
	}
	public String getTenrollDate() {
		return TenrollDate;
	}
	public void setTenrollDate(String tenrollDate) {
		TenrollDate = tenrollDate;
	}
	public String getTleftDate() {
		return TleftDate;
	}
	public void setTleftDate(String tleftDate) {
		TleftDate = tleftDate;
	}
	public double getTmoney() {
		return Tmoney;
	}
	public void setTmoney(double tmoney) {
		Tmoney = tmoney;
	}
	public double getDeposit() {
		return deposit;
	}
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	private String Rno;
	private String TenrollDate;
	private String TleftDate;
	private double Tmoney;
	private double deposit;
}
