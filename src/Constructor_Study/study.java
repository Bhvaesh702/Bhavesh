package Constructor_Study;

public class study {
	int age;
	String name;
	char Grade;
	
	public study(int x,String y,char z) {
		age=x;
		name=y;
		Grade=z;
		
	}

	public static void main(String[] args) {
		study obj= new study(20,"Bhavesh",'A');
		obj.display();
		
		
	}

	public void display() {
		System.out.println("Age is "+age);
		System.out.println("Name is "+name);
		System.out.println("Grade is "+Grade);
		
		
	}
}
