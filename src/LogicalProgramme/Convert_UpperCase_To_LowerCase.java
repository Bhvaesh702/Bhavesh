package LogicalProgramme;

import java.util.Scanner;

public class Convert_UpperCase_To_LowerCase {

	public static void main(String[] args) {
		char ch;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the char ");
		ch=sc.next().charAt(0);
		if(ch>='A' && ch<='Z') {
			char ch2 = Character.toLowerCase(ch);
			System.out.println("Lower case is :"+ch2);
		}
		else
		{
			char ch2 = Character.toUpperCase(ch);
			System.out.println("Upper case is :"+ch2);
		}
	}

}
