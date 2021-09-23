package com.aspire.annotations;

import java.util.Scanner;

public class PasswordValidator {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the password to validate");
		System.out.println(passwordValidate(scanner.nextLine()));
		scanner.close();
	}

	private static boolean passwordValidate(String testPassword) {
		boolean capsConstrain=false,lengthConstrain=false,lowerCaseConstrain=false,numberConstrain=false,specialCharacterConstrain=false;
		char[] testCharArray=testPassword.toCharArray();
		for(char c:testCharArray){
			if((int)c>=48&&(int)c<=57) numberConstrain=true;
			if(((int)c>=33&&(int)c<=47)||((int)c>=58&&(int)c<=64)||((int)c>=91&&(int)c<=95)) specialCharacterConstrain=true;
			if((int)c>=97&&(int)c<=122) lowerCaseConstrain=true;
			if((int)c>=65&&(int)c<=90) capsConstrain=true;
		}
		if(testPassword.length()>=8)	lengthConstrain=true;
		if(capsConstrain&&lengthConstrain&&lowerCaseConstrain&&numberConstrain&&specialCharacterConstrain)	return true;
		else return false;
	}

}
