package com.newlecture.web.controller.admin.notice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/admin/notice/list")
public class ListController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
	      
	      out.write("");
	      
	      out.write("<!DOCTYPE html>");
	      out.write("<html>");

	      out.write("<head>");
	      out.write("   <title>코딩 전문가를 만들기 위한 온라인 강의 시스템</title>");
	      out.write("   <meta charset=\"UTF-8\">");
	      out.write("   <title>공지사항목록</title>");
	      
	      out.write("   <link href=\"/css/customer/layout.css\" type=\"text/css\" rel=\"stylesheet\" />");
	      out.write("   <style>");
	      out.write("      #visual .content-container {");
	      out.write("         height: inherit;");
	      out.write("         display: flex;");
	      out.write("         align-items: center;");
	      
	      out.write("         background: url(\"/images/mypage/visual.png\") no-repeat center;");
	      out.write("      }");
	      out.write("   </style>");
	      out.write("</head>");

	      out.write("<body>");
	      out.write("   <!-- header 부분 -->");

	      out.write("   <header id=\"header\">");

	      out.write("      <div class=\"content-container\">");
	      out.write("         <!-- ---------------------------<header>--------------------------------------- -->");

	      out.write("         <h1 id=\"logo\">");
	      out.write("            <a href=\"/index.html\">");
	      out.write("               <img src=\"/images/logo.png\" alt=\"뉴렉처 온라인\" />");

	      out.write("            </a>");
	      out.write("         </h1>");

	      out.write("         <section>");
	      out.write("            <h1 class=\"hidden\">헤더</h1>");

	      
	      out.write("            <nav id=\"main-menu\">");
	      out.write("               <h1>메인메뉴</h1>");
	      out.write("               <ul>");
	      out.write("                  <li><a href=\"/guide\">학습가이드</a></li>");

	      out.write("                  <li><a href=\"/course\">강좌선택</a></li>");
	      for(int i=0; i<5; i++) {
	      out.write("                  <li><a href=\"/answeris/index\">AnswerIs</a></li>");
	      }
	      out.write("               </ul>");
	      out.write("            </nav>");
	      

	      out.write("            <div class=\"sub-menu\">");

	                           
	      out.write("</body>");

	      out.write("</html>");
	}
	
}
