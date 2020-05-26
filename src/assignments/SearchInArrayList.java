package assignments;

import java.util.ArrayList;

public class SearchInArrayList {

	ArrayList<String> listOfBanks;

	public static void main(String[] args) {
		SearchInArrayList lb = new SearchInArrayList();

		lb.listOfBanks = new ArrayList<String>();

		lb.listOfBanks.add("Bank Of America");
		lb.listOfBanks.add("Chase Bank");
		lb.listOfBanks.add("Wells Fargo");
		lb.listOfBanks.add("NorthWest Bank");
		lb.listOfBanks.add("Sun Bank");
		lb.listOfBanks.add("HDFC ank ");

		// System.out.println(lb.listOfBanks);
		if (lb.listOfBanks.contains("Chase Bank")) {
			System.out.println("Found Element");
		} else {
			System.out.println("There is no such element");
		}

	}

}
