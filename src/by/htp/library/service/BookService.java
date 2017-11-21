package by.htp.library.service;


import java.util.ArrayList;
import java.util.TreeSet;

import by.htp.library.bean.Book;
import by.htp.library.service.exception.ServiceException;

public interface BookService {
	
	void addBook(Book book) throws ServiceException;
	ArrayList<Book> searchByTitle(String title) throws ServiceException;
	ArrayList<Book> searchBookByAuthor(String author) throws ServiceException;

}
