package by.htp.library.controller.command.impl;

import java.util.TreeSet;

import by.htp.library.bean.Book;
import by.htp.library.bean.comparator.BookAuthorComparator;
import by.htp.library.bean.comparator.BookTitleComparator;
import by.htp.library.controller.command.Command;
import by.htp.library.service.BookService;
import by.htp.library.service.ServiceFactory;
import by.htp.library.service.exception.ServiceException;

public class SearchBookByTitleCommand implements Command{

	@Override
	public String execute(String request) {
		String[] params = request.split("\\s+");

		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		BookService bookService = serviceFactory.getBookService();
		String toFind = params[1];
		TreeSet<Book> booksFound = new TreeSet<Book>(
				new BookAuthorComparator().thenComparing(new BookTitleComparator()));

		String response = "";

		try {
			booksFound = bookService.searchByTitle(toFind);
			for(Book book: booksFound) {
				response += book.toString()+"\n";
			}
		} catch (ServiceException e) {
			response = "Sorry, no such books.";
		}

		return response;
	}

}
