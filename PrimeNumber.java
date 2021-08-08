package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("This is find out if the given number is PRIME or not");

		// variable declaration

		int input = 419, i = 2, rem;
		boolean flag = false;

		// looping with For, looping starts with the first prime no which is 2, until
		// the number is halved

		for (i = 2; i < (input / 2); i++) {
			rem = input % i;
			if (rem == 0) {
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("The given number: " + input + " is a Prime Number");
		} else
			System.out.println("The given number: " + input + " is not a Prime Number");
	}

}
