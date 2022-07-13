package Constructor_Study;

public class Constructor_overloading {
	int roll_num;
	String student_name;
	char grade;
		Constructor_overloading(int a,String b, char c){
			roll_num=a;
			student_name=b;
			grade=c;
		}
		Constructor_overloading(int a, String b){
			roll_num=a;
			student_name=b;
			
		}
		public void display() {
			System.out.println("Student name is "+student_name);
			System.out.println("Student roll num is "+roll_num);
			System.out.println("Student grade is "+grade);
		}

	public static void main(String[] args) {
		Constructor_overloading j1= new Constructor_overloading(32,"BhaveSH",'A');
		Constructor_overloading j2= new Constructor_overloading(32,"Bhavesh",'C');
		j1.display();
		j2.display();
		
		
		
		
	} 

}
