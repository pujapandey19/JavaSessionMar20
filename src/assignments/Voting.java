package assignments;

import java.util.Scanner;

public class Voting {
		
	public void vote(int age) {
		if(age>=18) {
			System.out.println("Hurray I am" +" " + age +" "+ " Eligible to Vote ");
		}
		else if(age<=0){
			System.out.println("Please Enter Correct Age");
			
		}
		else {
			System.out.println("Waiting to be 18" +" "+ "Not Eligible to Vote");
		}
		
	}
	public static void main(String[] args) {
		
		Voting v = new Voting();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age :");
		int myAge = sc.nextInt();
		v.vote(myAge);
		sc.close();
	}

}
