package com.aspire.arrayconcept;

import java.util.ArrayList;

public class DeleteDuplicate {
public static void main(String[]args) {
	int numbers[] = {20, 13, 11, 13, 15, 11, 20, 11, 3};
	int lengthofnumbers=numbers.length;
	ArrayList<Integer> num=new ArrayList<Integer>(lengthofnumbers);
	System.out.println("Length of the array is: "+lengthofnumbers);
	for(int i=0;i<lengthofnumbers;i++) {
		num.add(numbers[i]);
		}
	for(int j=0;j<lengthofnumbers;j++) {
		for(int k=0;k<lengthofnumbers&&j!=k;k++) {
		if(num.get(j)==num.get(k)) {
			num.remove(j);
			lengthofnumbers=lengthofnumbers-1;
		}
		}
	}
	System.out.println("Array after deletion of duplicate values will be: ");
	for(Integer x:num) {
		System.out.println(x);
	}
	}
	
}
