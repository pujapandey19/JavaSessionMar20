package stringManipulation;

public class NumericPartOfString {

	public static void main(String[] args) {

		String s = "your transaction id is:12345";
		System.out.println(
				"Numeric part of the given string is:" + (s.substring(s.indexOf("is") + 3).trim().replace(" ", "")));

	}

}
