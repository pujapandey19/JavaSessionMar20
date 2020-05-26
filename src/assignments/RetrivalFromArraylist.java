package assignments;

import java.util.ArrayList;

public class RetrivalFromArraylist {

	public static void main(String[] args) {

		ArrayList<Object> studentName = new ArrayList<Object>();
		studentName.add("Mia");
		studentName.add('F');
		studentName.add(27);
		studentName.add(999999999);

		System.out.println("I want to retrieve Index 0 from the list :" + " " + studentName.get(0));
		System.out.println("I want to retrieve Index 0 from the list :" + " " + studentName.get(1));
		System.out.println("I want to retrieve Index 0 from the list :" + " " + studentName.get(3));

	}

}
