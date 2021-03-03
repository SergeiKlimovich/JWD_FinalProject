package by.training.jwd.finalproject.controller.command.impl;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import by.training.jwd.finalproject.controller.command.ActionCommand;

public class SignOut implements ActionCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		if (session !=null) {
			session.removeAttribute("auth");
		}
		
		
		response.sendRedirect("Controller?command=to_sign_in_page_command&message=SignOut ok");
		
	}

}
