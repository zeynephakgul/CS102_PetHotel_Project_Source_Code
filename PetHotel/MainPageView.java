package PetHotel;
/*
 * this is main page interface for all common J materials
 *
 * @author Cahit Çağın Karataş
 * */
import javax.swing.*;

public interface MainPageView {
    JLabel LOGO = new JLabel("LOGO");
    JLabel TITLE = new JLabel("TITLE");
    JButton BOOK_NOW = new JButton("BOOK NOW");
    JButton RATE_US = new JButton("RATE US");
    JButton ABOUT_US = new JButton("ABOUT US");
    JButton CONTACT = new JButton("CONTACT");
    JButton WISHES_SUGGESTIONS = new JButton("WISHES");
    JTextField CHECK_IN = new JTextField();
    JTextField CHECK_OUT = new JTextField();
    JTextField HOTEL_NAME = new JTextField();
    JComboBox<String> STATUS = new JComboBox();
    JComboBox<String> PET_CATEGORY = new JComboBox();
    JComboBox<String> PRICES  = new JComboBox();
}
