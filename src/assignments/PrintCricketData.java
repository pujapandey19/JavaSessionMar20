package assignments;

public class PrintCricketData {

	public static void main(String[] args) {

		Object player1[] = new Object[6];
		Object player2[] = new Object[6];
		//Object player3[] = new Object[6];
		// information of Player1
		player1[0] = "David";
		player1[1] = 25;
		player1[2] = "XYZ";
		player1[3] = "Jan-09-1995";
		player1[4] = 'M';
		player1[5] = 4.5;

		// information of Player2

		player2[0] = "Reyan";
		player2[1] = 28;
		player2[2] = "ABC";
		player2[3] = "Jan-09-1992";
		player2[4] = 'M';
		player2[5] = 5.2;

		int len = player1.length;
		System.out.println("Details of Player1");
		for (int i = 0; i < len; i++) {

			System.out.println(player1[i]);
		}
		System.out.println();
		System.out.println("Details of Player2");
		for (int i = 0; i < len; i++) {

			System.out.println(player2[i]);
		}
	}

}
