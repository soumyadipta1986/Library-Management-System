package cleartrip.library;

public class BookDAOImpl implements BookDAO {
	
	private final LibraryPersistenceStore libraryStore;
	
	public BookDAOImpl(LibraryPersistenceStore libraryStore) {
		this.libraryStore = libraryStore;
	}
	
	@Override
	public void addBook(Book book) {
		libraryStore.addBook(book);
	}

	@Override
	public Book searchBook(String title, String author) {
		return libraryStore.searchBook(title, author);
	}
	
}
