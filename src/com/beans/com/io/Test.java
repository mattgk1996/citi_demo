package com.beans.com.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;

import com.beans.Book;


 public class Test implements BookPersistence {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		FileWriter writer = null;
		Test t= new Test();
		Book[] book = new Book[1];
		if(t.writeBooks(book)) {
		System.out.println("data added to the file successfully");
	}
	}
	

	@Override
	public boolean writeBooks(Book[] book) {
		// TODO Auto-generated method stub
		InputStreamReader read = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(read);
		
		try {
			
			//writer = new FileWriter("books.txt");
			
			
			for (int i=0;i<book.length;i++) {
				System.out.println("Enter ISBN,Name,Pub,Author and Price");
				String isbn = in.readLine();
				String bookname = in.readLine();
				String bookpub = in.readLine();
				String auth = in.readLine();
				int price =Integer.parseInt( in.readLine());		
				
				
				book[i] = new Book(isbn, bookname, bookpub, auth, price);
			}
			FileOutputStream fo = new FileOutputStream("book.txt");
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			oo.writeObject(book);
			
			oo.close();
			fo.close();
		
			return true;
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		
		
		
		
	}


	@Override
	public void printBookDetails(Book[] book) {
		// TODO Auto-generated method stub
		
	}

}
