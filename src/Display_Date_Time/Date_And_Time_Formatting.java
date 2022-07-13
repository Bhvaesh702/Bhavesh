package Display_Date_Time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date_And_Time_Formatting {

	public static void main(String[] args) {
		LocalDateTime Before= LocalDateTime.now();
		System.out.println("Before Formatting "+Before);
		
		DateTimeFormatter Format= DateTimeFormatter.ofPattern("E,MMM/dd/yyyy");
		String After = Before.format(Format);
		System.out.println("After Formatting "+After);
 
	
	}

}
