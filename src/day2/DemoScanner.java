package day2;

import java.util.Scanner;

public class DemoScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 age");
		int age = Integer.parseInt(sc.nextLine());
		int age1 = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter %");
		float perc = Float.parseFloat(sc.nextLine());//something wrong with this. What?
		float perc2 = sc.nextFloat();
		
		System.out.println("Ages:" + age + "\t"+age1);
		System.out.println("Percent " + perc+ "\t"+perc2);
		
		boolean a = false;
		
		if (a == true) {
			System.out.println("Legal");;
			
		}
		else {
			System.out.println("Sorraayy");
			
		}

	}

}
