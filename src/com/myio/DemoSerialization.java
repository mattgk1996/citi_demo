package com.myio;


//Dont have person class file or pojo

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.pojo.Person;

public class DemoSerialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		FileOutputStream fo = new FileOutputStream("person.txt"); // Step 1
		ObjectOutputStream oo = new ObjectOutputStream(fo); //Step 2
		oo.writeObject(new Person(12,"Abcd","Pune",30));
		//Serializable files are very sensitive. Dont have multiple writes. Use Arrays.
		//Process for Serialization same.
		
		oo.close();
		fo.close();
		
		System.out.println("data added to the file successfully");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
