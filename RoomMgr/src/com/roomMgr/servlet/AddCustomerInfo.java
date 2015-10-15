package com.roomMgr.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.roomMgr.Util.CustomerDB;
import com.roomMgr.model.CustomerInfo;

/**
 * Servlet implementation class AddCustomerInfo
 */
@WebServlet("/AddCustomerInfo")
public class AddCustomerInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCustomerInfo() {
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
		String cno=request.getParameter("cno");
		String cname=request.getParameter("cname");
		String csex=request.getParameter("csex");
		String cid=request.getParameter("cid");
		//System.out.println("cno="+cno+",csex="+csex);
		CustomerInfo cusInfo=new CustomerInfo();
		cusInfo.setCno(cno);
		cusInfo.setCname(cname);
		cusInfo.setCsex(csex);
		cusInfo.setCid(cid);
		CustomerDB db=new CustomerDB();
		int result=db.addCustomerInfo(cusInfo);
		if(result>0){
			RequestDispatcher rd=request.getRequestDispatcher("ViewCustomer.do?action=getCustomerInfo");
			rd.forward(request, response);
		}else{
			return;
		}
	}

}
