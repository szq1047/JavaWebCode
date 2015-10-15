package com.roomMgr.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.roomMgr.Util.RoomDB;
import com.roomMgr.model.RoomInfo;

/**
 * Servlet implementation class RoomInfoById
 */
@WebServlet("/GetRoomInfoById")
public class GetRoomInfoById extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetRoomInfoById() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		/*String uri = request.getRequestURI();
		System.out.println("uri:"+uri);
		String path = uri.substring(uri.lastIndexOf("/"), uri.lastIndexOf("."));
		System.out.println("path:" + path);
		if ("/roomInfoById".equals(path)) {*/
			String rno=request.getParameter("rno");
			System.out.println(rno);
			RoomDB db=new RoomDB();
			List<RoomInfo> list=new ArrayList<RoomInfo>();
			list=db.getRoomInfo(rno);
			JSONArray jsonArray = JSONArray.fromObject(list);
			String jsonStrRoom = jsonArray.toString();
			System.out.println(jsonStrRoom);
			out.println(jsonStrRoom);
			}
		//System.out.println("hello");

}
