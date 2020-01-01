package com.nt.test;

import com.nt.comp.BooksCollection;
import com.nt.factory.BookCollectionFactory;
import com.nt.factory.BookType;

public class PrototypeDPTest {

	public static void main(String[] args) {
	     BooksCollection  fCollection1=null,fCollection2=null;
	     BooksCollection nfCollection1=null,nfCollection2=null;
	     fCollection1=BookCollectionFactory.getInstance(BookType.FICTIONAL);
	     System.out.println(fCollection1);
	     System.out.println("...............................");
	     fCollection2=BookCollectionFactory.getInstance(BookType.FICTIONAL);
	     System.out.println(fCollection2);
	     System.out.println("====================================");
	     nfCollection1=BookCollectionFactory.getInstance(BookType.NONFICTIONAL);
	     System.out.println(nfCollection1);
	     System.out.println("...............................");
	     nfCollection2=BookCollectionFactory.getInstance(BookType.NONFICTIONAL);
	     System.out.println(nfCollection2);
	     

	}

}
