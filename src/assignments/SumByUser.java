package assignments;

import java.util.Scanner;

public class SumByUser {

	int sum;

	public void sumOfTwoNo(int a, int b) {
		sum = a + b;
	}

	public static void main(String[] args) {

		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number");
		num1 = sc.nextInt();

		System.out.println("Enter the Second Number");
		num2 = sc.nextInt();
		SumByUser add = new SumByUser();
		add.sumOfTwoNo(num1, num2);
		System.out.println("Summation of two No's: " + " " + add.sum);
		sc.close();

	}

}
