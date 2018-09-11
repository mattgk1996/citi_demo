package com.myio;

public class DemoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String objects are immutable objects 
		//Value for new variables do not change unless new memory is associated
		String name = "citi";
		System.out.println("Original Name:-"+ name);
		name.concat(",Pune");
		//Will only make a new mem location. name doesnt refer to concat pos
		
		name = name.concat(",Pune"); 
		// because immutable. Wrapper classes are also immutable.
		System.out.println("new name:-"+name);
		
		//String pool handles the strings. Check how it works...
		
		//String buffer 
		StringBuffer buffer = new StringBuffer("citi");// will not be treated as primitive
		buffer.append("hello");
		System.out.println(buffer);
		//String Builder also works the same way.
		
		
	}
	
	public class funcover {
		//vararg array of arguments. min 1
		//vararg can be only 1 in a vararg. it should be tell arg
		public void add(int...x ) {
		
			for (int i =0;i<x.length;i++) {}
			for (int data:x) {}
			
			}
		}
		
	}

//String Functionalitites.
