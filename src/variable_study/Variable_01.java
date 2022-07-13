package variable_study;

public class Variable_01 { 
	// Static variables 
public static int a=10;
static int b=20;
static float c=25.23f;
static void study() // Static method
{
	int x=20; // cannot use static variable in method
	System.out.println(x);

} 
 public void book(int emp_id,String name,String company_name)
{ System.out.println("emp id is "+emp_id);
System.out.println("Company Employee name is "+name);
System.out.println("Company name is "+ company_name);
	
}
	public static void main(String[] args) {
		System.out.println(a);
		study();      //  to call static method from same class syntax is- method name();
		Variable_01 r= new Variable_01(); // Object creation
		r.book(324566,"Bhavesh","IBM"); // non-static method calling
	}

}
