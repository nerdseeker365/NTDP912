package com.nt.comp;

public class FictionalBooksCollection extends BooksCollection {
	
	public FictionalBooksCollection() {
		System.out.println("FictionalBooksCollection:: 0-param constructor");
	}

	@Override
	public void loadBooks() {
		Book b=null;
		// collect these books DB s/w..
		setType("fictional");
		for(int i=0;i<10;++i) {
			b=new Book();
			b.setBookId(i+1);
			b.setBookName("FI->Book::"+i);
			getBooks().add(b);
		}
	}

}
