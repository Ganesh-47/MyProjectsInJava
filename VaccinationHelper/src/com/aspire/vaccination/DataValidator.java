/*
 1. Data Validator is a Class to Validate the Input Correct or Not.
 2. the following static methods are useful to validate the inputs Aadar, Name & Age.  
 */ 
package com.aspire.vaccination;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class DataValidator {
	static Scanner scanner=new Scanner(System.in);
	public static String aadharValidate(){
		//Static method to validate Aadhar input
		System.out.println("Enter 12 Digit Aadhar Number (Eg: xxxx xxxx xxxx): ");
		String aadharNumber=scanner.nextLine();
		boolean flag=false;
		while(flag==false){
			char[] aadarDigits=aadharNumber.toCharArray();
			for(char digit:aadarDigits){
				if(((int)digit>(int)'9'||(int)digit<(int)'0')&&digit!=' '||aadharNumber.length()!=14){
					flag=false;
					System.out.println("Aadhar Number is Invalid!!!\nEnter The Valid Aadhar Number: ");
					aadharNumber=scanner.nextLine();
					break;
				}else{
					flag=true;
				}
			}if(flag==true){
			if(aadharNumber.charAt(4)!=' '||aadharNumber.charAt(9)!=' '){
				flag=false;
				System.out.println("Aadhar Number is Invalid!!!\nEnter The Valid Aadhar Number: ");
				aadharNumber=scanner.nextLine();
			}
			}
			
		}
		return aadharNumber;
	}
	public static String nameValidate(){
		System.out.println("Enter the Name : ");
		String name=scanner.nextLine();
		boolean flag=false;
		while(flag==false){
			int index=0;
		String lowername=name.toLowerCase();
		char letterarray[]=lowername.toCharArray();
			for(int i=0;i<name.length()-2;i++){
				char c=letterarray[index];
				int ascii=(int)c;
			if(((ascii<(int)'a'||ascii>(int)'z')&&c!=' ')||lowername.length()<=2||lowername.length()>30||(name.charAt(i)==name.charAt(i+1)&&name.charAt(i)==name.charAt(i+2))){
				System.out.println("Name is Invalid!!!\nEnter The Correct Name : ");
				name=scanner.nextLine();
				flag=false;
				break;
			}
			else{
				flag=true;
			}
			index++;
			}
		}
		
		return name;
	}
	public static String validateaddress(){
		System.out.println("Enter Address");
		String address=scanner.nextLine();
		boolean flag=false;
		while(flag==false){
			for(int i=0;i<address.length()-2;i++){
			if(address.length()<10||(address.charAt(i)==address.charAt(i+1))&&(address.charAt(i)==address.charAt(i+2))){
				flag=false;
				System.out.println("Address is invalid!!!\nEnter Valid Address");
				address=scanner.nextLine();
			}else{
				flag=true;
			}
			}
		}
		return address;
		
	}
	public static long validatemobilenumber(){
		System.out.println("Enter 10 Digit Mobile Number: ");
		String mobileNumber=scanner.nextLine();
		boolean flag=false;
		while(flag==false){
			char[] mobileNumberDigits=mobileNumber.toCharArray();
			for(char digit:mobileNumberDigits){
				if((int)digit>(int)'9'||(int)digit<(int)'0'||mobileNumber.charAt(0)<'5'){
					flag=false;
					System.out.println("Mobile Number is Invalid!!!\nEnter Valid Mobile Number: ");
					mobileNumber=scanner.nextLine();
					break;
				}else{
					flag=true;
				}
			}if(flag==true){
			if(Long.parseLong(mobileNumber)>=0&&mobileNumber.length()==10){
				flag=true;
			}else{
				System.out.println("Mobile Number is Invalid!!!\nEnter Valid Mobile Number: ");
				mobileNumber=scanner.nextLine();
				flag=false;
			}
			}
			
		}
		return Long.parseLong(mobileNumber);
	}
	public static LocalDate validatedob(){
		System.out.println("Enter Date Of Birth(DD-MM-YYYY): ");
		String testDate=scanner.nextLine();
		boolean flag=false;
		while(flag==false) {
			char[] dayDigits=testDate.toCharArray();
			for(char digit:dayDigits){
				if((((int)digit>(int)'9'||(int)digit<(int)'0')&&digit!='-')||testDate.length()!=10){
					flag=false;
					System.out.println("Date Of Birth is Invalid!!!\nEnter Your Valid Date Of Birth (DD-MM-YYYY): ");
					testDate=scanner.nextLine();
					break;
				}else{
					flag=true;
				}
			}
			if(flag==true){
				String[] seperated=testDate.split("-");
				int birthYear=Integer.parseInt(seperated[2]);
				LocalDate today = LocalDate.now();
				int currentYear=today.getYear();
				if(birthYear<currentYear&&testDate.charAt(2)=='-'&&testDate.charAt(5)=='-') {
					flag=true;
				}
				else {
					System.out.println("Date Of Birth is Invalid!!!\nEnter Your Valid Date Of Birth (DD-MM-YYYY): ");
					flag=false;
					testDate=scanner.nextLine();
				}
			}
		}
		return DateValidatorforBirthday.dateValidate(testDate);
	}
public static int calculateAge(LocalDate birthday){
	LocalDate today = LocalDate.now();
	int years =Period.between(birthday, today).getYears();
	return years;
	}
}
class DateValidatorforBirthday {
	static int year;
	static int month;
	static int date;
	
	static Scanner scanner = new Scanner(System.in);
	
	public static int getYear() {
		return year;
	}
	public static void setYear(String yearOfApplicant) {
		boolean flag=false;
		while(flag==false) {
		int lengthOfYear=yearOfApplicant.length();
		char[] yearArray=yearOfApplicant.toCharArray();
		for(char digit:yearArray) 
		{
		if(lengthOfYear!=4||(int)digit<(int)'0'||(int)digit>(int)'9')
		{
			System.out.println("Error in Year!!!\nPlease Enter Correct Year(YYYY)");
			yearOfApplicant=scanner.nextLine();
			flag=false;
			break;
		}
		else {
			flag =true;
		}	
		}
		if(flag==true) {
		if((Integer.parseInt(yearOfApplicant)<1950||Integer.parseInt(yearOfApplicant)>LocalDate.now().getYear())) {
			flag=false;
			System.out.println("Error in Year!!!\nPlease Enter Correct Year(YYYY)");
			yearOfApplicant=scanner.nextLine();
		}
		else {
			flag=true;
			year = Integer.parseInt(yearOfApplicant);
			break;
		}
		}
		}
	}
	public static int getMonth() {
		return month;
	}
	public static void setMonth(String monthofapplicant) {
		boolean flag=false;
		while(flag==false) {
		int lengthOfMonth=monthofapplicant.length();
		char[] monthArray=monthofapplicant.toCharArray();
		for(char digit:monthArray) 
		{
		if(lengthOfMonth<1||lengthOfMonth>2||(int)digit<(int)'0'||(int)digit>(int)'9')
		{
			System.out.println("Error in Month!!!\nPlease Enter correct Month(MM)");
			monthofapplicant=scanner.nextLine();
			flag=false;
			break;
		}
		else {
			flag =true;
		}	
	}
		if(flag==true) 
		{
			if((Integer.parseInt(monthofapplicant)<1||Integer.parseInt(monthofapplicant)>12)) {
				flag=false;
				System.out.println("Error in Month!!!\nPlease Enter correct Month(MM)");
				monthofapplicant=scanner.nextLine();
			}
			else {
				flag=true;
				month = Integer.parseInt(monthofapplicant);
				break;
			}
		}
	}
	}
	
	public static int getDate() {
		return date;
	}
	public static void setDate(String dateOfApplicant) {
		boolean flag=false;
		while(flag==false) {
		int lengthOfDate=dateOfApplicant.length();
		char[] dateArray=dateOfApplicant.toCharArray();
		for(char digit:dateArray) 
		{
		if(lengthOfDate<1||lengthOfDate>2||(int)digit<(int)'0'||(int)digit>(int)'9')
		{
			System.out.println("Error in Day!!!\nPlease Enter correct Day(DD)");
			dateOfApplicant=scanner.next();
			flag=false;
			break;
		}
		else {
			flag =true;
		}	
	}
		if(flag==true) 
		{
			if((Integer.parseInt(dateOfApplicant)<1||Integer.parseInt(dateOfApplicant)>31)){
				flag=false;
				System.out.println("Error in Day!!!\nPlease Enter correct Day(DD)");
				dateOfApplicant=scanner.next();
			}
			else {
				flag=true;
				date = Integer.parseInt(dateOfApplicant);
				break;
			}
		}
	}
		}
	public static LocalDate dateValidate(String date) 
	{
		String testYear = null;;
		String testMonth = null;
		String testDate = null;
		boolean flag=false;
		while(flag==false){
		String[] spilited=date.split("-");
		
		 testYear=spilited[2];
		 testMonth=spilited[1];
		 testDate=spilited[0];
		 boolean leap=Integer.parseInt(testYear)%4==0;
		 boolean nonleap=Integer.parseInt(testYear)%4!=0;
		 boolean thirtyDayConstrain=((Integer.valueOf(testDate))>=31)&&(testMonth=="02"||testMonth=="04"||testMonth=="06"||testMonth=="09"||testMonth=="11");
		 boolean leapFebConstrain=testDate.equals("30")&&testMonth.equals("02")&&leap;
		 boolean nonLeapFebConstrain=(testDate.equals("29")||testDate.equals("30"))&&(testMonth.equals("02"))&&nonleap;
		 boolean dateConstrain=(Integer.valueOf(testDate))>31 || (Integer.valueOf(testDate))<1;
		 boolean monthconstrain=(Integer.valueOf(testMonth))>12 || (Integer.valueOf(testMonth))<1;
		 boolean yearConstrain=(Integer.valueOf(testMonth))>=LocalDate.now().getYear();
			if(thirtyDayConstrain||nonLeapFebConstrain||leapFebConstrain||dateConstrain||monthconstrain||yearConstrain){
				flag=false;
				System.out.println("Date of Birth is Invalid!!!\nEnter The Valid Date of Birth : ");
				date=scanner.nextLine();
			}
			else{
				flag=true;
				setYear(testYear);
				//setting month
				setMonth(testMonth);
				//setting date
				setDate(testDate);
			}
		}
		//setting year
		
		
		LocalDate correctedDate=LocalDate.of( getYear(), getMonth(), getDate());
		return correctedDate;
}
}

