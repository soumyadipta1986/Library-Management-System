package cleartrip.library;

public class Book {
	
	private final String title;
	private final String author;
	private boolean available;
	private final Key key;
	private Member issuedTo;
	
	public Book(String title, String author) {
		if (title == null || author == null) {
			throw new IllegalArgumentException("Title and Author cannot be null.");
		}
		if (title.equals("") || author.equals("")) {
			throw new IllegalArgumentException("Title and Author cannot be empty.");
		}		
		this.title = title;
		this.author = author;
		available = true;
		key = new Key(title, author);
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public boolean isAvailable() {
		return available;
	}
	
	public Key getKey() {
		return key;
	}
	
	public Member getIssuedTo() {
		return issuedTo;
	}
	
	public void setIssuedTo(Member member) {
		if (member == null) {
			throw new IllegalArgumentException("Member cannot be null.");
		}
		issuedTo = member;
		available = false;
	}
	
	public void removeIssuedTo() {
		issuedTo = null;
		available = true;
	}
	
	@Override
	public String toString() {
		return "[Title: " + title + ", Author: " + author + ", Available: " + available + ", Issued To: " + issuedTo + "]";
	}
	
	static class Key {
		
		private final String title;
		private final String author;
		
		Key(String title, String author) {
			this.title = title;
			this.author = author;
		}
		
		@Override
		public boolean equals(Object object) {
			if (object == this) {
				return true;
			}
			if (!(object instanceof Key)) {
				return false;
			}
			Key key = (Key) object;
			return (key.title.equals(title) && key.author.equals(author));			
		}
		
		@Override
		public int hashCode() {
			int result = 17;
			result = (37 * result) + title.hashCode();
			result = (37 * result) + author.hashCode();
			return result;
		}
		
	}
	
}	
