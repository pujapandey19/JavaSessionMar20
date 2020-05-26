package assignments;

import java.util.ArrayList;

public class PrintAnArrayList {

	public static void main(String[] args) {
		ArrayList<String> season = new ArrayList<String>();

		season.add("Spring");
		season.add("Summer");
		season.add("Autumn");
		season.add("Winter");
		season.add("Monsoon");

		System.out.println("Print all season name");

		for (int i = 0; i < season.size(); i++) {
			System.out.println(season.get(i));
		}

	}

}
