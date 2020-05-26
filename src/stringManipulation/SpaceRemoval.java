package stringManipulation;

public class SpaceRemoval {

	public static void main(String[] args) {

		String str = "         Hello      Everyone       ";
		System.out.println("Before trim given string is : " + " " + str);
		System.out.println("After trim given string is : " + " " + str.replace(" ", ""));

	}

}
