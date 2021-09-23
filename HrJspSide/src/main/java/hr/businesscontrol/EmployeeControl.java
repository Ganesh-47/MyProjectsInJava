package hr.businesscontrol;

import java.util.HashSet;
import java.util.Scanner;

import hr.dac.EmployeeDataAccessControl;
import hr.entity.Employee;
public class EmployeeControl {

	public static HashSet<Employee> viewAllEmployees(){
		HashSet<Employee> hashsetEmp=EmployeeDataAccessControl.viewAllEmployee();
		return hashsetEmp;
	}
	@SuppressWarnings("resource")
	public static Employee find(int id){
		return EmployeeDataAccessControl.findEmployee(id);
	}
	@SuppressWarnings("resource")
	public static int delete(int id){
		return EmployeeDataAccessControl.deleteEmployee(id);
	}
	@SuppressWarnings("resource")
	public static int addNewEmployee(Employee modifiedemployee){
		
		return EmployeeDataAccessControl.insertNewEmployee(modifiedemployee);
	}
	@SuppressWarnings("resource")
	public static int update(Employee modifiedemployee){
		return EmployeeDataAccessControl.updateEmployee(modifiedemployee);
	}
	
}
