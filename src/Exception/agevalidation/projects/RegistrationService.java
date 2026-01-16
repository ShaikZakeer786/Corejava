package Exception.agevalidation.projects;

class RegistrationService {

    boolean validateUser(String name, int age, String email)
            throws InvalidAgeException, InvalidEmailException {

        boolean isValid = true;

        if (age < 18) {
            isValid = false;
            throw new InvalidAgeException("Age must be 18 or above");
        }

        if (!email.contains("@")) {
            isValid = false;
            throw new InvalidEmailException("Email must contain @ symbol");
        }

        return isValid;
    }
}


