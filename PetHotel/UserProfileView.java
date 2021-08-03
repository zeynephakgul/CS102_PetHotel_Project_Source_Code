package PetHotel;

/*
 * this is the viewer class of the user profile page
 * 
 * @author Alper Biçer
 */

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.File;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class UserProfileView extends JPanel {

	// objects
	JPanel north, center, west, tabs;
	JScrollPane scroll;
	JLabel logo, title, updateProfile, savedPet, currentReservation, reservationHistory, savedCard, profilePhoto;
	ImageIcon icon;
	JTextField newPassword, newMail;
	JButton mainPage, aboutUs, rateUs, contact, wishesSuggestions, save, changePhoto, addPet, cardRegistration;
	UserProfileModel userModel;
	//DBConnection dataBase;
	ArrayList< JLabel > reservationHistories, savedPets, currentReservations, savedCards;
	
	// variables
	boolean isMain, doesAddPet, isProfilePhotoChanged, doesCardSave;
	
	/**
	 * constructor
	 */
	public UserProfileView() {
		// initialize
		userModel = new UserProfileModel( this );
		//dataBase = new DBConnection();
		north = new JPanel();
		center = new JPanel();
		west = new JPanel();
		tabs = new JPanel();
		scroll = new JScrollPane();
		logo = new JLabel();
		title = new JLabel( "User Profile" );
		updateProfile = new JLabel( "Update Profile" );
		savedPet = new JLabel( "Saved Pets" );
		currentReservation = new JLabel( "Current Reservations" );
		reservationHistory = new JLabel( "Reservation Histories" );
		savedCard = new JLabel( "Saved Cards" );
		profilePhoto = new JLabel( "photo" );
		icon = new ImageIcon( "images//pet_hotel_logo.png" );
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
		cardRegistration = new JButton( "Save Card" );
		reservationHistories = new ArrayList< JLabel >();
		savedPets = new ArrayList< JLabel >();
		currentReservations = new ArrayList< JLabel >();
		savedCards = new ArrayList< JLabel >();
		isMain = false;
		doesAddPet = false;
		isProfilePhotoChanged = false;
		doesCardSave = false;
		
		// set the logo
		logo.setIcon( icon );
		
		// add elements to the array lists
		/*try {
			currentReservations.addAll( dataBase.getCurrentReservations( dataBase.getEmailOfUsername( profilePhoto.getText() ) ) );
			reservationHistories.addAll( dataBase.getReservationHistory( dataBase.getEmailOfUsername( profilePhoto.getText() ) ) );
			savedCards.addAll( dataBase.getSavedCards( dataBase.getEmailOfUsername( profilePhoto.getText() ) ) );
			savedPets.addAll( dataBase.getSavedPets( dataBase.getEmailOfUsername( profilePhoto.getText() ) ) );
		} catch( Exception e ) {
			e.printStackTrace();
		}*/
		
		/*for( int i = 0; i < currentReservations.size(); i++ )
			currentReservationsArrayList.setText( currentReservations.get( i ) );*/
		
		// set the borders of text fields
		newMail.setBorder( new CompoundBorder( BorderFactory.createTitledBorder( "New E-Mail" ), newMail.getBorder() ) );
		newPassword.setBorder( new CompoundBorder( BorderFactory.createTitledBorder( "New Password" ), newPassword.getBorder() ) );
		
		// add action and adjustment listeners to components
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
		cardRegistration.addActionListener( userModel.userController );
		
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
		/*for( int i = 0; i < currentReservations.size(); i++ )
			center.add( currentReservations.get( i ) );*/
		center.add( reservationHistory );
		/*for( int i = 0; i < reservationHistories.size(); i++ )
			center.add( reservationHistories.get( i ) );*/
		center.add( savedCard );
		/*for( int i = 0; i < savedCards.size(); i++ )
			center.add( savedCards.get( i ) );*/
		center.add( Box.createRigidArea( new Dimension( 0, 10 ) ) );
		center.add( cardRegistration );
		// add components to the west panel
		west.setLayout( new BoxLayout( west, BoxLayout.Y_AXIS ) );
		west.add( profilePhoto );
		west.add( changePhoto );
		west.add( savedPet );
		/*for( int i = 0; i < savedPets.size(); i++ )
			center.add( savedPets.get( i ) );*/
		
		// scroll settings
		scroll.setVerticalScrollBarPolicy( JScrollPane.VERTICAL_SCROLLBAR_ALWAYS );
		scroll.setViewportView( center );
		
		// add components to the panel
		add( north, BorderLayout.NORTH );
		add( center, BorderLayout.CENTER );
		add( west, BorderLayout.WEST );
		add( scroll, BorderLayout.EAST );
	}
	
	/**
	 * go to system explorer and choose a jpeg, jpg or png file
	 * @return the chosen file in the system explorer
	 */
	public File takeProfilePhoto() {
		File file = null;
		JFileChooser fc = new JFileChooser();
		FileFilter filter = new FileNameExtensionFilter( "JPEG/PNG files", "jpg", "jpeg", "png" );
		fc.setFileFilter( filter );
		int response = fc.showOpenDialog( UserProfileView.this );
		if ( response == JFileChooser.APPROVE_OPTION ) {
            file = fc.getSelectedFile();
        }
		return file;
	}
}
