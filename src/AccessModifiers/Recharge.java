package AccessModifiers;

public class Recharge {
	
	/*  2️.Mobile Recharge System

	Task:
	Class Recharge:

	static method → showOperator()

	public constructor → set mobile number

	non-static method → choosePlan(int planCode) using switch

	private constructor → block outside creation


	Input: planCode = 2
	Output: 2GB/day – 28 days
	
	

*/
	long num;

	public static void showOperator() {

		System.out.println("Operator : JIO");

	}

	public Recharge(long n) {
		num = n;

	}
	
	public void  choosePlan(int planCode) {
		switch (planCode) {
		case 1:
			System.out.println("1GB/day – 24 days");
			break;
		case 2:
			System.out.println("2GB/day – 28 days");
		default:
			System.out.println("Invalid Plan");
		}
	}
		
		
		public static void main(String[] args) {
			Recharge.showOperator();
			Recharge obj = new Recharge(0000000);
			obj.choosePlan(2);
		}
		
	}
	
	