package com.aspire.martsupporter;

public class Item {
	int itemId;
	String itemName;
	int itemQty;
	String category;
	public Item(){
		
	}
	/*public Item(int itemId, String itemName, int itemQty, String category) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemQty = itemQty;
		this.category = category;
	}*/
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemQty() {
		return itemQty;
	}
	public void setItemQty(int itemQty) {
		this.itemQty = itemQty;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public String toString()
	{
		return "(" +this.itemId + " , " +this.itemName + " , " +this.itemQty + " , " + this.category + ")";
	}
	
}
