package by.training.jwd.finalproject.controller.command.impl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import by.training.jwd.finalproject.controller.command.ActionCommand;

public class ToMainPage implements ActionCommand {
	public static final String FORWARD_MAIN_PAGE = "/jsp/mainPage.jsp";
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		if (session == null) {
			response.sendRedirect("Controller?command=to_sign_in_page_command&message=error2");
			return;
		}
		Boolean isAuth = (Boolean) session.getAttribute("auth");
		if (isAuth == null || !isAuth) {
			response.sendRedirect("Controller?command=to_sign_in_page_command&message=error");
						return;
		}
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(FORWARD_MAIN_PAGE);
		requestDispatcher.forward(request, response);
	}

}
