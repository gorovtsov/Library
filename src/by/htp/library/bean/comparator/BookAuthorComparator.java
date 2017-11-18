package by.htp.library.bean.comparator;

import java.util.Comparator;

import by.htp.library.bean.Book;

public class BookAuthorComparator implements Comparator<Book>{

	@Override
	public int compare(Book b1, Book b2) {
		if (b1.getAuthor().compareTo(b2.getAuthor()) == -1) {
			return -1;
		}
		if (b1.getAuthor().compareTo(b2.getAuthor()) == 1) {
			return 1;
		}else {
			return 0;	
		}
	}

}
