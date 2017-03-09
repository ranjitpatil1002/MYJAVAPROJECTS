/**
 * 
 */
package com.demo.jdbc;

/**
 * @author JARVIS
 *
 */
public class Student {
			private int RollNo;
			private String Name;
			private String Address;
			private int Age;
			public String toString(){
				return "RollNo.: "+RollNo+"  Name: "+Name+"  Address: "+Address+"  Age: "+Age+"\n";
			}
	/**
	 * @param args
	 */
			/*public Student(int rollNo, String name, String address, int age) {
				super();
				RollNo = rollNo;
				Name = name;
				Address = address;
				Age = age;
			}*/
	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	
}
