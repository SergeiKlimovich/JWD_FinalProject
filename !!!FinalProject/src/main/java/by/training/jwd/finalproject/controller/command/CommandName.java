package by.training.jwd.finalproject.controller.command;

import by.training.jwd.finalproject.controller.command.impl.ToSignInPage;
import by.training.jwd.finalproject.controller.command.impl.ToMainPage;
import by.training.jwd.finalproject.controller.command.impl.SignIn;
import by.training.jwd.finalproject.controller.command.impl.SignOut;
import by.training.jwd.finalproject.controller.command.impl.ToSignUpPage;
import by.training.jwd.finalproject.controller.command.impl.SignUpOk;

public enum CommandName {
	SIGN_IN_COMMAND(new SignIn()),
	TO_SIGN_UP_PAGE_COMMAND(new ToSignUpPage()),
	SIGN_UP_OK_COMMAND(new SignUpOk()),
	TO_SIGN_IN_PAGE_COMMAND(new ToSignInPage()),
	TO_MAIN_PAGE_COMMAND(new ToMainPage()),
	SIGN_OUT_COMMAND(new SignOut());

	private final ActionCommand command;

	CommandName(ActionCommand command){
		this.command = command;
	}
	
	public ActionCommand getCurrentCommand() {
		return command;
	}
}
