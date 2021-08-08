package week1.day1;

import java.util.Iterator;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//To print out FIBONACCI series
		// variable initialization

		int firstNum = 0, range = 8, secNum = 1, sum;

		// looping with for to print the series
		System.out.println("The Fibonacci Series is as follows:");
		System.out.println(firstNum);
		for (int i = 1; i < range; i++) {

			sum = firstNum + secNum;
			firstNum = secNum;
			secNum = sum;
			System.out.println(sum);
		}

	}

}
