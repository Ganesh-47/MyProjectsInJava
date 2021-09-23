package com.aspire.student;

import java.util.HashSet;
import java.util.Scanner;

public class ui {
public void addDetails() {
	System.out.println("Enter the id");
	Scanner sc=new Scanner(System.in);
	student.setId(sc.nextInt());
	System.out.println("Enter the name: ");
	student.setName(sc.nextLine());
}
}
