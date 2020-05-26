package stringManipulation;

import java.util.Scanner;

public class FindLastHalfString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string");
		String str = sc.next();
		int len = str.length();
		System.out.println("Length of the string "+" "+ str +" "+"is "+" "+ len);
		System.out.println("Last half of string is: "+ " "+ str.substring(len/2));
		sc.close();

	}

}
