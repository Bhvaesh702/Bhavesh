package Constructor_Study;

public class Parameterized 
{
	String name;
	int emp_id;
	char level;
	public Parameterized(String x, int y, char z) 
{
		name=x;
		emp_id=y;
		level=z;
}
	public void display() 
{
		System.out.println("Employee name is "+name);
		System.out.println("Employee id is "+emp_id);
		System.out.println("Employee level is "+level);
		
}

	public static void main(String[] args)
{Parameterized j= new Parameterized("Bhavesh",324566,'A');
j.display();
		
}

}
