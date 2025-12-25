package oopsclassandobject;

public class Student {

    // Variables (data / properties)
    int id;
    String name;

    // Method (behavior)
    void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
    }

 public static void main(String[] args) {

        // Creating an object of Student class
        Student s1 = new Student();

        // Assigning values using object
        s1.id = 101;
        s1.name = "Zakeer";

        // Calling method using object
        s1.display();
    }
}



