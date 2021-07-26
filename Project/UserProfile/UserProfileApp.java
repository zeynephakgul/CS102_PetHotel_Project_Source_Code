package UserProfile;

import javax.swing.JFrame;

public class UserProfileApp {

	public static void main(String[] args) {
		
		UserProfileView viewer = new UserProfileView();
		JFrame frame = new JFrame();
		
		frame.add( viewer );
		frame.pack();
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.setVisible( true );
	}

}
