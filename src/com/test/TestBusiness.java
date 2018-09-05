package com.test;

import mypack1.business.Operation;

public class TestBusiness {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation o1;
		o1 = new Operation();
		System.out.println(o1.add(5, 7));
		int [] arr= {0,1,2,3,4,5};
		
		System.out.println(o1.max(arr));
	}

}
