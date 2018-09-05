package day2;

public class Demo1D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] array; 		//declaration
		array = new int[4];		//INITIALISATION
		/*array[0]=Integer.parseInt(args[0]);		//INDIVIDUAL ELEMENTS
		array[1] = Integer.parseInt(args[1]);
		*/
		int i;
		for (i=0; i<array.length; i++)
		{
			array[i]= Integer.parseInt(args[i]);
		}
		/*array[7]=6;*/
		
		for (int j=0;j<4;j++)
		System.out.println(array[j]);
		
		for(int var:array)
		{
			System.out.println(var);
		}
		
		
	}

}
