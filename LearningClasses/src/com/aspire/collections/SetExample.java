package com.aspire.collections;

import java.util.HashSet;
import java.util.Iterator;

public class SetExample {
public static void main(String []args){
HashSet<String> hs = new HashSet<String>();
     hs.add("Bee"); 
     hs.add("Apple");  
     hs.add("Doll"); 
     hs.add(null);
     hs.add("Egg");
     hs.add("Cinema");
     hs.add("Fan");     
     System.out.println("Size "+hs.size());
     hs.add("Fan");
     hs.add(null);
     System.out.println("Size "+hs.size());
     System.out.println(hs);
     Iterator<String> itr = hs.iterator();
   while(itr.hasNext())
   {
        Object element = itr.next();
        System.out.println(element + "-");
   }


}
}