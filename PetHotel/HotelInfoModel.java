import java.util.ArrayList;
import java.awt.Image;

/**
 * HotelInfoView model that holds hotels data
 * @author Zeynep Hanife Akgül
 */

public class HotelInfoModel 
{
    //properties
    String hotelName;
    String aboutUs;
    String contactInfo;
    String address;
    ArrayList<Image> photos;
    Image hotelLogo;

    //constructor
    public HotelInfoModel()
    {
        hotelName = "";
        aboutUs = "";
        contactInfo = "";
        address = "";
        photos = new ArrayList<Image>();
    }

}
