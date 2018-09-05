package excercisesday2;

public class CommandLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		if (args[2].equals("+")) {
			System.out.println(n1+n2);
		}
		else if (args[2].equals("-")) {
			System.out.println(n1-n2);
		}
		else if(args[2].equals("*")) {
			System.out.println(n1*n2);
		}
		else if(args[2].equals("/")) {
			System.out.println((float)(n1/n2));
		}
		else 
			System.out.println("Nothin");
	}

}
