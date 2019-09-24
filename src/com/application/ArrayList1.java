package com.application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {
	public static void main(String[] args) {
		
		 List a= new ArrayList();
		 a.add(123);
		 a.add(1234);
		 a.add("Amir");
		 a.add(20.0);
		System.out.println(a.indexOf(123)+a.size());
		Object []r = a.toArray();
		System.out.println(r);
		//System.out.println(r.);
		 Iterator itr =  a.iterator(); 
		 
		 
		 String arr[]= {"23","2","",""};
		  //System.out.println());
		
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
		
	}

}
