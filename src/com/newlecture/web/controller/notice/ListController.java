package com.newlecture.web.controller.notice;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.newlecture.web.entity.Member;
import com.newlecture.web.service.MemberService;

@WebServlet("/notice/member/list")
public class ListController extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();

	    MemberService service = new MemberService();
	    List<Member> list = service.getList();
	    
	    String html = "<table border='1'>";
	    
	    for(Member m : list) {
	       html += "<tr>";
	       html += "<td>" + m.getNicname() + "</td><td>"+m.getName()+"</td>";
	       html += "</tr>";
	    }      
	    
	    html += "</table>";
	    
	    out.println(html);		
	}
}

