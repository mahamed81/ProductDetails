package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RetrieveDetail {
	
		
	public static Connection getConnection(){
		Connection con=null;
		try{
			Class.forName("org.h2.Driver");
			con=DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
		}catch(Exception e){System.out.println(e);}
		return con;
	}
	
	
	public static Product getRecordById(int productid){
		Product u=null;
		try{
			Connection con=getConnection();
			PreparedStatement ps=con.prepareStatement("select * from product where productid=?");
			ps.setInt(1,productid);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				u=new Product();
				u.setProductId((rs.getInt("productid")));
				u.setProductName(rs.getString("productname"));
				u.setProductPrice(rs.getInt("productprice"));
				
			}
		}catch(Exception e){
			System.out.println(" srry " +e);
			
		}
		return u;
	}
	}
	
	
