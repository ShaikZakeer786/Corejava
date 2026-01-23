package StringsCoreTopics;

public class ReverseString {
    public static void main(String[] args) {

        String s = "Zakeer";
        String rev = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }

        System.out.println("Reversed string: " + rev);
    }
}

