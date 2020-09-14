package lab2.q2;

import java.util.*;

class BookStore {
	private Book[] books = new Book[10];

	public void sell(String bookTitle, int noOfCopies) {
		Book selectedBook = null;
		for (Book b : books) {
			if (b != null && b.getBookTitle().equals(bookTitle)) {
				selectedBook = b;
				break;
			}
		}
		if (selectedBook != null) {
			selectedBook.setNumOfCopies(Math.max(0, selectedBook.getNumOfCopies() - noOfCopies));
		} else {
			System.out.println("Book not found in the store.");
		}
	}

	public void order(String isbn, int noOfCopies) {
		for (Book b : books) {
			if (b != null && b.getISBN().equals(isbn)) {
				b.setNumOfCopies(b.getNumOfCopies() + noOfCopies);
				break;
			} else if (b == null) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Book not found in the store.");
				System.out.print("Enter book's title: ");
				String bookTitle = sc.nextLine();
				System.out.print("Enter book's author: ");
				String author = sc.nextLine();
				books[Arrays.asList(books).indexOf(b)] = new Book(bookTitle, author, isbn, noOfCopies);
				break;
			}
		}
	}

	public void display() {
		System.out.println("Info of all books");
		for (Book b : books) {
			if (b != null)
				b.display();
		}
	}
}
