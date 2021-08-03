package PetHotel;
/*
 * this is model class for user registration part
 *
 * @author Cahit Çağın Karataş
 * */
public class UserRegistrationModel {

    //Variables
    String password;
    String username;
    String mail;
    String age;


    //Constructor
    public UserRegistrationModel(){

    }

    public boolean checkConditions(String username, String password){
        if(username.length() != 0 && password.length() != 0){
            return true;
        }
        else
            return false;

    }

    public boolean checkMatchingPasswords(String firstPass , String secondPass){
        if (firstPass.equals(secondPass)){
            return true;
        }
        else
            return false;
    }
}
