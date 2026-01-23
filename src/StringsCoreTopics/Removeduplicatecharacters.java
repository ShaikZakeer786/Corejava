package StringsCoreTopics;

public class Removeduplicatecharacters {
    public static void main(String[] args) {

        String s = "java programmer";
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (result.indexOf(ch) == -1) {
                result = result + ch;
            }
        }

        System.out.println("After removing duplicates: " + result);
    }
}

