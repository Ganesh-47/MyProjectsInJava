package com.aspire.dbms;

import java.util.HashSet;
import java.util.Scanner;

public class EmployeeManager {
	
	public static void main(String[] args){
		view();
		//find();
	//	delete();
	//	insert();
	//	update();
	}
	public static void view(){
		HashSet<Employee> hashsetEmp=EmployeeDataAccessController.viewAllEmployee();
		for(Employee emp:hashsetEmp){
			System.out.println(emp);
		}
	}
	@SuppressWarnings("resource")
	public static void find(){
		Scanner scanner=new Scanner(System.in);
		System.out.println(EmployeeDataAccessController.findEmployee(scanner.nextInt()));
	}
	@SuppressWarnings("resource")
	public static void delete(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Deleted!!!"+EmployeeDataAccessController.findEmployee(scanner.nextInt()));
	}
	@SuppressWarnings("resource")
	public static void insert(){
		System.out.println("Id?");
		Scanner scanner=new Scanner(System.in);
		Employee modifiedemployee=new Employee(scanner.nextInt());
		System.out.println("Name: ");
		modifiedemployee.setName(scanner.nextLine());
		System.out.println("Salary: ");
		modifiedemployee.setSalary(scanner.nextDouble());
		System.out.println("Inserted!!!"+EmployeeDataAccessController.insertNewEmployee(modifiedemployee));
	}
	@SuppressWarnings("resource")
	public static void update(){
		System.out.println("Id?");
		Scanner scanner=new Scanner(System.in);
		Employee modifiedemployee=new Employee(scanner.nextInt());
		System.out.println("Name: ");
		modifiedemployee.setName(scanner.nextLine());
		System.out.println("Salary: ");
		modifiedemployee.setSalary(scanner.nextDouble());
		System.out.println("Inserted!!!"+EmployeeDataAccessController.updateEmployee(modifiedemployee));
	}
	
}
