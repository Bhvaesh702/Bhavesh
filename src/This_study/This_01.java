package This_study;

public class This_01 {
	public void main () {
		System.out.println(this); // This keyword also refer current object
	}


	public static void main(String[] args) {
		This_01 r= new This_01(); // Object creation
		System.out.println(r); // Calling referance  variable
		r.main();
		
	}

}
