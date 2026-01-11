package CollectionsExample;

import java.util.*;
/*Q4. CheckStudentExists

Question:
Create a method that checks whether a student name exists in list.

Input:

Name: John

Output:

Student Found */

public class CheckStudentExists {

	List<String> students = new ArrayList<String>();
	
	 public boolean checkStudent(String name) {

	        students.add("Ayaan");
	        students.add("Rahim");
	        students.add("Sara");
	        students.add("John");
	        students.add("Ali");

	        return students.contains(name);
	    }

	    public static void main(String[] args) {

	    	CheckStudentExists obj = new CheckStudentExists();
	        boolean found = obj.checkStudent("John");

	        if (found) {
	            System.out.println("Student Found");
	        } else {
	            System.out.println("Student Not Found");
	        }
	    }
}