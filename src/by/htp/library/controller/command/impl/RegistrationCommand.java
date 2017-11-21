package by.htp.library.controller.command.impl;

import by.htp.library.bean.User;
import by.htp.library.controller.command.Command;
import by.htp.library.service.ServiceFactory;
import by.htp.library.service.UserService;
import by.htp.library.service.exception.ServiceException;

public class RegistrationCommand implements Command {

	@Override
	public String execute(String request) {
		String[] params = request.split("\\s+");
		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		UserService userService = serviceFactory.getUserService();
		User user = new User(Integer.parseInt(params[1]), params[2],params[3],params[4],params[5],params[6]);

		String response = "registrationCommand " + user.toString();
		try {
			userService.registration(user);
			response = "User||Name= " + user.getName() + "||Surname= " + user.getSurname() + "| is registrated.";
		} catch (ServiceException e) {
			response = "Sorry, maybe the password is incorrect.(ServiceException)";
		}
		return response;
	}

}
