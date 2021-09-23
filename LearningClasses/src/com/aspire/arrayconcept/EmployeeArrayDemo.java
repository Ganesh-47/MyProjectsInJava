package com.aspire.arrayconcept;

public class EmployeeArrayDemo
{
  public static void main(String args[])
  {
    Employee elist[] = new Employee[10];
    for(int i = 0; i < 10; i++)
    {
    	Employee e1=new Employee(i);
    	e1.setName("Emp"+i);
    	elist[i] =e1;
    }
    System.out.println("No of Employees "+elist.length);
   
    for(Employee e1 : elist)
    {
System.out.println("ID="+e1.getID()+" Name="+e1.getName());
}
  }
}
