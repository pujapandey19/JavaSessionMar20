package assignments;

import java.util.ArrayList;

public class ArrayListColors {

	public static void main(String[] args) {

		ArrayList<String> colors = new ArrayList<String>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		colors.add("White");
		colors.add("Orange");
		colors.add("Black");

		for (int i = 0; i < colors.size(); i++) {
			System.out.println(colors.get(i));
		}
	}

}
