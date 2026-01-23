package Exceptions;

public class NestedTry {
	public static void main(String[] args) {
		try {
			try {
				int a = 10 / 0;
				System.out.println(a);
			} catch (ArithmeticException e) {
				System.out.println("Inner try block");
			}
		} catch (ArithmeticException e) {
			System.out.println("Outer block");
		} finally {
			System.out.println("final block");
		}
	}

}
