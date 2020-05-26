package assignments;

import java.util.ArrayList;

public class University {

	String universityName;
	String countryName;
	String establishedDate;
	ArrayList<String> listOfCourses;

	// Constructor using two parameters
	public University(String universityName, String countryName) {

		this.universityName = universityName;
		this.countryName = countryName;
	}

	// Constructor using all parameters
	public University(String universityName, String countryName, String establishedDate,
			ArrayList<String> listOfCourses) {

		this.universityName = universityName;
		this.countryName = countryName;
		this.establishedDate = establishedDate;
		this.listOfCourses = listOfCourses;
	}

	// getting the value
	public String getUniversityName() {
		return this.universityName;
	}

	public String getCountryName() {
		return this.countryName;
	}

	public String getEstablishedDate() {
		return this.establishedDate;

	}

	public ArrayList<String> getListOfCourses() {
		return this.listOfCourses;
	}

	public static void main(String[] args) {

		ArrayList<String> courses = new ArrayList<String>();
		courses.add("Accountig & Finance");
		courses.add("Architecture");
		courses.add("Biological Sciences");

		University univ = new University("University of Barcelona", "Spain", "Nov-1450", courses);
		// System.out.println(univ.universityName + " "+"is in"+" "+univ.countryName+"
		// "+"&"+" "+ "established in" + " "+
		// univ.establishedDate+ " "+ "and offers various courses like "+" "+courses);

		System.out.println(univ.getUniversityName());
		System.out.println(univ.getCountryName());
		System.out.println((univ.getEstablishedDate()));
		System.out.println(univ.getListOfCourses());

		University ur1 = new University("University of Texas", "USA");
		System.out.println("Name of University : " + " " + ur1.universityName);
		System.out.println("Name of Country : " + " " + ur1.countryName);

		University ur2 = new University("University of London", "UK");
		System.out.println("Name of University : " + " " + ur2.universityName);
		System.out.println("Name of Countery : " + " " + ur2.countryName);

		University ur3 = new University("Delhi Technological University", "India");
		System.out.println("Name of University : " + " " + ur3.universityName);
		System.out.println("Name of Countery : " + " " + ur3.countryName);

	}

}
