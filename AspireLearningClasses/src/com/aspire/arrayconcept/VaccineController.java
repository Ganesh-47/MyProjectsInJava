package com.aspire.arrayconcept;

import java.util.Scanner;

public class VaccineController {
	public void control() throws Exception {
		Scanner scanner=new Scanner(System.in);
		int doseNumber=0;
		int vial=1;
		int row=0;
		int column=0;
		Person people[][]=new Person[7][300];
		Vaccine vac[]=new Vaccine[2100];
		
		while(row<=6&&column<=299) {
			System.out.println("menu\na.Vaccinate new person\nb.recover the deatails of the person by aadar\nc.number of doses completed today\nd.Current vial number");
			char s=scanner.next().charAt(0);
		switch(s) {
		case 'a':{
			VaccinationUI vaccinate=new VaccinationUI();
			if(column==300) {
				column=0;
				row++;
			}
			people[row][column]=vaccinate.ui();
			column++;
			Vaccine vaccine=new Vaccine();
			vaccine.setDoseNumber(doseNumber);
			vaccine.setVialnumber(vial);
			for(int u=0;u<2100;u++) {
				vac[u]=vaccine;
			}
			doseNumber++;
			if(doseNumber%3==0) {
				vial++;
			}
			break;
		}
		case 'b':{
			try {
			System.out.println("Enter the aadar: ");
			long adr=scanner.nextLong();
			for(int i=0;i<7;i++) {
				for(int j=0;j<300;j++) {
					long check=people[i][j].getAadar();
					if(adr==check) {
						System.out.println("Name: "+people[i][j].getName());
						System.out.println("Aadar: "+people[i][j].getAadar());
						System.out.println("Age: "+people[i][j].getAge());
						break;
					}
				}
			}
			
			break;
			}
			catch(Exception e) {
				break;
			}
		}
		case 'c':{
			int x=doseNumber-row*300;
			System.out.println(x);
			break;
					}
		case 'd':{
			System.out.println("Current vial number: "+vial);
					}
		default:{
			System.out.println("Enter valid choice");
			//break;
		}
					
		}	
				
		}
		scanner.close();
	}
	}

