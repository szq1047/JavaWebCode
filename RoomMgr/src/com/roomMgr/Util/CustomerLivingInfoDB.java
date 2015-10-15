package com.roomMgr.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.roomMgr.model.CustomerLivingInfo;
import com.roomMgr.model.RoomInfo;

public class CustomerLivingInfoDB {
	public String url="jdbc:mysql://localhost:3306/db_roommgr";//数据库连接字符
	public String username="root";//数据库用户名
	public String password="123456";//数据库密码
	public static PreparedStatement stmt;
	public CustomerLivingInfoDB(){
		try{
			Class.forName("com.mysql.jdbc.Driver");//加载数据库驱动
		}catch(ClassNotFoundException e){
			throw new RuntimeException(e);
		}
	}
	//添加顾客住房记录
	public int addCustomerLivingInfo(CustomerLivingInfo Info){
		Connection conn=null;
		PreparedStatement st=null;
		int result=0;
		try{
			conn=DriverManager.getConnection(url,username,password);
			//st=conn.prepareStatement("select * from RoomInfo");
			//String sql="insert into RoomInfo values(?,?,?,?,?)";
			st = conn
					.prepareStatement("insert into CustomerLivingInfo values(?,?,?,?,?,?)");
			st.setString(1, Info.getCno());
			st.setString(2, Info.getRno());
			st.setString(3, Info.getTenrollDate());
			st.setString(4, Info.getTleftDate());
			st.setDouble(5,Info.getTmoney());
			st.setDouble(6,Info.getDeposit());
			result=st.executeUpdate();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(st!=null){
					st.close();
				}
				if(conn!=null){
					conn.close();
				}
			}catch(Exception e){}
		}
		return result;
	}

	//获得顾客住房记录
	public List<CustomerLivingInfo> getCustomerLivingInfo(String[] str){
		List<CustomerLivingInfo> list=null;
		Connection conn=null;
		PreparedStatement st=null;
		ResultSet rs=null;
		String cno=null;
		String rno=null;
		try{
			//System.out.println("这是rno和cno都为空的情况");
			conn=DriverManager.getConnection(url,username,password);
			String sql=null;
			cno=str[0];
			rno=str[1];
			//System.out.println(str[0]==null);
			//st=conn.prepareStatement("select * from RoomInfo");
			if(str[0]==null){
				System.out.println("这是rno和cno都为空的情况");
				sql="select * from CustomerLivingInfo";
				st=conn.prepareStatement(sql);
			}else{
				System.out.println("这是rno和cno都不为空的情况");
				sql="select * from CustomerLivingInfo where Cno=? and Rno=?";
				st=conn.prepareStatement(sql);
				st.setString(1, cno);
				st.setString(2, rno);
			}
			rs=st.executeQuery();
			list=new ArrayList<CustomerLivingInfo>();
			while(rs.next()){
				CustomerLivingInfo customerLivingInfo=new CustomerLivingInfo();
				customerLivingInfo.setCno(rs.getString("Cno"));
				customerLivingInfo.setRno(rs.getString("Rno"));
				customerLivingInfo.setTenrollDate(rs.getString("TenrollDate"));
				customerLivingInfo.setTleftDate(rs.getString("TleftDate"));
				customerLivingInfo.setTmoney(rs.getDouble("Tmoney"));
				customerLivingInfo.setDeposit(rs.getDouble("Tdeposit"));
				list.add(customerLivingInfo);
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(rs!=null){
					rs.close();
				}
				if(stmt!=null){
					stmt.close();
				}
				if(conn!=null){
					conn.close();
				}
			}catch(Exception e){}
		}
		return list;
	}
	
	//修改押金为0
	public int UpdateCustomerLivingInfo(String cno,String rno){
		Connection conn=null;
		PreparedStatement st=null;
		int result=0;
		try{
			conn=DriverManager.getConnection(url,username,password);
			//st=conn.prepareStatement("select * from RoomInfo");
			//String sql="insert into RoomInfo values(?,?,?,?,?)";
			System.out.println("cno="+cno+",rno="+rno);
			st=conn.prepareStatement("update customerlivinginfo set Tdeposit=0 where Cno=? and Rno=?");
			st.setString(1, cno);
			st.setString(2, rno);
			result=st.executeUpdate();
		}catch(Exception e){}
		return result;
	}
}
