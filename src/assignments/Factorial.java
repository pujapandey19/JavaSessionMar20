package assignments;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		
		long n,fact=1;
		
	    Scanner sc=new Scanner(System.in);
 
	    System.out.println("enter number");
	   
            n=sc.nextLong();
 
	    for(int i=1;i<=n;i++)
	    {
	
	    fact=fact*i;
 
 	    }
 
  	    System.out.println("fact="+fact);
  	    sc.close();
	}

}
