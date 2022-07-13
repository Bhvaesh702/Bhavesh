package polymorphism;
//Q).Can we declare overloaded method as one static and another non-static?
//Q). Can we overload main() method?
//Q). Can we change Method Overloading by changing the return type only?- No
//Q). Can we declare Overloaded method as a Final?- Yes
//Q). Automatic promotion in java.
public class Overloading {
	void company(int a) {
		System.out.println("Value of a is "+a);
		
	}
	void company (int x, int b, int c) {
		System.out.println("Value of x is "+x);
		System.out.println("Value of b is "+b);
		System.out.println("Value of c is "+c);
	}
	void test (int a) {
		System.out.println("Automatic Promotion 1");
		
	}
	void test(String a) {
		System.out.println("Automatic Promotion 2");
		
	}
	

	 public static void main(String[] args) {
		System.out.println("1");
		Overloading r = new Overloading();
		r.company(20,30,40);
		main(20);
		r.test("abc");
	
	}
	public static void main(int a) {
		System.out.println("2");
		
	}

}
