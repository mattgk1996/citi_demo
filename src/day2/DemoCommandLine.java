package day2;

public class DemoCommandLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("arg:" +args[0] +args[1]);
		
		int valu1= Integer.parseInt(args[0]);
		int valu2= Integer.parseInt(args[1]);
		
		System.out.println("you entered:"+ (valu1+valu2));
		
		Integer i = new Integer(433);
		i = 9834;//autoboxing
		
		int v=i.intValue();
		int u=i; //Auto Unboxing
	}

}
