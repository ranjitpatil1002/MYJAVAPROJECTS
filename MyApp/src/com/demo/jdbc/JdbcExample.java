package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

public class JdbcExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Student st=new Student();
		
		String url="jdbc:mysql://localhost:3306/dbnm";
		String user="root";
		String password="123";
		Connection con=null;
		Statement stmt=null;
		try{
			
		Class.forName("com.mysql.jdbc.Driver");
		 con= DriverManager.getConnection(url, user, password);
		 stmt=con.createStatement();
		//String sql="create table Login(user varchar(20), password varchar(20))";
		//stmt.executeUpdate(sql);
		//stmt.executeUpdate("insert into Login values('raju','rastogi')");
		//System.out.println("table created successfully");
		Student [] stt=new Student[5];
		/*ResultSet rs= stmt.executeQuery("select * from Login");
		while(rs.next()){
			//st=new Student(0, password, password, 0);
			System.out.println("USERNAME: "+rs.getString(1));
			System.out.println("PASSWORD: "+rs.getString(2));
			
			System.out.println();
		}*/
		//stmt.executeUpdate("insert into MyStudTable values(3,'Shamali','anguli',5)");
		//stmt.executeUpdate("update MyStudTable set name='Rana' where RollNo=2");
		//stmt.executeUpdate("delete from MyStudTable where RollNo=2");
		ResultSet rs= stmt.executeQuery("select * from MyStudTable");
		Student ss=null;
		int count=0;
		while(rs.next()){
			ss=new Student();
			/*System.out.println("ID: "+rs.getInt(1));
			System.out.println("NAME: "+rs.getString(2));
			System.out.println("ADDRESS: "+rs.getString(3));
			System.out.println("AGE: "+rs.getInt(4));
			System.out.println();*/
			
			ss.setRollNo(rs.getInt(1));
			ss.setName(rs.getString(2));
			ss.setAddress(rs.getString(3));
			ss.setAge(rs.getInt(4));
			stt[count]=ss;
			count++;
		}
		System.out.println(Arrays.toString(stt));
		}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally{
			try{
			stmt.close();
			con.close();
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}		
	}

}
