package This_study;// Use of This keyword
// to call local and instance variable of same class

public class This_02 {
	int a;
	
	public This_02 (int a) { // Constructor Creation
	this.a=a;  // We are using this keyword where local and instance keyword is in same class
		// to avoid jvm confusion this keyword is used
	}
	void main() {
		System.out.println(a);
		
	}

	public static void main(String[] args) {
		
		This_02 r= new This_02(200);
		r.main();
		
	}

}
