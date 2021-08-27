package com.aspire.collections;


public class Employee implements Comparable
{
 public int Id; //public int Id;
 public String Name;
 public Employee() {}
 public Employee(int i) {this.Id=i;}
 
 public boolean equals(Object obj)
 {
  Class c1=obj.getClass();
  boolean flag=false;
  if(c1==this.getClass())
  {
   Employee other=(Employee)obj;
   if(this.hashCode()==other.hashCode()) flag=true;
  }
  return flag;
 }
 public int hashCode()
 {
  return this.Id;
 }
 @Override
 public int compareTo(Object obj) {
  int result=-1;
  if (obj instanceof Employee)
  {
   Employee e2 = (Employee) obj;
   if(this.Id==e2.Id) result=0;
   else if(this.Id>e2.Id) result=1;
  }
  return result;
 } 
}


