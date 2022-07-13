package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read_File {

	public static void main(String[] args) throws FileNotFoundException {
		File data = new File("D:\\Class data\\Bhavesh.txt");
		Scanner sc= new Scanner(data);
		while(sc.hasNextLine()) {
			String ref = sc.next();
			System.out.println(ref);
			}
		
		
	}

}
