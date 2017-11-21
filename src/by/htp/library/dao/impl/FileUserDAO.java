package by.htp.library.dao.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import java.util.ArrayList;

import by.htp.library.bean.User;
import by.htp.library.dao.UserDAO;
import by.htp.library.dao.exception.DAOException;

public class FileUserDAO implements UserDAO {
	public final File dbFile = new File("c:\\Workspace\\Library\\database\\users.csv");

	@Override
	public User logination(String login, String password) throws DAOException {
		User user = null;
		ArrayList<User> dbUsers = readUserData();

		for (User checkUser : dbUsers) {

			if (checkUser.getLogin().equals(login) && checkUser.getPassword().equals(password)) {
				user = checkUser;
				System.out.println("Login Successfull!");
				break;
			} 
		}
		
		if(user == null) {
			throw new DAOException("Login or password is incorrect.", new Exception());
		}
		
		return user;
	}

	@Override
	public String registration(User user) throws DAOException {
		try {
			String strToFile = user.toString();
			
			//File dbFile = new File("c:\\Workspace\\Library\\database\\users.csv");
			BufferedWriter dbWriter = new BufferedWriter(new FileWriter(dbFile, true));
			dbWriter.append('\n');
			dbWriter.write(strToFile);

			dbWriter.flush();
			dbWriter.close();

			return "Successfull registration.";
		} catch (Exception e) {
			throw new DAOException("smth happended", e);
		}

	}

	public ArrayList<User> readUserData() throws DAOException {
		ArrayList<User> dbUsers = new ArrayList<User>();
		String strFromFile = null;
		String[] splittedStr = null;
		User user = null;

		try {
			BufferedReader dbReader = new BufferedReader(new FileReader(dbFile));
			
			while ((strFromFile = dbReader.readLine()) != null) {
				splittedStr = strFromFile.split(";");
				user = new User();
				user.setId(Integer.parseInt(splittedStr[0]));
				user.setLogin(splittedStr[1]);
				user.setPassword(splittedStr[2]);
				user.setName(splittedStr[3]);
				user.setSurname(splittedStr[4]);
				user.setEmail(splittedStr[5]);
				
				dbUsers.add(user);
			}

			//dbReader.close();
		} catch (Exception e) {
			throw new DAOException("smth happended", e);
		}
		return dbUsers;
	}

}
