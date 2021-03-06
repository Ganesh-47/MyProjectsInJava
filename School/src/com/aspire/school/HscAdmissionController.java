package com.aspire.school;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class HscAdmissionController {
	static Scanner scanner=new Scanner(System.in);
	public static void control(){
		ArrayList<Student> student=new ArrayList<Student>();
		while(true){
		boolean flagForMenu=false;
		while(flagForMenu==false){
		System.out.println("----------------------------------------------\n\t\t\tMenu\n----------------------------------------------\n1. New Admission\n2. List Of Student By Group\n3. Student Detail By Mobile Number\n----------------------------------------------\nChoose Your Option(1/2/3)");
		String switchstring=scanner.next();
		switch(switchstring){
		case "1":{
			student.add(SchoolUI.ui());
			System.out.println("......Successfully choosen the department.....");
			flagForMenu=true;
			break;
		}
		case "2":{
			boolean flagForCaseB=false;
			while(flagForCaseB==false){
			System.out.println("1. Biology\n2. Computer science\n3. Pure science\n4. Arts\nChoose the department (Eg : 1/2/3/4):");
			String groupswitch=scanner.nextLine();
			switch(groupswitch){
			case "1":{
				for(Student studentobject:student){
					String currentgroup=studentobject.getGroup();
					if(currentgroup.equals("Biology")){
						System.out.println("Name     : "+studentobject.getName());
						System.out.println("Age      : "+studentobject.getAge());
						System.out.println("Mobile   : "+studentobject.getMobileNo());
						System.out.println("Address  : "+studentobject.getAddress());
						System.out.println("DOB      : "+studentobject.getDate().format(DateTimeFormatter.ofPattern("dd-MMM-yyyy")));
						System.out.println("SSLC Mark: "+studentobject.getSslcmark());
						
						System.out.println("-------------------------");
					}
					
				}
				flagForCaseB=true;
				
				break;
			}
			case "2":{
				for(Student studentObjectForCaseTwo:student){
					String currentgroup=studentObjectForCaseTwo.getGroup();
					if(currentgroup.equals("Computer science")){
						System.out.println("Name     : "+studentObjectForCaseTwo.getName());
						System.out.println("Age      : "+studentObjectForCaseTwo.getAge());
						System.out.println("Mobile   : "+studentObjectForCaseTwo.getMobileNo());
						System.out.println("Address  : "+studentObjectForCaseTwo.getAddress());
						System.out.println("DOB      : "+studentObjectForCaseTwo.getDate().format(DateTimeFormatter.ofPattern("dd-MMM-yyyy")));
						System.out.println("SSLC Mark: "+studentObjectForCaseTwo.getSslcmark());
						System.out.println("-------------------------");
					}
					
				}
				flagForCaseB=true;
				break;
			}
			case "3":{
				for(Student studentobjectforcasethree:student){
					String currentgroup=studentobjectforcasethree.getGroup();
					if(currentgroup.equals("Pure science")){
						System.out.println("Name     : "+studentobjectforcasethree.getName());
						System.out.println("Age      : "+studentobjectforcasethree.getAge());
						System.out.println("Mobile   : "+studentobjectforcasethree.getMobileNo());
						System.out.println("Address  : "+studentobjectforcasethree.getAddress());
						System.out.println("DOB      : "+studentobjectforcasethree.getDate().format(DateTimeFormatter.ofPattern("dd-MMM-yyyy")));
						System.out.println("SSLC Mark: "+studentobjectforcasethree.getSslcmark());
						System.out.println("-------------------------");
					}
					
				}
				flagForCaseB=true;
				break;
				
			}
			case "4":{
				for(Student studentobjectforcasefour:student){
					String currentgroup=studentobjectforcasefour.getGroup();
					if(currentgroup.equals("Arts")){
						System.out.println("Name     : "+studentobjectforcasefour.getName());
						System.out.println("DOB      : "+studentobjectforcasefour.getDate().format(DateTimeFormatter.ofPattern("dd-MMM-yyyy")));
						System.out.println("Age      : "+studentobjectforcasefour.getAge());
						System.out.println("Mobile   : "+studentobjectforcasefour.getMobileNo());
						System.out.println("Address  : "+studentobjectforcasefour.getAddress());
						System.out.println("SSLC Mark: "+studentobjectforcasefour.getSslcmark());
						System.out.println("-------------------------");
					}
					
				}
				flagForCaseB=true;
				break;
			}
			default:{
				System.out.println("Enter valid choice: ");
				flagForCaseB=false;
			}
			}
			}
			flagForMenu=true;
			break;
		}
		case "3":{
			long mobile=DataValidator.validatemobilenumber();
			for(Student studentobjectformaincasethree:student ){
				if(studentobjectformaincasethree.getMobileNo()==mobile){
					System.out.println("Name     : "+studentobjectformaincasethree.getName());
					System.out.println("DOB      : "+studentobjectformaincasethree.getDate().format(DateTimeFormatter.ofPattern("dd-MMM-yyyy")));
					System.out.println("Age      : "+studentobjectformaincasethree.getAge());
					System.out.println("Group    : "+studentobjectformaincasethree.getGroup());
					System.out.println("Address  : "+studentobjectformaincasethree.getAddress());	
					System.out.println("SSLC Mark: "+studentobjectformaincasethree.getSslcmark());
					System.out.println("-------------------------");
				}
			}
			flagForMenu=true;
			break;
		}
		default:{
			System.out.println("Enter Valid Choice: ");
			flagForMenu=false;
		}
		}
		
	}
	}
	}
}
