package com.aspire.martsupporter;

import java.util.ArrayList;

public interface Mart {
	int addItem(Item item,ArrayList<Item> itm);
	ArrayList<Integer> getExtremeQtyByCategory(String Category,ArrayList<Item> itm);
	String getitem(int packedId,ArrayList<Item> itm);
	void updatedItem(int packedId,int newQty,ArrayList<Item> itm);
}
