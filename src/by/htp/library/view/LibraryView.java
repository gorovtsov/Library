package by.htp.library.view;

import by.htp.library.bean.Book;

public interface LibraryView {
	String showStartMenu();
	
	String showUserMenu();
	String logination();
	String registration();
	
	String showBookMenu();
	String addBook(Book book);
	
	Book searchBookByTitle(String title);
	void showFoundBook(Book book);
	
}
