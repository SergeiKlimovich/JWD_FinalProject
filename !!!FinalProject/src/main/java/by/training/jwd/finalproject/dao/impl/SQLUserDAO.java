package by.training.jwd.finalproject.dao.impl;

import by.training.jwd.finalproject.bean.RegistrationInfo;
import by.training.jwd.finalproject.bean.User;
import by.training.jwd.finalproject.dao.DAOException;
import by.training.jwd.finalproject.dao.UserDAO;

public class SQLUserDAO implements UserDAO{

	static {
		MYSQLDriverLoader.getInstance();
	}
	
	@Override
	public User authorization(String login, String password) throws DAOException {

       System.out.println("USER AUTHORIZATION");
		
       return new User();
	}

	@Override
	public boolean registration(RegistrationInfo regInfo) {
		// TODO Auto-generated method stub
		return false;
	}

}