package cleartrip.library;

public interface Librarian {
	
	void addBookToLibrary(Book book);
	void addMemberToLibrary(Member member);
	void lendBookToLibraryMember(Book book, Member member);
	void returnBookToLibrary(Book book, Member member);
	void setMaxNoOfBooksAllowed(Member member, int maxNoOfBooksAllowed); 
	Book searchBookInLibrary(String title, String author);
	Member searchMemberInLibrary(String name);
	
}
