package by.htp.library.dao;

import by.htp.library.bean.User;
import by.htp.library.dao.exception.DAOException;

public interface UserDAO {
	User logination(String login, String password) throws DAOException;
	String registration(User user) throws DAOException;	
}
