package BasicsConditionsandLoops;

public class EvenOddDigits {
    public static void main(String[] args) {

        int num = 12345;
        int even = 0;
        int odd = 0;

        while (num > 0) {
            int digit = num % 10;

            if (digit % 2 == 0) {
                even++;
            } else {
                odd++;
            }

            num = num / 10;
        }

        System.out.println("Even digits: " + even);
        System.out.println("Odd digits: " + odd);
    }
}
