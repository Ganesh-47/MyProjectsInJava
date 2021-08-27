package com.lessons.introduction;

public class DemoA {
	public static void taskC() {
		for (int i=0;i<10;i++) {
			System.out.print(i);
		}
		
	}
	public static void taskE() {
		for (int i=10;i>0;i--) {
			System.out.print(i);
		}
		
	}
	public static void taskF() {
		for (int i=0;i<10;i++) {
			for(int j=1;j<10;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
	public static void taskG() {
		for (int i=1;i<10;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
	public static void taskH() {
		for (int i=1;i<10;i++) {
			for(int j=9;j>i;j--) {
				System.out.print(".");
			}
			for(int k=i;k>0;k--) {
				System.out.print(k);
			}
			for(int n=2;n<=i;n++) {
				System.out.print(n);
			}
			System.out.println();
		}
		
	}
	public static void taskI() {
		int x=695243876;
		for(int i=1;i<=9;i++) {
			int r=x%10;
			x/=10;
			if(r%2==0) {
				System.out.println(r);
			}
			
		}
		
	}
	public static void taskJ() {
		for(int i=1;i<=100;i++) {
			if(i%15==0) {
				System.out.println("GOLD");
			}
			else {
			if(i%3==0) {
				System.out.println("FIZZ");
			}
			else {
				if(i%5==0) {
					System.out.println("BUZZ");
				}
				else {
					System.out.println(i);
				}
			}
			
		}
		}
		
	}
	public static void taskK() {
		for(int i=1;i<=100;i++) {
			if(i%15==0) {
				System.out.println("GOLD");
			}
			else {
			if(i%3==0) {
				System.out.println("FIZZ");
			}
			else {
				if(i%5==0) {
					System.out.println("BUZZ");
				}
				else {
					System.out.println(i);
				}
			}
			
		}
		}
		
	}
	
}
