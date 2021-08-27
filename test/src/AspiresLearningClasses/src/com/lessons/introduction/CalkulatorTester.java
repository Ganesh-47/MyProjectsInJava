package com.lessons.introduction;

public class CalkulatorTester {
	public static void testA() {
		int x=100;
		int y=50;
		int z=0;
		Calculator c1=new Calculator();
		z=c1.add(x,y);
		System.out.println("Add "+z);
		z=c1.multiply(x, y);
		System.out.println("Multiply "+z);
	}
}
