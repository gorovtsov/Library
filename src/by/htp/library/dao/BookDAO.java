package by.htp.library.dao;

import java.util.ArrayList;
import java.util.TreeSet;

import by.htp.library.bean.Book;
import by.htp.library.dao.exception.DAOException;

public interface BookDAO {
	
	void addBook(Book book) throws DAOException;
	TreeSet<Book> searchBookByTitle(String title) throws DAOException;
	TreeSet<Book> searchBookByAuthor(String author) throws DAOException;
	boolean isIdAvailable(int id) throws DAOException;
	ArrayList<Book> readBookData() throws DAOException;

}
