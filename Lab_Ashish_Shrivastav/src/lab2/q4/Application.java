package lab2.q4;

import java.util.*;

public class Application {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s = null;
		while (true) {
			System.out.println("'1' - to create a Student object.");
			System.out.println("'2' - to display the student info.");
			System.out.println("'3' - to exit.");
			System.out.print("Enter you choice: ");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("1: Create the object using name, id, and grade");
				System.out.println("2: Create the object using name and id");
				System.out.println("3: Create the object using id");
				System.out.print("Enter your choice: ");
				int choice2 = sc.nextInt();
				if (choice2 == 1) {
					sc.nextLine();
					System.out.print("Enter name: ");
					String name = sc.nextLine();
					System.out.print("Enter id: ");
					String id = sc.nextLine();
					System.out.print("Enter grade: ");
					double grade = sc.nextDouble();
					s = new Student(name, id, grade);
				} else if (choice2 == 2) {
					sc.nextLine();
					System.out.print("Enter name: ");
					String name = sc.nextLine();
					System.out.print("Enter id: ");
					String id = sc.nextLine();
					s = new Student(name, id);
				} else if (choice2 == 3) {
					sc.nextLine();
					System.out.print("Enter id: ");
					String id = sc.nextLine();
					s = new Student(id);
				}
			} else if (choice == 2) {
				System.out.println("1: Display the object with year");
				System.out.println("2: Display the object without year");
				System.out.print("Enter your choice: ");
				int choice2 = sc.nextInt();
				if (choice2 == 1) {
					System.out.print("Enter year: ");
					int year = sc.nextInt();
					if (s != null)
						s.display(year);
				} else if (choice == 2) {
					s.display();
				}
			} else if (choice == 3) {
				break;
			}
		}
		sc.close();
	}
}
