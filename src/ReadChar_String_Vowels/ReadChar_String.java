package ReadChar_String_Vowels;

import java.util.Scanner;

public class ReadChar_String {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int Vowels=0,conso=0,words=0;
		System.out.println("Enter the Sentense : ");
		String s = sc.nextLine();
		 s = s.toLowerCase();
		for(int i=0;i<=s.length();i++) 
		{
			char ch = s.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o'||ch=='u') 
		{
			++Vowels;
			}
			else if(ch>='a' && ch<='z') 
			
		{
				++conso;
			}
		}
			System.out.println("hOW many Letters are in Vowels ? "+Vowels);
			System.out.println("hOW many letters are in cons? "+conso);
			System.out.println("Lowercase : "+s.toLowerCase());
			System.out.println("Uppercase :"+s.toUpperCase());
			System.out.println("Total No Of Letters are "+(Vowels+conso));
			
			for(int i=0;i<s.length();i++)
		{
				if(s.charAt(i)==' ' && s.charAt(i)!=' ' ) {
					words++;
				}
				
			System.out.println("Total No of words "+(words+1));
		
		}
			
			
			
			
		}
	}

	



