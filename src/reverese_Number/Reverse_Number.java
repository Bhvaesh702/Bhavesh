package reverese_Number;

public class Reverse_Number {

	public static void main(String[] args) {
		int num=123;
		String Str = Integer.toString(num);
	    String rev= "";
	    for(int i=Str.length()-1;i>=0;i--) 
	    {
	    rev=rev+Str.charAt(i);	
	    }
	    int revNum = Integer.parseInt(rev);
	    System.out.println("Original Num is "+num);
	    System.out.println("Reverse Num is "+ revNum);
	}

}
