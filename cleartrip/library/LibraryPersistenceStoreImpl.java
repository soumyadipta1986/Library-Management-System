package cleartrip.library;

import java.util.Map;
import java.util.HashMap;

public class LibraryPersistenceStoreImpl implements LibraryPersistenceStore {

	private final Map<Book.Key, Book> books = new HashMap<Book.Key, Book>();
	private final Map<String, Member> members = new HashMap<String, Member>();
		
	@Override
	public void addBook(Book book) {
		books.put(book.getKey(), book);
	}

	@Override
	public Book searchBook(String title, String author) {
		return books.get(new Book.Key(title, author));
	}

	@Override
	public void addMember(Member member) {
		members.put(member.getName(), member);
	}

	@Override
	public Member searchMember(String name) {
		return members.get(name);
	}

}
