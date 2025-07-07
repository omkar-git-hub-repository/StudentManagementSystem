package library_books;

public class SetBookDetails {

	public SetBook setBook1() {
		SetBook book1 = new SetBook();
		book1.setBookID(101);
		book1.setBookName("Java");
		book1.setBookAuthor("Oracle");
		book1.setBookPages(574);
		book1.setBookPrise(529.00f);
		book1.setBookPublished(2019);
		System.out.println(book1.toString());
		return book1;
	}

	public SetBook setBook2() {
		SetBook book2 = new SetBook();
		book2.setBookID(102);
		book2.setBookName("Python Essentials");
		book2.setBookAuthor("Guido");
		book2.setBookPages(620);
		book2.setBookPrise(610.50f);
		book2.setBookPublished(2020);
		System.out.println(book2.toString());
		return book2;
	}

	public SetBook setBook3() {
		SetBook book3 = new SetBook();
		book3.setBookID(103);
		book3.setBookName("C Programming");
		book3.setBookAuthor("Dennis Ritchie");
		book3.setBookPages(480);
		book3.setBookPrise(425.00f);
		book3.setBookPublished(2017);
		System.out.println(book3.toString());
		return book3;
	}

	public SetBook setBook4() {
		SetBook book4 = new SetBook();
		book4.setBookID(104);
		book4.setBookName("Operating Systems");
		book4.setBookAuthor("Silberschatz");
		book4.setBookPages(850);
		book4.setBookPrise(750.00f);
		book4.setBookPublished(2021);
		System.out.println(book4.toString());
		return book4;
	}

	public SetBook setBook5() {
		SetBook book5 = new SetBook();
		book5.setBookID(105);
		book5.setBookName("Computer Networks");
		book5.setBookAuthor("Andrew S. Tanenbaum");
		book5.setBookPages(730);
		book5.setBookPrise(695.75f);
		book5.setBookPublished(2020);
		System.out.println(book5.toString());
		return book5;
	}

	public SetBook setBook6() {
		SetBook book = new SetBook();
		book.setBookID(106);
		book.setBookName("DSA Made Easy");
		book.setBookAuthor("Narasimha Karumanchi");
		book.setBookPages(560);
		book.setBookPrise(599.00f);
		book.setBookPublished(2022);
		return book;
	}

	public SetBook setBook7() {
		SetBook book = new SetBook();
		book.setBookID(107);
		book.setBookName("Machine Learning");
		book.setBookAuthor("Tom Mitchell");
		book.setBookPages(490);
		book.setBookPrise(870.25f);
		book.setBookPublished(2018);
		return book;
	}

	public SetBook setBook8() {
		SetBook book = new SetBook();
		book.setBookID(108);
		book.setBookName("Artificial Intelligence");
		book.setBookAuthor("Stuart Russell");
		book.setBookPages(1150);
		book.setBookPrise(999.99f);
		book.setBookPublished(2019);
		return book;
	}

	public SetBook setBook9() {
		SetBook book = new SetBook();
		book.setBookID(109);
		book.setBookName("Clean Code");
		book.setBookAuthor("Robert C. Martin");
		book.setBookPages(464);
		book.setBookPrise(720.00f);
		book.setBookPublished(2008);
		return book;
	}

	public SetBook setBook10() {
		SetBook book = new SetBook();
		book.setBookID(110);
		book.setBookName("Spring in Action");
		book.setBookAuthor("Craig Walls");
		book.setBookPages(520);
		book.setBookPrise(825.50f);
		book.setBookPublished(2021);
		return book;
	}

	public void DisplayAllBookDetails() {

		System.out.println("------------- All books----------");

		SetBook[] allBooks = {

				setBook1(), setBook2(), setBook3(), setBook4(), setBook5(), setBook6(), setBook7(), setBook8(),
				setBook9(), setBook10() };

		for (SetBook s : allBooks) {
			System.out.println(s);
		}
	}
}
