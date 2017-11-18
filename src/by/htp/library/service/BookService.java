package by.htp.library.service;


import java.util.TreeSet;

import by.htp.library.bean.Book;
import by.htp.library.service.exception.ServiceException;

public interface BookService {
	
	void addBook(Book book) throws ServiceException;
	TreeSet<Book> searchByTitle(String title) throws ServiceException;
	TreeSet<Book> searchBookByAuthor(String author) throws ServiceException;

}
