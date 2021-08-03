import javax.swing.*;
import java.awt.*;
package PetHotel;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * This is Hotel Registration page's model class. It checks if the certificate number (taken in the view) is accurate
 * and if the passwords entered in the view match.
 *
 * @author İlayda Zehra Yılmaz
 * @version 03/08/2021
 */

public class HotelRegModel{
    String password;
    String certificateNum;
    String price;
    String address;
    String mail;
    String hotelName;
    ArrayList<String> allowedPets;
    Image hotelLogo;
    ArrayList<Image> hotelPhotos;

    public HotelRegModel( HotelRegView view ){
        this.certificateNum = "01627382122";
    }

    public boolean checkCertificate( String number ){
        return  (certificateNum.equals(number)) ;
    }

    public boolean checkMatchingPasswords( String pass1, String pass2 ){
        return ( pass1.equals( pass2 ) );
    }
}
