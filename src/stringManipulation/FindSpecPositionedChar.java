package stringManipulation;

public class FindSpecPositionedChar {

	public static void main(String[] args) {
		String str = "Welcome to Naveen Automation Lab !";
		int i = str.indexOf('e', 0);//
		System.out.println("1st e is at " + " " + i + " " + "position");

		int j = str.indexOf('e', i + 1);
		System.out.println("2nd e is at " + " " + j + " " + "position");

		int k = str.indexOf('e', j + 1);
		System.out.println("3rd e is at " + " " + k + " " + "position");

	}

}
