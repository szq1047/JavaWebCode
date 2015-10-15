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

/**
 * Servlet implementation class UpdateRoomInfo
 */
@WebServlet("/UpdateRoomInfo")
public class UpdateRoomInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateRoomInfo() {
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
		int rprice=0;
		String rno=request.getParameter("rno");
		String rstyle=request.getParameter("rstyle");
		String price=request.getParameter("rprice");
		if(price!=null &&!price.equals("")){
			rprice=Integer.parseInt(price);
		}
		String rstate=request.getParameter("rstate");
		String rtel=request.getParameter("rtel");
		RoomInfo roomInfo=new RoomInfo();
		roomInfo.setRno(rno);
		roomInfo.setRprice(rprice);
		roomInfo.setRstate(rstate);
		roomInfo.setRstyle(rstyle);
		roomInfo.setRtel(rtel);
		RoomDB roomdb=new RoomDB();
		int result=roomdb.updateRoomInfo(roomInfo);
		if(result>0){
			//System.out.println("恭喜你，修改成功@！");
			RequestDispatcher rd=request.getRequestDispatcher("RoomManage.do?action=getRoomInfo");
			rd.forward(request, response);
			//response.sendRedirect("addNewRoom.do");
		}else{
			return;
		}
	}

}
