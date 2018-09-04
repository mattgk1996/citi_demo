package excerciseday1;

public class employee_e3 {

	int empid;
	String ename;
	
	static int ecount;
	
	public employee_e3(int empid, String ename) {
		super();
		this.empid = empid;
		this.ename = ename;
		ecount++;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public static int getEcount() {
		return ecount;
	}

	public employee_e3() {
		// TODO Auto-generated constructor stub
		ecount++;
	}
	
	public void display_employee() {
		
		System.out.println("Number: " +empid);
		System.out.println("Name: "+ename);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee_e3 e1,e2,e3,e4;
		
		e1 = new employee_e3();
		e2 = new employee_e3();
		e3 = new employee_e3(5, "ename");
		e4 = new employee_e3();
		
		e1.display_employee();
		e2.display_employee();
		e3.display_employee();
		e4.display_employee();
		
		System.out.println(getEcount());
		
		
	}

}
