package assignments;

import java.util.ArrayList;
import java.util.Collections;

public class SwappingInArrayList {

	public static void main(String[] args) {

		ArrayList<String> nameOfPlayer = new ArrayList<String>();
		nameOfPlayer.add("Reyan");
		nameOfPlayer.add("Amy");
		nameOfPlayer.add("Paul");
		nameOfPlayer.add("Nancy");
		nameOfPlayer.add("Mia");
		nameOfPlayer.add("Riko");
		nameOfPlayer.add("Milo");

		System.out.println("Diplay the name of Players" + " " + nameOfPlayer);
		System.out.println("Swap the position of player  Paul to Mia");
		Collections.swap(nameOfPlayer, 2, 5);
		System.out.println("Diplay the name of Players" + " " + nameOfPlayer);

	}

}
