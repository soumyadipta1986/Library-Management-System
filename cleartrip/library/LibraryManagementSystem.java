package cleartrip.library;

public class LibraryManagementSystem {
	
	private final Librarian librarian = new Administrator();
	
	public Librarian getLibrarian() {
		return librarian;
	}
	
}
