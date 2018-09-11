package com.beans.com.io;

import com.beans.Book;

public interface BookPersistence {
	public abstract boolean writeBooks(Book[] book);//Serialization
	void printBookDetails(Book[] book);
	
}
