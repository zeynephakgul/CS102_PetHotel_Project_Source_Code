package LogIn;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;

public class LogInView extends JPanel {

	// objects
	JPanel northPanel, centerPanel, southPanel;
	JLabel title, logo;
	JTextField email, password;
	JButton back, login, registerCustomer, registerOwner, forgotPassword;
	LogInModel model;
	
	/**
	 * constructor
	 */
	public LogInView() {
		// initialize
		northPanel = new JPanel();
		centerPanel = new JPanel();
		southPanel = new JPanel();
		title = new JLabel( "LOG IN" );
		logo = new JLabel( "LOGO" );
		forgotPassword = new JButton();
		email = new JTextField( 10 );
		password = new JTextField( 10 );
		back = new JButton( "Back" );
		login = new JButton( "Log in" );
		registerCustomer = new JButton( "Register as Customer" );
		registerOwner = new JButton( "Register as Hotel Owner" );
		model = new LogInModel( this );
		
		// set link's text
		forgotPassword.setBorder( null );
		forgotPassword.setFont( new Font( "link", Font.ITALIC, 12 ) );
		forgotPassword.setForeground( Color.BLUE );
		forgotPassword.setText( "forgot your password?" );
		
		// set borders' titles
		email.setBorder( new CompoundBorder( BorderFactory.createTitledBorder( "E-Mail" ), email.getBorder() ) );
		password.setBorder( new CompoundBorder( BorderFactory.createTitledBorder( "Password" ), password.getBorder() ) );
		
		// add components to the panels
		setLayout( new GridLayout( 3, 1 ) );
		
		northPanel.setLayout( new BoxLayout( northPanel, BoxLayout.X_AXIS ) );
		northPanel.add( logo );
		northPanel.add( Box.createRigidArea( new Dimension( 100, 0 ) ) );
		northPanel.add( title );
		northPanel.add( Box.createRigidArea( new Dimension( 100, 0 ) ) );
		northPanel.add( back );
		add( northPanel );
		
		centerPanel.setLayout( new BoxLayout( centerPanel, BoxLayout.Y_AXIS ) );
		centerPanel.add( email );
		centerPanel.add( Box.createRigidArea( new Dimension( 0, 30 ) ) );
		centerPanel.add( password );
		centerPanel.add( forgotPassword );
		centerPanel.add( Box.createRigidArea( new Dimension( 0, 20 ) ) );
		centerPanel.add( login );
		add( centerPanel );
		
		southPanel.setLayout( new BoxLayout( southPanel, BoxLayout.X_AXIS ) );
		southPanel.add( registerCustomer );
		southPanel.add( Box.createRigidArea( new Dimension( 100, 0 ) ) );
		southPanel.add( registerOwner );
		add( southPanel );
		
		// get text
		model.email = email.getText();
		model.password = password.getText();
		
		forgotPassword.addActionListener( model.controller );
		email.addActionListener( model.controller );
		password.addActionListener( model.controller );
		back.addActionListener( model.controller );
		login.addActionListener( model.controller );
		registerCustomer.addActionListener( model.controller );
		registerOwner.addActionListener( model.controller );
	}
}
