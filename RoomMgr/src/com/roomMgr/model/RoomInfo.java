package com.roomMgr.model;

import java.util.*;

import com.roomMgr.Util.RoomDB;

public class RoomInfo {
	private String Rno;
	public String getRno() {
		return Rno;
	}
	public void setRno(String rno) {
		Rno = rno;
	}
	public String getRstyle() {
		return Rstyle;
	}
	public void setRstyle(String rstyle) {
		Rstyle = rstyle;
	}
	public int getRprice() {
		return Rprice;
	}
	public void setRprice(int rprice) {
		Rprice = rprice;
	}
	public String getRstate() {
		return Rstate;
	}
	public void setRstate(String rstate) {
		Rstate = rstate;
	}
	public String getRtel() {
		return Rtel;
	}
	public void setRtel(String rtel) {
		Rtel = rtel;
	}
	private String Rstyle;
	private int Rprice;
	private String Rstate;
	private String Rtel;
}
