package com.aspire.mapexample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {
	public static void main(String args[]){
		TreeMap<String,Double> doubletreemap = new TreeMap<>();
	    doubletreemap.put("John Doe", 3434.34);
	    doubletreemap.put("Tom Smith", 123.22);
	    doubletreemap.put("Jane Baker", 1378.00);
	    doubletreemap.put("Tod Hall", 99.22);
	    doubletreemap.put("Ralph Smith", -19.08);
	    Set<Entry<String,Double>> set = doubletreemap.entrySet();
	    Iterator<Entry<String, Double>> i = set.iterator();
	    while(i.hasNext()) {
	      Map.Entry<String, Double> me = (Map.Entry<String, Double>)i.next();
	      System.out.print(me.getKey() + ": ");
	      System.out.println(me.getValue());
	    }
	    System.out.println();
	    // Deposit 1000 into John Doe's account
	    double balance =  doubletreemap.get("John Doe");
	    doubletreemap.put("John Doe", (balance + 1000));
	    System.out.println("John Doe's new balance: " +doubletreemap.get("John Doe"));	}

public static void usingGenericMapforString()
  {
 HashMap<String,String> secondMap=new HashMap<String,String>();
 System.out.println("Size "+secondMap.size());
 secondMap.put("k1", "ABcd");
 secondMap.put("k2", "ABcd");
 secondMap.put("k3", "ABcd");
 secondMap.put("k4", "ABcd");
 System.out.println("Size "+secondMap.size());
 Set<Map.Entry<String,String>> setofMapEntry = secondMap.entrySet();
 Iterator<Map.Entry<String,String>> mapIterator = setofMapEntry.iterator();
    while(mapIterator.hasNext())
    {
      Map.Entry<String,String> mapEntry =(Map.Entry<String,String>)mapIterator.next();
      System.out.print(mapEntry.getKey() + ": ");
      System.out.println(mapEntry.getValue());
    }
  }

}
