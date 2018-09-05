

public class Demo1D_objects {

	public static void main(String[] args) {
		
		MyClass [] obj;
		
		obj = new MyClass[3];
		obj[0] = new MyClass();//If you dont construct an object, null ptr exception
		obj[1] = new MyClass();
		obj [2] = new MyClass(5, 54f, "hi", 23d, true);
		
		for(MyClass g:obj)
		{
			g.display();
		}
		
		Student [] ob;
		ob = new Student[5];
		for(int i=0;i<ob.length;i++)
		{
			ob[i]= new Student();
		}
		
		for(Student g:ob)
		{
			g.display();
		}
	}

}
