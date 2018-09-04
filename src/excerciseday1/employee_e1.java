package excerciseday1;

public class employee_e1 {
	
	private int age;
	private String name;
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void showEmployeeDetails(){
		
		System.out.println("Name: "+this.getName());
		System.out.println("Age: "+this.getAge());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee_e1 e1;
		e1 = new employee_e1();
		
		e1.setAge(12);
		e1.setName("Kiddo");
		
		e1.showEmployeeDetails();
	}

}
