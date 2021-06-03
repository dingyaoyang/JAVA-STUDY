package iot.week14.tools;

import java.sql.Connection;
import java.sql.DriverManager;

//
public class DbConnection {
	private Connection con;
	
	public DbConnection(){
		String className = "com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/stu?useUnicode=true&characterEncoding=utf-8";
		String userName= "root";
		String password="990428";
		try{
			Class.forName(className);
			con=DriverManager.getConnection(url,userName,password);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Connection getCon() {
		return con;
	}
	
	public void close(){
		try{
			
			
			con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
