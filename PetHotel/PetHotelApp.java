package PetHotel;

import javax.swing.JFrame;

public class PetHotelApp {

	// objects
	static JFrame frame = new JFrame( "Pet Hotel Reservation System" );
	static LogInView logIn = new LogInView();
	static ForgotPassMVC forgotPass = new ForgotPassMVC();
	static UserProfileView userProfile = new UserProfileView();
	static UserRegistrationView userRegistration = new UserRegistrationView();
	static HotelRegView hotelReg = new HotelRegView();
	static MainPageWUser mainPageWUser = new MainPageWUser();
	static HotelInfoView hotelInfo = new HotelInfoView();
	static AdminPage adminPage = new AdminPage();
	static CardRegView cardReg = new CardRegView();
	static PetRegView petReg = new PetRegView();
	
	public static void main( String[] args ) {
		
		// implement frame
		frame.add( logIn );
		frame.pack();
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.setVisible( true );
		switchPage();
	}
	
	/**
	 * switch the page when the relevant button is pressed
	 */
	public static void switchPage() {
		while( frame.isActive() || forgotPass.isMessageSent || userProfile.isProfilePhotoChanged || userRegistration.abc || hotelReg.isRegistered || logIn.isLoggedIn
				|| petReg.keepFrameActive ) {
			
			if( logIn.isForgotPass ) {
				frame.getContentPane().remove( logIn );
				frame.add( forgotPass );
				frame.pack();
				frame.repaint();
				logIn.isForgotPass = false;
				forgotPass.remainedSeconds = 120;
				forgotPass.isPageActive = true;
				frame.setVisible( true );
			}
			if( logIn.isLoggedIn ) {
				frame.getContentPane().remove( logIn );
				frame.add( mainPageWUser );
				frame.repaint();
				logIn.isLoggedIn = false;
				frame.setVisible( true );
			}
			if( logIn.doesRegisteredAsCustomer ) {
				frame.getContentPane().remove( logIn );
				frame.add( userRegistration );
				frame.repaint();
				logIn.doesRegisteredAsCustomer = false;
				frame.setVisible( true );
			}
			if( logIn.doesRegisteredAsOwner ) {
				frame.getContentPane().remove( logIn );
				frame.add( hotelReg );
				frame.repaint();
				logIn.doesRegisteredAsOwner = false;
				frame.setVisible( true );
			}
			if( forgotPass.isBack ) {
				frame.getContentPane().remove( forgotPass );
				frame.add( logIn );
				frame.pack();
				frame.repaint();
				forgotPass.isBack = false;
				forgotPass.isPageActive = false;
				frame.setVisible( true );
			}
			if( forgotPass.isSubmitted ) {
				frame.getContentPane().remove( forgotPass );
				frame.add( userProfile );
				frame.repaint();
				forgotPass.isSubmitted = false;
				forgotPass.isMessageSent = false;
				forgotPass.isPageActive = false;
				frame.setVisible( true );
			}
			if( userProfile.isMain ) {
				frame.getContentPane().remove( userProfile );
				frame.add( mainPageWUser );
				frame.repaint();
				userProfile.isMain = false;
				frame.setVisible( true );
			}
			if( userProfile.doesAddPet ) {
				frame.getContentPane().remove( userProfile );
				frame.add( petReg );
				frame.repaint();
				userProfile.doesAddPet = false;
				frame.setVisible( true );
			}
			if( userRegistration.isBack ) {
				frame.getContentPane().remove( userRegistration );
				frame.add( logIn );
				frame.pack();
				frame.repaint();
				userRegistration.isBack = false;
				frame.setVisible( true );
			}
			if( hotelReg.isBack ) {
				frame.getContentPane().remove( hotelReg );
				frame.add( logIn );
				frame.pack();
				frame.repaint();
				hotelReg.isBack = false;
				frame.setVisible( true );
			}
			if( hotelReg.isRegister ) {
				frame.getContentPane().remove( hotelReg );
				frame.add( mainPageWUser );
				frame.pack();
				frame.repaint();
				hotelReg.isRegister = false;
				frame.setVisible( true );
			}
			if( mainPageWUser.isLogOut ) {
				frame.getContentPane().remove( mainPageWUser );
				frame.add( logIn );
				frame.pack();
				frame.repaint();
				mainPageWUser.isLogOut = false;
				frame.setVisible( true );
			}
			if( mainPageWUser.isHotelInfo ) {
				frame.getContentPane().remove( mainPageWUser );
				frame.add( hotelInfo );
				frame.pack();
				frame.repaint();
				mainPageWUser.isHotelInfo = false;
				frame.setVisible( true );
			}
			if( mainPageWUser.isProfile ) {
				frame.getContentPane().remove( mainPageWUser );
				frame.add( userProfile );
				frame.pack();
				frame.repaint();
				mainPageWUser.isProfile = false;
				frame.setVisible( true );
			}
			if( adminPage.isLogOut ) {
				frame.getContentPane().remove( adminPage );
				frame.add( logIn );
				frame.pack();
				frame.repaint();
				adminPage.isLogOut = false;
				frame.setVisible( true );
			}
			if( logIn.isAdmin ) {
				frame.getContentPane().remove( logIn );
				frame.add( adminPage );
				frame.pack();
				frame.repaint();
				logIn.isAdmin = false;
				frame.setVisible( true );
			}
			if( petReg.isMain ) {
				frame.getContentPane().remove( petReg );
				frame.add( mainPageWUser );
				frame.pack();
				frame.repaint();
				petReg.isMain = false;
				frame.setVisible( true );
			}
			if( petReg.isRegistered ) {
				frame.getContentPane().remove( petReg );
				frame.add( userProfile );
				frame.pack();
				frame.repaint();
				petReg.isRegistered = false;
				frame.setVisible( true );
			}
			if( userProfile.doesCardSave ) {
				frame.getContentPane().remove( userProfile );
				frame.add( cardReg );
				frame.pack();
				frame.repaint();
				userProfile.doesCardSave = false;
				frame.setVisible( true );
			}
			if( cardReg.isCardSaved ) {
				frame.getContentPane().remove( cardReg );
				frame.add( userProfile );
				frame.pack();
				frame.repaint();
				cardReg.isCardSaved = false;
				frame.setVisible( true );
			}
		}
	}
}
