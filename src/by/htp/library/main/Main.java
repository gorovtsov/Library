package by.htp.library.main;

import java.util.ArrayList;

import by.htp.library.bean.User;
import by.htp.library.controller.FrontController;
import by.htp.library.dao.exception.DAOException;
import by.htp.library.dao.impl.FileUserDAO;
import by.htp.library.view.ViewFactory;
import by.htp.library.view.impl.ConsoleInput;

public class Main {

	public static void main(String[] args) {
		FrontController controller = new FrontController();
		ConsoleInput input = new ConsoleInput();
		String request;
		String response;
		
		//--------------------------------------------------------------------------------------------
		// registration testing --OK
		/*request = "userRegistration 3 Victor Kram kram@ya.ru kramsy alalala";

		
		response = controller.doAction(request);
		
		System.out.print(response);*/
		
		
		//--------------------------------------------------------------------------------------------
		// loginaltion testing --OK
		/*request = "userLogination garavek gdsfdsf";
		response = controller.doAction(request);
		
		System.out.println(response);*/
		
		//--------------------------------------------------------------------------------------------
		//book addition testing --OK
		/*request = "bookAddition 6 IT S.King 1975";
		response = controller.doAction(request);
		
		System.out.println(response);*/
		
		//--------------------------------------------------------------------------------------------
		//searching book by author testing --OK
		request = "searchBookByTitle 1984";
		response = controller.doAction(request);
		
		System.out.println(response);
	}

}
