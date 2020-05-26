package assignments;

import java.util.Scanner;

public class DivisionOfTwoNo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Input the first number: ");
		int a = sc.nextInt();
		System.out.print("Input the second number: ");
		int b = sc.nextInt();
		int div = (a / b);
		System.out.println();
		System.out.println("The division of a and b is:" + div);

		sc.close();
	}

}
