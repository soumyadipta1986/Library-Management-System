package cleartrip.library;

public interface MemberDAO {
	
	void addMember(Member member);
	void lendBookToMember(Book book, Member member);
	void returnBookFromMember(Book book, Member member);
	void setMaxNoOfBooksAllowed(Member member, int maxNoOfBooksAllowed);
	Member searchMember(String name);
	
}
