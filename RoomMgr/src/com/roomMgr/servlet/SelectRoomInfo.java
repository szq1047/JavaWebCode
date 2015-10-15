package com.roomMgr.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.roomMgr.Util.RoomDB;
import com.roomMgr.model.RoomInfo;

import java.util.*;

/**
 * Servlet implementation class SelectRoomInfo
 */
@WebServlet("/SelectRoomInfo")
public class SelectRoomInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectRoomInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String rstyle=request.getParameter("rstyle");
		String rstate=request.getParameter("rstate");
		//System.out.println("rstyle="+rstyle+",rstate="+rstate);
		List<RoomInfo> roomList=new ArrayList<RoomInfo>();
		RoomDB rdb=new RoomDB();
		roomList=rdb.selectRoomInfo(rstyle, rstate);
		request.setAttribute("selectRoomInfo", roomList);
		request.setAttribute("message", "getRoomBySelect");
		RequestDispatcher rd=request.getRequestDispatcher("roomManage.jsp");
		rd.forward(request, response);
		
	}

}
