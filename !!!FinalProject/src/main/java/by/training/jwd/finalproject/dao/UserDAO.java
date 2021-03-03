package by.training.jwd.finalproject.dao;

import by.training.jwd.finalproject.bean.RegistrationInfo;
import by.training.jwd.finalproject.bean.User;

public interface UserDAO {
	User authorization (String login, String password) throws DAOException;
	boolean	registration(RegistrationInfo regInfo) throws DAOException;
}
