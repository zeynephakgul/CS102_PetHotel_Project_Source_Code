package UserProfile;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class UserProfileController implements ActionListener {

	UserProfileView view;
	
	public UserProfileController( UserProfileView viewer ) {
		view = viewer;
	}

	public void insertPasswordToDB( String password ) {
		JOptionPane.showMessageDialog(null, "password sent");
	}
	
	public void insertMailToDB( String mail ) {
		JOptionPane.showMessageDialog(null, "mail sent");
	}
	
	@Override
	public void actionPerformed( ActionEvent e ) {
		if( e.getSource() == view.save ) {
			insertMailToDB( view.newMail.getText() );
			insertPasswordToDB( view.newPassword.getText() );
		}
		if( e.getSource() == view.addPet ) {
			
		}
		if( e.getSource() == view.mainPage ) {
			
		}
		if( e.getSource() == view.changePhoto ) {
			
		}
		if( e.getSource() == view.aboutUs ) {
			
		}
		if( e.getSource() == view.rateUs ) {
			
		}
		if( e.getSource() == view.contact ) {
			
		}
		if( e.getSource() == view.wishesSuggestions ) {
			
		}
	}
}
