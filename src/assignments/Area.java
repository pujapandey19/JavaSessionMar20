package assignments;

import java.util.Scanner;

public class Area {

	final double pi = 3.14;
	double circum;
	double area;

	public void circumference(double rad) {
		circum = 2 * pi * rad;
	}

	public void areaOfCircle(double radious) {
		area = pi * radious * radious;

	}

	public static void main(String[] args) {

		Area ar = new Area();
		Scanner sc = new Scanner(System.in);
		System.out.println("Input radious ");
		ar.areaOfCircle(sc.nextDouble());
		System.out.println("Area of a Circle for the given radius is : " + " " + ar.area);
		ar.circumference(sc.nextDouble());
		sc.close();

	}

}
