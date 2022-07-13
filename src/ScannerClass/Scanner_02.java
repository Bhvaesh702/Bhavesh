package ScannerClass;

import java.util.Scanner;

public class Scanner_02 {

	public static void main(String[] args) {
		int age=20;
		Scanner sc= new Scanner(System.in);
		System.out.println("Please Enter Your Age  ;");
		int DATA = sc.nextInt(age);
if(DATA>=20) {
	System.out.println("You are eligible for driving license");
}else {
	System.out.println("You are not eligible for driving license");}
}

}
