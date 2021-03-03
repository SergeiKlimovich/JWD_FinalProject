package by.training.jwd.finalproject.controller.command.impl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import by.training.jwd.finalproject.bean.User;
import by.training.jwd.finalproject.controller.command.ActionCommand;
import by.training.jwd.finalproject.service.ServiceException;
import by.training.jwd.finalproject.service.ServiceProvider;
import by.training.jwd.finalproject.service.UserService;

public class SignIn implements ActionCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login;
		String password;
		login = request.getParameter("login");
		password = request.getParameter("password");
		ServiceProvider provider = ServiceProvider.getInstance();
		UserService userService = provider.getUserService();
		User user = null;
		RequestDispatcher requestDispatcher = null;
		try {
			user = userService.authorization(login, password);
			if (user == null) {
				response.sendRedirect("Controller?command=to_sign_in_page_command&message=user is null");
				
				return;
			}
			HttpSession session = request.getSession(true);
			session.setAttribute("auth", true);
			response.sendRedirect("Controller?command=to_main_page_command");

		} catch (ServiceException e) {
			response.sendRedirect("Controller?command=to_sign_in_page_command&message=wrong in catch");

		}

	}

}
