package by.training.jwd.finalproject.dao;

public class DBDriverLoadingException extends RuntimeException {
	
	private static final long serialVersionUID = -6028788723707807740L;

	public DBDriverLoadingException(Exception e) {
		super(e);
	}
}
