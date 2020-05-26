package assignments;

import java.util.ArrayList;

public class ExtractionFromArrayList {

	ArrayList<String> month;

	public static void main(String[] args) {
		ExtractionFromArrayList ex = new ExtractionFromArrayList();

		ex.month = new ArrayList<String>();
		ex.month.add("January");
		ex.month.add("February");
		ex.month.add("March");
		ex.month.add("April");
		ex.month.add("May");
		ex.month.add("June");
		ex.month.add("July");
		ex.month.add("August");
		ex.month.add("September");
		ex.month.add("October");
		ex.month.add("November");
		ex.month.add("December");

		System.out.println("Extract top 4  name of month from the list" + ex.month.subList(0, 4));

	}

}
