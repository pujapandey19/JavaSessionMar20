package assignments;

import java.util.ArrayList;

public class RemovalFromArrayList {

	ArrayList<String> day;

	public static void main(String[] args) {

		RemovalFromArrayList rm = new RemovalFromArrayList();
		rm.day = new ArrayList<String>();

		rm.day.add("Monday");
		rm.day.add("Tuesday");
		rm.day.add("Wednesday");
		rm.day.add("Thursday");
		rm.day.add("Friday");
		rm.day.add("Saturday");
		rm.day.add("Sunday");

		System.out.println(rm.day);
		System.out.println("After removal Wednesday from the week");
		rm.day.remove(2);
		System.out.println(rm.day);

	}

}
