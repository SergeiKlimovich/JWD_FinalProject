package by.training.jwd.finalproject.service;

public class ServiceException extends Exception {

	private static final long serialVersionUID = -3321500639618391934L;

	public ServiceException() {
		super();
	}

	public ServiceException(String massage) {
		super(massage);
	}

	public ServiceException(Exception e) {
		super(e);
	}

	public ServiceException(String massage, Exception e) {
		super(massage, e);

	}
}
