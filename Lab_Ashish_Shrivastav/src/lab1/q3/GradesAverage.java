package lab1.q3;

import java.util.Scanner;

public class GradesAverage {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		n = sc.nextInt();
		double avg = 0;
		for (int i = 0; i < n; i++) {
			System.out.print("Enter the grade for student " + (i + 1) + ": ");
			int grade = sc.nextInt();
			if (grade <= 0 || grade >= 100) {
				System.out.println("Invalid grade, try again...");
				i--;
			} else {
				avg += grade;
			}
		}
		sc.close();
		avg = avg / (double) n;
		System.out.println("The average is: " + avg);
	}
}
