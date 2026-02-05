package oopsclassandobject;

public class Students {

	   // Variables
	    int id;
	    String name;
	    String section;

	    // Method to set values
	    void setData(int i, String j, String k ) {
	        id = i;
	        name = j;
	        section= k; 
	        
	    }

	    // Method to display values
	    void display() {
	        System.out.println("Student ID: " + id);
	        System.out.println("Student Name: " + name);
	        System.out.println( "Student Section: " + section);
	    }
	
	
	    public static void main(String[] args) {

	        // Object creation
	        Students s1 = new Students();

	        // Setting values using method
	        s1.setData(11, "Zakeer","5th section");

	        // Calling method
	        s1.display();
	    }
	}


