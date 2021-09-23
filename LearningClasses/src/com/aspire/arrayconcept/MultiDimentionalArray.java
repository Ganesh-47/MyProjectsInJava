package com.aspire.arrayconcept;

public class MultiDimentionalArray {
	public static void creatingTwoDintArray()
	   {
	   int twod[][]=new int [4][5];//4 rows 5 col
	   int I,j,k=0;
	   for(I=0;I<4;I++)
	   {
		   for(j=0;j<5;j++)
		   {
			   twod[I][j]=k;
			   k++;
		   }
	   }
	for(I=0;I<4;I++)
	{
	for(j=0;j<5;j++)
	{
	System.out.print(twod[I][j]+" ");
	}
	System.out.println();
	}
	}
	public static void anotherWayToCreateTwoDintArray()
	   {
	   int marks[][]=new int[][]{
	   {82, 38, 45,77,55,0,0},
	   {95,99,92,90,85,0,0},
	   {85,100,91,92,93,0,0},
	   {75,55,92,74,66,0,0},
	   {85,75,58,62,75,0,0}
	   };//5 rows 7 col
	int I,j,sum=0;
	for(I=0;I<5;I++)
	{
	for(j=0;j<5;j++)
	{
	sum+=marks[I][j];
	}
	marks[I][5]=sum;
	marks[I][6]=sum/5;
	}
	for(j=0;j<5;j++)
	{
	System.out.print("Sub"+(j+1)+" ");
	}
	System.out.print("Total ");
	System.out.println("Avg");
	System.out.println("-------------------");
	for(I=0;I<4;I++)
	{
	for(j=0;j<7;j++)
	{
	System.out.print(marks[I][j]+"   ");
	}
	System.out.println();
	}
	}

}
