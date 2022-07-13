package FileHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;


public class Write_File {
	
	public static void main(String[] args) throws IOException {
		String str="Bhavesh";
		FileWriter Write= new FileWriter("D:\\Class data\\Bhavesh.txt");
		// Write.write("Bhavesh.txt");
		// Write.close();
		
		//Reading each Char FROM String ang writting into the file
			for(int i=0;i<str.length();i++)
				Write.write(str.charAt(i));
			System.out.println("File wite sucessfully");
			Write.close();
				
				 
			 }
		 
			 
		 
	}


