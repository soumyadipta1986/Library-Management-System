package cleartrip.library;

public class MemberDAOImpl implements MemberDAO {
	
	private final LibraryPersistenceStore libraryStore;
	
	public MemberDAOImpl(LibraryPersistenceStore libraryStore) {
		this.libraryStore = libraryStore;
	}
	
	@Override
	public void addMember(Member member) {
		libraryStore.addMember(member);
	}

	@Override
	public void lendBookToMember(Book book, Member member) {
		if (member.allotBook(book)) {
			book.setIssuedTo(member);
		}
	}

	@Override
	public void returnBookFromMember(Book book, Member member) {
		if (member.returnBook(book)) {
			book.removeIssuedTo();
		}
	}
	
	@Override
	public void setMaxNoOfBooksAllowed(Member member, int maxNoOfBooksAllowed) {
		member.setMaxNoOfBooksAllowed(maxNoOfBooksAllowed);
	}
	
	@Override
	public Member searchMember(String name) {
		return libraryStore.searchMember(name);
	}

}
