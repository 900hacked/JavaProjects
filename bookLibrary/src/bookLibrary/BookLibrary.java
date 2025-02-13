package bookLibrary;

public class BookLibrary {
	private String title;
	private String author;
	private int publicationYear;
	private boolean isAvailable;
	
	public BookLibrary(String theTitle, String theAuthor, int thePublicationYear, boolean isItAvailable) {
		title = theTitle;
		author = theAuthor;
		publicationYear = thePublicationYear;
		isAvailable = isItAvailable;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String newTitle) {
		this.title = newTitle;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String newAuthor) {
		this.author = newAuthor;
	}
	
	public int getPublicationYear() {
		return publicationYear;
	}
	
	public void setPublicationYear(int newPublicationYear) {
		if (newPublicationYear > 1500 && newPublicationYear < 2024) {
			this.publicationYear = newPublicationYear;
		}
		else {
			System.out.println("This publication year is wrong");
		}
	}
	
	public boolean getIsAvailable() {
		return isAvailable;
	}
	
	public void setIsAvailable(boolean newIsAvailable) {
		if (publicationYear < 2000 && publicationYear > 0) {
			this.isAvailable = false;
		}
		else if (publicationYear > 2000) {
			this.isAvailable = true;
		}
		else {
			System.out.println("Invalid");
		}
	}

	public static void main(String[] args) {
		
		BookLibrary book = new BookLibrary("Things Fall Apart", "Chinua Achebe", 1958, false);
		
//		book.setTitle("Percy Jackson");
//		book.setAuthor("Rick Riordan");
//		book.setPublicationYear(2005);
//		book.setIsAvailable(false);
		
		System.out.println(book.getTitle());
		System.out.println(book.getAuthor());
		System.out.println(book.getPublicationYear());
		System.out.println(book.getIsAvailable());

	}

}
