package by.training.jwd.finalproject.controller.command;

import java.util.HashMap;
import java.util.Map;

import by.training.jwd.finalproject.controller.command.impl.ToSignInPage;
import by.training.jwd.finalproject.controller.command.impl.ToMainPage;
import by.training.jwd.finalproject.controller.command.impl.SignIn;
import by.training.jwd.finalproject.controller.command.impl.SignOut;
import by.training.jwd.finalproject.controller.command.impl.ToSignUpPage;
import by.training.jwd.finalproject.controller.command.impl.SignUpOk;

public class CommandProvider {
	private Map<CommandName, ActionCommand> commands = new HashMap<>();

	public CommandProvider() {
		commands.put(CommandName.SIGN_IN_COMMAND, new SignIn());
		commands.put(CommandName.TO_SIGN_UP_PAGE_COMMAND, new ToSignUpPage());
		commands.put(CommandName.SIGN_UP_OK_COMMAND, new SignUpOk());
		commands.put(CommandName.TO_SIGN_IN_PAGE_COMMAND, new ToSignInPage());
		commands.put(CommandName.TO_MAIN_PAGE_COMMAND, new ToMainPage());
		commands.put(CommandName.SIGN_OUT_COMMAND, new SignOut());
	}

	public ActionCommand takeCommand(String name) {
		CommandName commandName;
		commandName = CommandName.valueOf(name.toUpperCase());
		return commands.get(commandName);
	}
}
