package cleartrip.library;

public class LibraryPersistenceStoreFactory {
	
	private final LibraryPersistenceStore libraryStore = new LibraryPersistenceStoreImpl();
	
	public LibraryPersistenceStore getLibraryStore() {
		return libraryStore;
	}
	
}
