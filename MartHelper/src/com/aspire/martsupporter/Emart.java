package com.aspire.martsupporter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Emart implements Mart {

	public int addItem(Item item, ArrayList<Item> itm) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the Item id: ");
		item.setItemId(scanner.nextInt());
		System.out.println("Enter the Item Name: ");
		item.setItemName(scanner.next());
		System.out.println("Enter the Item Qty: ");
		item.setItemQty(scanner.nextInt());
		System.out.println("Enter the Item category : ");
		item.setCategory(scanner.next());
		System.out.println("Added successfully!!!");
		itm.add(item);
		return -1;
	}

	public String getitem(int packedId,ArrayList<Item> itm) {
		boolean flag=false;
		String name="";
		int qty=0;
		String cat="";
		for(Item x:itm){
			if(x.getItemId()==packedId){
				flag=true;
				name=x.getItemName();
				qty=x.getItemQty();
				cat=x.getCategory();
				
			}
		}
		if(flag==true){
			return ("Name"+name+"\nQty: "+qty+"\nCategory: "+cat);
		}
		else{
			return ItemNotFoundException.itemNotFoundException();
		}
		
	}

	public void updatedItem(int packedId, int newQty,ArrayList<Item> itm) {
		boolean flag=false;
		for(Item x:itm){
			if(x.getItemId()==packedId){
				if(newQty>x.getItemQty()){
					x.setItemQty(newQty);
					flag=true;
				}
				else{
					flag=false;
				}
			}
		}
		if(flag==false){
			InvalidQtyException.invalidQtyException();
		}
		
	}

	public  ArrayList<Integer> getExtremeQtyByCategory(String Category, ArrayList<Item> itm) {
		int qty[]=new int[itm.size()];
		ArrayList<Integer> minmax=new ArrayList<Integer>(2);
		int index=0;
		for(Item x:itm){
			qty[index]=x.getItemQty();
			index++;
		}
		Arrays.sort(qty);
		minmax.add(qty[0]);
		minmax.add(qty[1]);
		return minmax;
	}
}
