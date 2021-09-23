package com.aspire.dbms;

import java.util.HashSet;
import java.util.Scanner;

public class EmployeeControl {

	public static HashSet<Employee> viewAllEmployees(){
		HashSet<Employee> hashsetEmp=EmployeeDataAccessController.viewAllEmployee();
		return hashsetEmp;
	}
	@SuppressWarnings("resource")
	public static Employee find(int id){
		return EmployeeDataAccessController.findEmployee(id);
	}
	
	@SuppressWarnings("resource")
	public static void delete(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Deleted!!!"+EmployeeDataAccessController.findEmployee(scanner.nextInt()));
	}
	@SuppressWarnings("resource")
	public static int insert(Employee modifiedemployee){
		
		return EmployeeDataAccessController.insertNewEmployee(modifiedemployee);
	}
	@SuppressWarnings("resource")
	public static int update(Employee modifiedemployee){
		return EmployeeDataAccessController.updateEmployee(modifiedemployee);
	}
	
}
