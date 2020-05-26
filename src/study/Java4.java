package study;

import java.util.ArrayList;

public class Java4 {
	private String name;
	private double height;
	
	//name에 대한 setter
	public void setName(String name) {
		this.name = name;
	}
	//name에 대한 getter
	public String getName() {
		return name;
	}
	
	//height에 대한 setter
	public void setHeight(double height) {
		this.height = height;
	}
	//height에 대한 getter
	public double getHeight() {
		return height;
	}
	
	Java4() {
		this.name = name;
		this.height = height;
		
	}
	
	public int plus(int first, int second) {	
		return first + second;
	}
	
	public void print() {
		System.out.println(name + "," + height);
	}
	
	public ArrayList<Customer> list(){
		ArrayList<Customer> list = new ArrayList<Customer>();
		list.add(new Customer("성영한1"));
		list.add(new Customer("성영한2"));
		//Customer c1 = new Customer("성영한3");
		//list.add(c1);
		
		return list;
	}
	
	public static void main(String[] args) {
		Java4 j= new Java4();
		ArrayList<Customer> list = j.list();
		
		for(Customer cust : list) {
			System.out.println(cust.name);
		}
		
		
		//Java4 j1 = new Java4("a1",170.2);
		//j1.name = "a1";
		//j1.height = 170.2;
		//j1.print();
		//int result1 = j1.plus(100, 2000);
		
		//System.out.println(result1);
		//System.out.println(j1.name);
		//System.out.println(j1.height);
		
		//Java4 j2 = new Java4("a2", 180.3);
		//j2.setName("a2");
		//j2.name = "a2";
		//j2.height = 180.3;
		
		//System.out.println(j2.getName());
		//System.out.println(j2.getHeight());

		//Java4 j3 = new Java4("a3", 150.4);
		//j3.name = "a3";
		//j3.height = 150.4;
		
		//System.out.println(j3.name);
		//System.out.println(j3.height);
		
		//Java4 j4 = j1;
		
	
	}
}
//ArrayList만 주구장창 하기
//예외처리 중요(try, throw, catch)
//JDBC (Java DataBase Connectivity)

