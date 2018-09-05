package day2;

public class Demo2D {

	public static void main(String []args) {
		int [][] elements = new int[3][3];
		
		/*for (int i=0;i<3;i++)
		{
			for (int j = 0;j<3;j++)
			{
				elements[i][j]= i+j;
			}
		}
		
		for (int i=0;i<3;i++)
		{
			for (int j = 0;j<3;j++)
			{
				System.out.print(elements[i][j]+"\t");
			}
			System.out.println();
		}*/
		
		//Adding different row lengths
		
		int [][] element= new int [3][]	;
		element [0]=new int [5];
		element [1]=new int[1];
		element [2]= new int [2];
		
		
/*		for (int i=0;i<3;i++)
		{
			for (int j:element[i])
			{
				element[i][1] = j;
			}
		}*/
		
		for (int i[]:element)
		{
			for (int j:i)
			{
				System.out.print(j+"\t");
			}
			System.out.println();
		}
		
	}
}

