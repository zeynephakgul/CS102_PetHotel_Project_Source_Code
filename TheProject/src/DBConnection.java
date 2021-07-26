import java.sql.*;
import java.util.ArrayList;

/**
 *
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
        //try connect to DB
        try 
        {
            Class.forName( "org.sqlite.JDBC");
            //Write location of the database file datab.db to be connected
            c = DriverManager.getConnection( "jdbc:sqlite:C:\\Users\\zeyne\\OneDrive\\Belgeler\\cs102_project\\datab.db");
            System.out.println( "Connected to DB");
        } catch ( Exception e) 
        {
            System.out.println( "Error: " + e.getMessage());
        }
    }

    //methods
    public static ArrayList<ArrayList<String>> getCareTakers()
    {
        ArrayList<String> personInfo = new ArrayList<>();
        ArrayList<ArrayList<String>> takers = new ArrayList<>();
        return takers;
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
                String city = rs.getString( "city");
                int zipCode = rs.getInt( "zipcode");
                int age = rs.getInt( "age");

                System.out.println( "\nName: " + name + "\nUsername: " + username + "\nAge: " + age 
                                    + "\nCity: " + city + "\nemail: " + email + "\nZipcode: " + zipCode);
            }

        } catch ( Exception e) 
        {
            System.out.println( "Error: " + e.getMessage());
        }
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
}
