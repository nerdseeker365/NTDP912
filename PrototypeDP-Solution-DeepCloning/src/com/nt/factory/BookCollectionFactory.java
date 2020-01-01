package com.nt.factory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.nt.comp.Book;
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
		 BooksCollection  clonedCollection=null,orginalCollection=null;
		 List<Book>  booksList=null;
		 Book bk=null;
		 orginalCollection=(BooksCollection)cache.get(type);
		 //cloning
		  clonedCollection=(BooksCollection) orginalCollection.clone();
		  //also copy inner objs to support deep cloning
		  booksList=new ArrayList();
		  
		  for(Book b:orginalCollection.getBooks()) {
			  bk=new Book();
			  bk.setBookId(b.getBookId());
			  bk.setBookName(b.getBookName());
			  booksList.add(bk);
		  }
		  clonedCollection.setBooks(booksList);
		  clonedCollection.setType(type);
		  return clonedCollection;
		
	}

}
