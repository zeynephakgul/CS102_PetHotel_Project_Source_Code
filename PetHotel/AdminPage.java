package PetHotel;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * Admin page class
 * @author Zeynep Hanife Akgül
 */

public class AdminPage extends javax.swing.JPanel 
{

    public AdminPage() 
    {
        initComponents();
    }
                         
    private void initComponents() 
    {
        //initializing variables
        jMenu1 = new javax.swing.JMenu();
        jLabel8 = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        MainPage = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        menuName = new javax.swing.JLabel();
        Menu = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        takerPanel = new javax.swing.JPanel();
        bioPanel = new javax.swing.JPanel();
        saveTaker1 = new javax.swing.JButton();
        viewTakers1 = new javax.swing.JButton();
        takersExper1 = new javax.swing.JLabel();
        addNewCaretaker1 = new javax.swing.JLabel();
        tAgeText1 = new javax.swing.JTextField();
        takersName1 = new javax.swing.JLabel();
        tNameText1 = new javax.swing.JTextField();
        takersAge1 = new javax.swing.JLabel();
        tExperText1 = new javax.swing.JTextField();
        tContactText1 = new javax.swing.JTextField();
        takersCont1 = new javax.swing.JLabel();
        currentBio = new javax.swing.JLabel();
        bioLab = new javax.swing.JLabel();
        writeNewBio = new javax.swing.JLabel();
        newBioText = new javax.swing.JTextField();
        saveBio = new javax.swing.JButton();
        ImageIcon icon = new ImageIcon( "images//pet_hotel_logo.png" );
        icon.getImage().getScaledInstance(10, 10, Image.SCALE_DEFAULT);
        isLogOut = false;

        //jMenu1.setText("jMenu1");

        //jLabel8.setText("jLabel8");

        Logo.setIcon( icon );

        Name.setFont(new java.awt.Font("Maiandra GD", 0, 24)); // NOI18N
        Name.setForeground(new java.awt.Color(0, 102, 0));
        Name.setText("Admin Page");

        MainPage.setBackground(new java.awt.Color(255, 153, 153));
        MainPage.setForeground(new java.awt.Color(255, 255, 255));
        MainPage.setText("Log out");
        MainPage.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                MainPageActionPerformed(evt);
            }
        });

        jButton1.setText("View Contact Info");

        jButton2.setText("Manage Logo");
        jButton2.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Manage Biography");
        jButton3.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("View Rented Rooms");

        jButton5.setText("Manage Caretakers");
        jButton5.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Manage Gallery");
        jButton6.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Manage Rooms");
        jButton7.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("View Wishes");

        menuName.setBackground(new java.awt.Color(0, 102, 0));
        menuName.setForeground(new java.awt.Color(255, 255, 255));
        menuName.setText("Page Name");
        menuName.setOpaque( true);

        Menu.setBackground(new java.awt.Color(0, 102, 0));
        Menu.setForeground(new java.awt.Color(255, 255, 255));
        Menu.setText("Menu");
        Menu.setOpaque( true);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 368, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 243, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MainPage)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(menuName, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MainPage))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(menuName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );
    }   
    
    private void MainPageActionPerformed(java.awt.event.ActionEvent evt) 
    {                                         
        isLogOut = true;
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) 
    {                                         
        // TODO add your handling code here:
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) 
    {  
        mainPanel.removeAll();
        
        menuName.setText("Manage Biography");

        currentBio.setBackground(new java.awt.Color(204, 255, 204));
        currentBio.setText("Current Biograpy:");

        bioLab.setText("Our Hotel provides a safe environment for pets");

        writeNewBio.setBackground(new java.awt.Color(204, 255, 204));
        writeNewBio.setText("Write a New Biography:");


        saveBio.setText("Save");
        saveBio.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                saveBioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bioPanelLayout = new javax.swing.GroupLayout(bioPanel);
        bioPanel.setLayout(bioPanelLayout);
        bioPanelLayout.setHorizontalGroup(
            bioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bioPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(bioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bioLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newBioText)
                    .addComponent(currentBio, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(writeNewBio, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(saveBio)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        bioPanelLayout.setVerticalGroup(
            bioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bioPanelLayout.createSequentialGroup()
                .addGroup(bioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bioPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveBio))
                    .addGroup(bioPanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(currentBio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bioLab, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(writeNewBio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(newBioText, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bioPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bioPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }                                        

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) 
    {                                         
        // TODO add your handling code here:
    }                                        

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) 
    {                                         
        // TODO add your handling code here:
    }    
    
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) 
    {
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) 
    {
        mainPanel.removeAll();

        menuName.setText( "Manage Caretakers");
        
        saveTaker1.setBackground(new java.awt.Color(255, 255, 153));
        saveTaker1.setText("Save");
        saveTaker1.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                saveTaker1saveTakerActionPerformed(evt);
            }
        });

        viewTakers1.setBackground(new java.awt.Color(204, 255, 204));
        viewTakers1.setText("View Current Caretakers");
        viewTakers1.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                viewTakers1viewTakersActionPerformed(evt);
            }
        });

        takersExper1.setBackground(new java.awt.Color(255, 255, 153));
        takersExper1.setText("Experienced Years:");

        addNewCaretaker1.setBackground(new java.awt.Color(204, 255, 204));
        addNewCaretaker1.setText("Add a New Caretaker");

        takersName1.setBackground(new java.awt.Color(255, 255, 153));
        takersName1.setText("Caretaker's Name:");

        tNameText1.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                tNameText1tNameTextActionPerformed(evt);
            }
        });

        takersAge1.setBackground(new java.awt.Color(255, 255, 153));
        takersAge1.setText("Caretaker's age:");

        takersCont1.setBackground(new java.awt.Color(255, 255, 153));
        takersCont1.setText("Caretaker's Contact:");

        javax.swing.GroupLayout takerPanelLayout = new javax.swing.GroupLayout(takerPanel);
        takerPanel.setLayout(takerPanelLayout);
        takerPanelLayout.setHorizontalGroup(
            takerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(takerPanelLayout.createSequentialGroup()
                .addGroup(takerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(takerPanelLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(addNewCaretaker1))
                    .addGroup(takerPanelLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(viewTakers1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, takerPanelLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(takerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(saveTaker1)
                    .addGroup(takerPanelLayout.createSequentialGroup()
                        .addGroup(takerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(takersAge1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(takersName1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(takersCont1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(takersExper1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(34, 34, 34)
                        .addGroup(takerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tContactText1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tExperText1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tAgeText1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tNameText1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(74, 74, 74))
        );
        takerPanelLayout.setVerticalGroup(
            takerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(takerPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(addNewCaretaker1)
                .addGap(18, 18, 18)
                .addGroup(takerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tNameText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(takersName1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(takerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tAgeText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(takersAge1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(takerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tExperText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(takersExper1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(takerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tContactText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(takersCont1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saveTaker1)
                .addGap(13, 13, 13)
                .addComponent(viewTakers1)
                .addContainerGap())
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(takerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(takerPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );  
    }                                        

    private void saveTaker1saveTakerActionPerformed(java.awt.event.ActionEvent evt) 
    {                                                    
        // TODO add your handling code here:
    }
    
    private void saveBioActionPerformed(java.awt.event.ActionEvent evt) 
    {                                                    
        bioLab.setText( newBioText.getText());
    }

    private void viewTakers1viewTakersActionPerformed(java.awt.event.ActionEvent evt) 
    {                                                      
        // TODO add your handling code here:
    }                                                     

    private void tNameText1tNameTextActionPerformed(java.awt.event.ActionEvent evt) 
    {                                                    
        // TODO add your handling code here:
    }                                                   


    // Variables declaration - do not modify                     
    private javax.swing.JLabel Logo;
    private javax.swing.JButton MainPage;
    private javax.swing.JLabel Menu;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel addNewCaretaker;
    private javax.swing.JLabel addNewCaretaker1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel menuName;
    private javax.swing.JPanel pagePanel;
    private javax.swing.JButton saveTaker;
    private javax.swing.JButton saveTaker1;
    private javax.swing.JTextField tAgeText;
    private javax.swing.JTextField tAgeText1;
    private javax.swing.JTextField tContactText;
    private javax.swing.JTextField tContactText1;
    private javax.swing.JTextField tExperText;
    private javax.swing.JTextField tExperText1;
    private javax.swing.JTextField tNameText;
    private javax.swing.JTextField tNameText1;
    private javax.swing.JPanel takerPanel;
    private javax.swing.JPanel bioPanel;
    private javax.swing.JLabel takersAge;
    private javax.swing.JLabel takersAge1;
    private javax.swing.JLabel takersCont;
    private javax.swing.JLabel takersCont1;
    private javax.swing.JLabel takersExper;
    private javax.swing.JLabel takersExper1;
    private javax.swing.JLabel takersName;
    private javax.swing.JLabel takersName1;
    private javax.swing.JButton viewTakers;
    private javax.swing.JButton viewTakers1;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel currentBio;
    private javax.swing.JLabel bioLab;
    private javax.swing.JLabel writeNewBio;
    private javax.swing.JTextField newBioText;
    private javax.swing.JButton saveBio;

    boolean isLogOut;

    public static void main(String[] args) 
    {

        AdminPage m = new AdminPage();
        JFrame f = new JFrame();
        f.add( m);
        f.pack();
        f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        f.setVisible( true);
    }
}


