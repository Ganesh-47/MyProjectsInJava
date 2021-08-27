package com.aspire.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<String> stringtreeset = new TreeSet<String>();
		   stringtreeset.add("Cut");  
		   stringtreeset.add("fun");  
		   stringtreeset.add("Assam");
		   stringtreeset.add("Ball");  
		   stringtreeset.add("dog");  
		   stringtreeset.add("Aag");  
		   stringtreeset.add("AAg");  
		   stringtreeset.add("Event");
		   stringtreeset.add("Fan");
		   //ts.add(null);
		   stringtreeset.add("Delhi");  
		   stringtreeset.add("carrot"); 
		   stringtreeset.add("Ball"); 
		   stringtreeset.add("apple");
		   stringtreeset.add("boy"); 
		   stringtreeset.add("egg");  
		   stringtreeset.add("Fool");
		     //System.out.println(ts);
		     System.out.println("Size "+stringtreeset.size());
		     Iterator<String> itr = stringtreeset.iterator();
		   while(itr.hasNext())
		   {
		        String element = itr.next();
		        System.out.println(element );
		   }

	}

}
