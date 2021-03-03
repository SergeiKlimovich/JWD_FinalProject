package by.training.jwd.finalproject.controller.command.impl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import by.training.jwd.finalproject.controller.command.ActionCommand;

public class SignUpOk implements ActionCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("class SignUpOk implements ActionCommand");
		response.sendRedirect("Controller?command=to_sign_in_page_command&message=SignUp ok");

	}

}
