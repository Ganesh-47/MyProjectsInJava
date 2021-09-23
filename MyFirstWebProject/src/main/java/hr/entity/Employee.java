package hr.entity;
public class Employee implements Comparable<Employee> {
private final int Id;
private String name="";
private String city="";
private double salary=0;
public String getCity() {
	return city;
}
public boolean setCity(String city) throws Exception {
	
	String lowercity=city.toLowerCase();
	boolean flag=true;
	char letterarray[]=lowercity.toCharArray();
		for(int i=0;i<city.length();i++){
			char c=letterarray[i];
			int ascii=(int)c;
		if(((ascii<(int)'a'||ascii>(int)'z')&&c!=' ')||lowercity.length()<=2||lowercity.length()>30){
			flag= false;
			break;
		}
		
		}
		if(flag==true){
			for(int i=0;i<city.length()-2;i++){
				if((letterarray[i]==letterarray[i+1])&&(letterarray[i]==letterarray[i+2])){
					flag=false;
					break;
				}
			}
		}
	if(flag==true){		
	this.city = city;
	}else {
		throw new Exception("City invalid");
	}
	//this.city = city;
	return flag;
	
}
public Employee(int id) {
	this.Id=id;
}
public String getName() {
	return name;
}
public boolean setName(String name) throws Exception {
	String lowername=name.toLowerCase();
	boolean flag=true;
	char letterarray[]=lowername.toCharArray();
		for(int i=0;i<name.length();i++){
			char c=letterarray[i];
			int ascii=(int)c;
		if(((ascii<(int)'a'||ascii>(int)'z')&&c!=' ')||lowername.length()<=2||lowername.length()>30){
			flag= false;
			break;
		}
		
		}
		if(flag==true){
			for(int i=0;i<name.length()-2;i++){
				if((letterarray[i]==letterarray[i+1])&&(letterarray[i]==letterarray[i+2])){
					flag=false;
					break;
				}
			}
		}
	if(flag==true){		
	this.name = name;
	}else {
		throw new Exception("name invalid");
	}
	//this.name = name;
	return flag;
}
public double getSalary() {
	return salary;
}
public boolean setSalary(Double salary) throws Exception {
	this.salary = salary;
	return true;
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
