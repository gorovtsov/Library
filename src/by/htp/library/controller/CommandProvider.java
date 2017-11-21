package by.htp.library.controller;

import java.util.HashMap;
import java.util.Map;

import by.htp.library.controller.command.Command;
import by.htp.library.controller.command.impl.*;

public class CommandProvider {
	
	private Map<String, Command> commands = new HashMap<>();
	
	public CommandProvider() {
		commands.put("userLogination", new LoginationCommand());
		commands.put("userRegistration", new RegistrationCommand());
		commands.put("bookAddition", new BookAddCommand());
		commands.put("searchBookByAuthor", new SearchBookByAuthorCommand());
		commands.put("searchBookByTitle", new SearchBookByTitleCommand());
	}
	
	public Command getCommand(String commandName) {
		
		return commands.get(commandName);
	}

}
