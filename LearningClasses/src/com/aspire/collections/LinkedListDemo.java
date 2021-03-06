package com.aspire.collections;

import java.util.Iterator;
import java.util.LinkedList;


public class LinkedListDemo {
  public static void main(String args[]) {
   /* LinkedList<String> stringlinklist = new LinkedList<>();
    stringlinklist.add("Fan");
    stringlinklist.add("Box");
    stringlinklist.add("Doll");
    stringlinklist.add("Egg");
    stringlinklist.add("Cat");
    stringlinklist.add("Fan");
    stringlinklist.add("Box");
    stringlinklist.add("Doll");
    stringlinklist.add("Egg");
    stringlinklist.add("Cat");
    stringlinklist.addLast("Zebra");
    stringlinklist.addFirst("Ant");
    //stringlinklist.add(1, "A2");
    System.out.println("Original contents of ll: " + stringlinklist);
    stringlinklist.remove("Fan");
    stringlinklist.remove(2);
    System.out.println("Contents after deletion: " + stringlinklist);
    stringlinklist.removeFirst();
    stringlinklist.removeLast();
    System.out.println("after deleting first and last: "+ stringlinklist);
    String val = stringlinklist.get(2);
    stringlinklist.set(2,  val + " Changed");
    System.out.println("After poll "+stringlinklist.poll());
    System.out.println("After pop "+stringlinklist.pop());
    System.out.println("ll after change: " + stringlinklist);
    System.out.println("After Iteration");
    Iterator<String> itr=stringlinklist.iterator();
    while(itr.hasNext()){
    	System.out.println(itr.next());
    }*/
	  LinkedList<String> stringlinklist = new LinkedList<>();
	  System.out.println(stringlinklist.pop()); //throws exception
	  System.out.println(stringlinklist.poll()); //return null
  }
}

