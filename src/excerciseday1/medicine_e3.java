package excerciseday1;

public class medicine_e3 {

	int medicine_age;
	String medicine_name;
	
	
	
	
	public medicine_e3(int medicine_age, String medicine_name) {
		super();
		this.medicine_age = medicine_age;
		this.medicine_name = medicine_name;
	}

	

	public medicine_e3() {
		super();
		this.medicine_age = 0;
		this.medicine_name = "Null";
	}



	public int getMedicine_age() {
		return medicine_age;
	}


	public void setMedicine_age(int medicine_age) {
		this.medicine_age = medicine_age;
	}


	public String getMedicine_name() {
		return medicine_name;
	}


	public void setMedicine_name(String medicine_name) {
		this.medicine_name = medicine_name;
	}

	public void displayMedInfo() {
		System.out.println("Medicine Name: "+getMedicine_name());
		System.out.println("Medicine Age: "+getMedicine_age());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		medicine_e3 m1, m2;
		m1 = new medicine_e3();
		m2 = new medicine_e3(7, "medicine_name");
		
		m1.displayMedInfo();
		m2.displayMedInfo();
		
		m1.setMedicine_age(6);
		m1.setMedicine_name("Name");
		
		m1.displayMedInfo();
		m2.displayMedInfo();
		
	}

}
