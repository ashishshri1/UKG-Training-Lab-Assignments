package lab2.q2;

import java.util.*;

public class BookStoreApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BookStore bookstore = new BookStore();
		boolean exit = true;
		while (exit) {
			System.out.println("Enter \"1\", to display the Books: Title - Author - ISBN - Quantity");
			System.out.println("Enter \"2\", to order new books.");
			System.out.println("Enter \"3\", to sell books.");
			System.out.println("Enter \"0\", to exit the system.");
			System.out.print("Your choice: ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				bookstore.display();
				break;
			case 2:
				System.out.print("Enter book isbn: ");
				sc.nextLine();
				String isbn = sc.nextLine();
				System.out.print("Enter number of copies to order: ");
				int noOfCopiesToOrder = sc.nextInt();
				bookstore.order(isbn, noOfCopiesToOrder);
				break;
			case 3:
				System.out.print("Enter book title: ");
				sc.nextLine();
				String bookTitle = sc.nextLine();
				System.out.print("Enter number of copies to order: ");
				int noOfCopiesToSell = sc.nextInt();
				bookstore.sell(bookTitle, noOfCopiesToSell);
				break;
			case 0:
				exit = false;
				break;
			}
		}
		sc.close();
	}

}
