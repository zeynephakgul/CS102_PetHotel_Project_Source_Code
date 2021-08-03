package PetHotel;
/*
 * this is view class for pet registration part
 *
 * @author Cahit Çağın Karataş
 * */
import javax.swing.*;
import javax.swing.border.CompoundBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PetRegView extends JPanel implements RegistrationController, ActionListener {
    JPanel north;
    JPanel center;
    JPanel south;
    JLabel pageTitle;
    JLabel logo;
    JLabel image;
    JTextField petName;
    JTextField age;
    JLabel genderI;
    JLabel breedI;
    JComboBox<String> gender;
    JComboBox<String> breed;
    JButton back;
    JButton register;
    ImageIcon icon;
    
    // variables
    boolean isMain, keepFrameActive, isRegistered;


    public PetRegView(){

        north = new JPanel();
        center = new JPanel();
        south = new JPanel();
        pageTitle = new JLabel("Pet Registration");
        pageTitle.setFont(new Font("title",Font.BOLD, 35));
        pageTitle.setForeground(Color.RED);
        logo = new JLabel();
        image = new JLabel();
        petName = new JTextField(8);
        age = new JTextField(8);
        back = new JButton("Main Menu");
        back.setBackground(Color.ORANGE);
        register = new JButton("Register Your Pet");
        register.setBackground(Color.ORANGE);
        genderI = new JLabel("Select your pet's gender");
        breedI = new JLabel("Select your pet's breed");
        gender = new JComboBox<>();
        gender.addItem("Male");
        gender.addItem("Female");
        breed = new JComboBox<>();
        breed.addItem("Dog");
        breed.addItem("Cat");
        breed.addItem("Bird");
        breed.addItem("Fish");
        icon = new ImageIcon( "images//pet_hotel_logo.png" );
        isMain = false;
        keepFrameActive = false;
        isRegistered = false;

        logo.setIcon(icon);
        
        petName.setBorder( new CompoundBorder( BorderFactory.createTitledBorder( "Your pet's name" ), petName.getBorder() ) );
        age.setBorder( new CompoundBorder( BorderFactory.createTitledBorder( "Your pets age" ), age.getBorder() ) );

        setLayout(new GridLayout(3,1));

        north.setLayout( new BoxLayout( north, BoxLayout.X_AXIS ) );
        north.add( Box.createRigidArea( new Dimension( 100, 0 ) ) );
        north.add( logo );
        north.add( Box.createRigidArea( new Dimension( 100, 0 ) ) );
        north.add( pageTitle );
        north.add( Box.createRigidArea( new Dimension( 100, 0 ) ) );
        north.add( back );
        add( north );


        center.setLayout( new BoxLayout( center, BoxLayout.Y_AXIS ) );
        center.add( petName );
        center.add( Box.createRigidArea( new Dimension( 0, 20 ) ) );
        center.add(age);
        center.add( Box.createRigidArea( new Dimension( 0, 20 ) ) );
        center.add(genderI);
        center.add(gender);
        center.add( Box.createRigidArea( new Dimension( 0, 20 ) ) );
        center.add(breedI);
        center.add(breed);
        add(center);

        south.setLayout( new BoxLayout( south, BoxLayout.X_AXIS ) );
        south.add( Box.createRigidArea( new Dimension( 100, 0 ) ) );
        south.add( register );
        add( south );

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("Main Menu")){
                	keepFrameActive = true;
            		isMain = true;
                }
            }
        });

        register.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("Register Your Pet")){
                	isRegistered = true;
                }
            }
        });

    }




    @Override
    public void insertToDB() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
