package acess;
public class Student {
	protected String name;  
	private int age;
	public String address;
	Static String clgName;
	public void method1()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
		System.out.println(clgName);
	}
	public static void method2(){
		System.out.println(clgName);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st=new Student();
		Student s=new Student();
		st.age=29;
		st.address="pune";
		st.name="Ram";
		
		s.address="Katraj";
		s.age=22;
		s.name="Raj";
		
		st.method1();
		s.method1();
		method2();
		
	}

}
