package PetHotel;

/*
 * this is the model class of the user profile page
 * 
 * @author Alper Biçer
 */

import java.util.ArrayList;

public class UserProfileModel {

	UserProfileController userController;
	
	public UserProfileModel( UserProfileView viewer ) {
		userController = new UserProfileController( viewer );
	}
	
	/*public ArrayList< ArrayList< String > > getAnimals() {
		// take data from database
	}*/
}
