package com.aspire.interviewhelper;
import java.util.*;
public class ApplicantUI {
	public static void addNewApplicant() throws Exception {
		Scanner scanner = new Scanner(System.in);
			ArrayList<Applicant> applicantarray=new ArrayList<Applicant>();
			Applicant applicant=new Applicant();
			while(true) {
			System.out.println("menu\na.Add new Applicant\nb.View profile by id of the Applicant\n(a/b): ");
			char s=scanner.next().charAt(0);;
			switch(s) {
			case 'a':{
				
				System.out.println("Enter the name of Applicant: ");
				String nameofApplicant=scanner.next();
				applicant.setName(nameofApplicant);
				
				System.out.println("Enter the Applicant's id: ");
				int idofApplicant=scanner.nextInt();
				applicant.setId(idofApplicant);
				
				System.out.println("Enter the date of Application(dd-mm-yyyy): ");
				String dateofApplication=scanner.next();
				applicant.setDate(dateofApplication);
				
			
				String statusofApplication=ApplicationTester.result(nameofApplicant,dateofApplication);
				applicant.setStatus(statusofApplication);
				applicantarray.add(applicant);
				break;
			}
			case 'b':{
				System.out.println("Enter the Applicants id to search: ");
				int idSearch=scanner.nextInt();
				for(Applicant x:applicantarray) {
					if(idSearch==x.getId()) {
					System.out.println("Name: "+x.getName());
					System.out.println("ApplicantId: "+x.getId());
					System.out.println("Date of Application: "+x.getDate());
					System.out.println("Status of Application: "+x.getStatus());
					break;
					}
				}
				break;
			}
			default:{
				System.out.println("Enter valid choise");
				break;
			}
			}
}
		}
	}
	
