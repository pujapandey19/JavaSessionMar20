package assignments;

import java.util.ArrayList;

public class ReversalInArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> revar = new ArrayList<Integer>();

		revar.add(1);
		revar.add(2);
		revar.add(3);
		revar.add(4);
		revar.add(5);

		System.out.println(revar);
		for (int i = revar.size() - 1; i >= 0; i--) {
			System.out.print(revar.get(i) + " ");
		}

	}

}
