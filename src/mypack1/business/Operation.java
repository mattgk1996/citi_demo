package mypack1.business;

import java.util.Arrays;

public class Operation {
	public int add(int no1,int no2) {
		return (no1+no2);
	}
	
	
	public int max(int[] arr) {
		Arrays.sort(arr);
		/*int i=0;
		for(int a:arr)
		{
			if(a>i)
			{
				i=a;
			}
		}
		return i;*/
		return arr[arr.length-1];
	}
}
