package by.htp.library.service.impl;

import by.htp.library.bean.User;
import by.htp.library.dao.DAOFactory;
import by.htp.library.dao.UserDAO;
import by.htp.library.dao.exception.DAOException;
import by.htp.library.service.UserService;
import by.htp.library.service.exception.ServiceException;

public class UserServiceImpl implements UserService {

	@Override
	public User logination(String login, String password) throws ServiceException {
		// validation
		if (login == null || login.isEmpty()) {
			return null;
		}

		DAOFactory daoFactory = DAOFactory.getInstance();

		UserDAO userDAO = daoFactory.getUserDAO();

		User user;

		try {
			
			user = userDAO.logination(login, password);
			
		} catch (DAOException e) {
			throw new ServiceException("smth wrong", e);
		}
		
		return user;
	}

	@Override
	public void registration(User user) throws ServiceException {
		DAOFactory daoFactory = DAOFactory.getInstance();

		UserDAO userDAO = daoFactory.getUserDAO();

		
			try {
				userDAO.registration(user);
			} catch (DAOException e) {
				throw new ServiceException("Service Exception in registration", e);
			}
		

	}

	@Override
	public boolean passwordValidation(User user){
		if (user.getPassword() == null) {
			return false;
		}
		if (user.getPassword().isEmpty()) {
			return false;
		}
		if (user.getPassword().length() < 6) {
			return false;
		}
		return true;
	}

}
