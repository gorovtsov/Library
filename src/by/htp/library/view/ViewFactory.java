package by.htp.library.view;

import by.htp.library.view.impl.MenuImpl;

public class ViewFactory {
	private static final ViewFactory instance = new ViewFactory();

	private final Menu menu = new MenuImpl();

	public ViewFactory() {
	}

	public Menu getMenu() {
		return menu;
	}
	public static ViewFactory getInstance() {
		return instance;
	}
}
