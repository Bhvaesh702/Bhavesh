package string;

public class String_study {
	
	public static void main(String[] args) {
		String name= "Bhavesh";
		//To get the length of String.
		//System.out.println(name.length());
		int lengthOfString = name.length();
		System.out.println(lengthOfString);
		
		//use of toUpperCase() of Method
		//System.out.println(name.toUpperCase());
		String UpperCase = name.toUpperCase();
		System.out.println(UpperCase);
		
		//Use of toLowerCase() method
		//System.out.println(name.toLowerCase());
		String LowerCase = name.toLowerCase();
		System.out.println(LowerCase);
		System.out.println("====================");
		//Use of equal() METHOD
		String a= "BHAVESH";
		String b= "bHAVESH";
		String c= "bhavesh";
		String d= new String("BHAVESH");
		String e= new String("bHAVESH");
		//== Used to compare the two memory locations
		//equals() method used to compare the Character sequence of two objects
		System.out.println(a==b);
		System.out.println(a==d); // used to comapre memory location of object
		System.out.println(b==e);
		System.out.println(a.equals(d));
		System.out.println(b.equals(e));// used to compare the character sequence is matcing or not
		boolean equality = a.equals(d);
		System.out.println(equality);
		
		//equalIgnoreCase Method() use
		
		String name1="Bhavesh";
		String name2="Bhavesh";
		String name3="BHAVESH";
		
		System.out.println(name1.equals(name3));
		System.out.println(name1.equalsIgnoreCase(name3));
		
		
		
		// use of contains method
		String name4= "Bhavesh";
		System.out.println(name4.contains("Bh"));
		System.out.println(name4.contains("ev"));
		
	}

}

