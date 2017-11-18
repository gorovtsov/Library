package by.htp.library.controller.command.impl;

import by.htp.library.bean.Book;
import by.htp.library.controller.command.Command;
import by.htp.library.service.BookService;
import by.htp.library.service.ServiceFactory;
import by.htp.library.service.exception.ServiceException;

public class BookAddCommand implements Command {

	@Override
	public String execute(String request) {
		String[] params = request.split("\\s+");

		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		BookService bookService = serviceFactory.getBookService();
		Book book = new Book(Integer.parseInt(params[1]), params[2], params[3], Integer.parseInt(params[4]));

		String response = null;

		try {
			bookService.addBook(book);
			response = "Book||Author= " + book.getAuthor() + "||title= " + book.getTitle() + "| is added to library.";
		} catch (ServiceException e) {
			response = "Sorry, maybe the password is incorrect.";
		}

		return response;
	}

}
