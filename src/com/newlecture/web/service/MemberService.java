package com.newlecture.web.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.newlecture.web.entity.Member;

public class MemberService {

	public List<Member> getList() {
		List<Member> list = new ArrayList<>();
		
		String url = "jdbc:oracle:thin:@hi.namoolab.com:1521/xepdb1";
		String sql = "select * from member where pwd = '111'";
		
		try {
			
			Connection con = DriverManager.getConnection(url, "NEWLEC", "11111");		
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			int i = 0;
			while(rs.next()) {
				int id = rs.getInt("id");
				String nicname = rs.getString("NICNAME");	
				String pwd = rs.getString("PWD");		
				String name = rs.getString("NAME");
				
				Member m = new Member();
				m.setID(id);
				m.setNicname(nicname);
				m.setName(name);
				m.setPwd(pwd);
				
				list.add(m);
			}
			
			rs.close();
			st.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

}
