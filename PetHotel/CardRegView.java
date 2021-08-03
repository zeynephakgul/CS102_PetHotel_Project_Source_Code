package PetHotel;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * This is Card Registration page's view class. It displays the page and takes information needed.
 *
 * @author İlayda Zehra Yılmaz
 * @version 03/08/2021
 */

public class CardRegView extends JPanel implements RegistrationController, ActionListener {

    JPanel north;
    JPanel center;
    JPanel south;
    JLabel pageTitle;
    JLabel logo;
    JTextField cardNumber;
    JTextField cardName;
    JTextField expiryMonth;
    JTextField expiryYear;
    JTextField cardSecurityCode;
    JButton addCard;
    JButton profile;
    ImageIcon icon;
    CardRegModel model;

    boolean isCardSaved;

    public CardRegView(){
        north = new JPanel();
        center = new JPanel();
        south = new JPanel();
        icon = new ImageIcon( "images//pet_hotel_logo.png" );

        pageTitle = new JLabel();
        pageTitle.setBorder(null);
        pageTitle.setForeground(Color.RED);
        pageTitle.setFont(new Font("title",Font.BOLD, 20));
        pageTitle.setText( "CARD REGISTRATION");

        isCardSaved = false;

        logo = new JLabel();
        logo.setIcon(icon);

        cardNumber = new JTextField( 50 );
        cardName = new JTextField( 50 );
        expiryMonth = new JTextField( 5 );
        expiryYear = new JTextField( 5 );
        cardSecurityCode = new JTextField( 5 );
        addCard = new JButton( "Add Card");
        addCard.setBackground( Color.ORANGE );
        profile = new JButton( "profile");
        profile.setBackground( Color.ORANGE );
        model = new CardRegModel( this );

        //Set border titles
        cardNumber.setBorder( new CompoundBorder( BorderFactory.createTitledBorder( "Card Number" ),
                cardNumber.getBorder() ) );

        cardName.setBorder( new CompoundBorder( BorderFactory.createTitledBorder( "Card Name" ),
                cardName.getBorder() ) );

        expiryYear.setBorder( new CompoundBorder( BorderFactory.createTitledBorder( "Expiry Year" ),
                expiryYear.getBorder() ) );

        expiryMonth.setBorder( new CompoundBorder( BorderFactory.createTitledBorder( "Expiry Month" ),
                expiryMonth.getBorder() ) );

        cardSecurityCode.setBorder( new CompoundBorder( BorderFactory.createTitledBorder( "Card Security Code" ),
                cardSecurityCode.getBorder() ) );

        //Add components to panels
        setLayout( new GridLayout( 3, 1 ) );

        north.setLayout( new BoxLayout( north, BoxLayout.X_AXIS ) );
        north.add( logo );
        north.add( Box.createRigidArea( new Dimension( 150, 10 ) ) );
        north.add( pageTitle );
        north.add( Box.createRigidArea( new Dimension( 150, 10 ) ) );
        north.add( profile );
        add( north );

        center.setLayout( new BoxLayout( center, BoxLayout.Y_AXIS ) );
        center.add( cardNumber );
        center.add( Box.createRigidArea( new Dimension( 0, 10 ) ) );
        center.add( cardName );
        center.add( Box.createRigidArea( new Dimension( 0, 10 ) ) );
        center.add( expiryMonth );
        center.add( expiryYear );
        center.add( Box.createRigidArea( new Dimension( 0, 10 ) ) );
        center.add( cardSecurityCode );
        center.add( Box.createRigidArea( new Dimension( 0, 10 ) ) );
        add( center );

        south.setLayout( new BoxLayout( south, BoxLayout.X_AXIS));
        south.add( Box.createRigidArea( new Dimension( 300, 10 ) ) );
        south.add( addCard );
        add( south );

        if ( model.checkConditions(cardNumber.getText())){
            model.CardNum = cardNumber.getText();
        }

        cardNumber.addActionListener( this );
        cardName.addActionListener( this );
        expiryMonth.addActionListener( this );
        expiryYear.addActionListener( this );
        cardSecurityCode.addActionListener( this );
        profile.addActionListener( this );
        addCard.addActionListener( this );
    }

    public void insertToDB(){
    }

    public void actionPerformed(ActionEvent e){

        if(e.getActionCommand().equals("profile")){
            isCardSaved = true;
        }

        if(e.getActionCommand().equals("Add Card")){
            if ( !(model.checkConditions(cardNumber.getText()))){
                JOptionPane.showMessageDialog(null, "Credit Card is not valid ");
            }
            else{
                JOptionPane.showMessageDialog(null, "Added");
            }
            isCardSaved = true;
        }
    }


}
