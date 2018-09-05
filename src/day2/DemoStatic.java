package day2;

public class DemoStatic {
	
	private int id;
	private String name;
	private static int counter;
	
	static {
		System.out.println("Static block invoked");
		counter =0;
		
	}
	
	{
		System.out.println("Non static");
	}

	public DemoStatic() {
		// TODO Auto-generated constructor stub
	id = 19;
	name = "abra";
	System.out.println("Constructor invoked");
	counter++;
	}
	
	public void display() {
		System.out.println("id:-"+ id);
		System.out.println("Name:-"+name);
		
	}
	
	public static void show() {
		System.out.println("Counter:-"+counter);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoStatic.show();
		DemoStatic d1 ;
		DemoStatic d2 = new DemoStatic();
		DemoStatic d3 = new DemoStatic();
		DemoStatic d4 = new DemoStatic();
		DemoStatic d5 = new DemoStatic();
		d1 = new DemoStatic();
		d2.display();
		
		show();
	}

}
