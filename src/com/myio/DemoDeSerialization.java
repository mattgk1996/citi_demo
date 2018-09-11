package com.myio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.pojo.Person;

public class DemoDeSerialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream fi = new FileInputStream("person.txt");
			//Never modify. Append doesnt work.
			//Read and then modify logically
			
			ObjectInputStream oi = new ObjectInputStream(fi);
			Object o= oi.readObject();//check for parent child exception handling from documentation
			//Cast parent to child type to access its things
			//Downcasting needs to be performed. Super class can't access child
			
			Person p = (Person) o;
			
			System.out.println(p.getPersonName()+"\t"+p.getPerId());
			oi.close();
			fi.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
