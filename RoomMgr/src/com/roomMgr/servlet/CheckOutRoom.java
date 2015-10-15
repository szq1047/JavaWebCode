package com.roomMgr.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.roomMgr.Util.CustomerLivingInfoDB;
import com.roomMgr.Util.RoomDB;

/**
 * Servlet implementation class CheckOutRoom
 */
@WebServlet("/CheckOutRoom")
public class CheckOutRoom extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckOutRoom() {
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
		//结算后的操作，也就是退房了，首先应该需要将押金改为0，然后将房间的状态信息改为"未占用"
		CustomerLivingInfoDB db=new CustomerLivingInfoDB();
		String cno=request.getParameter("cno");
		String rno=request.getParameter("rno");
		//System.out.println("cno=="+cno+",rno="+rno);
		int result=db.UpdateCustomerLivingInfo(cno, rno);
		System.out.println("result==="+result);
		if(result>0){
			RoomDB roomdb=new RoomDB();
			int result1=roomdb.updateRoomInfoByRno1(rno);
			if(result1>0){
				RequestDispatcher rd=request.getRequestDispatcher("viewCustomerEntryInfo.do?action=getCustomerEntryInfo");
				rd.forward(request, response);
			}else{
				return;
			}
		}else{
			return;
		}
	}

}
