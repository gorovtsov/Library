package by.htp.library.view;

public interface Menu {
	/*
	 * Main menu printing
	 */
	public void showMainMenu();
	
	/*
	 * Book menu printing
	 */
	public void askForBookId();
	public void askForBookTitle();
	public void askForBookAuthor();
	public void askForBookYear();
	
	/*
	 * User menu printing
	 */
	public void askForUserId();
	public void askForUserName();
	public void askForUserSurname();
	public void askForUserEmail();
	public void askForUserLogin();
	public void askForUserPassword();
	/*
	 * book find by title
	 */
	public String addBook();
}
