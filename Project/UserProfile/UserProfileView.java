package UserProfile;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;

public class UserProfileView extends JPanel {

	// objects
	JPanel north, center, west, tabs;
	JScrollBar scroll;
	JLabel logo, title, updateProfile, savedPet, currentReservation, reservationHistory, savedCard, profilePhoto;
	JTextField newPassword, newMail;
	JButton mainPage, aboutUs, rateUs, contact, wishesSuggestions, save, changePhoto, addPet;
	UserProfileModel userModel;
	ArrayList< JLabel > reservationHistories, savedPets, currentReservations, savedCards;
	
	/**
	 * constructor
	 */
	public UserProfileView() {
		// initialize
		userModel = new UserProfileModel( this );
		north = new JPanel();
		center = new JPanel();
		west = new JPanel();
		tabs = new JPanel();
		scroll = new JScrollBar();
		logo = new JLabel( "logo" );
		title = new JLabel( "User Profile" );
		updateProfile = new JLabel( "Update Profile" );
		savedPet = new JLabel( "Saved Pets" );
		currentReservation = new JLabel( "Current Reservations" );
		reservationHistory = new JLabel( "Reservation Histories" );
		savedCard = new JLabel( "Saved Cards" );
		profilePhoto = new JLabel( "photo" );
		newPassword = new JTextField( 10 );
		newMail = new JTextField( 10 );
		mainPage = new JButton( "Main Page" );
		aboutUs = new JButton( "About Us" );
		rateUs = new JButton( "Rate Us" );
		contact = new JButton( "Contact" );
		wishesSuggestions = new JButton( "Wishes and Suggestions" );
		save = new JButton( "Save" );
		changePhoto = new JButton( "change profile photo" );
		addPet = new JButton( "Add Pet" );
		reservationHistories = new ArrayList< JLabel >();
		savedPets = new ArrayList< JLabel >();
		currentReservations = new ArrayList< JLabel >();
		savedCards = new ArrayList< JLabel >();
		
		// set the borders of text fields
		newMail.setBorder( new CompoundBorder( BorderFactory.createTitledBorder( "New E-Mail" ), newMail.getBorder() ) );
		newPassword.setBorder( new CompoundBorder( BorderFactory.createTitledBorder( "New Password" ), newPassword.getBorder() ) );
		
		// add action listeners to components
		newMail.addActionListener( userModel.userController );
		newPassword.addActionListener( userModel.userController );
		mainPage.addActionListener( userModel.userController );
		aboutUs.addActionListener( userModel.userController );
		rateUs.addActionListener( userModel.userController );
		contact.addActionListener( userModel.userController );
		wishesSuggestions.addActionListener( userModel.userController );
		save.addActionListener( userModel.userController );
		changePhoto.addActionListener( userModel.userController );
		addPet.addActionListener( userModel.userController );
		
		setLayout( new BorderLayout() );
		// add components to the tabs panel
		tabs.add( aboutUs );
		tabs.add( Box.createRigidArea( new Dimension( 10, 0 ) ) );
		tabs.add( rateUs );
		tabs.add( Box.createRigidArea( new Dimension( 10, 0 ) ) );
		tabs.add( contact );
		tabs.add( Box.createRigidArea( new Dimension( 10, 0 ) ) );
		tabs.add( wishesSuggestions );
		// add components to the north panel
		north.setLayout( new BorderLayout() );
		north.add( logo, BorderLayout.WEST );
		north.add( title, BorderLayout.CENTER );
		north.add( mainPage, BorderLayout.EAST );
		north.add( tabs, BorderLayout.SOUTH );
		// add components to the center panel
		center.setLayout( new BoxLayout( center, BoxLayout.Y_AXIS ) );
		center.add( updateProfile );
		center.add( newMail );
		center.add( newPassword );
		center.add( Box.createRigidArea( new Dimension( 0, 10 ) ) );
		center.add( addPet );
		center.add( Box.createRigidArea( new Dimension( 0, 10 ) ) );
		center.add( save );
		center.add( Box.createRigidArea( new Dimension( 0, 10 ) ) );
		center.add( currentReservation );
		center.add( reservationHistory );
		center.add( savedCard );
		// add components to the west panel
		west.setLayout( new BoxLayout( west, BoxLayout.Y_AXIS ) );
		west.add( profilePhoto );
		west.add( changePhoto );
		west.add( savedPet );
		// add components to the panel
		add( north, BorderLayout.NORTH );
		add( center, BorderLayout.CENTER );
		add( west, BorderLayout.WEST );
	}
}
