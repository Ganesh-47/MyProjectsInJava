package com.aspire.arraylistexample;

import java.util.ArrayList;
import java.util.Iterator;

public class BookDetails {
public static void storeBook(){
	ArrayList<Book> arraylist=new ArrayList<Book>();
	arraylist.ensureCapacity(20);
	for(int i=1;i<=20;i++){
		Book book=new Book();
		book.setBookId(i);
		book.setBookName("Book"+i);
		arraylist.add(book);
	}
	Iterator<Book> bookiterator=arraylist.iterator();
	while(bookiterator.hasNext()){
		System.out.println("Book Id: "+bookiterator.next().getBookId());
		System.out.println("Book Name: "+bookiterator.next().getBookName());
	}
}
}
