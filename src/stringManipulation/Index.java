package stringManipulation;

public class Index {

	static String wordList[] = { "Hi", "Hello", "Bye" };

	public static int getIndex(String input) {

		for (int i = 0; i <= wordList.length - 1; i++) {
			if (wordList[i].equals(input)) {

				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int index = getIndex("Hi");
		System.out.println("Found index: " + " " + index);
	}

}