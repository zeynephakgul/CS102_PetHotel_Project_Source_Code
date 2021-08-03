import java.util.ArrayList;
import java.awt.Image;

/**
 * Adminpage model that holds adminpage data
 * @author Zeynep Hanife Akgül
 */

public class AdminPageModel 
{
    //properties
    Image hotelLogo;
    String bio;
    int roomNum;
    String roomType;
    String contactInfo;
    ArrayList<Image> hotelPhotos;
    ArrayList<ArrayList<String>> careTakers;
    ArrayList<ArrayList<String>> reservedRooms;
    ArrayList<String> wishesOfHotel;

    public AdminPageModel()
    {
        bio = "";
        roomNum = 0;
        roomType = "";
        contactInfo = "";
        hotelPhotos = new ArrayList<Image>();
        careTakers = new ArrayList<ArrayList<String>>();
        reservedRooms = new ArrayList<ArrayList<String>>();
        wishesOfHotel = new ArrayList<String>();
    }
}
