package com.newlecture.web.controller.admin.member;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.newlecture.web.entity.Member;
import com.newlecture.web.service.MemberService;

@WebServlet("/admin/member/list")
public class ListController extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		int size = 5;
		
		String size_ = request.getParameter("size");
		
		if( size_ != null )
			size = Integer.parseInt(size_);
		
		PrintWriter out = response.getWriter();

	    MemberService service = new MemberService();
	    List<Member> list = service.getList();
	    
	    String html = "<table border='1'>";
	    
	    for(int i=0; i<size; i++) {
	    	Member m = list.get(i);
	    	int num = i+1;
	       html += "<tr>";
	       html += "<td>" + num + "</td><td>" + m.getNicname() + "</td><td>"+m.getName()+"</td>";
	       html += "</tr>";
	    }      
	    
	    html += "</table>";
	    
	    out.println(html);		
	}
}
