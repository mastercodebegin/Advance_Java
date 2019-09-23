package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {
	public static void main(String[] args) {
		
		 List a= new ArrayList();
		 a.add(123);
		 a.add("Amir");
		 
		 Iterator itr =  a.iterator(); 
		 
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
		
	}

}
