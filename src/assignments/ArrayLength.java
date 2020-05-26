package assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLength {

	public static void main(String[] args) {
		int[] list = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int len = list.length;
		System.out.println("Length of array is :" + " " + len);

		int evenCount = 0;
		int oddCount = 0;
		for (int j = 0; j < len; j++) {
			if (list[j] % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		System.out.println("\n Total Number of Even Numbers in this Array = " + evenCount);
		System.out.println("\n Total Number of Odd  Numbers in this Array = " + oddCount);
	}
}
