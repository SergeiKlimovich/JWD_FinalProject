package by.training.jwd.finalproject.controller.command.impl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.training.jwd.finalproject.controller.command.ActionCommand;

public class ToSignInPage implements ActionCommand {
	public static final String FORWARD_SIGN_IN_PAGE = "/jsp/signInPage.jsp";

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(FORWARD_SIGN_IN_PAGE);

		requestDispatcher.forward(request, response);

	}
}
