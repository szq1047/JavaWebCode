package com.roomMgr.Util;

import java.sql.*;
import java.util.*;

import com.roomMgr.model.RoomInfo;

public class RoomDB {
	public String url="jdbc:mysql://localhost:3306/db_roommgr";//数据库连接字符
	public String username="root";//数据库用户名
	public String password="123456";//数据库密码
	public static PreparedStatement stmt;
	public RoomDB(){
		try{
			Class.forName("com.mysql.jdbc.Driver");//加载数据库驱动
		}catch(ClassNotFoundException e){
			throw new RuntimeException(e);
		}
	}
	//获取房间的信息,返回list集合
	public List<RoomInfo> getRoomInfo(String rno){
		List<RoomInfo> list=null;
		Connection conn=null;
		PreparedStatement st=null;
		ResultSet rs=null;
		String message=null;
		try{
			conn=DriverManager.getConnection(url,username,password);
			String sql=null;
			//st=conn.prepareStatement("select * from RoomInfo");
			if(rno.equals("")|| rno==null){
				sql="select * from RoomInfo";
				st=conn.prepareStatement(sql);
			}else{
				sql="select * from RoomInfo where Rno=?";
				st=conn.prepareStatement(sql);
				st.setString(1, rno);
			}
			rs=st.executeQuery();
			list=new ArrayList<RoomInfo>();
			while(rs.next()){
				RoomInfo roomInfo=new RoomInfo();
				roomInfo.setRno(rs.getString("Rno"));
				roomInfo.setRstyle(rs.getString("Rstyle"));
				roomInfo.setRprice(rs.getInt("Rprice"));
				roomInfo.setRstate(rs.getString("Rstate"));
				roomInfo.setRtel(rs.getString("Rtel"));
				list.add(roomInfo);
				
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

	//获取房间的信息,返回Room对象
	public RoomInfo getRoom(String rno){
		RoomInfo room=null;
		Connection conn=null;
		PreparedStatement st=null;
		ResultSet rs=null;
		String message=null;
		try{
			conn=DriverManager.getConnection(url,username,password);
			String sql=null;
			//st=conn.prepareStatement("select * from RoomInfo");
			if(rno.equals("")|| rno==null){
				sql="select * from RoomInfo";
				st=conn.prepareStatement(sql);
			}else{
				sql="select * from RoomInfo where Rno=?";
				st=conn.prepareStatement(sql);
				st.setString(1, rno);
			}
			rs=st.executeQuery();
			
			while(rs.next()){
				room=new RoomInfo();
				room.setRno(rs.getString("Rno"));
				room.setRstyle(rs.getString("Rstyle"));
				room.setRprice(rs.getInt("Rprice"));
				room.setRstate(rs.getString("Rstate"));
				room.setRtel(rs.getString("Rtel"));
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
		return room;
	}
	//添加房间信息
	public int addRoomInfo(RoomInfo roomInfo){
		Connection conn=null;
		PreparedStatement st=null;
		int result=0;
		try{
			conn=DriverManager.getConnection(url,username,password);
			//st=conn.prepareStatement("select * from RoomInfo");
			//String sql="insert into RoomInfo values(?,?,?,?,?)";
			st = conn
					.prepareStatement("insert into RoomInfo values(?,?,?,?,?)");
			st.setString(1, roomInfo.getRno());
			st.setString(2, roomInfo.getRstyle());
			st.setInt(3, roomInfo.getRprice());
			st.setString(4, roomInfo.getRstate());
			st.setString(5,roomInfo.getRtel());
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

	//修改房间信息
	public int updateRoomInfo(RoomInfo roomInfo){
		Connection conn=null;
		PreparedStatement st=null;
		int result=0;
		try{
			conn=DriverManager.getConnection(url,username,password);
			//st=conn.prepareStatement("select * from RoomInfo");
			//String sql="insert into RoomInfo values(?,?,?,?,?)";
			st = conn
					.prepareStatement("update RoomInfo set Rstyle=?,Rprice=?,Rstate=?,Rtel=? where Rno=?");
			st.setString(1, roomInfo.getRstyle());
			st.setInt(2, roomInfo.getRprice());
			st.setString(3, roomInfo.getRstate());
			st.setString(4,roomInfo.getRtel());
			st.setString(5, roomInfo.getRno());
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

	//删除房间信息
	public int deleteRoomInfo(String rno){
		Connection conn=null;
		PreparedStatement st=null;
		int result=0;
		try{
			conn=DriverManager.getConnection(url,username,password);
			//st=conn.prepareStatement("select * from RoomInfo");
			//String sql="insert into RoomInfo values(?,?,?,?,?)";
			st = conn
					.prepareStatement("delete from RoomInfo where Rno=?");
			st.setString(1, rno);
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

	//获取房间Map<string,RoomInfo>，通过查询未占用的房间
	public Map<String,RoomInfo> getMapRoomInfo(String str){
		Map<String,RoomInfo> map=null;
		Connection conn=null;
		PreparedStatement st=null;
		ResultSet rs=null;
		ResultSet rs1=null;
		String message=null;
		try{
			conn=DriverManager.getConnection(url,username,password);
			String sql=null;
			//st=conn.prepareStatement("select * from RoomInfo");
			sql="select Rno from RoomInfo where Rstate='"+str+"'";
			System.out.println("sql="+sql);
			st=conn.prepareStatement(sql);
			rs=st.executeQuery();
			System.out.println("result="+rs.next());
			map=new HashMap<String,RoomInfo>();
			while(rs.next()){
				String rno=rs.getString("Rno");
				sql="select *from RoomInfo where Rno=?";
				st=conn.prepareStatement(sql);
				st.setString(1, rno);
				rs1=st.executeQuery();
				while(rs1.next()){
					RoomInfo roomInfo=new RoomInfo();
					roomInfo.setRno(rno);
					roomInfo.setRstyle(rs1.getString("Rstyle"));
					roomInfo.setRprice(rs1.getInt("Rprice"));
					roomInfo.setRstate(rs1.getString("Rstate"));
					roomInfo.setRtel(rs1.getString("Rtel"));
					map.put(rno, roomInfo);
				}	
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
		return map;
	}
	
	//根据房间的rno来修改房间的状态
	public int updateRoomInfoByRno(String rno){
		Connection conn=null;
		PreparedStatement st=null;
		int result=0;
		try{
			conn=DriverManager.getConnection(url,username,password);
			//st=conn.prepareStatement("select * from RoomInfo");
			//String sql="insert into RoomInfo values(?,?,?,?,?)";
			st = conn
					.prepareStatement("update RoomInfo set Rstate='占用' where Rno=?");
			st.setString(1, rno);
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
	
	//根据房间的rno来修改房间的状态
	public int updateRoomInfoByRno1(String rno){
		Connection conn=null;
		PreparedStatement st=null;
		int result=0;
		try{
			conn=DriverManager.getConnection(url,username,password);
			//st=conn.prepareStatement("select * from RoomInfo");
			//String sql="insert into RoomInfo values(?,?,?,?,?)";
			st = conn
					.prepareStatement("update RoomInfo set Rstate='未占用' where Rno=?");
			st.setString(1, rno);
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

	public List<RoomInfo> selectRoomInfo(String rstyle,String rstate){
		List<RoomInfo> list=null;
		Connection conn=null;
		PreparedStatement st=null;
		ResultSet rs=null;
		String message=null;
		try{
			conn=DriverManager.getConnection(url,username,password);
			String sql=null;
			//st=conn.prepareStatement("select * from RoomInfo");

			sql = "select * from RoomInfo where Rstyle=? and Rstate=?";
			st = conn.prepareStatement(sql);
			st.setString(1, rstyle);
			st.setString(2, rstate);

			rs=st.executeQuery();
			list=new ArrayList<RoomInfo>();
			while(rs.next()){
				RoomInfo roomInfo=new RoomInfo();
				roomInfo.setRno(rs.getString("Rno"));
				roomInfo.setRstyle(rs.getString("Rstyle"));
				roomInfo.setRprice(rs.getInt("Rprice"));
				roomInfo.setRstate(rs.getString("Rstate"));
				roomInfo.setRtel(rs.getString("Rtel"));
				list.add(roomInfo);
				
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


}
