package com.aspire.dbms;

public class Employee implements Comparable<Employee> {
private final int Id;
private String name="";
private double salary=0;
public Employee(int id) {
	this.Id=id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double d) {
	this.salary = d;
}
public int getId() {
	return Id;
}
public int compareTo(Employee emp) {
	int result=-1;
	if(this.getClass().equals(emp.getClass())){
		if(this.Id>emp.Id)	result=1;
		else if(this.Id==emp.Id)	result=0;
		else result=-1;
	}
	return result;
}
@Override
public int hashCode(){
	return this.Id;
}
@Override
public String toString(){
	return this.Id+"\t"+this.name+" "+this.salary+";";
}
public boolean equals(Employee emp){
	if(this.Id==emp.Id)	return true;
	else return false;
	
}


}
