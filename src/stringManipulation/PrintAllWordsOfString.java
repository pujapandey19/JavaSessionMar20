package stringManipulation;

public class PrintAllWordsOfString {

	public static void main(String[] args) {

		String message = "Welcome to the beautiful world of selenium";
		String ar[] = message.split(" ");
		for (int i = 0; i <= ar.length - 1; i++) {
			System.out.println(ar[i]);
		}

	}

}
