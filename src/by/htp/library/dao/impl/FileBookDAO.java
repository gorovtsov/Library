package by.htp.library.dao.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import by.htp.library.bean.Book;
import by.htp.library.dao.BookDAO;
import by.htp.library.dao.exception.DAOException;

public class FileBookDAO implements BookDAO {
	public final File dbFile = new File("D:\\Projects\\Library\\database\\users.csv");

	@Override
	public void addBook(Book book) throws DAOException {
		String strToFile = book.toString();

		try {
			BufferedWriter dbWriter = new BufferedWriter(new FileWriter(dbFile));
			dbWriter.write(strToFile);
			
			dbWriter.flush();
			dbWriter.close();
		} catch (IOException e) {
			throw new DAOException("Books db is not found", e);
		}

	}

	@Override
	public ArrayList<Book> searchBookByTitle(String title) throws DAOException {
		ArrayList<Book> foundBooks = new ArrayList<Book>();
		ArrayList<Book> books = readBookData();
		
		for(Book book : books) {
			if(book.getTitle().equals(title)) {
				foundBooks.add(book);
			}
		}
		return foundBooks;
	}

	@Override
	public ArrayList<Book> searchBookByAuthor(String author) throws DAOException {
		ArrayList<Book> foundBooks = new ArrayList<Book>();
		ArrayList<Book> books = readBookData();
		
		for(Book book : books) {
			if(book.getAuthor().equals(author)) {
				foundBooks.add(book);
			}
		}
		return foundBooks;
	}

	@Override
	public ArrayList<Book> readBookData() throws DAOException {
		ArrayList<Book> books = new ArrayList<Book>();
		String strFromFile = null;
		String[] splittedStr = null;
		Book book = null;
		try {
			BufferedReader dbReader = new BufferedReader(new FileReader(dbFile));
			while (dbReader.readLine() != null) {
				strFromFile = dbReader.readLine();
				splittedStr = strFromFile.split(";");

				book = new Book(Integer.parseInt(splittedStr[0]), splittedStr[1], splittedStr[2],
						Integer.parseInt(splittedStr[3]));
				books.add(book);
			}
			dbReader.close();
		} catch (Exception e) {
			throw new DAOException("File read exception(books.csv)", e);
		}
		return books;
	}

}
