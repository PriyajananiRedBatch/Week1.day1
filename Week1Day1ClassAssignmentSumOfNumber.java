package week1.day1;

public class Week1Day1ClassAssignmentSumOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// To find out the sum of the digits of any given number and print it
		// Variable declaration as below

		int number = 61872;
		int sum = 0;
		System.out.println("The number taken is: " + number);

		// Using the while loop to extract the number from the last digit

		while (number > 0) {
			int rem = (number % 10);
			System.out.println("The extracted digit is: " + rem);
			number = number / 10;
			sum = sum + rem;

		}
		System.out.println("Sum of the digits of the number given is:" + sum);
	}

}
