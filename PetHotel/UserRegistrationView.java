package PetHotel;
/*
 * this is view class for user registration part
 *
 * @author Cahit Çağın Karataş
 * */
import javax.swing.*;
import javax.swing.border.CompoundBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserRegistrationView extends JPanel implements RegistrationController, ActionListener {

    JPanel north;
    JPanel south;
    JPanel center;
    JLabel pageTitle;
    JLabel logo;
    JLabel information;
    JTextField username;
    JTextField mail;
    JTextField password1;
    JTextField password2;
    JComboBox<Integer> day;
    JComboBox<Integer> month;
    JComboBox<Integer> year;
    JButton back;
    JButton register;
    ImageIcon icon;
    UserRegistrationModel model;

    boolean isBack, isRegister, abc;


    public UserRegistrationView(){

        isBack = false;
        isRegister = false;
        abc = false;
        //Panels

        north = new JPanel();

        south = new JPanel();

        center = new JPanel();

        icon = new ImageIcon( "images//pet_hotel_logo.png" );


        //Page Title

        pageTitle = new JLabel();
        pageTitle.setBorder(null);
        pageTitle.setForeground( Color.RED );
        pageTitle.setFont(new Font( "title",Font.BOLD, 35 ) );
        pageTitle.setText( "User Registration" );

        //LOGO
        logo = new JLabel();
        logo.setIcon( icon );


        //TextFields
        information = new JLabel("Please fill the blanks :) ");

        username = new JTextField();
        username.setBorder( new CompoundBorder( BorderFactory.createTitledBorder( "Your name and surname" ), username.getBorder() ) );

        mail = new JTextField();
        mail.setBorder( new CompoundBorder( BorderFactory.createTitledBorder( "Your e-mail address" ), mail.getBorder() ) );

        password1 = new JTextField();
        password1.setBorder( new CompoundBorder( BorderFactory.createTitledBorder( "Please set a password" ), password1.getBorder() ) );

        password2 = new JTextField();
        password2.setBorder( new CompoundBorder( BorderFactory.createTitledBorder( "Repeat your password" ), password2.getBorder() ) );

        //Combo boxes
        day = new JComboBox<>();
        for(int i = 1; i <= 31; i++){
            day.addItem(i);
        }
        month = new JComboBox<>();
        for(int i = 1; i <= 12; i++){
            month.addItem(i);
        }
        year = new JComboBox<>();
        for(int i = 1920; i <= 2003; i++){
            year.addItem(i);
        }

        //JButton Back

        back = new JButton("Back");
        back.setBackground(Color.ORANGE);


        //JButton Register
        register = new JButton("Register!");
        register.setBackground(Color.ORANGE);


        setLayout(new GridLayout(3,0));

        north.setLayout(new BoxLayout(north,BoxLayout.X_AXIS));
        north.add( Box.createRigidArea( new Dimension( 100, 0 ) ) );
        north.add(logo);
        north.add( Box.createRigidArea( new Dimension( 100, 0 ) ) );
        north.add( pageTitle );
        north.add( Box.createRigidArea( new Dimension( 100, 0 ) ) );
        north.add( back );
        add( north );

        center.setLayout( new BoxLayout( center, BoxLayout.Y_AXIS ) );
        center.add( information );
        center.add( Box.createRigidArea( new Dimension( 0, 15 ) ) );
        center.add(username);
        center.add( Box.createRigidArea( new Dimension( 0, 15 ) ) );
        center.add(day);
        center.add(month);
        center.add(year);
        center.add( Box.createRigidArea( new Dimension( 0, 15 ) ) );
        center.add(mail);
        center.add( Box.createRigidArea( new Dimension( 0, 15 ) ) );
        center.add(password1);
        center.add( Box.createRigidArea( new Dimension( 0, 15 ) ) );
        center.add(password2);
        add( center );


        south.setLayout(new BoxLayout(south, BoxLayout.X_AXIS));
        south.add( Box.createRigidArea( new Dimension( 1700, 0 ) ) );
        south.add(register);
        add(south);




        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                if(e.getSource() == back){
                	abc = true;
                	isBack = true;
                    JOptionPane.showMessageDialog(null, "bye bye");
                }
            }
        });

        register.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("Register!")){
                    JOptionPane.showMessageDialog(null, "Registered");
                    isRegister = true;
                }
            }
        });

    }

    @Override
    public void insertToDB() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
/*
        if(e.getActionCommand().equals("Back")){
            //isBack = true;
            JOptionPane.showMessageDialog(null, "bye bye");
        }

        if(e.getActionCommand().equals("Register")){
            JOptionPane.showMessageDialog(null, "Registered");
            isRegister = true;
        }

*/
    }
}
