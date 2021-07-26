import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.DimensionUIResource;


/**
 *
 * @author Zeynep Hanife Akgül
 */

public class CareTakers extends JPanel implements ActionListener
{
    //properties
    JLabel logo;
    JButton back;
    ArrayList<String> person;
    ArrayList<String> person2;
    ArrayList<JLabel> careTakersLabel;
    ArrayList<ArrayList<String>> careTakers;
    JPanel bigPane;
    


    public CareTakers()
    {
        person = new ArrayList<>();
        person2 = new ArrayList<>();
        person.add( "Zeynep");
        person.add( "19");
        person.add( "5");
        person.add( "Zeynep@mail");
        person2.add( "aaLi");
        person2.add( "20");
        person2.add( "4");
        person2.add( "alli@mail");

        //careTakers = DBConnection.getCareTakers();
        careTakers = new ArrayList<>();
        careTakers.add( person);
        careTakers.add( person2);
        
        careTakersLabel = new ArrayList<>();
        GridLayout la = new GridLayout( 1 ,4);
        Border border = BorderFactory.createLineBorder( Color.ORANGE, 2);
        
        //creating labels for each caretaker
        for( int i = 0; i < careTakers.size(); i++)
        {
            JLabel lab = new JLabel();
            lab.setLayout( la);
            //lab.setBorder( border);

            for( int a = 0; a < careTakers.get(i).size(); a++)
            {
                JLabel properties = new JLabel( careTakers.get(i).get(a), SwingConstants.CENTER);
                properties.setBorder( border);
                lab.add( properties, BorderLayout.CENTER);
            }

            careTakersLabel.add( lab);
        }

        //creating labels for headings in caretakers' table
        JLabel headings = new JLabel();
        ArrayList<String> heads = new ArrayList<>();
        GridLayout headLay = new GridLayout( 1, 4);
        heads.add( "Name");
        heads.add( "Age");
        heads.add( "Experienced Years");
        heads.add( "Contact Info");
        headings.setLayout( headLay);
        for( int z = heads.size() - 1; z >= 0 ; z--)
        {
            JLabel h = new JLabel( heads.get( z), SwingConstants.CENTER);
            h.setBorder( border);
            h.setBackground( Color.LIGHT_GRAY);
            h.setOpaque( true);
            headings.add( h, SwingConstants.CENTER);
        }


        //adding each caretaker to a panel
        JPanel p = new JPanel();
        GridLayout lay = new GridLayout( careTakersLabel.size(), 1);
        FlowLayout fl = new FlowLayout();
        //p.setLayout( fl);
        p.setLayout( lay);
        p.setSize( 100, 100);

        for( int i = 0; i < careTakersLabel.size(); i++)
        {
            p.add( careTakersLabel.get( i));
        }


        //creating back menu
        back = new JButton( "Back");
        back.setBackground( Color.RED);
        back.setForeground( Color.WHITE);
        back.setOpaque( true);
        JLabel backMenu = new JLabel();
        backMenu.setLayout( new FlowLayout( 2));
        backMenu.add( back, SwingConstants.CENTER);
        back.addActionListener( this);

        //creating title menu
        logo = new JLabel( "Logo");
        logo.setBackground( Color.RED);
        logo.setForeground( Color.WHITE);
        logo.setOpaque( true);
        JLabel title = new JLabel( "Caretakers of " + "Hotel");
        JLabel titleMenu = new JLabel();
        titleMenu.setBackground( Color.GREEN);
        titleMenu.setOpaque( true);
        titleMenu.setLayout( new FlowLayout( 1, 10, 10));
        titleMenu.add( logo);
        titleMenu.add( title);
        titleMenu.add( new JLabel());

        /*JScrollPane scrollPane = new JScrollPane( p);
        scrollPane.setSize( 100, 100);
        scrollPane.setHorizontalScrollBarPolicy( JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setVerticalScrollBarPolicy( JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);*/

        bigPane = new JPanel();
        bigPane.setLayout( new GridLayout( 2, 1));
        bigPane.add( headings);
        bigPane.add( p);
        setLayout( new GridLayout( 3, 1));
        
        add( titleMenu, BorderLayout.NORTH);
        add( bigPane, BorderLayout.CENTER);
        add( backMenu, BorderLayout.SOUTH);
        
        //add( scrollPane, BorderLayout.CENTER);
        JFrame f = new JFrame();
        f.setBounds( 500, 200, 500, 500);
        f.setSize( 500, 500);
        f.add( this, BorderLayout.CENTER);
        f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible( true);
    }


    public static void main( String[] args)
    {
        //CareTakers t = new CareTakers();

        // Frame initiallization
        JFrame f = new JFrame();
  
        // Frame Title
        f.setTitle("JTable Example");
  
        // Data to be displayed in the JTable
        String[][] data = {
            { "Kundan Kumar Jha", "4031", "CSE" },
            { "Anand Jha", "6014", "IT" }
        };
  
        // Column Names
        String[] columnNames = { "Name", "Roll Number", "Department" };
  
        // Initializing the JTable
        JTable j;
        j = new JTable(data, columnNames);
        j.setBounds(30, 40, 200, 300);
  
        // adding it to JScrollPane
        JScrollPane sp = new JScrollPane(j);
        f.add(sp);
        // Frame Size
        f.setSize(500, 200);
        f.setVisible( true);
    }

    @Override
    public void actionPerformed( ActionEvent e) 
    {
        if( e.getSource() == back)
        {
            JOptionPane.showMessageDialog(null, "hotel info page");
        }
        
    }
}