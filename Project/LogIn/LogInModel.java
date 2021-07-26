package LogIn;

public class LogInModel {

	// objects
	LogInController controller;
	// variables
	String email, password;
	
	/**
	 * contructor
	 */
	public LogInModel( LogInView view ) {
		controller = new LogInController( view );
	}
}
