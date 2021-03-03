package by.training.jwd.finalproject.dao;

import by.training.jwd.finalproject.dao.impl.SQLUserDAO;

public final class DAOProvider {

	private static final DAOProvider instance = new DAOProvider();	
	
	private final UserDAO userdao = new SQLUserDAO();
	
	
	private DAOProvider() {}
	
	public static DAOProvider getInstance() {
		return instance;
	}

	public UserDAO getUserdao() {
		return userdao;
	}

	
}
