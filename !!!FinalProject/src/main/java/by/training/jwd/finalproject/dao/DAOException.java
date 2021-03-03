package by.training.jwd.finalproject.dao;

public class DAOException extends Exception {
	
	private static final long serialVersionUID = 8563230460155495203L;

	public DAOException() {
		super();
	}
	
	public DAOException(String message) {
		super(message);
	}
	
	public DAOException(Exception e) {
		super(e);
	}

	public DAOException(String message, Exception e) {
		super(message, e);
	}

}