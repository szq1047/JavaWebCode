package com.roomMgr.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.roomMgr.Util.CustomerDB;
import com.roomMgr.Util.CustomerLivingInfoDB;
import com.roomMgr.Util.RoomDB;
import com.roomMgr.model.CustomerInfo;
import com.roomMgr.model.CustomerLivingInfo;
import com.roomMgr.model.RoomInfo;

import java.util.*;


/**
 * Servlet implementation class ViewCustomerEntryInfo
 */
@WebServlet("/ViewCustomerEntryInfo")
public class ViewCustomerEntryInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewCustomerEntryInfo() {
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
		List<CustomerLivingInfo> livingInfo=new ArrayList<CustomerLivingInfo>();
		List<RoomInfo> roomInfo=new ArrayList<RoomInfo>();
		List<CustomerInfo> cusInfo=new ArrayList<CustomerInfo>();
		CustomerLivingInfoDB livingDB=new CustomerLivingInfoDB();
		CustomerDB cosDB=new CustomerDB();
		RoomDB roomDB=new RoomDB();
		String action=request.getParameter("action");
		String Cno=request.getParameter("Cno");
		String Rno=request.getParameter("Rno");
		//System.out.println("Cno="+Cno+",Rno="+Rno+",action="+action);
		String[] str=new String[]{Cno,Rno};
		//System.out.println("str========"+str);
		livingInfo=livingDB.getCustomerLivingInfo(str);
		System.out.println(livingInfo);
		for(int i=0;i<livingInfo.size();i++){
			CustomerInfo cos=new CustomerInfo();
			RoomInfo room=new RoomInfo();
			String cno=livingInfo.get(i).getCno();
			String rno=livingInfo.get(i).getRno();
			cos=cosDB.getCustomer(cno);
			room=roomDB.getRoom(rno);
			cusInfo.add(cos);
			roomInfo.add(room);
		}
		request.setAttribute("livingInfo", livingInfo);
		request.setAttribute("roomInfo", roomInfo);
		request.setAttribute("cusInfo", cusInfo);
		if(action.equals("getCustomerEntryInfo")){
			RequestDispatcher rd=request.getRequestDispatcher("viewCustomerEntryInfo.jsp");
			rd.forward(request, response);
		}else if(action.equals("getLivingInfoById")){
			RequestDispatcher rd=request.getRequestDispatcher("checkOutRoom.jsp");
			rd.forward(request, response);
		}
		
	}

}
