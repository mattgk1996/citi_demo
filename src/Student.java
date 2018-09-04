
public class Student {
	
	private int rno;
	private String sname;
	private int std;
	private String address;
	private int age;
	
	public Student()
	{
		rno = 0;
		sname="Not Enrolled";
		std = 0;
		address = "N.A.";
		age = 0;
	}
	
	public Student(int rno, String sname,int std, String address, int age)
	{
		this.rno = rno;
		this.sname = sname;
		this.std =std;
		this.address = address;
		this.age = age;
	}
	
	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getStd() {
		return std;
	}

	public void setStd(int std) {
		this.std = std;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void display()
	{
		System.out.println("roll no:-"+rno+"\tage:="+age+"\tname :-"+sname);
		System.out.println("Standard:-"+std);
		System.out.println("Address :-"+address+"\n");
		
	}
	
}
