package cleartrip.library;

public interface LibraryPersistenceStore {
	
	void addBook(Book book);
	Book searchBook(String title, String author);
	void addMember(Member member);
	Member searchMember(String name);
	
}
