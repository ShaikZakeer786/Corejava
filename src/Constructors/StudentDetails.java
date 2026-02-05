package Constructors;

public class StudentDetails {

	static String schoolname = "Narayana";
	String name;
	int rollnum;

	public void showStudentDetails() {
		System.out.println("Student Name: " + name);
		System.out.println("Roll No: " + rollnum);

		showSchoolName();

	}

	public static void showSchoolName() {
		System.out.println("School Name: " + schoolname);

	}

	public static void main(String[] args) {
		StudentDetails.showSchoolName();
		StudentDetails obj = new StudentDetails();
		obj.showStudentDetails();

	}
}
