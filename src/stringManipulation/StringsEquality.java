package stringManipulation;

import java.util.Scanner;

public class StringsEquality {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System. in);
	        
	        System.out.print("Enter first string : ");
	        String str1 = sc.nextLine();
	        
	        
	        System.out.print("Enter second string : ");
	        String str2 = sc.nextLine();
	        
	        //check if two strings are equal
	        boolean equalStr = str1.equals(str2);
	 
	        System.out.print("The above Two string are equal  : "+equalStr);
	        sc.close();
	    }
		
		

}
