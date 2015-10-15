package com.roomMgr.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.roomMgr.Util.RoomDB;
import com.roomMgr.model.RoomInfo;
import com.roomMgr.model.UserInfo;

import java.util.*;

/**
 * Servlet implementation class RoomManage
 */
@WebServlet("/RoomManage")
public class RoomManage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RoomManage() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//String page = "Login.jsp";
		String action=request.getParameter("action");
		String rno=request.getParameter("Rno");
		//System.out.println("rno=="+rno);
		try {
			RoomDB roomdb = new RoomDB();
			List<RoomInfo> list=new ArrayList<RoomInfo>();
			if(action.equals("getRoomInfo")){
				list= roomdb.getRoomInfo("");
				request.setAttribute("roomInfoList", list);
				RequestDispatcher rd = request.getRequestDispatcher("roomManage.jsp");
				rd.forward(request, response);
			}else if(action.equals("getRoomInfoById")){
				//System.out.println("hello");
				list= roomdb.getRoomInfo(rno);
				//System.out.println("list"+list);
				request.setAttribute("roomInfoList", list);
				RequestDispatcher rd = request.getRequestDispatcher("UpdateRoomInfo.jsp");
				rd.forward(request, response);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} 

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
