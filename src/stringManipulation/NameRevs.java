package stringManipulation;

public class NameRevs {

	public static void main(String[] args) {
		String name = "Puja";
		System.out.println("Given name is : " + " " + name);
		System.out.print("After reversal name is :");
		for (int i = name.length() - 1; i >= 0; i--)

			System.out.print(name.charAt(i));

	}

}
