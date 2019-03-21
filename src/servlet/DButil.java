package servlet;

import java.sql.*;
import java.util.ArrayList;

public class DButil {

	static Connection con=null;
	Statement st;
	ResultSet rs;
	public int i=0;
	int q=0;
	public  ArrayList<String> ob=new ArrayList<String>();
	
	public  String str1="";
	public static Connection getconnect()
	{
		
		try
		{
			
		if(con==null)
			
			
			
		
		
		
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3308/prdatabase","root","root");
			System.out.println("connection created");
			
			
		}
		
	}
	catch(Exception e)
		{
		System.out.println(e);
		}
		return con;
}
	public void insert(String uname,String cont,String city,String addr,String pass) throws SQLException
	{
		try{
		String sql="insert into  info values('"+uname+"','"+pass+"','"+cont+"','"+city+"','"+addr+"')";
		Statement st=con.createStatement();
		st.executeUpdate(sql);}
		catch(Exception e){
			
			System.out.println(e);
		}
		
	}
	
	
	
	
	
	
	
	public  ArrayList<String> getdata(String str) throws SQLException
	{
		
		
		try{
		String sql="select * from info;";
		Statement st=con.createStatement();
		
		
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) { 
		
			str1=rs.getString("pass");
		System.out.println(str1);
		 ob.add(str1);
		
		 
		
		
		}
		
		
		
		}
		
		catch(Exception e){
			
			System.out.println(e);
		}
		
		
		
		//this is must bec we write in try it gives error bec that block so write in here
		return ob; 
	}
	
	
	
	
	public static void main(String[] args) throws SQLException {
		DButil db = new DButil();
		System.out.println(db.getconnect());
		String s="kirubhsa";
		db.getdata(s);
	}
}

