package PetHotel;

/*
 * this is the controller class of the log-in page
 * 
 * @author Alper Biçer
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class LogInController implements ActionListener {

	LogInView viewer;
	//DBConnection dataBase;
	
	public LogInController( LogInView view ) {
		viewer = view;
		//dataBase = new DBConnection();
	}
	
	/**
	 * implement actions
	 */
	@Override
	public void actionPerformed( ActionEvent e ) {
		
		if( e.getSource() == viewer.forgotPassword ) {
			viewer.isForgotPass = true;
		}
		if( e.getSource() == viewer.login ) {
			viewer.isLoggedIn = true;
			// this code for taking data from database
			/*if( dataBase.checkEmail( viewer.email ) && dataBase.checkPassword( viewer.password ) )
			 	isLoggedIn = true;
			 */
		}
		if( e.getSource() == viewer.registerCustomer ) {
			viewer.doesRegisteredAsCustomer = true;
		}
		if( e.getSource() == viewer.registerOwner ) {
			viewer.doesRegisteredAsOwner = true;
		}
		if( e.getSource() == viewer.adminLogIn )
			viewer.isAdmin = true;
	}
}
