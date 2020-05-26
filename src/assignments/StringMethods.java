package assignments;

public class StringMethods {

	public static void main(String[] args) {
		String str = "This is my first selenium program";
		System.out.println("Length of the given String is : "+" "+ str.length());
		System.out.println("1st Occurrence of m is at "+ " "+ str.indexOf('m')+ " "+ "position");//1st occurrence
		System.out.println("2nd Occurrence of m is at "+  " "+ str.indexOf('m', 9)+" " + "position");//2nd occurrence
		System.out.println("3rd Occurrence of m is at "+ " "+ str.indexOf('m', 25)+ " "+ "position");//3rd occurrence

	}

}
