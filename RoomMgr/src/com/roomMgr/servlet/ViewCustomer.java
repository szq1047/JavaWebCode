package com.roomMgr.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.roomMgr.Util.CustomerDB;
import com.roomMgr.Util.RoomDB;
import com.roomMgr.model.CustomerInfo;
import com.roomMgr.model.RoomInfo;

/**
 * Servlet implementation class ViewCustomer
 */
@WebServlet("/ViewCustomer")
public class ViewCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewCustomer() {
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
		String action=request.getParameter("action");
		String cno=request.getParameter("Cno");
		//System.out.println("cno=="+cno);
		try {
			CustomerDB cusdb = new CustomerDB();
			RoomDB romdb=new RoomDB();
			List<CustomerInfo> list=new ArrayList<CustomerInfo>();
			Map<String,RoomInfo> roomMap=new HashMap<String,RoomInfo>();
			if(action.equals("getCustomerInfo")){
				list= cusdb.getCustomerInfo("");
				request.setAttribute("cusInfoList", list);
				RequestDispatcher rd = request.getRequestDispatcher("viewCustomer.jsp");
				rd.forward(request, response);
			}else if(action.equals("getCustomerInfoById")){
				//System.out.println("hello");
				list= cusdb.getCustomerInfo(cno);
				roomMap=romdb.getMapRoomInfo("未占用");
				request.setAttribute("cusInfoList", list);
				request.setAttribute("roomInfoHashMap", roomMap);
				RequestDispatcher rd = request.getRequestDispatcher("customerEntry.jsp");
				rd.forward(request, response);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

}
