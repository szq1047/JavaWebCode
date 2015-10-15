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
import com.roomMgr.model.UserInfo;

/**
 * Servlet implementation class UserLogin
 */
@WebServlet("/UserLogin")
public class UserLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
		String page="Login.jsp";
		String username="";
		String password="";
		try{
			username=request.getParameter("name");
			password=request.getParameter("password");
			if(username==null || password==null){
				return;
			}else{
				UserInfo userinfo=new UserInfo();
				int info=userinfo.CheckLoginInfo(username, password);
				System.out.println(info);
				if(info==1){
					page="index.jsp";
					
				}else if(info==2){
					request.setAttribute("userError", "用户名不存在");
				}else if(info==3){
					request.setAttribute("pwdError", "密码错误");
				}else if(info==4){
					request.setAttribute("messageError", "数据库错误");
				}
			}
		}catch(Exception e){
			
		}finally{
			request.setAttribute("username", username);
			RequestDispatcher rd=request.getRequestDispatcher(page);
			rd.forward(request, response);
		}
		
	}

}
