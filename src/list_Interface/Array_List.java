package list_Interface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Array_List {

	public static void main(String[] args) {
		ArrayList al= new ArrayList();
         al.add("Bhavesh");
         al.add("Bhavesh");
         al.add(null);
         al.add(null);
         al.add(123);
         al.add(12.12);
         
//         System.out.println(al);
//         System.out.println(al.contains(null));
//         System.out.println(al.remove(0));
//         System.out.println(al);
//      al.add(5, "Don");
//      System.out.println(al);
//         System.out.println(al);
//         System.out.println(al.get(2));
//         System.out.println(al.size());
//         System.out.println(al.clone());
//         al.trimToSize();
//         System.out.println(al);
//         System.out.println(al.isEmpty());
//         System.out.println(al.indexOf("Bhavesh"));
//         System.out.println(al.lastIndexOf(123));
//         System.out.println(al.remove(2));
//         System.out.println(al);
//         al.set(3, "Kutra");
//         System.out.println(al);
         System.out.println("===========================");
         
         Iterator r= al.iterator();
         
         while(r.hasNext())
         {
        	 System.out.println(r.next());
        	 
        	  System.out.println("===========================");
        	  
        	  ListIterator j=al.listIterator();
        	  while(j.hasNext()) {
        		  System.out.println(j.next());}
        		  
        		  System.out.println("===========================");
        		  
        		  for(Object k:al) {
       			  System.out.println(k);}
        			  
        		  }
        		  
        	  }
	}
        	 
       //}
	//}
//}
