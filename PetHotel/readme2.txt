Group g1G

List of Group Members:
Zeynep Hanife Akgül 22003356
Cahit Çağın Karataş 21802634
Alper Biçer 22003097
İlayda Zehra Yılmaz 22001769

Title: Pet Hotel Booking System

Description: A pet hotel booking system that includes various interfaces: 
User, Pet, Pet Hotel and Card Registration; Log in - Log out & Resetting Password If Forgotten; 
Reservation and Booking; Viewing Hotel Information; Caretakers’ List; User Profile; 
Main Page with an Account; Administrative Part’s Main Page.


Work Distribution:
· Zeynep Hanife Akgül: class MainPageWUser, class HotelInfoViewCont, class HotelInfoModel, 
class AdminPageModel, class AdminPageView, class AdminPageController, class CareTakers, 
class DBConnection
· Cahit Çağın Karataş: interface RegistrationController, class UserRegistrationModel,  
class UserRegistrationView, class PetRegModel, class PetRegView, interface MainPageView
· Alper Biçer: class LogInModel, class LogInController, class LogInView, class ForgotPassMVC, 
class UserProfileModel, class UserProfileView, class UserProfileController
· İlayda Zehra Yılmaz: class CardRegModel, class CardRegView, class HotelRegModel, class HotelRegView, 
class MainPageModel

Current status of the project:
All classes mentioned above are implemented and all are combined to switch in between. 
Even though DBConnection class exists, the project is not tested while being connected to the 
PetHotel.db database file. Regarding this problem, some classes, especially the ones related with 
the databases are not tested as well. Login and registration actions are not controlled, 
users can directly reach the main page. Program sometimes does not switch pages, this can be solved 
by rerunning the code.


Used technologies and sources:
· Basic implementations are made by using Java.
· SQLite databases are created for storing information.
· GUI is used to create interfaces.
· MVC is used as a design pattern.
· VSCode, IntelliJ, Eclipse, JCreator are used as coding environments.
· Java Mail API is used for sending confirmation email, if the user forgets password while logging in.
· sqlite-jdbc-3.7.2 jar file is used as a referenced library for database connections.
· GitHub is used for sharing and storing source codes.
· https://cacoo.com is used to make UML Diagrams.


Set up instructions:
All classes are involved in PetHotel package. That is why you need to create a package with that name, 
if there is not.

To connect to the database, the address of the PetHotel.db database file needs to be written 
in the commented part in the constructor of the DBConnection.java class.  sqlite-jdbc-3.7.2 jar 
file needs to be added as a referenced library.

Java Mail API is needed to be downloaded and added to the classpath for sending confirmation emails. 
Antivirus program’s smtp protection is needed to be deactivated. Sender email account which can be 
seen in the source code is needed to allow access from outside in the settings of the email account 
(allowing access from outside is done, this is just for your information).

PetHotelApp.java needs to be runned to start the application
