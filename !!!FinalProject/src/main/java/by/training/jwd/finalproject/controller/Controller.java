package by.training.jwd.finalproject.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.training.jwd.finalproject.controller.command.ActionCommand;
import by.training.jwd.finalproject.controller.command.CommandProvider;

public class Controller extends HttpServlet {

	private static final long serialVersionUID = 5622442061455503191L;
	private final CommandProvider provider = new CommandProvider();
	private static final String COMMAND_PARAM = "command";

	public Controller() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);
	}

	private void process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter(COMMAND_PARAM);
		ActionCommand command = provider.takeCommand(name);

		command.execute(request, response);

	}

}
