import java.sql.*;
import java.util.ArrayList;

import javax.swing.ImageIcon;

/**
 * Class to connect to the database
 * @author Zeynep Hanife Akgül
 */

public class DBConnection 
{
    //Properties
    static Connection c = null;
    static Statement stmt = null;

    //Constructor
    public DBConnection()
    {
        //try connectting to DB
        try
        {
            Class.forName( "org.sqlite.JDBC");
            //Write location of the database file datab.db to be connected
            c = DriverManager.getConnection( "jdbc:sqlite:C:\\Users\\zeyne\\cs102\\Project_Summer\\PetHotel.db");
            
            System.out.println( "Connected to DB");
        } catch ( Exception e) 
        {
            System.out.println( "Error: " + e.getMessage());
        }
    }

    //methods
    public static ArrayList<ArrayList<String>> getCareTakers( String hotelName)
    {
        hotelName = hotelName + "Takers";
        DBConnection db = new DBConnection();

        ArrayList<String> personInfo = new ArrayList<>();
        ArrayList<ArrayList<String>> takers = new ArrayList<>();
        String taker = "";

        try 
        {
            stmt = c.createStatement();

            ResultSet rs = stmt.executeQuery( "SELECT * FROM '"+hotelName+"'");

            while( rs.next())
            {
                String name = rs.getString( "name");
                personInfo.add( name);
                int age = rs.getInt( "age");
                personInfo.add( "" + age);
                String experience = rs.getString( "experienced_years");
                personInfo.add( experience);
                String contact = rs.getString( "contact");
                personInfo.add( contact);
                takers.add( personInfo);
                personInfo.clear();
            }

        } catch( Exception e)
        {
            System.out.println( "Error: " + e);
        }
        return takers;
    }

    public ArrayList<ArrayList<String>> getAllRoomsOf( String hotelName)
    {
        hotelName = hotelName + "Rooms";

        DBConnection db = new DBConnection();

        ArrayList<String> roomInfo = new ArrayList<>();
        ArrayList<ArrayList<String>> rooms = new ArrayList<>();
        String room = "";

        try 
        {
            stmt = c.createStatement();

            ResultSet rs = stmt.executeQuery( "SELECT * FROM '"+hotelName+"'");

            while( rs.next())
            {
                int roomNo = rs.getInt( "roomNo");
                roomInfo.add( "" + roomNo);
                String availabity = rs.getString( "availabity");
                roomInfo.add( availabity);
                String owner = rs.getString( "owner");
                roomInfo.add( owner);
                rooms.add( roomInfo);
                roomInfo.clear();
            }

        } catch( Exception e)
        {
            System.out.println( "Error: " + e);
        }
        return rooms;
    }

    /** 
     * Finds password of given username from the database
     * @param username
     * @return String password of given username
     * @author Zeynep Akgul
     */
    public static String getPasswordOfUsername( String username)
    {
        DBConnection db = new DBConnection();

        String password = "";

        try 
        {
            stmt = c.createStatement();

            ResultSet passwordRs = stmt.executeQuery( "SELECT password FROM users WHERE username = '"+username+"'");

            while( passwordRs.next())
            {
                password = passwordRs.getString( "password");
            }

        } catch( Exception e)
        {
            System.out.println( "Error: " + e);
        }

        return password;
    }

    
    /** 
     * Checks if the given password matches with given username's password on the database
     * @param username
     * @param password
     * @return Boolean true if password matches with given username's password on the database
     * @author Zeynep Akgul
     */
    public static Boolean checkPassword( String username, String password)
    {
        DBConnection db = new DBConnection();

        if( password.equals( getPasswordOfUsername( username)))
        {
            //JOptionPane.showMessageDialog( null, "login succesful");
            return true;
        }
        //else
        //JOptionPane.showMessageDialog( null, "wrong username or password");
        return false;
    }

        /** 
     * Finds the age of given username from the database
     * @param username of user to be searched
     * @return int age name of user
     * @author Zeynep Akgul
     */
    public static int getAgeOfUsername( String username)
    {
        int age = 0;

        DBConnection db = new DBConnection();

        try 
        {
            stmt = c.createStatement();

            ResultSet ageRs = stmt.executeQuery( "SELECT age FROM users WHERE username = '"+username+"'");

            while( ageRs.next())
            {
                age = ageRs.getInt( "age");
            }
            
        } catch( Exception e)
        {
            System.out.println( "Error: " + e);
        }

        return age;
    }

    
    /** 
     * Finds the email of given username from the database
     * @param username of user to be searched
     * @return String email of user
     * @author Zeynep Akgul
     */
    public static String getEmailOfUsername( String username)
    {
        String email = "";

        DBConnection db = new DBConnection();

        try 
        {
            stmt = c.createStatement();

            ResultSet emailRs = stmt.executeQuery( "SELECT email FROM users WHERE username = '"+username+"'");

            while( emailRs.next())
            {
                email = emailRs.getString( "email");
            }
            
        } catch( Exception e)
        {
            System.out.println( "Error: " + e);
        }

        return email;
    }

    /** 
     * Finds photos of given hotel from database and returns it 
     * @param hotelName of hotel
     * @author Zeynep Akgul
     */
    public static ArrayList<ImageIcon> getPhotosOfItem( String hotelName)
    {
        DBConnection db = new DBConnection();
        ArrayList<ImageIcon> photos = new ArrayList<>();

        ImageIcon image = null;
        //im.getScaledInstance(bLab.getWidth(), bLab.getHeight(), Image.SCALE_SMOOTH);

        try 
        {
            stmt = c.createStatement();

            ResultSet imageRs = stmt.executeQuery( "SELECT image FROM '"+hotelName+"'");

            while( imageRs.next())
            {
                //byte[] img = imageRs.getBytes( "image");
                image = (ImageIcon) imageRs.getBlob( "image");
                photos.add( image);
            }
        } catch( Exception e)
        {
            System.out.println( "Error image: " + e);
        }
        return photos;
    }

    /** 
     * Finds all users present in the database and prints their properties
     * @author Zeynep Akgul
     */
    public static void listUsers()
    {
        DBConnection db = new DBConnection();

        try 
        {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery( "SELECT * FROM users");

            while( rs.next())
            {
                String name = rs.getString( "name");
                String username = rs.getString( "username");
                String password = rs.getString( "password");
                String email = rs.getString( "email");
                int age = rs.getInt( "age");

                System.out.println( "\nName: " + name + "\nUsername: " + username + "\nAge: " + age 
                                    + "\nemail: " + email);
            }

        } catch ( Exception e) 
        {
            System.out.println( "Error: " + e.getMessage());
        }
    }

    /** 
     * Finds logo of given hotel from database and returns it 
     * @param hotelName of hotel
     * @return ImageIcon of hotel logo
     * @author Zeynep Akgul
     */
    public static ImageIcon getLogoOfHotel( String hotelName)
    {
        DBConnection db = new DBConnection();

        ImageIcon image = null;
        //im.getScaledInstance(bLab.getWidth(), bLab.getHeight(), Image.SCALE_SMOOTH);

        try 
        {
            stmt = c.createStatement();

            ResultSet imageRs = stmt.executeQuery( "SELECT logo FROM '"+hotelName+"'");

            while( imageRs.next())
            {
                //byte[] img = imageRs.getBytes( "image");
                image = (ImageIcon) imageRs.getBlob( "logo");
            }
        } catch( Exception e)
        {
            System.out.println( "Error image: " + e);
        }
        return image;
    }

    /** 
     * Finds wishes of given hotel from database and returns it 
     * @param hotelName of hotel
     * @return ImageIcon of hotel logo
     * @author Zeynep Akgul
     */
    public static ArrayList<String> getWishesOfHotel( String hotelName)
    {
        DBConnection db = new DBConnection();
        ArrayList<String> wishes = new ArrayList<>();

        try 
        {
            stmt = c.createStatement();

            ResultSet wishesRs = stmt.executeQuery( "SELECT wishes FROM '"+hotelName+"'");

            while( wishesRs.next())
            {
                wishes.add( wishesRs.getString( "wishes"));
            }
        } catch( Exception e)
        {
            System.out.println( "Error image: " + e);
        }
        return wishes;
    }

    /** 
     * Closes all connections to made to database
     * @author Zeynep Akgul
     */
    public void closeConnections()
    {
        try 
        {
            c.close();
        } catch (Exception e) 
        {
            //error
        }
    }
    
    /** 
     * executes given String to find representation in SQLite language
     * @param query to be executed
     * @author Zeynep Akgul
     */
    public void executeQuery( String query)
    {
        try 
        {
            stmt = c.createStatement();
            stmt.executeQuery( query);
        } catch (Exception e) 
        {
            //error
        }
    }

    public static void main(String[] args) 
    {
        DBConnection d = new DBConnection();
        System.out.println( DBConnection.getCareTakers( "CatHotel"));
        
    }
}
