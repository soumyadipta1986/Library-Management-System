package cleartrip.library;

public class DAOFactory {
	
	private final BookDAO bookDAO;
	private final MemberDAO memberDAO;
	private final LibraryPersistenceStore libraryStore;
	
	public DAOFactory() {
		LibraryPersistenceStoreFactory persistenceFactory = new LibraryPersistenceStoreFactory();
		libraryStore = persistenceFactory.getLibraryStore();
		bookDAO = new BookDAOImpl(libraryStore);
		memberDAO = new MemberDAOImpl(libraryStore);
	}
	
	public BookDAO getBookDAO() {
		return bookDAO;
	}
	
	public MemberDAO getMemberDAO() {
		return memberDAO;
	}
	
}
