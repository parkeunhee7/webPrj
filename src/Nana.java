import javax.servlet.*;
import javax.servlet.http.*;

import com.newlecture.web.entity.Member;
import com.newlecture.web.service.MemberService;

import java.io.*;
import java.util.List;


public class Nana extends HttpServlet {
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		PrintWriter out = response.getWriter();

		MemberService service = new MemberService();
		List<Member> list = service.getList();
		
		String url = "jdbc:oracle:thin:@hi.namoolab.com:1521/xepdb1";
		String sql = "select * from member";

		for(Member m : list)
			out.printf("nicname : %s, name : %s, pwd : %s \n", m.getNicname(), m.getName(), m.getPwd());
		
		
	}

}
