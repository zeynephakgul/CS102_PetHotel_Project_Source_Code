package UserProfile;

import java.util.ArrayList;

public class UserProfileModel {

	UserProfileController userController;
	
	public UserProfileModel( UserProfileView viewer ) {
		userController = new UserProfileController( viewer );
	}
	
	public boolean checkPasswordCondition( String password ) {
		return true;
	}
	
	/*public ArrayList< ArrayList< String > > getAnimals() {
		
	}*/
}
