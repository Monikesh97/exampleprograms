package com.moni.encapsulation;

public class Test {

	public static void main(String[] args) {
		Employee employee= new Employee();
		employee.setId(509);
		employee.setName("moni");
		employee.setSalary(100000);
		System.out.println("Employee ID : "+employee.getId());
		System.out.println("Employee Name : "+employee.getName());
		System.out.println("Employee Salary: "+employee.getSalary());
		

	}

}
