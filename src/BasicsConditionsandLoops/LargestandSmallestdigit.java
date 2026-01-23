package BasicsConditionsandLoops;

public class LargestandSmallestdigit {
    public static void main(String[] args) {

        int num = 1234;
        int max = 0;
        int min = 9;

        while (num > 0) {
            int digit = num % 10;

            if (digit > max) {
                max = digit;
            }
            if (digit < min) {
                min = digit;
            }

            num = num / 10;
        }

        System.out.println("Largest digit: " + max);
        System.out.println("Smallest digit: " + min);
    }
}
