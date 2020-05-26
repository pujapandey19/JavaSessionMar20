package assignments;

public class PrintPatternUsingArray {

	public static void main(String[] args) {
		
		int a[]=new int[5];
		a[0]= 0;
		a[1]= 1;
		a[2]= 2;
		a[3]= 3;
		a[4]= 4;
		
		for(int counter=a.length-1;counter>=0;counter--) {
		System.out.println("n = "+a[counter]);
		}

	}

}
