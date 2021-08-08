package week1.day1;

public class FactorialFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//To find the Factorial of a given number
		System.out.println("This is to find and print the factorial of a given number");
		
		//Variable declaration
		int input = 10, fact = 1, i;
		
		//Looping with for
		for(i=1; i<=input; i++) {
			fact = fact*i;
		}
		System.out.println("The Factorial of the given number " + input + " is: " + fact);
	}

}
