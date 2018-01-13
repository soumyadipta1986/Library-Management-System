package cleartrip.library;

public interface BookDAO {
	
	void addBook(Book book);
	Book searchBook(String title, String author);
	
}
