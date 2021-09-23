package com.aspire.collections;


public class CustomStack<E> {
 private E[] arr = null;
 private int CAPACITY;
 private int top = -1;
 private int size = 0;
 
 @SuppressWarnings("unchecked")
 public CustomStack(int capacity) {
  this.CAPACITY = capacity;
  this.arr = (E[]) new Object[capacity];
 }
 
 public E pop() {
  if(this.size == 0){
   return null;
  }
 
  this.size--;
  E result = this.arr[top];
  this.arr[top] = null;//prevent memory leaking
  this.top--;
 
  return result;
 }
 
 public boolean push(E e) {
  if (isFull())
   return false;
 
  this.size++;
  this.arr[++top] = e;
 
  return true;
 }
 
 public boolean isFull() {
  if (this.size == this.CAPACITY)
   return true;
  return false;
 }
 
 public String toString() {
  if(this.size==0){
   return null;
  }
 
  StringBuilder sb = new StringBuilder();
  for(int i=0; i<this.size; i++){
   sb.append(this.arr[i] + ", ");
  }
 
  sb.setLength(sb.length()-2);
  return sb.toString(); 
 }
 
 public static void main(String[] args) {
 
  CustomStack<String> stack = new CustomStack<String>(11);
  stack.push("hello");
  stack.push("world");
 
  System.out.println(stack);
 
  stack.pop();
  System.out.println(stack);
 
  stack.pop();
  System.out.println(stack);
  CustomStack<Integer> intstack=new CustomStack<>(10);
  intstack.push(1000);
  System.out.println(intstack);
 }
}
