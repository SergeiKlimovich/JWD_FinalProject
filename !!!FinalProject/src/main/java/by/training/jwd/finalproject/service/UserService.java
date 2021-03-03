package by.training.jwd.finalproject.service;


import by.training.jwd.finalproject.bean.RegistrationInfo;
import by.training.jwd.finalproject.bean.User;

public interface UserService {
	User authorization(String login, String passport) throws ServiceException;
	boolean registration(RegistrationInfo regInfo) throws ServiceException;
}
	
