package CollectionsExample;

import java.util.*;

/*
🔹 CLASS 1: List Interface – Homework

Q1. AddStudents
Question:
Create a method that adds 5 student names to a List and returns the list.
Expected Output:
Students: [Ayaan, Rahim, Sara, John, Ali]
*/
public class StudentData {
	List<String> list = new LinkedList<>();

	List createStudents() {

		list.add("syed");
		list.add("Rahim");
		list.add("Sara");
		list.add("Jhon");

		return list;

	}

	public static void main(String[] args) {
		
		StudentData studentData = new StudentData();
		
		List students = studentData.createStudents();
		
		System.out.println("Students data : " + students);

	}

}