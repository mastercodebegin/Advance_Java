package com.application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class SortingDemo {

	public static void main(String[] args) {
		
		Set<Student> sset = new TreeSet<>();
		
		Student s1 = new Student(13, "ABC");
		Student s2 = new Student(12, "PQR");
		Student s3 = new Student(11, "XYZ");
		
		sset.add(s1);
		sset.add(s2);
		sset.add(s3);
		
		System.out.println("All students are : ");
		for(Student s : sset)
			System.out.println(s.getRollno()+" : "+s.getName());
		
		
		Employee e1 = new Employee("ABC",4567);
		Employee e2 = new Employee("PQR",1234);
		Employee e3 = new Employee("XYZ",3200);
		
		TreeSet<Employee> eset = new TreeSet<>(new 
				NameComparator());
		
		eset.add(e1);
		eset.add(e2);
		eset.add(e3);
		
		System.out.println("All Employees are : ");
		for(Employee e : eset)
			System.out.println(e.getName()+" : "+e.getSalary());
		
		
		ArrayList<Employee> alist = new ArrayList<>();
		
		alist.add(e1);
		alist.add(e2);
		alist.add(e3);
		
		Collections.sort(alist , new SalaryComparator());
		
		System.out.println("All Employees are : ");
		for(Employee e : alist)
			System.out.println(e.getName()+" : "+e.getSalary());
	}
}














