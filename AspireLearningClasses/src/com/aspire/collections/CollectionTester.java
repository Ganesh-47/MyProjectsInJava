package com.aspire.collections;

import java.util.ArrayList;

public class CollectionTester {

public static void usingStringArrayList()
  {
   ArrayList<String> stringArrayList=new ArrayList<String>();
   int listsize=stringArrayList.size();
   System.out.println("Initial size of stringArrayList: " +listsize);
   try
   {
     stringArrayList.add("Car");
     stringArrayList.add("Auto");
     stringArrayList.add("Egg");
     stringArrayList.add("Box");
     stringArrayList.add("Doll");
     stringArrayList.add("Fan");
     // will insert a new value , 
     // pushing the current value of index 1 to the next index
     stringArrayList.add(1,"Animal");
     stringArrayList.add("Girl");
     stringArrayList.add("Fan");
     listsize=stringArrayList.size();
     System.out.println("Size of stringArrayList after additions: " + listsize);
     System.out.println("Contents of stringArrayList: " + stringArrayList);
     // will replace the value in index 2      
     stringArrayList.set(2,"xenas");          
     System.out.println("After Set(2): " + stringArrayList);
     System.out.println("Last Index of: 'Fan' " +stringArrayList.lastIndexOf("Fan"));
     // remove the first instance of 'Fan'
     stringArrayList.remove("Fan");
     stringArrayList.remove(2);
     listsize=stringArrayList.size();
     System.out.println("Size after remove(2): " + listsize);
     System.out.println("Contents of stringArrayList: " + stringArrayList);
     // will reduce the capacity 
     stringArrayList.trimToSize();
    }catch(Exception err)
    {
   System.out.println(err.getMessage());
    }
  }

}
