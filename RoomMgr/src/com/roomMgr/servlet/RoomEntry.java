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
import com.roomMgr.model.CustomerLivingInfo;

/**
 * Servlet implementation class RoomEntry
 */
@WebServlet("/RoomEntry")
public class RoomEntry extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RoomEntry() {
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
		//功能：在customerEntry.jsp中点击开房的按钮，首先在CustomerLivingInfo表中插入信息，而且要修改对应房间号的状态信息（在RoomInfo)中
		//如果成功的话，则跳转到退房管理页面，首先需要加载所有的已经办理了入住的信息，交给viewCustomerEntryInfo.do处理
		String cno=request.getParameter("cno");
		String rno=request.getParameter("rno");
		String tfromDate=request.getParameter("tfromDate");
		String tleftDate=request.getParameter("tleftDate");
		double tmoney=Double.parseDouble(request.getParameter("tmoney"));
		double tdeposit=Double.parseDouble(request.getParameter("tdeposit"));
		//System.out.println(cno+","+rno+","+tfromDate+","+tleftDate+","+tmoney+","+tdeposit);
		CustomerLivingInfo info=new CustomerLivingInfo();
		info.setCno(cno);
		info.setRno(rno);
		info.setTenrollDate(tfromDate);
		info.setTleftDate(tleftDate);
		info.setTmoney(tmoney);
		info.setDeposit(tdeposit);
		CustomerLivingInfoDB db=new CustomerLivingInfoDB();
		int result=db.addCustomerLivingInfo(info);
		if(result>0){
			//如果添加成功的话，需要将RoomInfo信息的对应的房间号的状态改为已经”占用“
			RoomDB rdb=new RoomDB();
			int result1=rdb.updateRoomInfoByRno(rno);
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
