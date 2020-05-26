package assignments;

import java.util.Scanner;

public class CheckPositiveAndNegativeNo {

	public static void main(String[] args) {
		int num;

		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number to be checked:");
		num = s.nextInt();

		if (num > 0) {
			System.out.println("Given number is positive");
		} else if (num < 0) {
			System.out.println("Given number is Negative");
		} else {
			System.out.print("The given no is 0");

		}
		
		s.close();

	}

}
