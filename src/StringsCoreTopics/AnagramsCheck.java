package StringsCoreTopics;

public class AnagramsCheck {
    public static void main(String[] args) {

        String s1 = "java";
        String s2 = "python";

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        java.util.Arrays.sort(a);
        java.util.Arrays.sort(b);

        if (java.util.Arrays.equals(a, b)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not anagram");
        }
    }
}

