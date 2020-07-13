/**
 * <h>DetailsClass.java</h>
 * <p>
 *     This class is used to get the information of the customers,contractors and the architects
 *     And display the information in a user-friendly manner
 * </p>
 *
 * <p1>
 *   The main class called DetailsClass is the class that has all of the method and the other class are an extension of
 *   this class
 *
 *   The method in the class receives inputs from the user and has while loop to check if the inputs are correct
 *
 *   The is a toString method the displays the information in a user friendly manner
 * </p1>
 *
 *  @param name this is a String attribute used to store the name inputted by the user
 *
 *  @param telNo this is a String attribute used to store the telephone number inputted by the user
 *
 *  @param email this is a String attribute used to store the email address inputted by the user
 *
 *  @param phyAddress this is a String attribute used to store the physical address inputted by the user
 *
 *  @param output this is apart of the toString method that returns the information in a user_friendly manner
 *
 *  @param name2 this is used in a setter method that is used to set a variable to an attribute
 *
 *  @param telNo2 this is used in a setter method that is used to set a variable to an attribute
 *
 *  @param email2 this is used in a setter method that is used to set a variable to an attribute
 *
 *  @param phyAddress2 this is used in a setter method that is used to set a variable to an attribute
 *
 *  @see DetailsClass
 *  @see DetailsClass#field
 *  @see DetailsClass#name
 *  @see DetailsClass#telNo
 *  @see DetailsClass#email
 *  @see DetailsClass#phyAddress
 *
 *  @see DetailsClass#DetailsClass()
 *  @see DetailsClass#setName()
 *  @see DetailsClass#setName(String)
 *  @see DetailsClass#getName()
 *  @see DetailsClass#setTelNo()
 *  @see DetailsClass#setTelNo2(String)
 *  @see DetailsClass#getTelNo()
 *  @see DetailsClass#setEmail()
 *  @see DetailsClass#setEmail2(String)
 *  @see DetailsClass#getEmail()
 *  @see DetailsClass#setPhyAddress()
 *  @see DetailsClass#setPhyAddress2(String)
 *  @see DetailsClass#getPhyAddress()
 *  @see DetailsClass#toString()
 *
 *  @see package.java.util.*
 *
 *
 * @author Shaakir Caroto
 * @version 1.00
 * @since 19-05-2020
 */

// Imported package that is used in the processing of data

import java.util.*;

class DetailsClass {

    // The classes attributes
    // This attributes are share by the below classes (ArcClass and ConClass)

    String name, telNo, email, phyAddress;

    /**
     * DetailsClass
     *
     * The classes constructor method used to initialize the attributes declared in the class
     * This is also used to create a link between the mainInt the main class so that it is able to used it methods
     * to process inputted data by the user of text files
     *
     * This is the class that is inherit by the other class to reduce the amount of lines of code and number of class
     * for better readability
     *
     * @see #DetailsClass()
     *
     */

    public DetailsClass() {

        // Initializing the attributes with a variable of making it a place holder so it can be worked with

        this.name = "";
        this.telNo = "";
        this.email = "";
        this.phyAddress = "";
    }

    /**
     * setName
     *
     * This void method set the name that the user inputs by using a scanner for the java.util.*
     * package and the method has a while true loop to make sure the input and the variable is not
     * empty or does not equal nothing
     *
     * If the variable has a value then the method will set the value to the attribute and break the while loop
     *
     * There is no return method as the method is a void
     *
     * @see #setName()
     * @see package.java #java.until.*
     */

    public void setName() {

        // String variable used to store the users input
        String name;

        // A while true loop to repeat going through the lines of code
        while (true) {
            // The scanner object to get an input for the user
            Scanner sc = new Scanner(System.in);

            // Storing the input in the string variable
            name = sc.nextLine();

            //Checks if the input is correct if the user input something and the variable is not empty
            if (name.equals("") | name.isEmpty()) {

                // Displays the following messages to the user to inform the user what happened
                System.out.println("Please try again");
                System.out.print("Please re-enter the name: ");
            } else {
                // Else if the variable has a input that is correct the value of the variable will be stored in the
                // Attribute and break the while loop
                this.name = name;
                break;
            }
        }

    }

    /**
     * setName2
     *
     * This void method is a  setter that is used to receive an input from the user and set the input to the correct
     * class attribute.
     *
     * This is not scanner used in this method and therefore the method needs a parameter to set the variable, this
     * will be uses to receive a data variable from a text file of if the user wish to change a specific part of the
     * information displayed to the user
     *
     * This used in the alternative naming method in the ProClass class to create a project name
     *
     *
     * @param name2  this is used to store the user input went the user wants to update an aspect of the information
     *               found by the search method in the class mainInt
     *
     * @see ProClass#setName2(String, String)
     * @see #setName2(String)
     */

    public void setName2(String name2){
        // Setting the variable to the attribute without the uses of a scanner
        this.name = name2;
    }

    /**
     * getName
     *
     * This is the getter string method that return the value the attribute is set too and returns it to the user
     *
     * @see #getName()
     * @return name
     */

    public String getName() {
        // This method is a getter method and just returns the value that is storing the attribute
        return name;
    }

    /**
     * setTelNo
     *
     * This void method set the Telephone number that the user inputs by using a scanner for the java.util.*
     * package and the method has a while true loop to make sure the input and the variable is not
     * empty or does not equal nothing
     *
     * If the variable has a value then the method will set the value to the attribute and break the while loop
     *
     * There is no return method as the method is a void
     *
     * @see #setTelNo()
     * @see package.java #java.until.*
     */

    public void setTelNo() {

        // String variable used to store the users input
        String telNo;

        // A while true loop to repeat going through the lines of code
        while (true) {
            // The scanner object to get an input for the user
            Scanner sc = new Scanner(System.in);

            // Storing the input in the string variable
            telNo = sc.nextLine();

            //Checks if the input is correct if the user input something and the variable is not empty
            // And if the length of the input is not more or less the 10
            if (telNo.equals("") | telNo.isEmpty() | telNo.length() < 10 | telNo.length() > 10) {

                // Displays the following messages to the user to inform the user what happened
                System.out.println("Please try again");
                System.out.print("Please re-enter the telephone number: ");
            } else {

                // Else if the variable has a input that is correct the value of the variable will be stored in the
                // Attribute and break the while loop
                this.telNo = telNo;
                break;
            }
        }
    }

    /**
     * setTelNo2
     *
     * This void method is a  setter that is used to receive an input from the user and set the input to the correct
     * class attribute.
     *
     * This is not scanner used in this method and therefore the method needs a parameter to set the variable,this
     * will be uses to receive a data variable from a text file of if the user wish to change a specific part of the
     * information displayed to the user
     *
     * @param telNo2 this is used to store the user input went the user wants to update an aspect of the information
     *               found by the search method in the class mainInt
     *
     * @see #setTelNo2(String)
     */

    public void setTelNo2(String telNo2){
        // Setting the variable to the attribute without the uses of a scanner
        this.telNo = telNo2;
    }

    /**
     * getTelNo
     *
     * This is the getter string method that return the value the attribute is set too and returns it to the user
     *
     * @see #getTelNo()
     * @return telNo
     */

    public String getTelNo() {
        // This method is a getter method and just returns the value that is storing the attribute
        return telNo;
    }

    /**
     * setEmail
     *
     * This void method set the name that the user inputs by using a scanner for the java.util.*
     * package and the method has a while true loop to make sure the input and the variable is not
     * empty or does not equal nothing
     *
     * If the variable has a value then the method will set the value to the attribute and break the while loop
     *
     * There is no return method as the method is a void
     *
     * @see #setEmail()
     * @see package.java #java.until.*
     */

    public void setEmail(){
        // String variable used to store the users input
        String email;

        // A while true loop to repeat going through the lines of code
        while(true){
            // The scanner object to get an input for the user
            Scanner sc = new Scanner(System.in);

            // Storing the input in the string variable

            email = sc.nextLine();

            //Checks if the input is correct if the user input something and the variable is not empty
            if (email.equals("") | email.isEmpty()) {
                // Displays the following messages to the user to inform the user what happened
                System.out.println("Please try again");
                System.out.print("Please re-enter the telephone number: ");
            } else {
                // Else if the variable has a input that is correct the value of the variable will be stored in the
                // Attribute and break the while loop
                this.email = email;
                break;
            }
        }
    }

    /**
     * setEmail2
     *
     * This void method is a  setter that is used to receive an input from the user and set the input to the correct
     * class attribute.
     *
     * This is not scanner used in this method and therefore the method needs a parameter to set the variable, this
     * will be uses to receive a data variable from a text file of if the user wish to change a specific part of the
     * information displayed to the user
     *
     * @param email2 this is used to store the user input went the user wants to update an aspect of the information
     *               found by the search method in the class mainInt
     *
     * @see #setEmail2(String)
     */

    public void setEmail2(String email2) {
        // Setting the variable to the attribute without the uses of a scanner
        this.email = email2;
    }

    /**
     * getEmail
     *
     * This is the getter string method that return the value the attribute is set too and returns it to the user
     *
     * @see #getEmail()
     * @return email
     */

    public String getEmail() {
        // This method is a getter method and just returns the value that is storing the attribute
        return email;
    }

    /**
     * setPhyAddress
     *
     * This void method set the name that the user inputs by using a scanner for the java.util.*
     * package and the method has a while true loop to make sure the input and the variable is not
     * empty or does not equal nothing
     *
     * If the variable has a value then the method will set the value to the attribute and break the while loop
     *
     * There is no return method as the method is a void
     *
     * @see #setPhyAddress()
     * @see package.java #java.until.*
     */

    public void setPhyAddress(){

        // String variable used to store the users input
        String phyAddress;

        // A while true loop to repeat going through the lines of code
        while (true) {

            // The scanner object to get an input for the user
            Scanner sc = new Scanner(System.in);

            // Storing the input in the string variable
            phyAddress = sc.nextLine();

            //Checks if the input is correct if the user input something and the variable is not empty
            if (phyAddress.equals("") | phyAddress.isEmpty() ) {
                // Displays the following messages to the user to inform the user what happened
                System.out.println("Please try again");
                System.out.print("Please re-enter the telephone number: ");
            } else {
                // Else if the variable has a input that is correct the value of the variable will be stored in the
                // Attribute and break the while loop
                this.phyAddress = phyAddress;
                break;
            }
        }
    }

     /**
     * setPhyAddress2
     *
     * This void method is a  setter that is used to receive an input from the user and set the input to the correct
     * class attribute.
     *
     * This is not scanner used in this method and therefore the method needs a parameter to set the variable, this
     * will be uses to receive a data variable from a text file of if the user wish to change a specific part of the
     * information displayed to the user
     *
     * @param phyAddress2 this is used to store the user input went the user wants to update an aspect of the information
     *                    found by the search method in the class mainInt
     *
     * @see #setPhyAddress2(String)
     */

    public void setPhyAddress2(String phyAddress2) {
        // Setting the variable to the attribute without the uses of a scanner
        this.phyAddress = phyAddress2;
    }

    /**
     * getPhyAddress
     *
     * This is the getter string method that return the value the attribute is set too and returns it to the user
     *
     * @see #getPhyAddress()
     * @return phyAddress
     */

    public String getPhyAddress() {
        // This method is a getter method and just returns the value that is storing the attribute
        return phyAddress;
    }

    /**
     * toString
     *
     * This is a toString method that has all of the information collected for the above methods and displays them in
     * a user-friendly and neat manner
     *
     * This method uses the getter method above to get the information that is needed to be displayed
     *
     * @return output
     * @see #toString()
     */

    public String toString(){
        // This is the toString method that displays all of the information gathered from the above methods
        // To display a user-friendly summary of all the information received
        String output = "The customer's information: \n";
               output += "Full Name : " + getName() + "\n";
               output += "Telephone Number : " + getTelNo() + "\n";
               output += "Email Address: " + getEmail() + "\n";
               output += "Physical Address: " + getPhyAddress();

        // Return the information stored in the string variable
        return output;
    }
}

/**
 * ConClass
 *
 * This class inherit the methods for DetailsClass above
 * but the class has its own toString method that uses the inherited get methods to collect the information needed
 *
 * The class inherits all of the attributes, getter and setter methods to collect and store the information inputted
 * by the user
 *
 * @see ConClass
 * @see ConClass#ConClass()
 * @see ConClass#toString()
 * @extends DetailsClass
*/

class ConClass extends DetailsClass{

    /**
     * ConClass
     *
     * This constructor is created to link mainInt class with ConClass and to create the inheritance link between
     * ConClass and DetailsClass by using the super function
     *
     * This doesn't have any methods as it shares the methods with the DetailsClass and therefore has most of its
     * function above
     *
     * The classes constructor method used establish the inherited link between the class called DetailsClass
     * This is also used to create a link between the mainInt the main class so that it is able to used it methods
     * to process inputted data by the user of text files
     *
     * @see #ConClass()
     * @see super()
     */

    public ConClass(){

        // "super()" is used to link the attributes in the inherited class above

        super();
    }

    /**
     * toString
     *
     * This method uses the method that were inherited by the DetailsClass and displays everything in a user-friendly
     * manner
     *
     * @see #toString()
     * @return output
     */

    public String toString(){
        // This is the toString method that displays all of the information gathered from the above methods
        // To display a user-friendly summary of all the information received
        String output = "The contractor's details: \n";
        output += "Full Name : " + super.getName() + "\n";
        output += "Telephone Number : " + super.getTelNo() + "\n";
        output += "Email Address: " + super.getEmail() + "\n";
        output += "Physical Address: " + super.getPhyAddress();

        // Return the information stored in the string variable
        return output;
    }

}

/**
 * ArcClass
 *
 * This class inherit the methods for DetailsClass above
 * but the class has its own toString method that uses the inherited get methods to collect the information needed
 *
 * The class inherits all of the attributes, getter and setter methods to collect and store the information inputted
 * by the user
 *
 * @see ArcClass
 * @see ArcClass#ArcClass()
 * @see ArcClass#toString()
 *
 * @extends DetailsClass
*/

class ArcClass extends DetailsClass{

    /**
     * ArcClass
     *
     * This constructor is created to link mainInt class with ArcClass and to create the inheritance link between
     * ArcClass and DetailsClass by using the super function
     *
     * This doesn't have any methods as it shares the methods with the DetailsClass and therefore has most of its
     * function above
     *
     * The classes constructor method used establish the inherited link between the class called DetailsClass
     * This is also used to create a link between the mainInt the main class so that it is able to used it methods
     * to process inputted data by the user of text files
     *
     * @see #ArcClass()
     * @see super()
     */


    public ArcClass(){

        // "super()" is used to link the attributes in the inherited class above

        super();
    }

    /**
     * toString
     *
     * This method uses the method that were inherited by the DetailsClass and displays everything in a user-friendly
     * manner
     *
     * @see #toString()
     * @return output
     */

    public String toString(){
        // This is the toString method that displays all of the information gathered from the above methods
        // To display a user-friendly summary of all the information received
        String output = "The architect's details: \n";
        output += "Full Name : " + super.getName() + "\n";
        output += "Telephone Number : " + super.getTelNo() + "\n";
        output += "Email Address: " + super.getEmail() + "\n";
        output += "Physical Address: " + super.getPhyAddress();

        // Return the information stored in the string variable
        return output;
    }

}