package com.application;

public class Student implements Comparable<Student> 
{

	private int rollno;
	private String name;
	
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}

	public Student() {
		super();
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Student stud) {
		
		return this.rollno - stud.rollno ;
		
		//return this.name.compareTo(stud.name);
	}
	
	
}









