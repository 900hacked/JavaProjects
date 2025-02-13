package Models;

import java.util.ArrayList;
import java.util.Scanner;

public class Book {
	
	enum category {
		ACTION,
		FICTION,
		FANTASY,
		ROMANCE
	}
	
	private String books;
	private String author;
	private boolean isBorrowed;
	
	public Book(String theTitle, String theAuthor, boolean borrow) {
		books = theTitle;
		author = theAuthor;
		isBorrowed = borrow;
	}
	
	public String getBooks() {
		return books;
	}
	
	public void setBooks(String newTitle) {
		this.books = newTitle;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String newAuthor) {
		this.author = newAuthor;
	}
	
	public boolean getBorrow() {
		return isBorrowed;
	}
	
	public void setBorrow(boolean newBorrow) {
		this.isBorrowed = newBorrow;
	}
	

	public static void main(String[] args) {
		
		ArrayList<Book> books = new ArrayList<Book>();
		
		books.add(new Book("The Titans Curse", "Rick Riordan ", false));
		books.add(new Book("Things Fall Apart", "Chinua Achebe ", false));
		books.add(new Book("The things they carried", "Tim O\'Brien ", false));
		
		
		Scanner myScan = new Scanner(System.in);
		
		Book myBook = new Book("The Titans Curse ", "Rick Riordan ", true);
		
		myBook.setBooks("The Titans Curse");
		myBook.setAuthor("Rick Riordan");
		
		System.out.println("Welcome to the Library Management System!");
		System.out.println("1. Register as a Library Member\r\n"
				+ "2. View Available Books\r\n"
				+ "3. Borrow a Book\r\n"
				+ "4. Return a Book\r\n"
				+ "5. Exit\r\n"
				+ "");
		
		System.out.println("Please select one of the options: ");
		int myOption = myScan.nextInt();

		
		
		switch (myOption) {
		case 1 :
			System.out.println("Register as a Library member ");
			break;
		case 2:
			System.out.println("The Available books are: ");
			for(Book eachBook : books) {
				System.out.println(eachBook.getBooks() + " by " + eachBook.getAuthor());
			}
			break;
		case 3:
//			System.out.println(books.get(0).getBooks());
			System.out.println("Please Enter the name of the book you want to borrow: ");
			 Scanner theScan = new Scanner(System.in);
			 String nameOfTheBookToBeBorrowed = theScan.nextLine();
			
//			for(Book oneBook : books) {
//				if(nameOfTheBookToBeBorrowed  == oneBook.getBooks()) {
//					oneBook.setBorrow(true);
//				}
//			}
			 
			 for(int i = 0; i < books.size(); i++) {
				 if(nameOfTheBookToBeBorrowed  == books.get(i).getBooks()) {
					 System.out.println("The book that has been updated is: " + myBook);
						books.set(i, myBook);
					}
			 }
			for(Book eachBook : books) {
				System.out.println(eachBook.getBooks() + " by " + eachBook.getAuthor() + " " + eachBook.getBorrow());
			}
			
			break;
		case 4:
			System.out.println("Return a book ");
			break;
		case 5 :
			System.out.println("Exit ");
			break;
			default:
				System.out.println("Please enter a valid option ");
		}
		
		
		
		

	}

}
