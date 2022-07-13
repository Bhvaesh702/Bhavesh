package LogicalProgramme;

import java.util.Scanner;

public class Check_Vowels_and_Consonant {

	public static void main(String[] args) {
		char ch;
		System.out.println("Please enter the character :");
		Scanner sc= new Scanner(System.in);
		ch=sc.next().charAt(0);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') 
		{
			System.out.println("This is vowels ");
			
		}else
		{
			System.out.println("This is Consonant ");
		}
	}

}
