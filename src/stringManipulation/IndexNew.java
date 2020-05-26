package stringManipulation;

public class IndexNew {

	static String word_list[] = { "Hi", "Hello","Bye" };

	public static int getIndex(String input) {
		 
		for (int i = 0; i <= word_list.length-1; i++) {
			if (word_list[i].equals(input)) {
				//System.out.println("Found index: "+" "+ i);
			  return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int index =getIndex("Hello");
		System.out.println("Found index: "+" "+ index);
	}

}