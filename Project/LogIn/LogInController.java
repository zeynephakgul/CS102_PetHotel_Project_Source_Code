package LogIn;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class LogInController implements ActionListener {

	LogInView viewer;
	
	public LogInController( LogInView view ) {
		viewer = view;
	}
	
	/**
	 * implement actions
	 */
	@Override
	public void actionPerformed( ActionEvent e ) {
		
		if( e.getActionCommand().equals( "Back" ) )
			JOptionPane.showMessageDialog( null, "hello" );
		if( e.getSource() == viewer.forgotPassword )
			JOptionPane.showMessageDialog( null, "bye bye" );
	}
}
