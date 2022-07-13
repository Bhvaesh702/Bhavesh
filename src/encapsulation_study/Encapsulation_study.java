package encapsulation_study;

public class Encapsulation_study {
	private int empid;                  //Data Hiding

	public static void main(String[] args) {
		
		Encapsulation_study s= new Encapsulation_study();
		s.setEmpid(100);
		System.out.println(s.getEmpId());
	}
public void setEmpid( int empid1)
{
	  empid=empid1;                       //Setter Method is used to  modify the data
}
public int getEmpId() 
{
	return empid;        //Getter Method is used to get data
}

}
