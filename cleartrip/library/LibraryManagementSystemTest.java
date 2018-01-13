package cleartrip.library;

public class LibraryManagementSystemTest {
	
	public static void main(String[] args) {	
		LibraryManagementSystem library = new LibraryManagementSystem();
		Librarian librarian = library.getLibrarian();
		//Add Book
		librarian.addBookToLibrary(new Book("Book 1", "Author 1"));
		librarian.addBookToLibrary(new Book("Book 2", "Author 2"));
		//Search Book
		Book book1 = librarian.searchBookInLibrary("Book 1", "Author 1");
		if (book1 != null) {
			System.out.println("Book 1 found: " + book1);
		}
		//	Search Book	
		Book book3 = librarian.searchBookInLibrary("Book 3", "Author 3");
		if (book3 == null) {
			System.out.println("Cannot find Book 3");
		}
		//Add Member
		librarian.addMemberToLibrary(new Member("Member 1", 10));
		librarian.addMemberToLibrary(new Member("Member 2", 5));
		//Search Member
		Member member1 = librarian.searchMemberInLibrary("Member 1");
		if (member1 != null) {
			System.out.println("Member 1 found: " + member1);
		}
		//Search Member
		Member member3 = librarian.searchMemberInLibrary("Member 3");
		if (member3 == null) {
			System.out.println("Cannot find Member 3");
		}
		//Set Max No Of Books Allowed
		librarian.setMaxNoOfBooksAllowed(member1, 12);
		System.out.println("Member 1: " + member1);
		//Lend Book
		librarian.lendBookToLibraryMember(book1, member1);
		System.out.println("Book 1: " + book1);
		//Return Book
		librarian.returnBookToLibrary(book1, member1);
		System.out.println("Book 1:" + book1);
		System.out.println("Member 1: " + member1);
	}
	
}
