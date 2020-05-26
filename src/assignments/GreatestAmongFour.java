package assignments;

public class GreatestAmongFour {

	public static void main(String[] args) {

		int a = 25;
		int b = 78;
		int c = 87;
		int d = 90;

		if (a > b && a > c && a > d) {
			System.out.println("a is the greatest no");
		} else if (b > c && b > d) {
			System.out.println("b is the greatest no");
		} else if (c > d) {
			System.out.println("c is the greatest no");
		} else {
			System.out.println("d is the greatest no");
		}

	}
}
