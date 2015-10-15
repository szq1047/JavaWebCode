package com.roomMgr.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.roomMgr.model.CustomerInfo;
import com.roomMgr.model.RoomInfo;

public class CustomerDB {
	public String url="jdbc:mysql://localhost:3306/db_roommgr";//数据库连接字符
	public String username="root";//数据库用户名
	public String password="123456";//数据库密码
	public static PreparedStatement stmt;
	public CustomerDB(){
		try{
			Class.forName("com.mysql.jdbc.Driver");//加载数据库驱动
		}catch(ClassNotFoundException e){
			throw new RuntimeException(e);
		}
	}
	
	//获取客户的信息
		public List<CustomerInfo> getCustomerInfo(String cno){
			List<CustomerInfo> list=null;
			Connection conn=null;
			PreparedStatement st=null;
			ResultSet rs=null;
			//String message=null;
			try{
				conn=DriverManager.getConnection(url,username,password);
				String sql=null;
				//st=conn.prepareStatement("select * from RoomInfo");
				if(cno.equals("")|| cno==null){
					sql="select * from CustomerInfo";
					st=conn.prepareStatement(sql);
				}else{
					sql="select * from CustomerInfo where Cno=?";
					st=conn.prepareStatement(sql);
					st.setString(1, cno);
				}
				rs=st.executeQuery();
				list=new ArrayList<CustomerInfo>();
				while(rs.next()){
					CustomerInfo cusInfo=new CustomerInfo();
					cusInfo.setCno(rs.getString("Cno"));
					cusInfo.setCname(rs.getString("Cname"));
					cusInfo.setCsex(rs.getString("Csex"));
					cusInfo.setCid(rs.getString("Cid"));
					list.add(cusInfo);
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
	//添加客户信息
		public int addCustomerInfo(CustomerInfo cusInfo){
			Connection conn=null;
			PreparedStatement st=null;
			int result=0;
			try{
				conn=DriverManager.getConnection(url,username,password);
				//st=conn.prepareStatement("select * from RoomInfo");
				//String sql="insert into RoomInfo values(?,?,?,?,?)";
				st = conn
						.prepareStatement("insert into CustomerInfo values(?,?,?,?)");
				st.setString(1, cusInfo.getCno());
				st.setString(2, cusInfo.getCname());
				st.setString(3, cusInfo.getCsex());
				st.setString(4, cusInfo.getCid());
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

		//返回客户信息，返回的JavaBean
		public CustomerInfo getCustomer(String cno){
			CustomerInfo customer=null;
			Connection conn=null;
			PreparedStatement st=null;
			ResultSet rs=null;
			//String message=null;
			try{
				conn=DriverManager.getConnection(url,username,password);
				String sql=null;
				//st=conn.prepareStatement("select * from RoomInfo");
				if(cno.equals("")|| cno==null){
					sql="select * from CustomerInfo";
					st=conn.prepareStatement(sql);
				}else{
					sql="select * from CustomerInfo where Cno=?";
					st=conn.prepareStatement(sql);
					st.setString(1, cno);
				}
				rs=st.executeQuery();
				customer=new CustomerInfo();
				while(rs.next()){
					customer.setCno(rs.getString("Cno"));
					customer.setCname(rs.getString("Cname"));
					customer.setCsex(rs.getString("Csex"));
					customer.setCid(rs.getString("Cid"));
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
			return customer;
		}
}
