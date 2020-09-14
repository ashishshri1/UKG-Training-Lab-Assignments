package lab2.q2;

class Book {
	private String bookTitle;
	private String author;
	private String ISBN;
	private int numOfCopies;

	public Book(String bookTitle, String author, String ISBN, int numOfCopies) {
		this.bookTitle = bookTitle;
		this.author = author;
		this.ISBN = ISBN;
		this.numOfCopies = numOfCopies;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}

	public int getNumOfCopies() {
		return numOfCopies;
	}

	public void setNumOfCopies(int numOfCopies) {
		this.numOfCopies = numOfCopies;
	}

	public void display() {
		System.out.println(this.bookTitle + " - " + this.author + " - " + this.ISBN + " - " + this.numOfCopies);
	}
}
