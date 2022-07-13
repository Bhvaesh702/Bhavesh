package ScannerClass;

import java.util.Scanner;

public class Scanner_01 {

	public static void main(String[] args) {
		  Scanner sc= new Scanner(System.in);
		  System.out.println("Enter the Age,Name,Salary");
		  
		     int Age = sc.nextInt();
		     String Name = sc.next();
		   double Salary = sc.nextDouble();
		     System.out.println(" Age: "+Age);
		     System.out.println(" Name: "+Name);
		     System.out.println(" Salary: "+Salary);
		     
	        
	}

}
