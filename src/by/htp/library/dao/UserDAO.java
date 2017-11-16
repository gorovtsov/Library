package by.htp.library.dao;

import java.util.ArrayList;

import by.htp.library.bean.User;
import by.htp.library.dao.exception.DAOException;

public interface UserDAO {
	User logination(String login, String password) throws DAOException;
	String registration(User user) throws DAOException;
	ArrayList<User> readUserData() throws DAOException;	
}
