package com.nt.factory;

import com.nt.comp.BooksCollection;
import com.nt.comp.FictionalBooksCollection;
import com.nt.comp.NonFictionalBooksCollection;

public class BookCollectionFactory {
	
	
	public  static   BooksCollection   getInstance(String type) {
		BooksCollection collection=null;
		if(type.equalsIgnoreCase(BookType.FICTIONAL)) {
			collection=new FictionalBooksCollection();
			collection.loadBooks();
		}
		else if(type.equalsIgnoreCase(BookType.NONFICTIONAL)) {
			collection=new NonFictionalBooksCollection();
			collection.loadBooks();
		}
		else
			throw new IllegalArgumentException("Invalid Book Type");
		return collection;
		
	}

}
