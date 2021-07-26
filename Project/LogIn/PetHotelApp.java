package LogIn;

import javax.swing.JFrame;

public class PetHotelApp {

	public static void main( String[] args ) {

		// objects
		JFrame frame = new JFrame( "Pet Hotel Reservation System" );
		LogInView viewer = new LogInView();
		ForgotPassMVC forgotPass = new ForgotPassMVC();
		
		// implement frame
		frame.add( viewer );
		frame.pack();
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.setVisible( true );
	}
}
