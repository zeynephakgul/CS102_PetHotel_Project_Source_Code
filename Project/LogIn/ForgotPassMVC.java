package LogIn;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;

public class ForgotPassMVC extends JPanel implements ActionListener {

	// constants
	private final int DELAY = 1000;
	
	// objects
	JPanel northPanel, centerPanel, mailPanel;
	JTextField email, confirmationCode;
	JLabel logo;
	JButton submit, back, sendCode;
	Border defaultBorder;
	Timer timer;
	
	// variables
	String codeForConfirmation = "";
	int remainedSeconds;
	
	public ForgotPassMVC() {
		// intialize
		northPanel = new JPanel();
		centerPanel = new JPanel();
		mailPanel = new JPanel();
		email = new JTextField( 10 );
		confirmationCode = new JTextField( 20 );
		logo = new JLabel( "Logo" );
		submit = new JButton( "Submit" );
		back = new JButton( "Back" );
		sendCode = new JButton( "Send Code" );
		timer = new Timer( DELAY, this );
		remainedSeconds = 120;
		
		// set sizes
		email.setPreferredSize( new Dimension( 150, 43 ) );
		confirmationCode.setPreferredSize( new Dimension( 100, 43 ) );
		submit.setPreferredSize( new Dimension( 40, 30 ) );
		
		// set borders' titles
		defaultBorder = confirmationCode.getBorder();
		email.setBorder( new CompoundBorder( BorderFactory.createTitledBorder( "enter your e-mail" ), email.getBorder() ) );
		confirmationCode.setBorder( new CompoundBorder( BorderFactory.createTitledBorder( "enter the code in " + remainedSeconds + " seconds" ), confirmationCode.getBorder() ) );
		
		// add action listeners
		email.addActionListener( this );
		confirmationCode.addActionListener( this );
		submit.addActionListener( this );
		back.addActionListener( this );
		
		// add components to the panels
		setLayout( new BorderLayout() );
		
		northPanel.setLayout( new BorderLayout() );
		northPanel.add( logo, BorderLayout.WEST );
		northPanel.add( back, BorderLayout.EAST );
		
		mailPanel.setLayout( new BorderLayout() );
		mailPanel.add( email, BorderLayout.WEST );
		mailPanel.add( sendCode, BorderLayout.EAST );
		
		centerPanel.setLayout( new BoxLayout( centerPanel, BoxLayout.Y_AXIS ) );
		centerPanel.add( Box.createRigidArea( new Dimension( 0, 20 ) ) );
		centerPanel.add( mailPanel );
		centerPanel.add( Box.createRigidArea( new Dimension( 0, 20 ) ) );
		centerPanel.add( confirmationCode );
		centerPanel.add( Box.createRigidArea( new Dimension( 80, 20 ) ) );
		centerPanel.add( submit );
		
		add( northPanel, BorderLayout.NORTH );
		add( centerPanel, BorderLayout.CENTER );
		
		// add action listeners to components
		back.addActionListener( this );
		email.addActionListener( this );
		confirmationCode.addActionListener( this );
		submit.addActionListener( this );
		sendCode.addActionListener( this );
		
		// start the time
		timer.start();
	}
	
	/**
	 * implement actions
	 */
	@Override
	public void actionPerformed( ActionEvent e ) {
		
		if( remainedSeconds <= 0 ) {
			JOptionPane.showMessageDialog( null, "Time is ended. Be careful next time..." );
			remainedSeconds = 120;
			email.setText( "" );
			confirmationCode.setText( "" );
			codeForConfirmation = "";
		}
		remainedSeconds--;
		confirmationCode.setBorder( defaultBorder );
		confirmationCode.setBorder( new CompoundBorder( BorderFactory.createTitledBorder( "enter the code in " + remainedSeconds + " seconds" ), confirmationCode.getBorder() ) );
		
		if( e.getSource() == submit ) {
			
			if( codeForConfirmation.equals( confirmationCode.getText() ) )
				JOptionPane.showMessageDialog( null, "Now you can reset your password, have a good day :)" );
			else
				JOptionPane.showMessageDialog( null, "Wrong code, please try again..." );
		}
		
		if( e.getSource() == sendCode ) {
			// set the confirmation code randomly
			for( int i = 0; i < 6; i++ ) {
				codeForConfirmation += Integer.toString( ( int )( Math.random() * 100 ) );
			}
			// set the properties
			String recipientAddress = email.getText();
			String senderAddress = "pet.hotel.reservation.system@gmail.com";
			String senderPass = "alper.zeynep.cahit.ilayda";
			Properties props = new Properties();
			props.put( "mail.smtp.auth" , "true" );
			props.put( "mail.smtp.starttls.enable" , "true" );
			props.put( "mail.smtp.host" , "smtp.gmail.com" );
			props.put( "mail.smtp.port" , "587" );
			
			Session session = Session.getInstance( props, new Authenticator() {
				@Override
				protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
					return new javax.mail.PasswordAuthentication( senderAddress, senderPass );
				}
			});
			
			// send email to the user
			try {
				
				MimeMessage message = new MimeMessage( session );
				message.setFrom( new InternetAddress( senderAddress ) );
				message.setRecipient( Message.RecipientType.TO, new InternetAddress( recipientAddress ) );
				message.setSubject( "Confirmation Code from Pet Hotel Reservation System" );
				message.setText( "Hi, we heard that you are having a problem with logging in. That is why we sent to you a confirmation code to understand "
								+ "that you are the real you. Please write the code to the confirmation text field and prove that you are real :)\n\nConfirmation Code: "
								+ codeForConfirmation );
				
				Transport.send( message );
				JOptionPane.showMessageDialog( null, "Confirmation Code Successfully Sent! Please check out your e-mail within the time." );
				
			} catch( MessagingException me ) {
				me.printStackTrace();
			}
		}
	}
}
