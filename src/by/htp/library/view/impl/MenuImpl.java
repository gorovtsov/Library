package by.htp.library.view.impl;

import by.htp.library.view.Menu;

public class MenuImpl implements Menu {
	/*
	 * Main menu printing
	 */
	public void showMainMenu() {
		System.out.println("Welcome to DummyLib! Choose your action:\n" + "1 - Login.\n" + "2 - Register new user.\n"
				+ "3 - Add new book to DummyLib.\n" + "4 - Find book by title.\n" + "5 - Find book by author.");
	}

	/*
	 * Book menu printing
	 */
	public void askForBookId() {
		System.out.println("Insert id:");
	}

	public void askForBookTitle() {
		System.out.println("Insert title:");
	}

	public void askForBookAuthor() {
		System.out.println("Insert author:");
	}

	public void askForBookYear() {
		System.out.println("Insert printing year:");
	}

	/*
	 * User menu printing
	 */
	public void askForUserId() {
		System.out.println("Insert user ID:");
	}

	public void askForUserName() {
		System.out.println("Insert user Name:");
	}

	public void askForUserSurname() {
		System.out.println("Insert user surname:");
	}

	public void askForUserEmail() {
		System.out.println("Type the email:");
	}

	public void askForUserLogin() {
		System.out.println("Insert login:");
	}

	public void askForUserPassword() {
		System.out.println("Insert password:");
	}

	@Override
	public String addBook() {
		ConsoleInput input = new ConsoleInput();
		String result = "addBook" + " ";

		askForBookId();
		result += input.intInput() + " ";
		askForBookTitle();
		result += input.stringInput() + " ";
		askForBookAuthor();
		result += input.stringInput() + " ";
		askForBookYear();
		result += input.intInput();
		return result;
	}
}