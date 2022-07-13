package variable_study;

public class InstanceAndGlobalVariable  {
	int a=20;             // Instance and global variable
	static int b=30;       // static variable
	

	public static void main(String[] args) {
	
	InstanceAndGlobalVariable obj= new InstanceAndGlobalVariable();   //Object creation non static method
	obj.run();
	
	
	}
	public  void run() {
		System.out.println(a);
		System.out.println(b);
		
		
		
	}

}
