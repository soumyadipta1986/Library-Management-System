package cleartrip.library;

import java.util.List;
import java.util.ArrayList;

public class Member {
	
	private final String name;
	private int maxNoOfBooksAllowed;
	private List<Book> allottedBooks = new ArrayList<Book>();
	
	public Member(String name, int maxNoOfBooksAllowed) {
		if (name == null) {
			throw new IllegalArgumentException("Member name cannot be null.");
		}
		if (name.equals("")) {
			throw new IllegalArgumentException("Member name cannot be empty.");
		}
		if (maxNoOfBooksAllowed <= 0) {
			throw new IllegalArgumentException("Max book limit must be a positive number.");
		}
		this.name = name;
		this.maxNoOfBooksAllowed = maxNoOfBooksAllowed;
	}
	
	public String getName() {
		return name;
	}
	
	public int getMaxNoOfBooksAllowed() {
		return maxNoOfBooksAllowed;
	}
	
	public int getNoOfBooksAllotted() {
		return allottedBooks.size();
	}
	
	public void setMaxNoOfBooksAllowed(int maxNoOfBooksAllowed) {
		if (getNoOfBooksAllotted() > maxNoOfBooksAllowed) {
			throw new IllegalArgumentException("Maximum limit is less than the number of books that are already alloted to the member.");
		}
		this.maxNoOfBooksAllowed = maxNoOfBooksAllowed;
	}
	
	public boolean allotBook(Book book) {
		if (getNoOfBooksAllotted() >= maxNoOfBooksAllowed) {
			throw new IllegalArgumentException("Maximum limit has reached ... Cannot allot further books to the member.");
		}
		return allottedBooks.add(book);
	}
	
	public boolean returnBook(Book book) {
		return allottedBooks.remove(book);
	}
	
	@Override
	public String toString() {
		return "[Name: " + name + ", Max Books Allowed: " + maxNoOfBooksAllowed + ", No. of Books Allotted: " + getNoOfBooksAllotted() + "]"; 
	}
	
}
