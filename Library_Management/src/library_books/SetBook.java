package library_books;

public class SetBook extends Book {

	private int BookID;
	private String BookName;

	private String BookAuthor;
	private int BookPublished;

	private int BookPages;
	private float BookPrise;

	@Override
	public void setBookID(int bookid) {
		this.BookID = bookid;
	}

	@Override
	public void setBookName(String bookname) {
		this.BookName = bookname;

	}

	@Override
	public void setBookAuthor(String bookauthor) {
		this.BookAuthor = bookauthor;
	}

	@Override
	public void setBookPublished(int publishedYear) {
		this.BookPublished = publishedYear;
	}

	@Override
	public void setBookPages(int bookpages) {
		this.BookPages = bookpages;
		
	}

	@Override
	public void setBookPrise(float bookprise) {
		this.BookPrise = bookprise; 
	}

	@Override
	public String toString() {
		return "BookDetails : [BookID= " + BookID + ", BookName= " + BookName + ", BookAuthor= " + BookAuthor
				+ ", BookPublished= " + BookPublished + ", BookPages= " + BookPages + ", BookPrise= " + BookPrise + "]";
	}

}
