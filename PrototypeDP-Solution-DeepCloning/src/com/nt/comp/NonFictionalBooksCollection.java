package com.nt.comp;

public class NonFictionalBooksCollection extends BooksCollection {

	public NonFictionalBooksCollection() {
		System.out.println("NonFictionalBooksCollection::0-param constructor");
	}
	
	@Override
	public void loadBooks() {
		Book b=null;
		// collect these books DB s/w..
		setType("non-fictional");
		for(int i=0;i<10;++i) {
			b=new Book();
			b.setBookId(i+1);
			b.setBookName("NFI->Book::"+i);
			getBooks().add(b);
		}
	}

}
