package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Deletion_Of_File {

	public static void main(String[] args) throws IOException {
		
		File Write= new File("D:\\Class data\\Bhavesh.txt");
		
		if(Write.delete()) {
			System.out.println("File deleted SucessFully name is : "+ Write.getName());
		}else {
			System.out.println("Error Occured");
		}
		
	
	}

}
