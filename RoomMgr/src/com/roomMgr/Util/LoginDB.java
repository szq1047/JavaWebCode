package com.roomMgr.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDB {
	private String url="jdbc:mysql://localhost:3306/db_roommgr";//数据库连接字符
	private String username="root";//数据库用户名
	private String password="123456";//数据库密码
	private static PreparedStatement stmt;
	public LoginDB(){
		try{
			Class.forName("com.mysql.jdbc.Driver");//加载数据库驱动
		}catch(ClassNotFoundException e){
			throw new RuntimeException(e);
		}
	}
	// 登录验证
	public String CheckLoginInfo(String name, String pwd) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String message = null;
		try {
			conn = DriverManager.getConnection(url, username, password);
			stmt = conn
					.prepareStatement("select Username,userPwd from userinfo where Username=?");
			stmt.setString(1, name);
			// st=conn.createStatement();
			rs = stmt.executeQuery();
			if (rs.next() == false) {
				message = "用户名不存在";
			} else {
				stmt = conn
						.prepareStatement("select Username,userPwd from userinfo where Username=? and userPwd=?");
				stmt.setString(1, name);
				stmt.setString(2, pwd);
				rs = stmt.executeQuery();

				if (rs.next() == false) {
					message = "密码错误";
				} else {
					message = "登录成功";
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
			}
		}
		return message;
	}
}
