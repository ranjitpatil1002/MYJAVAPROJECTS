/**
 * 
 */
package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

/**
 * @author JARVIS
 *
 */
public class OracleExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:oracle:thin:@localhost:1521:XE";
		String user="system";
		String password="admin";
		Connection con=null;
		Statement stmt=null;
		try{
			
		Class.forName("oracle.jdbc.driver.OracleDriver");
		 con= DriverManager.getConnection(url, user, password);
		 stmt=con.createStatement();
		// String sql="create table MyStudTable(RollNo number(20), Name varchar(20),Addr varchar(20),Age number(10))";
		// stmt.executeUpdate(sql);
		 /*//String sql="create table Ironman(Id number(20), Name varchar(20))";
		
		
		//stmt.executeUpdate("insert into Ironman values(2,'Ironman2')");
		//System.out.println("record inserted successfully");
		//System.out.println("table created successfully");
		
		//ResultSet rs= stmt.executeQuery("select * from Ironman");
		while(rs.next()){
			//st=new Student(0, password, password, 0);
			System.out.println("Version: "+rs.getString(1));
			System.out.println("Name: "+rs.getString(2));
			
			System.out.println();
		}*/
		 Student [] stt=new Student[5];
		stmt.executeUpdate("insert into MyStudTable values(1,'Shamali','anguli',55)");
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
