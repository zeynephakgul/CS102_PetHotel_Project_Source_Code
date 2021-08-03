package PetHotel;

/*
 * this is the controller class of the user profile page
 * 
 * @author Alper Biçer
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.ImageIcon;

public class UserProfileController implements ActionListener {

	UserProfileView view;
	//DBConnection dataBase;
	
	public UserProfileController( UserProfileView viewer ) {
		view = viewer;
	}

	public void insertPasswordToDB( String password ) {
		//dataBase.setPassword( password );
	}
	
	public void insertMailToDB( String mail ) {
		//dataBase.setPassword( mail );
	}
	
	@Override
	public void actionPerformed( ActionEvent e ) {
		view.isProfilePhotoChanged = false;
		
		// button controls
		if( e.getSource() == view.save ) { // insert changes to data base
			if( view.newMail.getText().length() > 0 )
				insertMailToDB( view.newMail.getText() );
			if( view.newPassword.getText().length() > 0 )
				insertPasswordToDB( view.newPassword.getText() );
		}
		if( e.getSource() == view.addPet ) {
			view.doesAddPet = true;
		}
		if( e.getSource() == view.mainPage ) {
			view.isMain = true;
		}
		if( e.getSource() == view.changePhoto ) {
			// get the path of the file and set that image to the profile photo
			view.isProfilePhotoChanged = true;
			File file = view.takeProfilePhoto();
			String path = file.getPath();
			view.profilePhoto.setText( "" );
			view.profilePhoto.setIcon( new ImageIcon( path ) );
			view.repaint();
		}
		if( e.getSource() == view.cardRegistration )
			view.doesCardSave = true;
	}
}
