package codetest.may2017.prob2;

public class Book extends LendingItem {
	
	private String isbn;
	private String title;
	private String authorFirstName;
	private String authorLastName;
	
	public Book(String isbn, String title, String fname, String lname) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.authorFirstName = fname;
		this.authorLastName = lname;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj.getClass()!=this.getClass())
			return false;
		
		Book book=(Book)obj;
		
		return isbn.equals(book.isbn) && title.equals(book.title) && authorFirstName.equals(book.authorFirstName) && authorLastName.equals(book.authorLastName);
	}
	
}
