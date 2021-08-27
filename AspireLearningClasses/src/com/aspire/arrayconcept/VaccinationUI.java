package com.aspire.arrayconcept;
import java.util.Scanner;

public class VaccinationUI {
	public Person ui() throws Exception{
			Scanner scanner = new Scanner(System.in);
			Person person=new Person();
			System.out.println("Enter the aadar number");
			long aadar=scanner.nextLong();
			person.setAadar(aadar);
			System.out.println("Enter the age");
			int age=scanner.nextInt();
			person.setAge(age);
			System.out.println("Enter the name");
			String name=scanner.next();
			person.setName(name);
			return person;
		}
	}
	
	
