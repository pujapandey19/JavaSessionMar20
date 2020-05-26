package assignments;

import java.util.ArrayList;

public class ArrayListAtSpecificIndex {

	public static void main(String[] args) {

		ArrayList<Integer> ar = new ArrayList<Integer>(5);

		ar.add(0, 1);
		ar.add(20);
		ar.add(45);
		ar.add(67);
		ar.add(4, 89);

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

	}

}
