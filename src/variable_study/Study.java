package variable_study;

public class Study {
	int a= 20;
	static int b=30;

	public static void main(String[] args) {
		Study obj= new Study();
		System.out.println(obj.a);
		System.out.println(obj.b);
	obj. a=1000;
		obj.b=2000;
		System.out.println(obj.a);
		System.out.println(obj.b);
		Study obj1= new Study();
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		

	}

}
