package com.application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		Set<Integer> hset = new HashSet<>();
		
		hset.add(123);
		hset.add(567);
		hset.add(778);
		hset.add(899);
		hset.add(123);
		
		System.out.println("All elements of hset are : ");
		for(Integer x : hset)
			System.out.println(x);
		
		Set<Integer> lhset = new LinkedHashSet<>();
		
		lhset.add(123);
		lhset.add(567);
		lhset.add(899);
		lhset.add(778);
		lhset.add(123);
		
		System.out.println("All elements of lhset are : ");
		for(Integer x : lhset)
			System.out.println(x);
		
		Set<Integer> tset = new TreeSet<>();
		
		tset.add(123);
		tset.add(899);
		tset.add(778);
		tset.add(567);
		
		System.out.println("All elements of tset are : ");
		for(Integer x : tset)
			System.out.println(x);
		
		
	}
}













