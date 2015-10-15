package com.roomMgr.model;


import com.roomMgr.Util.LoginDB;
import com.roomMgr.Util.RoomDB;

public class UserInfo {
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getUserPwd() {
		return UserPwd;
	}
	public void setUserPwd(String userPwd) {
		UserPwd = userPwd;
	}
	public int getSno() {
		return Sno;
	}
	private int Sno;
	private String Username;
	private String UserPwd;
	
	public int CheckLoginInfo(String name,String pwd)
	{
		LoginDB connectDB=new LoginDB();
		String result=connectDB.CheckLoginInfo(name,pwd);
		if(result.equals("登录成功")){
			return 1;//登录成功
			
		}else if(result.equals("用户名不存在")){
			return 2;//用户名不存在
		}else if(result.equals("密码错误")){
			return 3;//密码错误
		}else{
			return 4;//未知错误
		}
	}
}
