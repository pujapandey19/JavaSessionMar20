package assignments;

import java.util.ArrayList;

public class ArrayListVC {

	public static void main(String[] args) {

		ArrayList<String> flower = new ArrayList<String>();
		flower.add("Iris");
		flower.add("Daffodil");
		flower.add("Dahlia");
		flower.add("Tulip");
		flower.add("Lilac");
		flower.add("Jasmine");
		flower.add("SunFlower");
		flower.add("Orchid");
		flower.add("Rose");
		flower.add("Aster");
		flower.add("Common Daisy");

		System.out.println("Original Arraylist " + " " + flower);

		System.out.println("Lets trim to size the above arraylist");

		flower.trimToSize();
		System.out.println(flower);

	}

}
