package com.aspire.collections;

import java.util.EmptyStackException;
import java.util.Stack;

public class InbuildStack {
public static void main(String args[]){
Stack<Integer> integerstack = new Stack<>();
    System.out.println("stack: " + integerstack);
    integerstack.push(42);
    integerstack.push(66);
    integerstack.push(99);
    System.out.println("stack: " + integerstack);
    int count = integerstack.size();
    System.out.println("Stack Size "+count);
    for(int x=0;x<count;x++)
    {
     System.out.println(integerstack.peek());
    }
    System.out.print("pop -> ");
  Integer i = integerstack.pop();
  System.out.println(i);
  i = integerstack.pop();
  System.out.println(i);
  i = integerstack.pop();
  System.out.println(i);
  System.out.println("stack: " + integerstack);
    try {
    	i = integerstack.pop();
    	  System.out.println(i);
    	  System.out.println("stack: " + integerstack);
    } catch (EmptyStackException e)
    {
      System.out.println("empty stack "+e.getMessage());
    }

}
}
