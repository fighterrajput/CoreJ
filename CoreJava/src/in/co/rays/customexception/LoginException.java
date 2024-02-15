package in.co.rays.customexception;

public class LoginException extends RuntimeException {
	
	public LoginException() {
		super("Invalid User");
	}

}
