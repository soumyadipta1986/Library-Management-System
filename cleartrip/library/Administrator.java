package cleartrip.library;

public class Administrator implements Librarian {
	
	private final DAOFactory factory = new DAOFactory();
	private final BookDAO bookDAO = factory.getBookDAO();
	private final MemberDAO memberDAO = factory.getMemberDAO();
	
	@Override
	public void addBookToLibrary(Book book) {
		bookDAO.addBook(book);	
	}

	@Override
	public void addMemberToLibrary(Member member) {
		memberDAO.addMember(member);
	}

	@Override
	public void lendBookToLibraryMember(Book book, Member member) {
		if (book.isAvailable()) {
			memberDAO.lendBookToMember(book, member);
		}		
	}

	@Override
	public void returnBookToLibrary(Book book, Member member) {
		if (book.getIssuedTo() != null && book.getIssuedTo().getName().equals(member.getName())) {
			memberDAO.returnBookFromMember(book, member);
		}		
	}

	@Override
	public void setMaxNoOfBooksAllowed(Member member, int maxNoOfBooksAllowed) {
		memberDAO.setMaxNoOfBooksAllowed(member, maxNoOfBooksAllowed);	
	}

	@Override
	public Book searchBookInLibrary(String title, String author) {
		return bookDAO.searchBook(title, author);
	}

	@Override
	public Member searchMemberInLibrary(String name) {
		return memberDAO.searchMember(name);
	}

}
