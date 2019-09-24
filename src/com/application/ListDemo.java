
package com.application;
import java.util.*;

public class ListDemo {

	public static void main(String[] args) {
		
		List lst = new ArrayList<>();
		
		lst.add(123);
		lst.add("ABC");
		lst.add(456);
		lst.add(12.35);
		lst.add(true);
		lst.add(123);
		
		System.out.println("All elements of lst are : ");
		for(Object obj : lst)
			System.out.println(obj);
		
		lst.remove(new Integer(123));
		
		System.out.println("After removal , all elements of lst are : ");
		Iterator itr = lst.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("Total number of elements in lst is : "+ lst.size());
		
		System.out.println("Elements present at index 3 in lst is : "+ lst.get(3));
		
		System.out.println("Is 456 present in lst : "+lst.contains(456));
		
		System.out.println("Element 12.35 is present at index : "+lst.indexOf(12.35));
															
		
		System.out.println("Element 899 is present at index : "+lst.indexOf(899));
				
		
		lst.clear();
		
		System.out.println("Now size of lst is : "+lst.size());
		
		String[] arr = {"ABC","PQR","XYZ","LMN"};
		//array to list conversion
		List<String> mylist = Arrays.asList(arr);
		
		System.out.println("All elements of mylist are : ");
		for(String str : mylist)
			System.out.println(str);
		
		Object[] myar = mylist.toArray();
		System.out.println("All elements of myar are : ");
		for(Object str : myar)
			System.out.println(str);
		
	}
}























