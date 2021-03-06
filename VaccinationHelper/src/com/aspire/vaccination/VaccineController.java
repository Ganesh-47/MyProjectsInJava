/*VaccinationController is Class which controls operations of the project*/
package com.aspire.vaccination;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class VaccineController {
	static Scanner scanner=new Scanner(System.in);
	public static void control() {
		
		int doseNumber=0;
		int vial=1;
		int row=0;
		int column=0;
		int indexvalue=0;
	//Creating the array of custom data type Person and vaccine respect to vaccine availability.
		VaccinatedPersonDetails person[][]=new VaccinatedPersonDetails[30][3];
		Vaccine vaccineArray[]=new Vaccine[9000];
		while(true) {
			//Menu
			System.out.println("----------------------------------------------------\n\t\tMenu\n----------------------------------------------------\n1. Vaccinate New Person\n2. Recover The Details Of The Person By Aadar\n3. Number Of Doses Completed For Today\n4. Current Vial Number\n5. List Of Vaccinated People By Day Number \n----------------------------------------------------\nEnter your choice (1/2/3/4/5): ");
			String choise=scanner.nextLine();
		switch(choise) {
		case "1":{
			//to vaccinate new person.
			VaccinationUI vaccinate=new VaccinationUI();
			//100 vials(i.e: )300 doses per day
			person[row][column]=vaccinate.ui();//calling the UI part
			person[row][column].setDateofvaccination(row+1);//setting date of vaccination to the person object
			column++;
			Vaccine vaccine=new Vaccine();
			vaccine.setDoseNumber(doseNumber);
			vaccine.setVialnumber(vial);
			vaccineArray[indexvalue]=vaccine;
			indexvalue++;
			doseNumber++;
			//Vial number increased by one for each 3 doses
			if(doseNumber%3==0) {
				vial++;
			}
			System.out.println("...Deatails Stored Successfully...\n");
			if(column==3) {
				column=0;//doses
				row++;//days
				System.out.println("Today's Doses Completed!!!");
			}
			break;
		}
		case "2":{
			try {
				boolean present=false;
				//Printing the person details by aadar
			String adr=DataValidator.aadharValidate();
			for(int i=0;i<30;i++) {
				for(int j=0;j<3;j++) {
					String check=person[i][j].getAadhar();//getting the Aadar number from the object
					if(adr.equals(check)) {
						System.out.println("Name                : "+person[i][j].getName());
						System.out.println("Aadar               : "+person[i][j].getAadhar());
						System.out.println("DOB                 : "+person[i][j].getDateOfBirth().format(DateTimeFormatter.ofPattern("dd-MMM-yyyy")));
						System.out.println("Age                 : "+person[i][j].getAge());
						System.out.println("Mobile Number       : "+person[i][j].getMobileNumber());
						System.out.println("Address             : "+person[i][j].getMobileNumber());
						System.out.println("Date of Vaccination : Day "+person[i][j].getDateofvaccination());
						System.out.println("----------------------------------------------------");
						present=true;
						break;
					}
				}
			}
			if(present==false)
				System.out.println("!!!!No Data Available For This Aadhar!!!! ");
			break;
			}
			catch(Exception e) {
				
				break;
			}
		}
		case "3":{
			//number of doses completed today is equals to dose number - does number upto last date.
			int dosesfortoday=doseNumber-row*3;
			System.out.println("Number Of Doses Completed  : "+dosesfortoday);
			break;
		}
		case "4":{
			System.out.println("Current vial number is "+vial);
			break;
		}
		case "5":{
			//Retriving the list of vaccinated people by date number
			
			System.out.println("Enter the Day number (Ex: 1/2/3): ");
			String testdatestring=scanner.next();
			boolean present=false;
			while(present==false){
				if(testdatestring.length()==1&&testdatestring.charAt(0)>0){
					present=true;
					break;
				}else{
					System.out.println("Enter Valid Date: ");
					testdatestring=scanner.nextLine();
					present=false;
				}
			}
			int testdate=Integer.parseInt(testdatestring);
			System.out.println("----------------------------------------------------");
			System.out.println("********* List of Vaccinated people on Day "+testdate+"*********\n----------------------------------------------------");
			try{for(int i=0;i<30;i++) {
				for(int j=0;j<3;j++) {
					//checking the date of vaccination for each array members
					long check=person[i][j].getDateofvaccination();
					if(testdate==check) {
						System.out.println("Name                : "+person[i][j].getName());
						System.out.println("Aadar               : "+person[i][j].getAadhar());
						System.out.println("DOB                 : "+person[i][j].getDateOfBirth().format(DateTimeFormatter.ofPattern("dd-MMM-yyyy")));
						System.out.println("Age                 : "+person[i][j].getAge());
						System.out.println("Mobile Number       : "+person[i][j].getMobileNumber());
						System.out.println("Address             : "+person[i][j].getMobileNumber());
						System.out.println("Date of Vaccination : Day "+person[i][j].getDateofvaccination());
						System.out.println("----------------------------------------------------");
						present=true;
					}
				}
			}
			if(present==false){
				System.out.println("!!!No Data Available!!!");
			}
			}
			catch(Exception e){
			break;
			}
		}
		default:{
			System.out.println("Invalid Choice!!!\nEnter valid choice: ");
		}
					
		}	
				
		}
	}
	}

