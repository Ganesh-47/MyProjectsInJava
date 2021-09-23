package com.aspire.constructors;

public class Pizza {
	private String bread;
	private String cheese;
	private String toppings;
	private String spice;
	private int size;
	public Pizza() {
		this("red pepper flakes");
		System.out.println("1");
	}
	public Pizza(String spice) {
		this("French Cheese","Chicken,sweet potato,semi-dried tomato");
		System.out.println("2");
		this.spice=spice;
	}
	public Pizza(String cheese,String toppings) {
		this("Brown",8);
		System.out.println("3");
		this.cheese=cheese;
		this.toppings=toppings;
	}
	public Pizza(String bread,int size) {
		System.out.println("4");
		this.bread=bread;
		this.size=size;
	}
}
