package assignments;

import java.util.ArrayList;

public class EmptyAnArrayList {

	public static void main(String[] args) {

		ArrayList<Object> br = new ArrayList<Object>();
		br.add("MacBook");
		br.add("Dell");
		br.add("Lenovo");
		br.add(12);
		br.add('R');
		br.add(true);
		br.add(6.7);

		System.out.println("List the items: ");

		for (int i = 0; i < br.size(); i++) {
			System.out.println(br.get(i));

		}
		System.out.println("Remove all the items from the list");
		br.clear();
		System.out.println("All items from the list have been deleted ");

	}

}
