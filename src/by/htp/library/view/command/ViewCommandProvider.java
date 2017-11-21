package by.htp.library.view.command;

import java.util.HashMap;
import java.util.Map;

import by.htp.library.controller.command.Command;
import by.htp.library.controller.command.impl.LoginationCommand;
import by.htp.library.controller.command.impl.RegistrationCommand;

public class ViewCommandProvider {
private Map<String, Command> commands = new HashMap<>();
	
	public ViewCommandProvider() {
		//book outputs
		commands.put("askForBookId", new LoginationCommand());
		commands.put("askForBookTitle", new RegistrationCommand());
		commands.put("askForBookAuthor", new RegistrationCommand());
		commands.put("askForBookYear", new RegistrationCommand());
		
		//user outputs
		commands.put("askForUserId", new RegistrationCommand());
		commands.put("askForUserName", new RegistrationCommand());
		commands.put("askForUserSurname", new RegistrationCommand());
		commands.put("askForUserEmail", new RegistrationCommand());
		commands.put("askForUserLogin", new RegistrationCommand());
		commands.put("askForUserPassword", new RegistrationCommand());
	}
	
	public Command getCommand(String commandName) {
		
		return commands.get(commandName);
	}
}
