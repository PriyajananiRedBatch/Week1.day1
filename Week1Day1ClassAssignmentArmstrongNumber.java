package week1.day1;

public class Week1Day1ClassAssignmentArmstrongNumber {

	public static void main(String[] args) {
		//  This is to calculate if a number is an ARMSTRONG Number or not
		// Armstrong Number is one if the sum of the cubes of the digits of the number is equal to the number
		
		System.out.println("To find if a given number is ARMSTRONG NUMBER");
		System.out.println("A given number is called ARMSTRONG Number if the sum of the cubes of its digits is equal to the number");
		
		//Variables Declaration and initialisation
		
		int input = 371, remainder, original;
		original = input;
		int calc = 0;
		
		//Using While loop to set condition
		
		while (original>0) {
			
			remainder = (original%10);
			original = (original/10);
			calc = ((remainder*remainder*remainder)+calc);
		}
		
		//Using If condition to validate if the calculated result is equal to the input
				
		if (calc==input) {
			System.out.println("The given number: " + input + " is an ARMSTRONG Number");
		}
		else
			System.out.println("The given number: " + input + " is not an ARMSTRONG Number");

	}

}
