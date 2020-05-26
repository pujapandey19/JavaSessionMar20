package assignments;

import java.util.Scanner;

public class FindMaxAndMinNo {
	public void getGreatestNumber(int a, int b, int c) {
		
		if (a > b && a > c) {
			System.out.println("The Greatest Number is:  " + " " + a);
		} else if (b > c) {
			System.out.println("The Greatest Number is : " + " " + b);
		} else {
			System.out.println("The Greatest Number is : " + " " + c);
		}

	}
	public void getLowestNumber(int a, int b, int c) {
		
		if (a < b && a < c) {
			System.out.println("The Lowest Number is : " + a);
		} else if (b < c) {
			System.out.println("The Lowest Number is : " + b);
		} else {
			System.out.println("The Lowest Number is : " + c);
		}
	}
	public static void main(String[] args) {
		FindMaxAndMinNo num = new FindMaxAndMinNo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number : ");
		int num1 =sc.nextInt();
		System.out.println("Enter the Second Number : ");
		int num2 =sc.nextInt();
		System.out.println("Enter the Third Number : ");
		int num3 =sc.nextInt();
		num.getGreatestNumber(num1, num2, num3);
		num.getLowestNumber(num1, num2, num3);
		sc.close();
	}

}
