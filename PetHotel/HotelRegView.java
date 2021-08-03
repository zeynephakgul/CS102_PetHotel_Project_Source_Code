package PetHotel;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This is Hotel Registration page's view class. It displays the page and takes information needed.
 *
 * @author İlayda Zehra Yılmaz
 * @version 03/08/2021
 */

public class HotelRegView extends JPanel implements RegistrationController, ActionListener {

    JPanel north;
    JPanel center;
    JPanel south;
    JLabel pageTitle;
    JLabel logo;
    JLabel addPhoto;
    JLabel addLogo;
    JTextField price;
    JTextField email;
    JTextField hotelName;
    JTextField password1;
    JTextField password2;
    JTextField address;
    JTextField certificateNum;
    JCheckBox dog;
    JCheckBox cat;
    JCheckBox bird;
    JCheckBox fish;
    JButton back;
    JButton register;
    HotelRegModel model;
    ImageIcon icon;
    boolean isBack, isRegister, isRegistered;

    public HotelRegView(){
        isBack = false;
        isRegister = false;
        isRegistered = false;
        north = new JPanel();
        center = new JPanel();
        south = new JPanel();
        icon = new ImageIcon( "images//pet_hotel_logo.png" );

        pageTitle = new JLabel();
        pageTitle.setBorder(null);
        pageTitle.setForeground(Color.RED);
        pageTitle.setFont(new Font("title",Font.BOLD, 10));
        pageTitle.setText( "HOTEL REGISTRATION");

        logo = new JLabel();
        addPhoto = new JLabel();
        addLogo = new JLabel();
        logo.setIcon( icon );

        price = new JTextField( 10 );
        email = new JTextField( 50 );
        hotelName = new JTextField( 50 );
        password1 = new JTextField( 10 );
        password2 = new JTextField( 10 );
        address = new JTextField( 50 );
        certificateNum = new JTextField( 20);

        dog = new JCheckBox("Dog");
        cat = new JCheckBox( "Cat");
        bird = new JCheckBox( "Bird");
        fish = new JCheckBox( "Fish");

        back = new JButton( "back");
        back.setBackground( Color.ORANGE );
        register = new JButton( "register");
        register.setBackground( Color.ORANGE );
        model = new HotelRegModel( this );

        price.setBorder( new CompoundBorder( BorderFactory.createTitledBorder( "Price" ),
                price.getBorder() ) );

        email.setBorder( new CompoundBorder( BorderFactory.createTitledBorder( "E-Mail" ),
                email.getBorder() ) );

        hotelName.setBorder( new CompoundBorder( BorderFactory.createTitledBorder( "Hotel Name" ),
                hotelName.getBorder() ) );

        password1.setBorder( new CompoundBorder( BorderFactory.createTitledBorder( "Password" ),
                password2.getBorder() ) );

        password2.setBorder( new CompoundBorder( BorderFactory.createTitledBorder( "Password Again" ),
                password2.getBorder() ) );

        address.setBorder( new CompoundBorder( BorderFactory.createTitledBorder( "Address" ),
                address.getBorder() ) );

        certificateNum.setBorder( new CompoundBorder( BorderFactory.createTitledBorder( "Certificate Number" ),
                certificateNum.getBorder() ) );

        center.setLayout( new BoxLayout( center, BoxLayout.Y_AXIS ) );
        center.add( logo );
        center.add( Box.createRigidArea( new Dimension( 150, 0 ) ) );
        center.add( pageTitle );
        center.add( Box.createRigidArea( new Dimension( 150, 0 ) ) );
        center.add( back );
        center.add( email );
        center.add( hotelName );
        center.add( password1 );
        center.add( password2 );
        center.add( Box.createRigidArea( new Dimension( 0, 0 ) ) );
        center.add( price );
        center.add( Box.createRigidArea( new Dimension( 0, 0) ) );
        center.add( dog );
        center.add( Box.createRigidArea( new Dimension( 0, 0 ) ) );
        center.add( cat );
        center.add( Box.createRigidArea( new Dimension( 0, 0 ) ) );
        center.add( bird );
        center.add( Box.createRigidArea( new Dimension( 0, 0 ) ) );
        center.add( fish );
        center.add( Box.createRigidArea( new Dimension( 0, 0) ) );
        center.add( address );
        center.add( Box.createRigidArea( new Dimension( 0, 0) ) );
        center.add( addPhoto );
        center.add( Box.createRigidArea( new Dimension( 0, 0) ) );
        center.add( addLogo );
        center.add( Box.createRigidArea( new Dimension( 0, 0) ) );
        center.add( certificateNum );
        center.add( Box.createRigidArea( new Dimension( 0, 0) ) );
        center.add( register );
        add( center, BorderLayout.CENTER );

        /*south.setLayout( new BoxLayout( south, BoxLayout.X_AXIS));
        south.add( Box.createRigidArea( new Dimension( 300, 0 ) ) );*/

        //add( south, BorderLayout.SOUTH );

        if ( model.checkMatchingPasswords( password1.getText(), password2.getText())){
            model.password = password1.getText();
        }

        model.price = price.getText();
        model.address = address.getText();
        model.mail = email.getText();
        model.hotelName = hotelName.getText();

        // model.hotelLogo = addLogo.getIcon();
        // model.hotelPhotos = addPhoto.getIcon();

        price.addActionListener( this );
        email.addActionListener( this );
        hotelName.addActionListener( this );
        password1.addActionListener( this );
        password2.addActionListener( this );
        dog.addActionListener( this );
        cat.addActionListener( this );
        bird.addActionListener( this );
        fish.addActionListener( this );
        certificateNum.addActionListener( this );
        back.addActionListener( this );
        register.addActionListener( this );

        if( dog.isSelected() ){
            model.allowedPets.add("Dog");
        }
        if( cat.isSelected() ){
            model.allowedPets.add("Cat");
        }
        if( bird.isSelected() ){
            model.allowedPets.add("Bird");
        }
        if( fish.isSelected() ){
            model.allowedPets.add("Fish");
        }


    }

    public void insertToDB(){
    }

    public void actionPerformed( ActionEvent e){

        if(e.getActionCommand().equals("back")){
            isBack = true;
        }

        if(e.getActionCommand().equals("register")){
            isRegistered = true;
        	
            /*if ( !(model.checkMatchingPasswords( password1.getText(), password2.getText()) && model.checkCertificate(
                    certificateNum.getText() )) ){
                JOptionPane.showMessageDialog(null, "Passwords don't match! Please enter" +
                        " again. \n" + "Wrong certificate number! Please enter again.");


            }
            else if( !(model.checkMatchingPasswords( String.valueOf(password1.getText()), String.valueOf(
                    password2.getText()) ))){
                JOptionPane.showMessageDialog(null, "Passwords don't match! Please enter" +
                        " again.");
            }
            else if( !( model.checkCertificate( String.valueOf(certificateNum.getText()) )) ){
                JOptionPane.showMessageDialog(null, "Wrong certificate number! Please enter" +
                        " again.");
            }
            else{
                JOptionPane.showMessageDialog(null, "register");
            }*/
            isRegister = true;
        }
    }
}