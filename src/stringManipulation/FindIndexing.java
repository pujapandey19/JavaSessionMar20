package stringManipulation;

public class FindIndexing {

		static String type[] = { "adf", "thh" };

		public static int getIndex(String input) {
			for (int i = 0; i <= type.length; i++) {
				if (type[i].equals(input)) {
					return i;

				}
			}
			return -1;
		}

		
	public static void main(String[] args) {
		
		getIndex("adf");
	}

}
