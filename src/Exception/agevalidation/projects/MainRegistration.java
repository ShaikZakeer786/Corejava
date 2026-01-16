package Exception.agevalidation.projects;

import java.util.Scanner;

public class MainRegistration {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        RegistrationService service = new RegistrationService();

        try {
            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Email: ");
            String email = sc.nextLine();

            boolean result = service.validateUser(name, age, email);

            if (result) {
                System.out.println("Registration Successful");
            }

        } catch (InvalidAgeException e) {
            System.out.println("Age Error: " + e.getMessage());

        } catch (InvalidEmailException e) {
            System.out.println("Email Error: " + e.getMessage());

        }
    }
}
