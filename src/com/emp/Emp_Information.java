package com.emp;

public class Emp_Information {

	public Emp_Information() {
		System.out.println("Employee Details");
	}
	public Emp_Information(int id) {
		System.out.println("Employee id is:"+id);
	}
	public Emp_Information(String name) {
		System.out.println("Employee Name is:"+name);
	}
	public Emp_Information(double salary) {
		System.out.println("Employee Salary is:"+salary);
	}
	
	public static void main(String[] args) {
		Emp_Information emp=new Emp_Information();
		Emp_Information emp1=new Emp_Information(6548);
		Emp_Information emp2=new Emp_Information("Saru");
		Emp_Information emp3=new Emp_Information(56000.0);
	}
}
