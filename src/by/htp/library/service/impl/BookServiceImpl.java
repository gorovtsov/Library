package by.htp.library.service.impl;


import java.util.ArrayList;
import java.util.TreeSet;

import by.htp.library.bean.Book;
import by.htp.library.dao.BookDAO;
import by.htp.library.dao.DAOFactory;
import by.htp.library.dao.exception.DAOException;
import by.htp.library.service.BookService;
import by.htp.library.service.exception.ServiceException;

public class BookServiceImpl implements BookService {

	@Override
	public void addBook(Book book) throws ServiceException {
		// validation
		DAOFactory daoFactory = DAOFactory.getInstance();
		BookDAO bookDAO = daoFactory.getBookDAO();
		if (book == null) {
			throw new ServiceException("The book object is null", new Exception());
		}
		try {
			/*if (bookDAO.isIdAvailable(book.getId())) {
				return;
			}*/
			bookDAO.addBook(book);
		} catch (DAOException e) {
			throw new ServiceException("Smthng wrong...", e);
		}

	}

	@Override
	public ArrayList<Book> searchByTitle(String title) throws ServiceException {
		// simple validation
		if (title == null || title.isEmpty()) {
			return null;
		}

		DAOFactory daoFactory = DAOFactory.getInstance();
		BookDAO bookDAO = daoFactory.getBookDAO();
		
		ArrayList<Book> resBooks;
		
		try {
			resBooks = bookDAO.searchBookByTitle(title);
		} catch (DAOException e) {
			throw new ServiceException("Something wrong", e);
		}

		return resBooks;

	}

	public ArrayList<Book> searchBookByAuthor(String author) throws ServiceException {
		if (author == null || author.isEmpty()) {
			return null;
		}
		
		DAOFactory daoFactory = DAOFactory.getInstance();
		BookDAO bookDAO = daoFactory.getBookDAO();
		
		ArrayList<Book> resBooks;
		
		try {
			resBooks = bookDAO.searchBookByAuthor(author);
		} catch (DAOException e) {
			throw new ServiceException("Something wrong", e);
		}
		return resBooks;
	}
}