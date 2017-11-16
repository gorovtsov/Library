package by.htp.library.dao;

import java.util.ArrayList;
import java.util.List;

import by.htp.library.bean.Book;
import by.htp.library.dao.exception.DAOException;

public interface BookDAO {
	
	void addBook(Book book) throws DAOException;
	ArrayList<Book> searchBookByTitle(String title) throws DAOException;
	ArrayList<Book> searchBookByAuthor(String author) throws DAOException;
	ArrayList<Book> readBookData() throws DAOException;

}
