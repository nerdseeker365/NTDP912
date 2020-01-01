package com.nt.factory;

import java.util.HashMap;
import java.util.Map;

import com.nt.comp.BooksCollection;
import com.nt.comp.FictionalBooksCollection;
import com.nt.comp.NonFictionalBooksCollection;

public class BookCollectionFactory {
	private  static Map<String ,BooksCollection> cache=new HashMap();

	static{
		BooksCollection fCollection=null,nfCollection=null;
		fCollection=new FictionalBooksCollection();
		fCollection.loadBooks();

		nfCollection=new NonFictionalBooksCollection();
		nfCollection.loadBooks();

		cache.put(BookType.FICTIONAL,fCollection);
		cache.put(BookType.NONFICTIONAL,nfCollection);
	}
	
	
	public  static   BooksCollection   getInstance(String type) throws Exception {
		//return  (BooksCollection)cache.get(type).clone();
		return  (BooksCollection)cache.get(type);
	}

}
