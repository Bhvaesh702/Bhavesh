package polymorphism;
//Q). Can we declare one overloaded method as static and another Non static?
public class Overloading_02 {
	void show(int emp_id,float income) {
		System.out.println("Employee id is "+emp_id);
		System.out.println("Net worth of company is "+income);
		
	}
	static void show(String company_name,int gate_no) {
		System.out.println("Company name is "+company_name);
		System.out.println(" Gate no is "+gate_no);
		
		
	}
	

	public static void main(String[] args) {
		Overloading_02 r= new Overloading_02();
		r.show(3245, 45.25f);
		show("Bhavesh", 24);
		
	}

}
