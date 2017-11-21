package by.htp.library.controller.command.impl;

import by.htp.library.bean.User;
import by.htp.library.controller.command.Command;
import by.htp.library.service.ServiceFactory;
import by.htp.library.service.UserService;
import by.htp.library.service.exception.ServiceException;

public class LoginationCommand implements Command {

	@Override
	public String execute(String request) {
		String[] params = request.split("\\s+");

		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		UserService userService = serviceFactory.getUserService();
		String login = params[1];
		String password = params[2];
		String response = null;
		try {
			User user = userService.logination(login, password);
			response = "User||Name= " + user.getName() + "||Surname= " + user.getSurname() + "| is logged on.";
		} catch (ServiceException e) {
			response = "Sorry, maybe the password is incorrect.";
		}
		return response;
	}

}
