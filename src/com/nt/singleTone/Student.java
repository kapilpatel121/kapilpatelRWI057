package com.nt.singleTone;

public class Student {

	public static Student student_instance = null;

	public static Student getInstance() {
		if (student_instance == null) {
			student_instance = new Student();
		}
		return student_instance;
	}

	public static void main(String[] args) {

		Student s1 = Student.getInstance();
		System.out.println(s1.hashCode());
		Student s2 = Student.getInstance();
		System.out.println(s2.hashCode());

	}
}