package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class Write_File_02 {

	public static void main(String[] args) throws IOException {
		String data= "Hii Iam CHutiYa";
		FileWriter Write= new FileWriter("D:\\Class data\\Bhavesh.txt");
		Write.write(data);
		System.out.println("File written Sucessful");
		
		Write.close();

	}

}
