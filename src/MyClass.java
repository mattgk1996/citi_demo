
public class MyClass {
		private int age;
		private float percentage;
		private String name;
		private double salary;
		private boolean isEmployed;
		
		public void display()
		{
			System.out.println("age:="+age+"\tname :-"+name);
		}
		
		public MyClass()
		{
			age = 199;
			percentage = 10.8f;
			name = "Citi";
			salary = 10000d;
			isEmployed = true;
		}
		
		public MyClass(int a, float p,String n,double s,boolean i)
		{
			age = a;
			percentage=p;
			salary = s;
			isEmployed = i;
			name=n;
			
		}
}
