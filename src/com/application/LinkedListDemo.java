package com.application;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> lst = new LinkedList<>();
		
		lst.add("ABC");
		lst.add("PQR");
		lst.add("XYZ");
		lst.addFirst("DEF");
		lst.addLast("LMN");
		
		System.out.println("All elements of lst are : ");
		for(String str : lst)
			System.out.println(str);
		
		lst.remove();
		lst.removeFirst();
		lst.removeLast();
		
		System.out.println("after removal , All elements of lst are : ");
		for(String str : lst)
			System.out.println(str);
		
		System.out.println("result of peek is : "+lst.peek());
		
		System.out.println("result of polling is : "+lst.poll());
		
		System.out.println("after polling , All elements of lst are : ");
		for(String str : lst)
			System.out.println(str);
	}
}












