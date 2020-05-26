package assignments;

import java.util.Scanner;

public class Multiplier {

	int mul;

	public void multiply(int x, int y) {

		mul = x * y;

	}

	public static void main(String[] args) {

		Multiplier pro = new Multiplier();
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number: ");
		num1 = sc.nextInt();
		System.out.println("Enter the Second Number: ");
		num2 = sc.nextInt();
		pro.multiply(num1, num2);
		System.out.println("Product of two no's: " + " " + pro.mul);
		sc.close();
	}

}
