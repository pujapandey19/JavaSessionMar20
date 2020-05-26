package assignments;

public class StringManipulation {

	public static void main(String[] args) {
		
		String s1 = "  Computer Science  ";
		//Find the length of the String
		int len = s1.length();
		System.out.println("Length of the given string is :"+ " "+ len);
		System.out.println("**********************************");
		
		//Split String into two part
		String ar[] = s1.split(" ");
		for (int i = 0; i <= ar.length - 1; i++) {
			System.out.println(ar[i]);
		}
		System.out.println("**********************************");
		//Remove space from String s1
		String afterRemovalOfSpace=s1.trim();
		System.out.println("Before trim given string is : " + " " + s1);
		System.out.println("After trim given string is : "+afterRemovalOfSpace);
		System.out.println("**********************************");
		
		//Occurrence of c in the given String
		
		int s=s1.indexOf('c', 0);//1st occurrence
		System.out.println("1st Occurrence of c is at "+  " "+ s+ " "+ "position");//1st occurrence
		
		int r = s1.indexOf('c', s+1);//2nd occurrence
		System.out.println("2nd Occurrence of c is at "+  " "+ r+ " "+ "position");//2nd occurrence
		
		
		
	}
		
		
	}


