package Constructor_Study;

public  class User_defined {
	String name;
	int emp_id;
	
	
	 public  User_defined()
	
	{ name="Bhavesh";
	emp_id=324566;
		
}
	public void display() {
		System.out.println("Employee Name is "+name);
		System.out.println("Employee is is "+emp_id);
	}


	public static void main(String[] args) {
		User_defined j= new User_defined();
		j.display();
	
	}

}
