package FileHandling;

import java.io.File;
import java.io.IOException;

public class Creation_Of_File {

	public static void main(String[] args) throws IOException   {
		File Creation= new File("D:\\Class data\\Bhavesh.txt");
        boolean Create = Creation.createNewFile();
        if(Create) {
        	System.out.println("File Creation done SucessFully And Name is "+Creation.getName());
        }else {
        	System.out.println("File Creation didnt SucessFul");
        }
        
        
        
        // Instead of throwing the IOException we can cover the object in catch and try exception.
	
//	try {
//		Creation.createNewFile();
//	} catch (IOException e) {
//		
//		
//	}
	
	
	
	
	}
	
	

}
