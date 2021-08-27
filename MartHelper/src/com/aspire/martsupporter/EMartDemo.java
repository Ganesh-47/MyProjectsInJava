package com.aspire.martsupporter;

import java.util.ArrayList;
import java.util.Scanner;


public class EMartDemo {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	ArrayList<Item> itm=new ArrayList<Item>(100);
	while(true){

	//itm.add(new Item(1,"aaa",2,"Sports"));
	//itm.add(new Item(2,"bbb",3,"Travel"));
	//itm.add(new Item(3,"ccc",2,"Food"));
	//System.out.println(itm);
	//1.Add Item
	//2.Get extream quantity by cat..
	//3.Get Item by id
	//4.Update Item qty
	System.out.println("Menu\na.Add Item\nb.Get extream quantity by cat..\nc.Get Item by id\nd.Update Item qty");
	switch(scanner.next().charAt(0)){
	case 'a':{
		Item item=new Item();
		Emart em=new Emart();
		em.addItem(item, itm);
		System.out.println("List size: "+itm.size());
		break;
	}
	case 'b':{
		Emart em=new Emart();
		System.out.println("Enter Category: ");
		String category=scanner.next();
		ArrayList<Integer> array=em.getExtremeQtyByCategory(category, itm);
		System.out.println("Minimum qty:"+array.get(0));
		System.out.println("Maximum qty:"+array.get(1));
		break;
	}
	case 'c':{
		System.out.println("Enter Id: ");
		Emart em=new Emart();
		String itmname=em.getitem(scanner.nextInt(), itm);
		System.out.println(itmname);
		break;
	}
	case 'd':{
		Emart em=new Emart();
		System.out.println("Enter Id: ");
		int id=scanner.nextInt();
		System.out.println("Enter New qty: ");
		int qty=scanner.nextInt();
		em.updatedItem(id, qty,itm);
		break;
	}
	default:{
		System.out.println("Enter valid choice: ");
	}
	}
	
	
	}
	}

}
