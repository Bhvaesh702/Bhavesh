package reverese_Number;

public class ReverseNum_Without_String {

	public static void main(String[] args) {
		//123---321 WITHOUT USING STRING
//		System.out.println(11/2);
//        System.out.println(11%2 );
//		System.out.println(123/10);
//		System.out.println(123%10);
//		System.out.println(12%10);
//		System.out.println(1%10);
		
		int revNum=0;
		for(int i=123;i>0;i=i/10)
		{
			int rem=i%10;
			System.out.println(rem);
			revNum=revNum+rem;
		}
		System.out.println(revNum);
	}

}
