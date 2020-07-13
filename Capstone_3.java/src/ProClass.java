/**
 *  <h>ProClass.java</h>
 *
 *  <p>
 *  This class is used to get the information of the projects and display them in user-friendly manner
 *  </p>
 *
 *  <p1>
 *   This class is the project class that stores and creates project
 *
 *   The method in the class receives inputs from the user and has while loop to check if the inputs are correct
 *
 *   The is a to_String method the displays the information in a user friendly manner
 *
 *  </p1>
 *
 * @param  num      This is an integer attribute
 *                  Stores the number of records in the text
 *                  Receives and Counts the number of records
 *                  Gives a record new record/project for to keep track of the number of projects and for indexing
 *
 * @param  name     This is a String attribute
 *                  Stores the project name
 *                  Receives a input from the user
 *                  Gives the project its name
 *
 * @param  buildType  This is a String attribute
 *                    Stores the building type
 *                    Receives an inputs from the user
 *                    Checks if the input is correct
 *                    Gives the projects its building type
 *
 * @param  phyAdress  This is a String attribute
 *                    Stores the Physical Address
 *                    Receives an inputs from the user
 *                    Checks if the input is correct
 *                    Gives the projects its Physical Address
 *
 * @param  ERF        This is a String attribute
 *                    Stores the ERF Number which is 21 digit number
 *                    Receives an inputs from the user
 *                    Checks if the input is correct
 *                    Gives the projects its ERF Number
 *
 * @param  dateDeadLine  This is a String attribute
 *                       Stores the Deadline date
 *                       Receives an inputs from the user
 *                       Checks if the input is correct
 *                       Gives the projects its Deadline date
 *
 * @param  totalFee      This is a Floating point attribute
 *                       Stores the Total amount of the project
 *                       Receives an inputs from the user
 *                       Checks if the input is correct
 *                       Gives the projects its Total amount
 *
 * @param  dateToFee     This is a Floating point attribute
 *                       Stores the Date to fee amount that the customer pays initially
 *                       Receives an inputs from the user
 *                       Checks if the input is correct
 *                       Gives the projects its Date to fee amount
 *
 * @param  outstandingBal   This is a Floating point attribute
 *                          Stores the Outstanding balance after the customer has paid
 *                          Receives an inputs from the user
 *                          Checks if the input is correct
 *                          Gives the projects its Outstanding balance
 *
 * @param completed    This is a String attribute
 *                     Stores in the date of the completed project
 *                     Receives an inputs from the user
 *                     Checks if the input is correct
 *                     Gives the project it Completion date
 *
 *
 * @see ProClass
 * @see ProClass#field
 * @see ProClass#num
 * @see ProClass#name
 * @see ProClass#buildType
 * @see ProClass#phyAdress
 * @see ProClass#ERF
 * @see ProClass#dateDeadLine
 * @see ProClass#totalFee
 * @see ProClass#dateToFee
 * @see ProClass#outstandingBal
 * @see ProClass#completed
 *
 * @see ProClass#ProClass()
 * @see ProClass#setNum()
 * @see ProClass#getNum()
 * @see ProClass#setName()
 * @see ProClass#setName2(String,String)
 * @see ProClass#setBuildType()
 * @see ProClass#getBuildType()
 * @see ProClass#setPhyAdress()
 * @see ProClass#getPhyAdress()
 * @see ProClass#setERF()
 * @see ProClass#getERF()
 * @see ProClass#setDateDeadLine()
 * @see ProClass#getDateDeadLine()
 * @see ProClass#setTotalFee()
 * @see ProClass#getTotalFee()
 * @see ProClass#setDateToFee()
 * @see ProClass#getDateToFee()
 * @see ProClass#setOutstandingBal(float, float)
 * @see ProClass#getOutstandingBal()
 * @see ProClass#setCompleted()
 * @see ProClass#getCompleted()
 * @see ProClass#toString()
 *
 * @see package.java.text.*
 * @see package.java.until.*
 * @see package.java.io.*
 *
 * @author Shaakir Caroto
 * @version 1.00
 * @since 19-05-2020
 *
 */

// Imported packages that is used in the processing of data

import java.io.*;
import java.text.*;
import java.util.*;

class ProClass{

    // The classes attributes

    int num;
    String name,buildType,phyAdress,ERF,dateDeadLine,completed;
    float totalFee,dateToFee, outstandingBal;

    /**
     * ProClass
     *
     * This is ProClass's constructor that initializes all of the attributes used in the class
     * and is also used to make the method accessible to the class mainInt
     *
     * The classes constructor method used to initialize the attributes declared in the class
     * This is also used to create a link between the mainInt the main class so that it is able to used it methods
     * to process inputted data by the user of text files
     *
     * @see #ProClass()
     *
     */

    public ProClass(){

       // Initializing the attributes with a variable of making it a place holder so it can be worked with

       num = 0;
       name = " ";
       buildType = " ";
       phyAdress = " ";
       ERF = " ";
       dateDeadLine = " ";
       totalFee = 0;
       dateToFee = 0;
       outstandingBal = 0;
       completed = "";
    }

    /**
     * setNum
     *
     * This method is called setNum
     *
     * This is a setter method
     * It is used to count the number of line the Project text file and store the number in the attribute num
     * which is then used for indexing the project and giving project its number
     *
     *
     * @throws IOException  This is due to the method using text files to calculate the number of project in the text
     *                      file
     *
     * @see #setNum ()
     * @see package.java #java.io.*
     */

    public void setNum () throws IOException {

        //Creating a integer variable for counting the number of record in the text file
        int num = 0;

        // Creating a BufferedReader object with a FileReader
        // To read the number of records in the text file
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\shaak\\Dropbox\\Shaakir Caroto-50216\\Introduction to Software Engineering\\Task 24\\Capstone_3.java\\src\\Projects.txt"));

        // While the BufferedReader object "br"
        // readLines does not equal nothing
        // the loop will constantly increase the counter until br.readLine equals nothing
        while (br.readLine() != null){
            // increasing num by 1
            num++;
        }

        // The attribute(num) equals the value of num + 1
        this.num = num + 1;
    }

    /**
     * getNum
     *
     * This is the getter string method that return the value the attribute is set too and returns it to the user
     *
     * @see #getNum()
     * @return num
     */

    public int getNum(){
        // Will return the value of the attribute
        return num;
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

        // Creating a string variable to store the user's input
        String name;

        // Creating the scanner object  to get the user's input
        Scanner sc = new Scanner(System.in);

        // Assigning the input to the declared variable above
        name = sc.nextLine();

        // Assigning the input to the attribute
        this.name = name;

    }

    /**
     * setName2
     *
     * This is an alternative name method that is used when the customer chooses to leave the previous method
     * setName does not have a correct input
     *
     * The method uses the customers surname and the type of build the customer wishes to be built
     * Then adds the two together to gives the project a name
     *
     * This is also a setter method
     *
     *
     * @param typeBuilding      This variable is input by the user and is used in the creation of the project name
     *                          that is needed to identify the project and is given to the method by the setBuildType
     *                          method
     *
     * @param cusName           This variable is input by the user and is used in the creation of the project name
     *                          that is needed to identify the project and is given to the method by the DetailClass's
     *                          setName method
     *
     * @see #setBuildType()
     * @see DetailsClass#setName()
     * @see #setName2(String, String)
     */

    public void setName2(String typeBuilding,String cusName){
        // This is the alternative project naming method that uses the customer's name
        // Which is received for the DetailsClass and the Building type which is inputted in the following method

        // Creating a array by splitting the customers name by the space
        String[] surname = cusName.split(" ");

        // Assign the type of Building input and the second element in the array
        // to the attribute to create the project name
        this.name = typeBuilding + " " + surname[1];
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
        // Will return the value of the attribute
        return name;
    }

    /**
     * setBuildType
     *
     * This void method set the building type that the user inputs by using a scanner for the java.util.*
     * package and the method has a while true loop to make sure the input and the variable is not
     * empty or does not equal nothing
     *
     * If the variable has a value then the method will set the value to the attribute and break the while loop
     *
     * There is no return method as the method is a void
     *
     * This is also used in the alternative naming method above
     *
     * @see #setBuildType()
     * @see #setName2(String, String)
     * @see package.java #java.until.*
     */

    public void setBuildType() {

        // Creating a String variable to store the users input
        String buildType;

        // A while true loop to repeat going through the lines of code
        while (true) {
            // The scanner object to get an input for the user
            Scanner sc = new Scanner(System.in);

            // Storing the input in the string variable
            buildType = sc.nextLine();

            //Checks if the input is correct if the user input something and the variable is not empty
            if (buildType.equals("") | buildType.isEmpty()) {

                // Displays the following messages to the user to inform the user what happened
                System.out.println("Please try again");
                System.out.print("Please re-enter the type of building: ");

            } else {

                // Else if the variable has a input that is correct the value of the variable will be stored in the
                // Attribute and break the while loop
                this.buildType = buildType;
                break;
            }
        }
    }

    /**
     * getBuildType
     *
     * This is the getter string method that return the value the attribute is set too and returns it to the user
     *
     * @see #getBuildType()
     * @return buildType
     */

    public String getBuildType(){
        // Will return the value of the attribute
        return buildType;
    }

    /**
     * setPhyAdress
     *
     * This void method set the physical address that the user inputs by using a scanner for the java.util.*
     * package and the method has a while true loop to make sure the input and the variable is not
     * empty or does not equal nothing
     *
     * If the variable has a value then the method will set the value to the attribute and break the while loop
     *
     * There is no return method as the method is a void
     *
     * @see #setPhyAdress()
     * @see package.java #java.until.*
     */

    public void setPhyAdress() {

        // Creating a String variable to store the users input
        String phyAdress;

        // A while true loop to repeat going through the lines of code
        while (true){

            // The scanner object to get an input for the user
            Scanner sc = new Scanner(System.in);

            // Storing the input in the string variable
            phyAdress = sc.nextLine();

            //Checks if the input is correct if the user input something and the variable is not empty
            if(phyAdress.equals(" ") | phyAdress.isEmpty()){

                // Displays the following messages to the user to inform the user what happened
                System.out.println("Please try again");
                System.out.print("Please re-enter the physical address: ");

            }else{

                // Else if the variable has a input that is correct the value of the variable will be stored in the
                // Attribute and break the while loop
                this.phyAdress = phyAdress;
                break;
            }
        }
    }

    /**
     * getPhyAdress
     *
     * This is the getter string method that return the value the attribute is set too and returns it to the user
     *
     * @see #getPhyAdress()
     * @return  phyAdress
     */

    public String getPhyAdress() {
        // Will return the value of the attribute
        return phyAdress;
    }

    /**
     * setERF
     *
     * This void method set the ERF that the user inputs by using a scanner for the java.util.*
     * package and the method has a while true loop to make sure the input and the variable is not
     * empty or does not equal nothing
     *
     * If the variable has a value then the method will set the value to the attribute and break the while loop
     *
     * There is no return method as the method is a void
     *
     * @see #setERF()
     * @see package.java #java.until.*
     */

    public void setERF() {

        // Creating a String variable to store the users input
        String ERF;

        // A while true loop to repeat going through the lines of code
        while(true){

            // The scanner object to get an input for the user
            Scanner sc = new Scanner(System.in);

            // Storing the input in the string variable
            ERF = sc.nextLine();

            //Checks if the input is correct if the user input something and the variable is not empty
            // or if the input is greater or less than 21 then it is incorrect
            if (ERF.isEmpty()|ERF.equals(" ")|ERF.length()<21|ERF.length()>21){

                // Displays the following messages to the user to inform the user what happened
                System.out.println("There was an error will your input");
                System.out.print("Please re-enter the ERF Number: ");

            }else{
                // Else if the variable has a input that is correct the value of the variable will be stored in the
                // Attribute and break the while loop
                this.ERF = ERF;
                break;
            }
        }
    }

    /**
     * getERF
     *
     * This is the getter string method that return the value the attribute is set too and returns it to the user
     *
     * @see #getERF()
     * @return  ERF
     */

    public String getERF() {
        // Will return the value of the attribute
        return ERF;
    }

    /**
     * setDateDeadLine
     *
     * This void method set the date of the deadline that the user inputs by using a scanner for the java.util.*
     * package and the method has a while true loop to make sure the input and the variable is not
     * empty or does not equal nothing or if the date format is inputted correctly
     *
     * If the variable has a value then the method will set the value to the attribute and break the while loop
     *
     * There is no return method as the method is a void
     *
     * @throws ParseException   This is due to the checking of the date
     *
     * @see #setDateDeadLine()
     * @see package.java #java.until.*
     */

    public void setDateDeadLine() throws ParseException {

        // Creating a String variable to store the users input
        String dateDeadLine;

        // A while true loop to repeat going through the lines of code
        while(true){

            //Showing a message it inform the user on the format of the date
            System.out.println("Enter the date in the following format dd/mm/yyyy");

            // The scanner object to get an input for the user
            Scanner sc = new Scanner(System.in);

            // Storing the input in the string variable
            dateDeadLine = sc.nextLine();

            //Checks if the input is correct if the user input something and the variable is not empty
            if (dateDeadLine.equals(" ") | dateDeadLine.isEmpty()){
                // Displays the following messages to the user to inform the user what happened
                System.out.println("There was nothing entered");
                System.out.println("Please re-enter the projects deadline date: ");

            }
            else{

                // If there is a valid input then the program will continue
                // Creating a SimpleDateFormat object
                // This is used to set a date pattern for the input
                SimpleDateFormat deadFormat = new SimpleDateFormat("dd/MM/yyyy");

                // This setLenient method is a boolean method and has a false boolean value
                // This is used mainly for validation of the inputted date
                deadFormat.setLenient(false);

                // try catch is used to catch a ParseException
                // if the inputted date has the wrong pattern/format
                try {

                    // This is to change the date into a date variable instead of a string as it was
                    // before
                    deadFormat.parse(dateDeadLine.trim());

                } catch (ParseException e) {

                    //If the input format is incorrect the following messages will come up
                    System.out.println("The error found is: "+e);
                    System.out.println("Please try again the format that was enter was incorrect.");

                    // And the call the method again to give the user another chance to try again
                    setDateDeadLine();
                }

                //Setting the input into a string again
                // to be stored in the attribute
                new SimpleDateFormat("dd/MM/yyyy").parse(dateDeadLine);

                // Storing the value to the attribute
                // And breaking the while loop
                this.dateDeadLine = dateDeadLine;
                break;
            }
        }

    }

    /**
     * getDateDeadLine
     *
     * This is the getter string method that return the value the attribute is set too and returns it to the user
     *
     * @see #getDateDeadLine()
     * @return dateDeadLine
     */

    public String getDateDeadLine(){
        // Will return the value of the attribute
        return dateDeadLine;
    }

    /**
     * setTotalFee
     *
     * This void method set the total amount that the user inputs by using a scanner for the java.util.*
     * package and the method has a while true loop to make sure the input and the variable is not
     * empty or does not equal nothing
     *
     * This is also used in the outstanding balance that is used to see how much the customer stills owes after the
     * first payment
     *
     * If the variable has a value then the method will set the value to the attribute and break the while loop
     *
     * There is no return method as the method is a void
     *
     * @see #setTotalFee()
     * @see #setOutstandingBal(float, float)
     * @see package.java #java.until.*
     */

    public void setTotalFee(){

        // Creating float variable to store the users input
        float totalFee;

        // A while true loop to repeat going through the lines of code
        while(true){

            // The scanner object to get an input for the user
            Scanner sc = new Scanner(System.in);

            // Storing the input in the float variable
            totalFee = sc.nextFloat();

            // If the variable equals 0
            if(totalFee == 0){
                // Displays the following messages to the user to inform the user what happened
                System.out.println("There was no amount enter.");
                System.out.print("Please re-enter the total amount: ");

            }
            else{
                // Else if the variable has a input that is correct the value of the variable will be stored in the
                // Attribute and break the while loop
                this.totalFee =totalFee;
                break;
            }
        }
    }

    /**
     * getTotalFee
     *
     * This is the getter string method that return the value the attribute is set too and returns it to the user
     *
     * @see #getTotalFee()
     * @return totalFee
     */

    public float getTotalFee() {
        // Will return the value of the attribute
        return totalFee;
    }

    /**
     * setDateToFee
     *
     * This void method set the date to fee amount that the user inputs by using a scanner for the java.util.*
     * package and the method has a while true loop to make sure the input and the variable is not
     * empty or does not equal nothing
     *
     * This is also used in the outstanding balance that is used to see how much the customer stills owes after the
     * first payment
     *
     * If the variable has a value then the method will set the value to the attribute and break the while loop
     *
     * There is no return method as the method is a void
     *
     * @see #setDateToFee()
     * @see #setOutstandingBal(float, float)
     * @see package.java #java.until.*
     */

    public void setDateToFee() {

        // Creating float variable to store the users input
        float dateToFee;

        // A while true loop to repeat going through the lines of code
        while(true){

            // The scanner object to get an input for the user
            Scanner sc = new Scanner(System.in);

            // Storing the input in the float variable
            dateToFee = sc.nextFloat();

            // If the variable equals 0
            if(dateToFee == 0){
                // Displays the following messages to the user to inform the user what happened
                System.out.println("There was no amount enter.");
                System.out.print("Please re-enter the total amount: ");

            }
            else{
                // Else if the variable has a input that is correct the value of the variable will be stored in the
                // Attribute and break the while loop
                this.dateToFee = dateToFee;
                break;
            }
        }
    }

    /**
     * getDateToFee
     *
     * This is the getter string method that return the value the attribute is set too and returns it to the user
     *
     * @see #getDateToFee()
     * @return dateToFee
     */

    public float getDateToFee() {
        // Will return the value of the attribute
        return dateToFee;
    }

    /**
     * setOutstandingBal
     *
     * This method is used to calculate the amount the customer still owes after the first payment and is also used to
     * see if the customer needs an invoice or not
     *
     * This method used two float variable to help with the calculate the  numbers are given by the totalFee and dateToFee
     * methods
     *
     * @param totalFee      This value is inputted by the user by given to the method below by the setTotalFee method
     *                      that checks if the input is correct
     * @param dateToFee     This value is inputted by the user by given to the method below by the setDateToFee method
     *                      that checks if the input is correct
     *
     * @see #setTotalFee()
     * @see #setDateToFee()
     * @see #setOutstandingBal(float, float)
     */

    public void setOutstandingBal(float totalFee, float dateToFee){

        // The totalFee and the dateToFee values are found by the method with the same name
        // This method is used see if the customer will need an invoice if the balance is not 0

        // Creating a float variable to store the output of the calculation
        float outstandingBal;

        // totalFee minus dateToFee to get the outstanding Balance
        // Storing the answer in the created float variable
        outstandingBal = totalFee - dateToFee;

        // If the answer of the above calculate less or equal to 0
        if (outstandingBal <= 0){
            // the attribute will equal 0
            this.outstandingBal = 0;
        }else
            // Else if the value is greater then the value will be assigned to the attribute
           this.outstandingBal = outstandingBal;
    }

    /**
     * getOutstandingBal
     *
     * This is the getter string method that return the value the attribute is set too and returns it to the user
     *
     * @see #getOutstandingBal()
     * @return outstandingBal
     */

    public float getOutstandingBal(){
        // Will return the value of the attribute
        return outstandingBal;
     }

    /**
     * setCompleted
     *
     * This void method set the completion date of the project that the user inputs by using a scanner for the java.util.*
     * package and the method has a while true loop to make sure the input and the variable is not
     * empty or does not equal nothing or if the date format is inputted correctly
     *
     * If the variable has a value then the method will set the value to the attribute and break the while loop
     *
     * There is no return method as the method is a void
     *
     * @throws ParseException This is due to the checking of the date
     * @see #setDateDeadLine()
     * @see package.java #java.until.*
     */

    public void setCompleted() throws ParseException {

        // Creating a String variable to store the users input
        String completed;

        // A while true loop to repeat going through the lines of code
        while(true){

            //Showing a message it inform the user on the format of the date
            System.out.println("Enter the date in the following format dd/mm/yyyy");

            // The scanner object to get an input for the user
            Scanner sc = new Scanner(System.in);

            // Storing the input in the string variable
            completed = sc.nextLine();

            //Checks if the input is correct if the user input something and the variable is not empty
            if (completed.equals(" ") | completed.isEmpty()){
                // Displays the following messages to the user to inform the user what happened
                System.out.println("There was nothing entered");
                System.out.println("Please re-enter the projects deadline date: ");
            }
            else{

                // If there is a valid input then the program will continue
                // Creating a SimpleDateFormat object
                // This is used to set a date pattern for the input
                SimpleDateFormat deadFormat = new SimpleDateFormat("dd/MM/yyyy");

                // This setLenient method is a boolean method and has a false boolean value
                // This is used mainly for validation of the inputted date
                deadFormat.setLenient(false);

                // try catch is used to catch a ParseException
                // if the inputted date has the wrong pattern/format
                try {
                    // This is to change the date into a date variable instead of a string as it was
                    // before
                    deadFormat.parse(completed.trim());

                } catch (ParseException e) {
                    //If the input format is incorrect the following messages will come up
                    System.out.println("The error found is: "+e);
                    System.out.println("Please try again the format that was enter was incorrect.");

                    // And the call the method again to give the user another chance to try again
                    setCompleted();
                }

                //Setting the input into a string again
                // to be stored in the attribute
                new SimpleDateFormat("dd/MM/yyyy").parse(completed);

                // Storing the value to the attribute
                // And breaking the while loop
                this.completed = completed;
                break;
            }
        }
    }

    /**
     * getCompleted
     *
     * This is the getter string method that return the value the attribute is set too and returns it to the user
     *
     * @see #getCompleted()
     * @return completed
     */

    public String getCompleted() {
        // Will return the value of the attribute
        return completed;
    }

    /**
     * toString
     *
     * This method uses the method that are declared above and displays everything in a user-friendly
     * manner
     *
     * @see #toString()
     * @return output
     */

    public String toString(){
        // This is the toString method that displays all of the information gathered from the above methods
        // To display a user-friendly summary of all the information received
        String output = "The project details: \n";

        output += "The project number: " + getNum() + "\n";
        output += "The project name: " + getName() + "\n";
        output += "The type of building: " + getBuildType() + "\n";
        output += "The physical address: " + getPhyAdress() + "\n";
        output += "The ERF Number of the project: " + getERF() + "\n";
        output += "The deadline of the project: " + getDateDeadLine() + "\n";
        output += "The total fee amount: R" + getTotalFee() + "\n";
        output += "The fee to date amount: R" + getDateToFee() + "\n";
        output += "The outstanding amount after payment: R" + getOutstandingBal();

        // Return the information stored in the string variable
        return output;
    }

}