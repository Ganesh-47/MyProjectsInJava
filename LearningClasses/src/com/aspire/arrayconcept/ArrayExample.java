package com.aspire.arrayconcept;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {
	public static void creatingArrays()
	{
	int firstValue = 100;
	System.out.println("firstValue "+firstValue);
	int[] numbers= {10,20,30,40,50};
	int lengthofnumbers=numbers.length;
	System.out.println("length of numbers= "+lengthofnumbers);
	for(int x:numbers)
	{
	System.out.println(x);
	}
	Scanner scanner=new Scanner(System.in);
	int days[];
	System.out.println("Enter size for days");
	int size = scanner.nextInt();
	days = new int[size];
	int lengthofdays=days.length;
	System.out.println("No of Days "+lengthofdays);
	for(int i=0;i<lengthofdays;i++)
	{
	int value=(int) (Math.random()*100);
	days[i]=value;
	}

	for(int x:days)
	{
	System.out.println(x);
	}
	scanner.close();
	}
	public static void workingwithTheArray() {
		int numberArray[] = new int[10];
	     
	     for(int i = 0; i < 10; i++) {  
	    	 numberArray[i] = -3* i;
	     }
	     Arrays.sort(numberArray);
	     //Arrays.fill(numberArray,2,6,-1); 
	     for(int i = 0; i < 10; i++) {  
	    	 System.out.println(numberArray[i]);
	     }
	     
	     int index=Arrays.binarySearch(numberArray, -9);
	     System.out.println("intex of number -9 is: "+index);
	}
	public static void testingBubbleSort() {
		int[] nos= {11,23,4,56,32,43,323,76,8,54,56};
		int count=nos.length;
		int temp=0;
		for(int i=0;i<count;i++)
		{
		for(int j=0;j<(count-1);j++)
		{
		if(nos[j+1]<nos[j])
		{
		temp=nos[j];
		nos[j]=nos[j+1];
		nos[j+1]=temp;
		temp=0;
		}
		}
		}
		for(int i=0;i<count;i++)
		{
		System.out.println(nos[i]);
		}
		}
	public static void workingWithCharArray() 
	  {
	String s1="Today is a very hot day";
	char[] data=s1.toCharArray();
	int count=data.length;
	System.out.println("Array length "+count);
	for(int i=0;i<count;i++)
	{
	System.out.println(data[i]+" "+(int)data[i]);
	}
	}
}
