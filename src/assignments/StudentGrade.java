package assignments;

import java.util.Scanner;

public class StudentGrade {

	public void getGrade(int marks) {
		if (marks > 90 && marks <= 100) {
			System.out.println("I have got AA grade" + " " + "with " + marks + " " + "Marks");
		} else if (marks > 80 && marks <= 90) {
			System.out.println("I have got AB grade" + " " + "with " + marks + " " + "Marks");
		} else if (marks > 70 && marks <= 80) {
			System.out.println("I have got BB grade" + " " + "with " + marks + " " + "Marks");
		} else if (marks > 60 && marks <= 70) {
			System.out.println("I have got BC grade" + " " + "with " + marks + " " + "Marks");
		} else if (marks > 50 && marks <= 60) {
			System.out.println("I have got CD grade" + " " + "with " + marks + " " + "Marks");
		}
		else if (marks > 40 && marks <= 50) {
			System.out.println("I have got DD grade" + " " + "with " + marks + " " + "Marks");
		}
		else if (marks <= 40) {
			System.out.println("Sad to Say I am Fail I have got " + " "+ marks + " " + "Marks");
		}
		else {
			System.out.println("Please Enter Correct Marks");
		}

	}

	public static void main(String[] args) {

		StudentGrade grade = new StudentGrade();
		System.out.println("Please Enter the Marks to know your grade");
		Scanner sc = new Scanner(System.in);
		int myMarks = sc.nextInt();
		grade.getGrade(myMarks);
		sc.close();

	}

}
