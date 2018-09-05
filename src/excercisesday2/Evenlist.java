package excercisesday2;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Evenlist {
	
	public static int[] even(int n) {
		
		int [] op_arr;
		op_arr = new int[n];
		int count=0;
		for(int i=0;i<=n;i++) {
			if(i%2==0) {
				op_arr[count]=i;
				count++;
			}
		}
		return op_arr;
	}
	
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter Values for array");*/
		for (int i: even(n)) {
			if(i!=0)
			System.out.println(i+"\n");
		}
		
		
		// TODO Auto-generated method stub

	}

}
