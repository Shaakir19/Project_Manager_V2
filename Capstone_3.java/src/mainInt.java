/**
 *  <h>Capstone_3.java</h>
 *  <p>
 *  The program uses three classes that are used in the processing of user input information and display it in a
 *  user-friendly manner
 *  </p>
 *
 *  <p1>
 *    This class the main class
 *    This class is used to hold method like the user created menu method and the main interface method that allows
 *    the user to do all of the work.
 *
 *    This program uses text file to store the user input information and saves it for late use, there is a while true
 *    loop that allows the user to use the program until they wish to end the program.
 *  </p1>
 *
 * @see package.java.text.*
 * @see package.java.until.*
 * @see package.java.io.*
 * @extends Thread
 *
 * @author Shaakir Caroto
 * @version 1.00
 * @since 19-05-2020
 *
 */

// Imported packages that is used in the processing of data

import java.text.*;
import java.util.*;
import java.io.*;

class mainInt extends Thread {

    /**
     * mainMenu()
     *
     *  The method mainMenu displays the option to the user in a user-friendly manner
     *
     *  The method allow uses the delay() void method above
     *
     *  This method displays a list of options and that the user used to pick the option they will like to use
     *  it also has a number system for easy option selection
     *
     * @see mainInt
     * @throws InterruptedException This is used to make the program sleep for a short period of time so the user can
     *                              read a message or a menu
     */

    public static void mainMenu() throws InterruptedException {

        // Calling the delay method to slow down the speed of the menu presentation
        delay();

        //Displaying the menu options by using the system out method
        System.out.println("Menu Main: \n");
        System.out.println("1 - Create a project");
        System.out.println("2 - View projects");
        System.out.println("3 - Completed projects");
        System.out.println("4 - Customer information");
        System.out.println("5 - Contractor information");
        System.out.println("6 - Architect information");
        System.out.println("7 - Statistics\n");
        System.out.println("0 - Exit\n");
    }

    /**
     * subMenuMain()
     *
     * This method show the user option to continue
     * This method displays a list of options and that the user used to pick the option they will like to use
     * it also has a number system for easy option selection
     *
     *   @see mainInt
     */

    public static void subMenuMain() {

        //Displaying the menu options by using the system out method
        System.out.println("1 - Create a new Customer Profile");
        System.out.println("2 - Search for Customer Profile\n");

        System.out.println("0 - Continue");

    }

    /**
     * menuOption4()
     *
     * This method show the user option to continue
     * This method displays a list of options and that the user used to pick the option they will like to use
     * it also has a number system for easy option selection
     *
     *   @see mainInt
     */

    public static void menuOption4(){

        //Displaying the menu options by using the system out method
        System.out.println("1 - Would you like to view all of the customers");
        System.out.println("2 - Would you like to search for a customer's information");
        System.out.println("3 - Adding a new customer's details\n");

        System.out.println("0 - Back to main menu\n");

    }

    /**
     * menuOption5()
     *
     *  This method show the user option to continue
     *  This method displays a list of options and that the user used to pick the option they will like to use
     *  it also has a number system for easy option selection
     *
     *   @see mainInt
     */

    public static void menuOption5(){

        //Displaying the menu options by using the system out method
        System.out.println("1 - Would you like to view all of the contractors");
        System.out.println("2 - Would you like to search for a contractor's information");
        System.out.println("3 - Adding a new contractor's details\n");

        System.out.println("0 - Back to main menu\n");
    }

    /**
     * menuOption6()
     *
     * This method show the user option to continue
     * This method displays a list of options and that the user used to pick the option they will like to use
     * it also has a number system for easy option selection
     *
     *   @see mainInt
     */

    public static void menuOption6(){

        //Displaying the menu options by using the system out method
        System.out.println("1 - Would you like to view all of the architects");
        System.out.println("2 - Would you like to search for a architect's information");
        System.out.println("3 - Adding a new architect's details\n");

        System.out.println("0 - Back to main menu\n");
    }

    /**
     * projectUpMenu()
     *
     * This method show the user option to continue
     * This method displays a list of options and that the user used to pick the option they will like to use
     * it also has a number system for easy option selection
     *
     *   @see mainInt
     */

    public static void projectUpMenu(){

        //Displaying the menu options by using the system out method
        System.out.println("1 - Deadline date");
        System.out.println("2 - Payment toward the outstanding balance");
        System.out.println("3 - Finalized project");
        System.out.println("4 - Completed project\n");

        System.out.println("0 - To continue to the main menu\n");


        System.out.print("Enter the number of the option you pick: ");
    }

    /**
     * delay()
     * <br>
     *  The method is used it delay the program so the user of the program can read some information before the next
     *  thing pops-up
     *  The method needs to be call in the program and the method that it is being used in must have an InterruptedException
     *
     *  This is a delay method that freeze that program for a couple of milliseconds so the user can read a message
     *  or an option menu without the program jumping to the next dialog process
     *
     * @see mainInt
     * @deprecated
     * @throws InterruptedException This is used to make the program sleep for a short period of time so the user can
     *                              read a message or a menu
     */

    public static void delay() throws InterruptedException {
        // This is the sleep thread method that makes the program sleep
        // for a program amount of milliseconds to slow down the program
        Thread.sleep(1500);
    }

    /**
     * main
     * <br>
     *
     * This is the main method where the methods and classes are used to make the program work and function
     * to preform the tasks that are needed
     *
     * This is the interface that the user will see and interact with to complete task and manage the data
     * receive and/or save to a text file
     *
     * It has its own set of variable and functions to complete tasks
     *
     * This is the main interface method that the user will be working with.
     * This has all of the classes and methods to complete the tasks that the user will need to do
     *
     * @param args      It is used in the main void that store arguments of the method to help the program to
     *                  work correctly
     *
     * @throws InterruptedException This is used to make the program sleep for a short period of time so the user can
     *                              read a message or a menu
     */

    public static void main(String[] args) throws InterruptedException {

        // First message the user will when the program starts up
        System.out.println("Welcome to Poised's company application\nThe following menu will display all of the options available: ");


        // Variables that are used for storage and data manipulation
        String name,telNo,emailAd,phyAddress;
        int proNum;
        String proName,proBuild,proPhyAddress,ERF,dateDeadLine;
        float totalFee,dateToFee,outstandingBal;

        // Creating the class object to be able access the constructor and the methods in the classes
        DetailsClass customerInfo = new DetailsClass();

        // This two classes inherit their methods for the above DetailsClass
        ConClass contractorInfo  = new ConClass();
        ArcClass architectInfo = new ArcClass();

        // This is the project class
        ProClass projectInfo = new ProClass();

        // A while true loop to repeat going through the lines of code
        // So the program will continue you running until the user want to end the program
        while (true){

           // This try catch statement will catch and of the expectations and end the program
           // The user will be presented with messages telling them what was wrong and the program will end
           // breaking the above while true loop
           try{

               // Calling the menu method
               // So the user can see their options
               mainMenu();

               // Creating the scanner object to receive the user inputs
               Scanner sc = new Scanner(System.in);

               // Telling the user what they will need to input to select an option
               System.out.print("Enter one of the numbers to select the option: ");

               // Creating a integer variable to store the users input
               int input = sc.nextInt();

               // Creating a switch statement that will call a case based on the user input and allow them to
               // do a task
               // the switch statement is used due to the number of option that can be called
               switch (input) {

                   // If the user entered 1 into the input variable
                   // This case will be called
                   // This is the option if the user wants to create a new project
                   case 1:

                       // informing the user what they have selected
                       System.out.println("The option you have selected is to create a new project.\nPlease input the customers " +
                               "information first.");


                       // A while true loop to repeat going through the lines of code
                       // So the program will continue you running until the user want to end the program
                       while(true) {

                           // Calling the subMenu method
                           // This menu is check if the user is going to create a new customer profile
                           // Or if they are going to search a the text file for the information
                           subMenuMain();

                           // Telling the user want to input
                           // And creating the store integer variable to be used in the switch statement below
                           System.out.print("Please enter the option: ");
                           int customer = sc.nextInt();



                           // the switch statement is used due to the number of option that can be called
                           switch (customer) {



                               // This is used if the user wants to create a new customer profile
                               case 1:

                                   // Displaying to the user what option they have picked and what they will need to do
                                   System.out.println("You have chosen to create a new customer profile\nFill in the following information : ");

                                   // Telling the user what they will need to input
                                   // And calling the setter methods from the DetailsClass to get the inputs for the user
                                   // And checking if the inputs are correct
                                   System.out.print("Enter the Customer Full Name: ");
                                   customerInfo.setName();
                                   System.out.print("Enter the Customer's Telephone Number: ");
                                   customerInfo.setTelNo();
                                   System.out.print("Enter the Customer's Email Address: ");
                                   customerInfo.setEmail();
                                   System.out.print("Enter the Customer's Physical Address: ");
                                   customerInfo.setPhyAddress();

                                   // Using the getter method to store the values of the attributes from the DetailsClass
                                   // This variable declared in this class
                                   name = customerInfo.getName();
                                   telNo = customerInfo.getTelNo();
                                   emailAd = customerInfo.getEmail();
                                   phyAddress = customerInfo.getPhyAddress();

                                   // Creating a BufferedWriter object with an FileWriter as the output object with the text files path
                                   // The file writer append function is set to true as it is a boolean and needs to be set to working and not
                                   // write over the store information
                                   BufferedWriter customerWrite = new BufferedWriter(new FileWriter("C:\\Users\\shaak\\Dropbox\\Shaakir Caroto-50216\\Introduction to Software Engineering\\Task 24\\Capstone_3.java\\src\\Customers.txt",true));

                                   // Appending the new information to the text file using the append method
                                   // for the BufferedWriter
                                   customerWrite.append(name).append(",").append(telNo).append(",").append(emailAd)
                                           .append(",").append(phyAddress).append("\n");

                                   //Closing the file
                                   customerWrite.close();

                                   // This break function is so the case end and does not continue to the next case
                                   break;



                               // This case is if the user want to search for the customer and get the information
                               case 2:

                                   // Displaying to the user what option they have picked
                                   System.out.println("You have chosen to search for the information.");

                                   /*
                                    Telling the user what they need to do
                                    the "sc.nextLine" is so the program doesn't skip the line below it
                                    And creating a string variable that will store the user input to be used in the
                                    Search method

                                    The user will enter the full name of the customer they want to search and it will be stored in
                                    the variable "fullName" and will be used to get the customer profile
                                   */
                                   System.out.print("Enter the customers full name and surname: ");
                                   sc.nextLine();
                                   String fullName = sc.nextLine();

                                   // Creating a file object with the files path
                                   File f1=new File("C:\\Users\\shaak\\Dropbox\\Shaakir Caroto-50216\\Introduction to Software Engineering\\Task 24\\Capstone_3.java\\src\\Customers.txt");

                                   /*
                                   Creating a string array that will store the read information for the text file
                                   And will use a for loop to run through the element to search for the customer profile
                                   */
                                   String[] words;

                                   //Creating a FileReader variable using the file object above as the path
                                   FileReader fr = new FileReader(f1);

                                   // Creating the BufferedReader object with the FileReader object as the in
                                   BufferedReader br = new BufferedReader(fr);

                                   // This is the string variable that will store the line of the BufferedReader lines
                                   String s;

                                   // This variable will be used to store the line that is equal to the user input
                                   String str = "";

                                   /* This boolean variable is used to check if the item is found or not */
                                   boolean bFound = false;

                                   // This while loop will run until the lines in the text file are all read
                                   // Assigning the line of the text file to "s"
                                   while((s=br.readLine())!=null)
                                   {
                                       // Splitting the lines from the text file to make an array of string
                                       words=s.split(",");

                                       // A for loop to run through the element of the array
                                       for (String word : words)
                                       {
                                           /*
                                            Using an if statement to see if the user input is equal to an of the lines
                                            elements
                                           */
                                           if (word.equals(fullName)) {
                                               // if any of the element equal the inputted string assign the line of
                                               // string "s" to the storage holder of "str"
                                               str = s;

                                               // Change bFound to true as the profile the user wants is found
                                               bFound = true;

                                               //breaking the while loop
                                               break;
                                           }
                                       }
                                   }

                                   // If bFound is true
                                   if (bFound) {

                                       // Telling the user that the profile was found
                                       System.out.println("The information for " + fullName + " has been found: ");

                                       // Making the splitting str into an array
                                       String[] info = str.split(",");

                                       /*
                                        Assigning the element of the array info to the below variables
                                        for later uses
                                       */
                                       name = info[0];
                                       telNo = info[1];
                                       emailAd = info [2];
                                       phyAddress = info[3];

                                       /*
                                        Using the alternative setter method to set the found variable to
                                        the attribute in the DetailsClass
                                       */
                                       customerInfo.setName2(name);
                                       customerInfo.setTelNo2(telNo);
                                       customerInfo.setEmail2(emailAd);
                                       customerInfo.setPhyAddress2(phyAddress);

                                       // Display the found information in a user friendly manner by using the
                                       // class's toString method
                                       System.out.println(customerInfo.toString());

                                   } else {

                                       // if bFound is still false then the following messages will show
                                       System.out.println("The information that have been looking for was not found");
                                       System.out.println("Please try the process again \n");

                                   }

                                   //Closing the file
                                   fr.close();

                                   // This break function is so the case end and does not continue to the next case
                                   break;

                               // This is so the user will be able to end the switch statement
                               case 0 :
                                   break;

                               // If the user inputs something that is not parts of the options this method will display
                               default:
                                   System.out.println("Option not found\n Please try again");

                           }


                           //if the variable customer equals 0
                           if(customer == 0){
                               // Display the following method and the while loop will break so the user can continue
                               System.out.println("You have chosen to continue.");
                               break;
                           }
                       }

                       /*
                        Telling the user that the customers information is found and received
                        And telling the user what is next
                       */
                       System.out.println("The customer's information have been received");
                       System.out.println("Now you are able to input the details of the project: \n");

                       /*
                        This setNum is from the the ProClass and counts the number of records in the text file
                        and assigns the text file a number
                       */
                       projectInfo.setNum();


                       // Telling the user what to input and using the setter method from the ProClass to get the
                       // user's inputs
                       System.out.print("If you don't have specific project name one will be generated\nEnter the project name: ");
                       projectInfo.setName();
                       System.out.print("Enter the type of building design: ");
                       projectInfo.setBuildType();
                       System.out.print("Enter the physical address: ");
                       projectInfo.setPhyAdress();
                       System.out.print("Enter the 21 digit ERF number: ");
                       projectInfo.setERF();
                       System.out.print("Enter the deadline date of the project: ");
                       projectInfo.setDateDeadLine();
                       System.out.print("Enter the total fee amount of the project: ");
                       projectInfo.setTotalFee();
                       System.out.print("Enter the date to fee amount: ");
                       projectInfo.setDateToFee();

                       // Telling the user that the input have been received
                       System.out.print("Thank you all of the information have been collected");

                       // Storing the values of the attribute in the variable created in this class
                       proNum = projectInfo.getNum();
                       proName = projectInfo.getName();

                       /*
                        Checking the value of the string variable proName
                        if the variable equal nothing of has a dash in it

                        The name getter function from the DetailsClass will be called and the BuildType
                        getter function will also be called to use the alternative naming
                        setter function

                        Then the variable proName will be assigned with the new name
                       */
                       if (proName.equals(" ") | proName.isEmpty() | proName.equals("-")){
                           name = customerInfo.getName();
                           projectInfo.setName2(projectInfo.getBuildType(),name);
                           proName = projectInfo.getName();
                       }

                       // Storing the values of the attribute in the variable created in this class
                       proBuild = projectInfo.getBuildType();
                       proPhyAddress = projectInfo.getPhyAdress();
                       ERF = projectInfo.getERF();
                       dateDeadLine = projectInfo.getDateDeadLine();
                       totalFee = projectInfo.getTotalFee();
                       dateToFee = projectInfo.getDateToFee();

                       /*
                        Calculating the outstanding balance for the totalFee and dateToFee variable to
                        see if the customer will still need an invoice due to there being an oustanding amount
                        left

                        And assign to a variable called outstandingBal
                       */
                       projectInfo.setOutstandingBal(totalFee,dateToFee);
                       outstandingBal = projectInfo.getOutstandingBal();

                       // Telling the user that the information is collected
                       System.out.println("\nThe information have been collected");

                       /*
                        Creating a BufferedWriter object with an FileWriter as the output object with the text files path
                        The file writer append function is set to true as it is a boolean and needs to be set to working and not
                        write over the store information
                       */
                       BufferedWriter projectWriter = new BufferedWriter(new FileWriter("C:\\Users\\shaak\\Dropbox\\Shaakir Caroto-50216\\Introduction to Software Engineering\\Task 24\\Capstone_3.java\\src\\Projects.txt",true));

                       /*
                        Appending the new information to the text file using the append method
                        for the BufferedWriter
                       */
                       projectWriter.append(String.valueOf(proNum)).append(",").append(proName).append(",").append(proBuild).append(",").append(proPhyAddress).append(",")
                       .append(ERF).append(",").append(dateDeadLine).append(",").append(String.valueOf(totalFee)).append(",").append(String.valueOf(dateToFee)).append(",").append(String.valueOf(outstandingBal)).append("\n");

                       // Closing the text file
                       projectWriter.close();

                       /*
                       Checking if the customer will need a invoice based on the calculating that is done
                       in the setter method outstandingBal
                        */
                       if(outstandingBal == 0 | outstandingBal < 0){
                           // if outstandingBal equals or is less than 0
                           // this message will display
                           System.out.println("The customer has paid in full no invoice needs to be generated.");
                       }
                       else{

                           // Else if the value is greater than 0
                           // The following message and the two classes toString functions will be called
                           System.out.println("The customers invoice: ");
                           System.out.println(projectInfo.toString());
                           System.out.println(customerInfo.toString());
                       }

                       // Telling the user that the information is stored and that they will go back to the menu
                       System.out.println("The information has been stored\nYou will return to the main menu");

                       // Calling the delay function
                       delay();

                       // This break function is so the case end and does not continue to the next case
                       break;



                   /*
                    this case is if the user wants to view all the projects and if they want to update any aspect of the
                    projects
                   */
                   case 2:

                       // Telling the user what option they have picked
                       System.out.println("You have chosen to view all of the projects\n");

                       // Creating a file object with the files path
                       File fileProject = new File("C:\\Users\\shaak\\Dropbox\\Shaakir Caroto-50216\\Introduction to Software Engineering\\Task 24\\Capstone_3.java\\src\\Projects.txt");

                       /*
                       Creating a string array that will store the read information for the text file
                       And will use a for loop to run through the element to display the information in a
                       user-friendly manner
                       */
                       String[] infoPro;

                       //Creating a FileReader variable using the file object above as the path
                       FileReader fileReadPro = new FileReader(fileProject);

                       // Creating the BufferedReader object with the FileReader object as the in
                       BufferedReader buffedPro = new BufferedReader(fileReadPro);

                       // This is the string variable that will store the line of the BufferedReader lines
                       String strInfo;

                       // This while loop will run until the lines in the text file are all read
                       // Assigning the line of the text file to "strInfo"
                       while((strInfo = buffedPro.readLine()) != null){

                           // Splitting the lines from the text file to make an array of string
                           infoPro = strInfo.split(",");

                           //Using the string array to display the data in a user-friendly
                           System.out.println("The project number: " + infoPro[0]);
                           System.out.println("The project name: " + infoPro[1]);
                           System.out.println("The type of build: " + infoPro[2]);
                           System.out.println("The physical address of the project: " + infoPro[3]);
                           System.out.println("The ERF number of the project: " + infoPro[4] );
                           System.out.println("The deadline of the project: " + infoPro[5]);
                           System.out.println("The total amount of the project: R" + infoPro[6] );
                           System.out.println("The previous fee amount paid: R" + infoPro[7]);
                           System.out.println("The balance payable : R" + infoPro[8] + "\n");
                       }

                       // Closing the file
                       buffedPro.close();

                       // this is so the program doesn't skip the line below it
                       sc.nextLine();

                       //Telling the user what to do
                       System.out.println("Please answer with yes or no");
                       System.out.print("Would you like to update any of the projects: ");

                       // Storing the input for the user and change the input to lowercase
                       String strAns = sc.nextLine();
                       strAns = strAns.toLowerCase();

                       // If the user's input is equal to "yes"
                       if (strAns.equals("yes")){

                          // This message will pop up telling the user what to do next
                          System.out.print("Which would you like to search by 1 (the number) or 2 (the name):  ");

                          // Storing the user's integer input for the if statement below
                          int searchOp  = sc.nextInt();

                          // If the user inputs 1 and wants to search by number
                          if(searchOp == 1 ){

                             //This message will tell the user what option they have picked
                             System.out.println("You have chosen to search by the number of the project\n");

                             // Initializing integer variables
                             // The "numPro" will store the users input and be used for searching
                             // The "num" is a key that will be used in the map
                             int numPro;
                             int num = 1;

                             // Creating a map variable with a integer key and the a string
                             // The LinkedHashMap is used as it will store everything as it is saved
                             HashMap <Integer,String> map = new LinkedHashMap<>();

                             /*
                             Creating a BufferedReader object with a FileReader as the output object
                             with the file path in the FileReader
                              */
                             BufferedReader projectBuff = new BufferedReader(new FileReader("C:\\Users\\shaak\\Dropbox\\Shaakir Caroto-50216\\Introduction to Software Engineering\\Task 24\\Capstone_3.java\\src\\Projects.txt"));

                             // Used to store the lines from the text file and to be written to the backup text file
                             String detail;

                             // Creating a file object with file path in it
                             File Backup = new File("C:\\Users\\shaak\\Dropbox\\Shaakir Caroto-50216\\Introduction to Software Engineering\\Task 24\\Capstone_3.java\\src\\Backups.txt");

                             // Creating the BufferedWriter for the backup file
                             // the BufferedWriter object with an FileWriter as the output object with the text files path
                             // The file writer append function is set to true as it is a boolean and needs to be set to working and not
                             // write over the store information
                             BufferedWriter backWriter = new BufferedWriter(new FileWriter(Backup,true));

                             // This while loop will run until the lines in the text file are all read
                             // Assigning the line of the text file to "detail"
                             while((detail = projectBuff.readLine())!= null){

                                 // Writing the line that are stored in details into the backup file
                                 backWriter.append(detail).append("\n");

                                 // increasing num by 1 every time the while loop goes and setting it as the key
                                 // and storing the lines from the text file in the map
                                 map.put(num++,detail);
                             }

                             // Closing both files
                             projectBuff.close();
                             backWriter.close();

                             // Deleting the old "project file"
                             fileProject.delete();

                             // Renaming the backup file to the new project file
                             Backup.renameTo(new File("C:\\Users\\shaak\\Dropbox\\Shaakir Caroto-50216\\Introduction to Software Engineering\\Task 24\\Capstone_3.java\\src\\Projects.txt"));

                             // Telling the user what they need to input
                             System.out.print("Enter the number of the project you would like to edit: ");

                             // Storing the user input in the variable
                             numPro = sc.nextInt();

                             //Using the user input to find the record/project they want to edit
                             String searchInfo =  map.get(numPro);

                             /* Storing the string information in a ArrayList
                                due it not having a limit on the amount if element to be added
                             */
                             ArrayList<String> arr = new ArrayList<>(Arrays.asList(searchInfo.split(",")));

                             // Displaying the information in a user-friendly manner
                             System.out.println("The project number: " + arr.get(0));
                             System.out.println("The project name: " + arr.get(1));
                             System.out.println("The type of build: " + arr.get(2));
                             System.out.println("The physical address of the project: " + arr.get(3));
                             System.out.println("The ERF number of the project: " + arr.get(4));
                             System.out.println("The deadline of the project: " + arr.get(5));
                             System.out.println("The total amount of the project: R" + arr.get(6));
                             System.out.println("The previous fee amount paid: R" + arr.get(7));
                             System.out.println("The balance payable : R" + arr.get(8) + "\n");

                              // A while true loop to repeat going through the lines of code
                              // So the program will continue you running until the user want to end the program
                              while(true) {

                                  // Calling the menu method for the user
                                  projectUpMenu();

                                  // receiving the users input
                                  int option = sc.nextInt();

                                  // Creating a switch statement that will call a case based on the user input and allow them to
                                  // do a task
                                  // the switch statement is used due to the number of option that can be called
                                  switch (option) {

                                      // This case is for the user if they want to change the deadline of the selected project
                                      case 1:

                                          // Telling the user what option they have selected
                                          System.out.println("You have chosen to change the deadline date.");

                                          // Displaying the old deadline date to the user
                                          System.out.println("The current date saved: " + arr.get(5));

                                          //Telling the user what they would need to input
                                          System.out.print("Enter what you would like to change the date to: \n");

                                          // Calling a method from the ProClass to check the date the user inputs
                                          projectInfo.setDateDeadLine();

                                          // Displaying what the user input for the new deadline date
                                          System.out.println("The new date you have entered is : " + projectInfo.getDateDeadLine());

                                          // Assigning the new deadline date to the array
                                          arr.set(5, projectInfo.getDateDeadLine());

                                          /*
                                          This next lines of code are used to change the array list variable into a string
                                          so that it can be stored in the map to b e written to the text file

                                          Storing the arr in the temp variable and using the toString function of the array
                                          to change it into a String
                                          The next line is removing the square brackets from the new string value and
                                          storing it into the map
                                           */
                                          String temp = arr.toString();
                                          temp = temp.substring(1, temp.length() - 1);
                                          map.put(numPro,temp);

                                          /*
                                           the BufferedWriter object with an FileWriter as the output object with the text files path
                                           The file writer append function is set to true as it is a boolean and needs to be set to working and not
                                           write over the store information
                                          */
                                          BufferedWriter upWrite = new BufferedWriter(new FileWriter("C:\\Users\\shaak\\Dropbox\\Shaakir Caroto-50216\\Introduction to Software Engineering\\Task 24\\Capstone_3.java\\src\\Projects.txt",true));

                                          // The for loop runs through the elements of the map and writes the elements
                                          // to the project file
                                          for (Map.Entry<Integer,String> m :map.entrySet()){

                                              // Using the append function to write the elements from the map to the text file
                                              upWrite.append(m.getValue()).append("\n");
                                          }

                                          // Closing the text file
                                          upWrite.close();

                                          // This break function is so the case end and does not continue to the next case
                                          break;


                                      // This case is for the user if the customer makes another payment and cause the project
                                      // to be finalized
                                      case 2:

                                          // Telling the user what option they have selected
                                          System.out.println("You have chosen to assign a payment from a customer");

                                          // Telling the user what to input
                                          System.out.print("Enter the customer's full name: ");

                                          // Storing the user's input in the string variable
                                          String cusName = sc.nextLine();

                                          // Displaying the old balance of the project
                                          System.out.println("The current balance is " + arr.get(8));

                                          // Changing the old balance into a float variable for calculations
                                          float balance = Float.parseFloat(arr.get(8));

                                          // Telling the user what to input
                                          System.out.println("Enter the amount the customer has paid");

                                          // Calling a method from the ProClass to check the payment the user inputs
                                          projectInfo.setDateToFee();

                                          // Storing the input in a newly created variable for the outstanding balance
                                          // calculation
                                          float newPayment = projectInfo.getDateToFee();

                                          // Displaying the users input
                                          System.out.println("The amount the customer has paid is R" + newPayment);

                                          // Calling a method from the ProClass to do the outstanding balance calculation
                                          projectInfo.setOutstandingBal(balance,newPayment);

                                          // if the answer from the calculation is equal to 0
                                          if (projectInfo.getOutstandingBal() == 0){

                                              // Telling the user that the customer have fully paid
                                              System.out.println("The project is fully paid and the project can be set as finalized\n");

                                              // Setting the new balance to the array
                                              arr.set(8,"0");

                                              // And adding a new element that shows the project has been finalized
                                              arr.add(9,"Finalise");

                                              /*
                                              This next lines of code are used to change the array list variable into a string
                                              so that it can be stored in the map to b e written to the text file

                                              Storing the arr in the temp variable and using the toString function of the array
                                              to change it into a String
                                              The next line is removing the square brackets from the new string value and
                                              storing it into the map
                                               */
                                              temp = arr.toString();
                                              temp = temp.substring(1, temp.length() - 1);
                                              map.put(numPro,temp);

                                              /*
                                               the BufferedWriter object with an FileWriter as the output object with the text files path
                                               The file writer append function is set to true as it is a boolean and needs to be set to working and not
                                               write over the store information
                                              */
                                              upWrite = new BufferedWriter(new FileWriter("C:\\Users\\shaak\\Dropbox\\Shaakir Caroto-50216\\Introduction to Software Engineering\\Task 24\\Capstone_3.java\\src\\Projects.txt",true));

                                              // The for loop runs through the elements of the map and writes the elements
                                              // to the project file
                                              for (Map.Entry<Integer,String> m :map.entrySet()){

                                                  // Using the append function to write the elements from the map to the text file
                                                  upWrite.append(m.getValue()).append("\n");
                                              }

                                          }
                                          else{

                                              // Else if the user has not fully paid
                                              // the project will display the balance left over
                                              System.out.println("The customer still owes: " + projectInfo.getOutstandingBal());

                                              // The project will create a new invoice for the customer
                                              System.out.println("The customer's new invoice: \n");

                                              // Setting the new balance to the array
                                              arr.set(8,String.valueOf(projectInfo.getOutstandingBal()));

                                              /*
                                              This next lines of code are used to change the array list variable into a string
                                              so that it can be stored in the map to b e written to the text file

                                              Storing the arr in the temp variable and using the toString function of the array
                                              to change it into a String
                                              The next line is removing the square brackets from the new string value and
                                              storing it into the map
                                               */
                                              temp = arr.toString();
                                              temp = temp.substring(1, temp.length() - 1);
                                              map.put(numPro,temp);

                                              /*
                                               the BufferedWriter object with an FileWriter as the output object with the text files path
                                               The file writer append function is set to true as it is a boolean and needs to be set to working and not
                                               write over the store information
                                              */
                                              upWrite = new BufferedWriter(new FileWriter("C:\\Users\\shaak\\Dropbox\\Shaakir Caroto-50216\\Introduction to Software Engineering\\Task 24\\Capstone_3.java\\src\\Projects.txt",true));


                                              // The for loop runs through the elements of the map and writes the elements
                                              // to the project file
                                              for (Map.Entry<Integer,String> m :map.entrySet()){

                                                  // Using the append function to write the elements from the map to the text file
                                                  upWrite.append(m.getValue()).append("\n");
                                              }

                                              // displaying the information of the project
                                              System.out.println("The project number: " + arr.get(0));
                                              System.out.println("The project name: " + arr.get(1));
                                              System.out.println("The type of build: " + arr.get(2));
                                              System.out.println("The physical address of the project: " + arr.get(3));
                                              System.out.println("The ERF number of the project: " + arr.get(4));
                                              System.out.println("The deadline of the project: " + arr.get(5));
                                              System.out.println("The total amount of the project: R" + arr.get(6));
                                              System.out.println("The previous fee amount paid: R" + arr.get(7));
                                              System.out.println("The balance payable : R" + arr.get(8) + "\n");

                                              // Creating a file reader object with the customer text file path
                                              FileReader cusReader = new FileReader("C:\\Users\\shaak\\Dropbox\\Shaakir Caroto-50216\\Introduction to Software Engineering\\Task 24\\Capstone_3.java\\src\\Customers.txt");

                                              // Creating the BufferedReader object using the file reader object as the input data
                                              BufferedReader cusBuff = new BufferedReader(cusReader);

                                              // This is the string variable that will store the line of the BufferedReader lines
                                              String strCus;

                                              // This variable will be used to store the line that is equal to the user input
                                              String store = "";

                                              // This while loop will run until the lines in the text file are all read
                                              // Assigning the line of the text file to "strInfo"
                                              while((strCus = cusBuff.readLine()) != null){

                                                  // Splitting the lines from the text file to make an array of string
                                                  String[] words = strCus.split(",");

                                                  // A for loop to run through the element of the array
                                                  for (String word : words){

                                                      /*
                                                       Using an if statement to see if the user input is equal to an of the lines
                                                       elements
                                                      */
                                                      if (word.equals(cusName)){
                                                          // if any of the element equal the inputted string assign the line of
                                                          // string "strCus" to the storage holder of "store"
                                                          store = strCus;

                                                          //breaking the while loop
                                                          break;
                                                      }
                                                  }
                                              }

                                              // Creating an ArrayList to store the information that was found by the search
                                              // and splitting it
                                              ArrayList<String> cusArr = new ArrayList<>(Arrays.asList(store.split(",")));

                                              // displaying the information of the customer
                                              System.out.println("The customer's information\n");
                                              System.out.println("The full name: " + cusArr.get(0));
                                              System.out.println("The telephone number: " + cusArr.get(1));
                                              System.out.println("The email address: " + cusArr.get(2));
                                              System.out.println("The physical address: " + cusArr.get(3));

                                              // Closing the file
                                              cusBuff.close();
                                          }

                                          // Closing the file
                                          upWrite.close();

                                          // This break function is so the case end and does not continue to the next case
                                          break;


                                      // This is the case if the user wants to set the project as finalized
                                      case 3:

                                          // Telling the user what option they have selected
                                          System.out.println("You have chosen to finalised the project.");

                                          // adding a new element that shows the project has been finalized
                                          arr.add(9,"Finalise");

                                          // Telling the user that it is done
                                          System.out.println("The project has been finalised");

                                          /*
                                              This next lines of code are used to change the array list variable into a string
                                              so that it can be stored in the map to b e written to the text file

                                              Storing the arr in the temp variable and using the toString function of the array
                                              to change it into a String
                                              The next line is removing the square brackets from the new string value and
                                              storing it into the map
                                               */
                                          temp = arr.toString();
                                          temp = temp.substring(1, temp.length() - 1);
                                          map.put(numPro,temp);

                                          /*
                                               the BufferedWriter object with an FileWriter as the output object with the text files path
                                               The file writer append function is set to true as it is a boolean and needs to be set to working and not
                                               write over the store information
                                              */
                                          upWrite = new BufferedWriter(new FileWriter("C:\\Users\\shaak\\Dropbox\\Shaakir Caroto-50216\\Introduction to Software Engineering\\Task 24\\Capstone_3.java\\src\\Projects.txt",true));

                                          // The for loop runs through the elements of the map and writes the elements
                                          // to the project file
                                          for (Map.Entry<Integer,String> m :map.entrySet()){

                                              // Using the append function to write the elements from the map to the text file
                                              upWrite.append(m.getValue()).append("\n");
                                          }

                                          // Closing the file
                                          upWrite.close();

                                          // This break function is so the case end and does not continue to the next case
                                          break;

                                      // Thia case is so the user can set that the project is complete and
                                      // check the inputted date
                                      case 4:

                                          // Telling the user what option they have selected
                                          System.out.println("You have chosen to set a project as completed\n");

                                          // Checking if the project has been finalized
                                          if (arr.get(9).equals("Finalise")) {

                                              // Asking the user to input the completion date
                                              System.out.println("Enter the date of the projects completion: \n");

                                              // Checking if the date is correct
                                              projectInfo.setCompleted();

                                              // Adding two new elements one for the date and one for the completed tag
                                              // for the project
                                              arr.add(10,projectInfo.getCompleted());
                                              arr.add(11,"Completed");

                                              /*
                                              This next lines of code are used to change the array list variable into a string
                                              so that it can be stored in the map to b e written to the text file

                                              Storing the arr in the temp variable and using the toString function of the array
                                              to change it into a String
                                              The next line is removing the square brackets from the new string value and
                                              storing it into the map
                                               */
                                              temp = arr.toString();
                                              temp = temp.substring(1, temp.length() - 1);
                                              map.put(numPro,temp);

                                              /*
                                               the BufferedWriter object with an FileWriter as the output object with the text files path
                                               The file writer append function is set to true as it is a boolean and needs to be set to working and not
                                               write over the store information
                                              */
                                              BufferedWriter buffCom = new BufferedWriter(new FileWriter("C:\\Users\\shaak\\Dropbox\\Shaakir Caroto-50216\\Introduction to Software Engineering\\Task 24\\Capstone_3.java\\src\\Completed.txt",true));

                                              /*
                                               the BufferedWriter object with an FileWriter as the output object with the text files path
                                               The file writer append function is set to true as it is a boolean and needs to be set to working and not
                                               write over the store information
                                              */
                                              upWrite = new BufferedWriter(new FileWriter("C:\\Users\\shaak\\Dropbox\\Shaakir Caroto-50216\\Introduction to Software Engineering\\Task 24\\Capstone_3.java\\src\\Projects.txt",true));


                                              // The for loop runs through the elements of the map and writes the elements
                                              // to the project file
                                              for (Map.Entry<Integer,String> m :map.entrySet()){

                                                  // Using the append function to write the elements from the map to the text file
                                                  upWrite.append(m.getValue()).append("\n");
                                              }

                                              // Writing to the Complete file
                                              buffCom.append(temp).append("\n");

                                              //Closing the files
                                              buffCom.close();
                                              upWrite.close();

                                          }else{
                                              // If the project have not been finalized
                                              System.out.println("The project needs to be finalised first to be set to completed");
                                          }

                                        // This break function is so the case end and does not continue to the next case
                                        break;


                                      // When the user wants to continue to another function
                                      case 0:
                                          break;

                                      // If the user inputs something that is not one of the above cases
                                      default:
                                          System.out.println("The option selected was not found.");
                                  }

                                  //if the variable option equals 0
                                  if(option == 0){
                                      // Display the following method and the while loop will break so the user can continue
                                      System.out.println("You have chosen to continue.");
                                      break;
                                  }
                              }


                          }

                          // if the user want to search for the project by the name and inputs 2
                          else if (searchOp == 2){

                               //This message will tell the user what option they have picked
                               System.out.println("You have chosen to search by the name of the project\n");

                               // Creating a map variable with a integer key and the a string
                                // The LinkedHashMap is used as it will store everything as it is saved
                               HashMap<String,String> map2 = new LinkedHashMap<>();

                               /*
                                  Creating a BufferedReader object with a FileReader as the output object
                                  with the file path in the FileReader
                                */
                               BufferedReader projectBuff = new BufferedReader(new FileReader("C:\\Users\\shaak\\Dropbox\\Shaakir Caroto-50216\\Introduction to Software Engineering\\Task 24\\Capstone_3.java\\src\\Projects.txt"));

                               // Used to store the lines from the text file
                               String sp2;


                               // Creating a file object with file path in it
                               File Backup = new File("C:\\Users\\shaak\\Dropbox\\Shaakir Caroto-50216\\Introduction to Software Engineering\\Task 24\\Capstone_3.java\\src\\Backups.txt");

                               // Creating the BufferedWriter for the backup file
                               // the BufferedWriter object with an FileWriter as the output object with the text files path
                               // The file writer append function is set to true as it is a boolean and needs to be set to working and not
                               // write over the store information
                               BufferedWriter backWriter = new BufferedWriter(new FileWriter(Backup,true));

                               // This while loop will run until the lines in the text file are all read
                               // Assigning the line of the text file to "sp2"
                               while ((sp2 = projectBuff.readLine()) != null){

                                   // Creating a string array that holds the split lines from the text file
                                   String[] selection = sp2.split(",");

                                   // Creating a string variable called key and setting the second element as the key
                                   // to be used in the map
                                   String key = selection[1];

                                   // Setting the element and the key to the map
                                   map2.put(key,sp2);

                                   // Writing the line that are stored in details into the backup file
                                   backWriter.append(sp2).append("\n");
                               }

                               // Closing the files
                               projectBuff.close();
                               backWriter.close();

                               // Deleting the old "project file"
                               fileProject.delete();

                               // Renaming the backup file to the new project file
                               Backup.renameTo(new File("C:\\Users\\shaak\\Dropbox\\Shaakir Caroto-50216\\Introduction to Software Engineering\\Task 24\\Capstone_3.java\\src\\Projects.txt"));

                               // Telling the user what to input
                               System.out.print("Enter the name of the project you would like to edit: ");

                               // Storing the user's input in the string creating variable
                               String idName = sc.nextLine();

                               // Searching for the data by the key
                               // and using the user input
                               String searchInfo =  map2.get(idName);

                               /*
                                Storing the string information in a ArrayList
                                due it not having a limit on the amount if element to be added
                               */
                               ArrayList<String> arr = new ArrayList<>(Arrays.asList(searchInfo.split(",")));

                               // Displaying the information in a user-friendly manner
                               System.out.println("The project number: " + arr.get(0));
                               System.out.println("The project name: " + arr.get(1));
                               System.out.println("The type of build: " + arr.get(2));
                               System.out.println("The physical address of the project: " + arr.get(3));
                               System.out.println("The ERF number of the project: " + arr.get(4));
                               System.out.println("The deadline of the project: " + arr.get(5));
                               System.out.println("The total amount of the project: R" + arr.get(6));
                               System.out.println("The previous fee amount paid: R" + arr.get(7));
                               System.out.println("The balance payable : R" + arr.get(8) + "\n");

                               // A while true loop to repeat going through the lines of code
                              // So the program will continue you running until the user want to end the program
                               while(true){

                                   // Calling the menu method for the user
                                   projectUpMenu();

                                   // receiving the users input
                                   int option = sc.nextInt();

                                   // Creating a switch statement that will call a case based on the user input and allow them to
                                   // do a task
                                   // the switch statement is used due to the number of option that can be called
                                   switch (option){

                                       // This case is for the user if they want to change the deadline of the selected project
                                       case 1:

                                          // Telling the user what option they have selected
                                          System.out.println("You have chosen to change the deadline date.");

                                          // Displaying the old deadline date to the user
                                          System.out.println("The current date saved: " + arr.get(5));

                                          //Telling the user what they would need to input
                                          System.out.print("Enter what you would like to change the date to: \n");

                                          // Calling a method from the ProClass to check the date the user inputs
                                          projectInfo.setDateDeadLine();

                                          // Displaying what the user input for the new deadline date
                                          System.out.println("The new date you have entered is : " + projectInfo.getDateDeadLine());

                                          // Assigning the new deadline date to the array
                                          arr.set(5, projectInfo.getDateDeadLine());

                                          /*
                                          This next lines of code are used to change the array list variable into a string
                                          so that it can be stored in the map to b e written to the text file

                                          Storing the arr in the temp variable and using the toString function of the array
                                          to change it into a String
                                          The next line is removing the square brackets from the new string value and
                                          storing it into the map
                                          */
                                          String temp = arr.toString();
                                          temp = temp.substring(1, temp.length() - 1);
                                          map2.put(idName,temp);

                                          /*
                                           the BufferedWriter object with an FileWriter as the output object with the text files path
                                           The file writer append function is set to true as it is a boolean and needs to be set to working and not
                                           write over the store information
                                          */
                                          BufferedWriter upWrite = new BufferedWriter(new FileWriter("C:\\Users\\shaak\\Dropbox\\Shaakir Caroto-50216\\Introduction to Software Engineering\\Task 24\\Capstone_3.java\\src\\Projects.txt",true));

                                          // The for loop runs through the elements of the map and writes the elements
                                          // to the project file
                                          for (Map.Entry<String,String> m :map2.entrySet()){

                                              // Using the append function to write the elements from the map to the text file
                                              upWrite.append(m.getValue()).append("\n");
                                          }

                                          // Closing the text file
                                          upWrite.close();

                                          // This break function is so the case end and does not continue to the next case
                                          break;


                                       // This case is for the user if the customer makes another payment and cause the project
                                       // to be finalized
                                       case 2:

                                           // Telling the user what option they have selected
                                           System.out.println("You have chosen to assign a payment from a customer");

                                           // Telling the user what to input
                                           System.out.print("Enter the customer's full name: ");

                                           // Storing the user's input in the string variable
                                           String cusName = sc.nextLine();

                                           // Displaying the old balance of the project
                                           System.out.println("The current balance is " + arr.get(8));

                                           // Changing the old balance into a float variable for calculations
                                           float balance = Float.parseFloat(arr.get(8));

                                           // Telling the user what to input
                                           System.out.println("Enter the amount the customer has paid");

                                           // Calling a method from the ProClass to check the payment the user inputs
                                           projectInfo.setDateToFee();

                                           // Storing the input in a newly created variable for the outstanding balance
                                           // calculation
                                           float newPayment = projectInfo.getDateToFee();

                                           // Displaying the users input
                                           System.out.println("The amount the customer has paid is R" + newPayment);

                                           // Calling a method from the ProClass to do the outstanding balance calculation
                                           projectInfo.setOutstandingBal(balance,newPayment);

                                           // if the answer from the calculation is equal to 0
                                           if (projectInfo.getOutstandingBal() == 0){


                                               // Telling the user that the customer have fully paid
                                               System.out.println("The project is fully paid and the project can be set as finalized\n");

                                               // Setting the new balance to the array
                                               arr.set(8,"0");

                                               // And adding a new element that shows the project has been finalized
                                               arr.add(9,"Finalise");

                                               /*
                                                This next lines of code are used to change the array list variable into a string
                                                so that it can be stored in the map to b e written to the text file

                                                Storing the arr in the temp variable and using the toString function of the array
                                                to change it into a String
                                                The next line is removing the square brackets from the new string value and
                                                storing it into the map
                                               */
                                               temp = arr.toString();
                                               temp = temp.substring(1, temp.length() - 1);
                                               map2.put(idName,temp);

                                               /*
                                                 the BufferedWriter object with an FileWriter as the output object with the text files path
                                                 The file writer append function is set to true as it is a boolean and needs to be set to working and not
                                                 write over the store information
                                               */
                                               upWrite = new BufferedWriter(new FileWriter("C:\\Users\\shaak\\Dropbox\\Shaakir Caroto-50216\\Introduction to Software Engineering\\Task 24\\Capstone_3.java\\src\\Projects.txt",true));

                                               // The for loop runs through the elements of the map and writes the elements
                                               // to the project file
                                               for (Map.Entry<String,String> m :map2.entrySet()){

                                                   // Using the append function to write the elements from the map to the text file
                                                   upWrite.append(m.getValue()).append("\n");
                                               }


                                           }else {

                                               // Else if the user has not fully paid
                                               // the project will display the balance left over
                                               System.out.println("The customer still owes: " + projectInfo.getOutstandingBal());

                                               // The project will create a new invoice for the customer
                                               System.out.println("The customer's new invoice: \n");

                                               // Setting the new balance to the array
                                               arr.set(8, String.valueOf(projectInfo.getOutstandingBal()));

                                               /*
                                                 This next lines of code are used to change the array list variable into a string
                                                 so that it can be stored in the map to b e written to the text file

                                                 Storing the arr in the temp variable and using the toString function of the array
                                                 to change it into a String
                                                 The next line is removing the square brackets from the new string value and
                                                 storing it into the map
                                               */
                                               temp = arr.toString();
                                               temp = temp.substring(1, temp.length() - 1);
                                               map2.put(idName,temp);

                                               /*
                                                 the BufferedWriter object with an FileWriter as the output object with the text files path
                                                 The file writer append function is set to true as it is a boolean and needs to be set to working and not
                                                 write over the store information
                                               */
                                               upWrite = new BufferedWriter(new FileWriter("C:\\Users\\shaak\\Dropbox\\Shaakir Caroto-50216\\Introduction to Software Engineering\\Task 24\\Capstone_3.java\\src\\Projects.txt", true));

                                               // The for loop runs through the elements of the map and writes the elements
                                               // to the project file
                                               for (Map.Entry<String, String> m : map2.entrySet()) {

                                                   // Using the append function to write the elements from the map to the text file
                                                   upWrite.append(m.getValue()).append("\n");
                                               }

                                               // displaying the information of the project
                                               System.out.println("The project number: " + arr.get(0));
                                               System.out.println("The project name: " + arr.get(1));
                                               System.out.println("The type of build: " + arr.get(2));
                                               System.out.println("The physical address of the project: " + arr.get(3));
                                               System.out.println("The ERF number of the project: " + arr.get(4));
                                               System.out.println("The deadline of the project: " + arr.get(5));
                                               System.out.println("The total amount of the project: R" + arr.get(6));
                                               System.out.println("The previous fee amount paid: R" + arr.get(7));
                                               System.out.println("The balance payable : R" + arr.get(8) + "\n");

                                               // Creating a file reader object with the customer text file path
                                               FileReader cusReader = new FileReader("C:\\Users\\shaak\\Dropbox\\Shaakir Caroto-50216\\Introduction to Software Engineering\\Task 24\\Capstone_3.java\\src\\Customers.txt");

                                               // Creating the BufferedReader object using the file reader object as the input data
                                               BufferedReader cusBuff = new BufferedReader(cusReader);

                                               // This is the string variable that will store the line of the BufferedReader lines
                                               String strCus;

                                               // This variable will be used to store the line that is equal to the user input
                                               String store = "";

                                               // This while loop will run until the lines in the text file are all read
                                               // Assigning the line of the text file to "strInfo"
                                               while ((strCus = cusBuff.readLine()) != null) {

                                                   // Splitting the lines from the text file to make an array of string
                                                   String[] words = strCus.split(",");

                                                   // A for loop to run through the element of the array
                                                   for (String word : words){

                                                      /*
                                                       Using an if statement to see if the user input is equal to an of the lines
                                                       elements
                                                      */
                                                       if (word.equals(cusName)){
                                                           // if any of the element equal the inputted string assign the line of
                                                           // string "strCus" to the storage holder of "store"
                                                           store = strCus;

                                                           //breaking the while loop
                                                           break;
                                                       }
                                                   }
                                               }

                                               // Creating an ArrayList to store the information that was found by the search
                                               // and splitting it
                                               ArrayList<String> cusArr = new ArrayList<>(Arrays.asList(store.split(",")));

                                               // displaying the information of the customer
                                               System.out.println("The customer's information\n");
                                               System.out.println("The full name: " + cusArr.get(0));
                                               System.out.println("The telephone number: " + cusArr.get(1));
                                               System.out.println("The email address: " + cusArr.get(2));
                                               System.out.println("The physical address: " + cusArr.get(3));

                                               // Closing the file
                                               cusBuff.close();
                                           }

                                           // Closing the file
                                           upWrite.close();

                                           // This break function is so the case end and does not continue to the next case
                                           break;


                                       // This is the case if the user wants to set the project as finalized
                                       case 3:

                                           // Telling the user what option they have selected
                                           System.out.println("You have chosen to finalised the project.");

                                           // adding a new element that shows the project has been finalized
                                           arr.add(9,"Finalise");

                                           // Telling the user that it is done
                                           System.out.println("The project has been finalised");

                                           /*
                                              This next lines of code are used to change the array list variable into a string
                                              so that it can be stored in the map to b e written to the text file

                                              Storing the arr in the temp variable and using the toString function of the array
                                              to change it into a String
                                              The next line is removing the square brackets from the new string value and
                                              storing it into the map
                                           */
                                           temp = arr.toString();
                                           temp = temp.substring(1, temp.length() - 1);
                                           map2.put(idName,temp);

                                           /*
                                              the BufferedWriter object with an FileWriter as the output object with the text files path
                                              The file writer append function is set to true as it is a boolean and needs to be set to working and not
                                              write over the store information
                                           */
                                           upWrite = new BufferedWriter(new FileWriter("C:\\Users\\shaak\\Dropbox\\Shaakir Caroto-50216\\Introduction to Software Engineering\\Task 24\\Capstone_3.java\\src\\Projects.txt",true));


                                           // The for loop runs through the elements of the map and writes the elements
                                           // to the project file
                                           for (Map.Entry<String,String> m :map2.entrySet()){

                                               // Using the append function to write the elements from the map to the text file
                                               upWrite.append(m.getValue()).append("\n");
                                           }

                                           // Closing the file
                                           upWrite.close();

                                           // This break function is so the case end and does not continue to the next case
                                           break;


                                       // Thia case is so the user can set that the project is complete and
                                       // check the inputted date
                                       case 4:

                                           // Telling the user what option they have selected
                                           System.out.println("You have chosen to set a project as completed\n");

                                           // Checking if the project has been finalized
                                           if (arr.get(9).equals("Finalise")) {

                                               // Asking the user to input the completion date
                                               System.out.println("Enter the date of the projects completion: \n");

                                               // Checking if the date is correct
                                               projectInfo.setCompleted();

                                               // Adding two new elements one for the date and one for the completed tag
                                               // for the project
                                               arr.add(10,projectInfo.getCompleted());
                                               arr.add(11,"Completed");

                                               /*
                                                This next lines of code are used to change the array list variable into a string
                                                so that it can be stored in the map to b e written to the text file

                                                Storing the arr in the temp variable and using the toString function of the array
                                                to change it into a String
                                                The next line is removing the square brackets from the new string value and
                                                storing it into the map
                                               */
                                               temp = arr.toString();
                                               temp = temp.substring(1, temp.length() - 1);
                                               map2.put(idName,temp);

                                               /*
                                                 the BufferedWriter object with an FileWriter as the output object with the text files path
                                                 The file writer append function is set to true as it is a boolean and needs to be set to working and not
                                                 write over the store information
                                               */
                                               BufferedWriter buffCom = new BufferedWriter(new FileWriter("C:\\Users\\shaak\\Dropbox\\Shaakir Caroto-50216\\Introduction to Software Engineering\\Task 24\\Capstone_3.java\\src\\Completed.txt",true));

                                               /*
                                                 the BufferedWriter object with an FileWriter as the output object with the text files path
                                                 The file writer append function is set to true as it is a boolean and needs to be set to working and not
                                                 write over the store information
                                               */
                                               upWrite = new BufferedWriter(new FileWriter("C:\\Users\\shaak\\Dropbox\\Shaakir Caroto-50216\\Introduction to Software Engineering\\Task 24\\Capstone_3.java\\src\\Projects.txt",true));

                                               // The for loop runs through the elements of the map and writes the elements
                                               // to the project file
                                               for (Map.Entry<String,String> m :map2.entrySet()){

                                                   // Using the append function to write the elements from the map to the text file
                                                   upWrite.append(m.getValue()).append("\n");
                                               }

                                               // Writing to the Complete file
                                               buffCom.append(temp).append("\n");

                                               //Closing the files
                                               buffCom.close();
                                               upWrite.close();

                                           }else{
                                               // If the project have not been finalized
                                               System.out.println("The project needs to be finalised first to be set to completed");
                                           }

                                           // This break function is so the case end and does not continue to the next case
                                           break;

                                       // When the user wants to continue to another function
                                       case 0:
                                            break;

                                       // If the user inputs something that is not one of the above cases
                                       default:
                                            System.out.println("The option selected was not found.");

                                   }

                                   //if the variable option equals 0
                                   if(option == 0){

                                       // Display the following method and the while loop will break so the user can continue
                                       System.out.println("You will go back to the main menu\n");
                                       break;
                                   }
                               }

                          }
                          else{

                              // If the user doesn't input the correct inputs
                              System.out.println("Option not found.");
                              System.out.println("Please try again.");
                          }

                       }
                       else{
                           //if the user doesn't want to edit the project
                           System.out.println("You will go back to the main menu");
                       }

                       // This break function is so the case end and does not continue to the next case
                       break;

                   // This case is if the user wants to view all of the complete tasks
                   case 3:

                       // Telling the user want they have selected
                       System.out.println("You have chosen to view all of the completed projects.");

                       /*
                         Creating a BufferedReader object with a FileReader as the output object
                         with the file path in the FileReader
                       */
                       BufferedReader cBR = new BufferedReader(new FileReader("C:\\Users\\shaak\\Dropbox\\Shaakir Caroto-50216\\Introduction to Software Engineering\\Task 24\\Capstone_3.java\\src\\Completed.txt"));

                       // Used to store the lines from the text file
                       String read;

                       // This while loop will run until the lines in the text file are all read
                       // Assigning the line of the text file to "read"
                       while((read = cBR.readLine()) != null){

                           // Splitting the lines from the text file into a array to be displayed in a user-friendly manner
                           String[] arrR = read.split(",");

                           // Displaying the array elements in a user-friendly manner
                           System.out.println("The project number: " + arrR[0]);
                           System.out.println("The project name: " + arrR[1]);
                           System.out.println("The type of build: " + arrR[2]);
                           System.out.println("The physical address of the project: " + arrR[3]);
                           System.out.println("The ERF number of the project: " + arrR[4]);
                           System.out.println("The deadline of the project: " + arrR[5]);
                           System.out.println("The total amount of the project: R" + arrR[6]);
                           System.out.println("The previous fee amount paid: R" + arrR[7]);
                           System.out.println("The balance payable : R" + arrR[8]);
                           System.out.println("Finalised: " + arrR[9]);
                           System.out.println("Completed: "+ arrR[10]);
                           System.out.println("The date of completion: " + arrR[11] + "\n");

                           // Calling the delay method to slow down the display of the information
                           delay();
                       }

                       // Closing the file
                       cBR.close();

                       // This break function is so the case end and does not continue to the next case
                       break;

                   // This case is if the user wants to view all of the customer details or add or update information
                   case 4:

                       // Telling the user want they have selected
                       System.out.println("You have chosen the customer's information option.\n");

                       /*
                        A while true loop to repeat going through the lines of code
                        So the program will continue you running until the user want to end the program
                       */
                       while (true) {

                           // Calling the menu method
                           menuOption4();

                           // Telling the user what to input
                           // And storing the input in a new created integer variable
                           System.out.print("Enter the option number: ");
                           int option4in = sc.nextInt();

                           // Creating a switch statement that will call a case based on the user input and allow them to
                           // do a task
                           // the switch statement is used due to the number of option that can be called
                           switch (option4in) {

                               // This case is if the user wants to view all of the customer details in a user-friendly manner
                               case 1:

                                   // Telling the user what option they have chosen
                                   System.out.println("You have chosen to view all of the customers.");

                                   /*
                       Creating a string array that will store the read information for the text file
                       And will use a for loop to run through the element to display the information in a
                       user-friendly manner
                       */
                                   String[] details;

                                   // Used to store the lines from the text file
                                   String str;

                                   /*
                         Creating a BufferedReader object with a FileReader as the output object
                         with the file path in the FileReader
                       */
                                   BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\shaak\\Dropbox\\Shaakir Caroto-50216\\Introduction to Software Engineering\\Task 24\\Capstone_3.java\\src\\Customers.txt"));

                                   // This while loop will run until the lines in the text file are all read
                                   // Assigning the line of the text file to "read"
                                   while ((str = br.readLine()) != null) {

                                       // Splitting the lines from the text file to make an array of string
                                       details = str.split(",");

                                       // Displaying the data in a user-friendly manner
                                       System.out.println("The customer's name: " + details[0]);
                                       System.out.println("The telephone number: " + details[1]);
                                       System.out.println("The email address: " + details[2]);
                                       System.out.println("The physical address: " + details[3]+"\n");


                                   }

                                   //Closing the file
                                   br.close();

                                   // Telling the user what to do next
                                   System.out.println("If you wish to change a Customer's information\n Search for the customers full name in option 2.");

                                   // This break function is so the case end and does not continue to the next case
                                   break;

                               // This case is if the user wants to edit the information of the searched for customer
                               case 2:

                                   // Telling the user what option they have chosen
                                   System.out.println("You have chosen to search for a customer details");

                                   // this is so the program doesn't skip the line below it
                                   sc.nextLine();

                                   // Telling the user what to do
                                   // And storing the input in a String variable
                                   System.out.print("Enter the customers full name and surname for the search: ");
                                   String fullName = sc.nextLine();

                                   /*
                         Creating a BufferedReader object with a FileReader as the output object
                         with the file path in the FileReader
                       */
                                   BufferedReader buffR = new BufferedReader(new FileReader("C:\\Users\\shaak\\Dropbox\\Shaakir Caroto-50216\\Introduction to Software Engineering\\Task 24\\Capstone_3.java\\src\\Customers.txt"));

                                   /*
                                   Creating a string array that will store the read information for the text file
                                   And will use a for loop to run through the element to search for the customer profile
                                   */
                                   String[] words;

                                   // This is the string variable that will store the line of the BufferedReader lines
                                   String s;

                                   // This variable will be used to store the line that is equal to the user input
                                   String info = "";

                                   /* This boolean variable is used to check if the item is found or not */
                                   boolean bFound = false;

                                   // This while loop will run until the lines in the text file are all read
                                   // Assigning the line of the text file to "s"
                                   while ((s = buffR.readLine()) != null) {

                                       // Splitting the lines from the text file to make an array of string
                                       words = s.split(",");

                                       // A for loop to run through the element of the array
                                       for (String word : words) {

                                            /*
                                            Using an if statement to see if the user input is equal to an of the lines
                                            elements
                                           */
                                           if (word.equals(fullName)) {

                                               // if any of the element equal the inputted string assign the line of
                                               // string "s" to the storage holder of "info"
                                               info = s;

                                               // Change bFound to true as the profile the user wants is found
                                               bFound = true;

                                               //breaking the while loop
                                               break;
                                           }
                                       }
                                   }

                                   // If bFound is true
                                   if (bFound) {

                                       // Telling the user that the profile was found
                                       System.out.println("The information for " + fullName + " has been found: ");

                                       // Making the splitting str into an array
                                       String[] infoArr = info.split(",");


                                       /*
                                        Assigning the element of the array info to the below variables
                                        for later uses
                                       */
                                       name = infoArr[0];
                                       telNo = infoArr[1];
                                       emailAd = infoArr[2];
                                       phyAddress = infoArr[3];

                                       // Displaying the information in a user-friendly manner
                                       System.out.println("The full name: " + name);
                                       System.out.println("The telephone number: " + telNo);
                                       System.out.println("The email address: " + emailAd);
                                       System.out.println("The physical address: " + phyAddress + "\n");

                                       // Closing the file
                                       buffR.close();

                                       // Telling the user what to input
                                       System.out.println("Please answer Yes or no");

                                       // Asking the user for input
                                       System.out.print("Would you like to update " + fullName + " information: ");

                                       // Storing the input and changing it to lowercase
                                       String ans = sc.nextLine();
                                       ans = ans.toLowerCase();

                                       // If the user inputs "yes"
                                       if (ans.equals("yes")){

                                           // Creating two file objects with the file paths in them
                                           File inputFile = new File("C:\\Users\\shaak\\Dropbox\\Shaakir Caroto-50216\\Introduction to Software Engineering\\Task 24\\Capstone_3.java\\src\\Customers.txt");
                                           File tempFile = new File("C:\\Users\\shaak\\Dropbox\\Shaakir Caroto-50216\\Introduction to Software Engineering\\Task 24\\Capstone_3.java\\src\\TempDel.txt");

                                           // Created two Buffered object one to read the inputfile(customer file) and the other to write to the tempFile
                                           BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                                           BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile,true));

                                           // This is the string variable that will store the line of the BufferedReader lines
                                           String s1;

                                           // This while loop will run until the lines in the text file are all read
                                           // Assigning the line of the text file to "s1"
                                           while((s1 = reader.readLine()) != null) {

                                               // Creating a string object to store the text without the unicode from
                                               // the text file
                                               String trimmedLine = s1.trim();

                                               // The trimmedLine variable string is equal to info then it will be skipped
                                               if(trimmedLine.equals(info)) continue;

                                               //Writing the string valued s1 to the new text file
                                               writer.append(s1 + System.getProperty("line.separator"));
                                           }

                                           // Closing the files
                                           writer.close();
                                           reader.close();

                                           // Deleting the old file
                                           inputFile.delete();

                                           // Renaming the tempFile to the new Customer file
                                           tempFile.renameTo(new File("C:\\Users\\shaak\\Dropbox\\Shaakir Caroto-50216\\Introduction to Software Engineering\\Task 24\\Capstone_3.java\\src\\Customers.txt"));

                                           //Splitting the string value of info into an arr
                                           String[] upInfo = info.split(",");

                                           // Storing the user input name that has been found to an attribute in the detailsClass
                                           customerInfo.setName2(fullName);

                                           /*
                                            Asking the user for input and telling them what to input
                                            */
                                           System.out.println("Enter the correct information for the following details.");
                                           System.out.print("The new telephone number: ");
                                           customerInfo.setTelNo();
                                           System.out.print("The new email address: ");
                                           customerInfo.setEmail();
                                           System.out.print("The new physical address: ");
                                           customerInfo.setPhyAddress();

                                           // Storing the values of the classes attribute in locally created variables
                                           upInfo[0] = customerInfo.getName();
                                           upInfo[1] = customerInfo.getTelNo();
                                           upInfo[2] = customerInfo.getEmail();
                                           upInfo[3] = customerInfo.getPhyAddress();

                                           // Displaying the new information to the user
                                           System.out.println("The updated information: \n");
                                           System.out.println(customerInfo.toString());

                                           /* Creating a BufferedWriter object to write the updates to the file */
                                           BufferedWriter fileUP = new BufferedWriter(new FileWriter("C:\\Users\\shaak\\Dropbox\\Shaakir Caroto-50216\\Introduction to Software Engineering\\Task 24\\Capstone_3.java\\src\\Customers.txt",true));

                                           // Writing the information to the file
                                           // And displaying a message to the user
                                           fileUP.append(upInfo[0]).append(",").append(upInfo[1]).append(",").append(upInfo[2]).append(",").append(upInfo[3]).append("\n");
                                           System.out.println("Update complete.");

                                           // Closing the file
                                           fileUP.close();
                                       }
                                       else{
                                           //if the user doesn't want to edit anything
                                           // the message will display
                                           System.out.println("Enter 0 if you wish to go back to the main menu\n");

                                           // Closing the file
                                           buffR.close();
                                       }


                                   } else {
                                       // If the record was not found
                                       // The following messages will display
                                       System.out.println("The information that have been looking for was not found");
                                       System.out.println("Please try the process again \n");
                                   }

                                   // Closing the file
                                   buffR.close();

                                   // This break function is so the case end and does not continue to the next case
                                   break;

                               // This case is if the user wants to add a new customer to the text file
                               case 3:

                                   // Displaying to the user what option they have picked and what they will need to do
                                   System.out.println("You can now add a new customer's information to the database\nFill in the following information : ");

                                   /*
                                    Telling the user what they will need to input
                                    And calling the setter methods from the DetailsClass to get the inputs for the user
                                    And checking if the inputs are correct
                                   */
                                   System.out.print("Enter the Customer Full Name: ");
                                   customerInfo.setName();
                                   System.out.print("Enter the Customer's Telephone Number: ");
                                   customerInfo.setTelNo();
                                   System.out.print("Enter the Customer's Email Address: ");
                                   customerInfo.setEmail();
                                   System.out.print("Enter the Customer's Physical Address: ");
                                   customerInfo.setPhyAddress();

                                   /*
                                    Using the getter method to store the values of the attributes from the DetailsClass
                                    This variable declared in this class
                                   */
                                   name = customerInfo.getName();
                                   telNo = customerInfo.getTelNo();
                                   emailAd = customerInfo.getEmail();
                                   phyAddress = customerInfo.getPhyAddress();

                                   /*
                                    Creating a BufferedWriter object with an FileWriter as the output object with the text files path
                                    The file writer append function is set to true as it is a boolean and needs to be set to working and not
                                    write over the store information
                                   */
                                   BufferedWriter customerWrite = new BufferedWriter(new FileWriter("C:\\Users\\shaak\\Dropbox\\Shaakir Caroto-50216\\Introduction to Software Engineering\\Task 24\\Capstone_3.java\\src\\Customers.txt",true));

                                   // Appending the new information to the text file using the append method
                                   // for the BufferedWriter
                                   customerWrite.append(name).append(",").append(telNo).append(",").append(emailAd).append(",").append(phyAddress).append("\n");

                                   //Closing the file
                                   customerWrite.close();

                                   // Telling the user the task is done
                                   System.out.println("The information have been saved");

                                   // Telling the user want  to do next
                                   System.out.println("Enter 0 if you wish to go back to the main menu\n");

                                   break;

                               // if the user wants to end the program
                               case 0:
                                   break;

                               //This is if the user input something that is not seen as an option
                               default:

                                   // Displaying messages to the user
                                   System.out.println("The option you have input is incorrect");
                                   System.out.println("Please try again\n");
                           }

                           //if the variable option4in equals 0
                           if (option4in == 0) {

                               // Display the following method and the while loop will break so the user can continue
                               System.out.println("You will go back to the main menu.");
                               break;
                           }
                       }

                       // This break function is so the case end and does not continue to the next case
                       break;

                   // This case is if the user wants to view all of the contractor details or add or update information
                   case 5:

                       // Telling the user want they have selected
                       System.out.println("You have chosen the contractor's information option.\n");

                       /*
                        A while true loop to repeat going through the lines of code
                        So the program will continue you running until the user want to end the program
                       */
                       while (true){

                           // Calling the menu method
                           menuOption5();

                           /*
                            Telling the user what to input
                            And storing the input in a new created integer variable
                           */
                           System.out.print("Enter the option number: ");
                           int option5in = sc.nextInt();


                           /*
                            Creating a switch statement that will call a case based on the user input and allow them to
                            do a task
                            the switch statement is used due to the number of option that can be called
                           */
                           switch (option5in){

                               // This case is if the user wants to view all of the contractor details in a user-friendly manner
                               case 1:

                                   // Telling the user what option they have chosen
                                   System.out.println("You have chosen to view all of the contractors.");


                                   /*
                                    Creating a string array that will store the read information for the text file
                                    And will use a for loop to run through the element to display the information in a
                                    user-friendly manner
                                   */
                                   String[] details;

                                   // Used to store the lines from the text file
                                   String str;

                                   /*
                                    Creating a BufferedReader object with a FileReader as the output object
                                    with the file path in the FileReader
                                   */
                                   BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\shaak\\Dropbox\\Shaakir Caroto-50216\\Introduction to Software Engineering\\Task 24\\Capstone_3.java\\src\\Contractors.txt"));

                                   // This while loop will run until the lines in the text file are all read
                                   // Assigning the line of the text file to "read"
                                   while ((str = br.readLine()) != null) {

                                       // Splitting the lines from the text file to make an array of string
                                       details = str.split(",");

                                       // Displaying the data in a user-friendly manner
                                       System.out.println("The contractor's name: " + details[0]);
                                       System.out.println("The telephone number: " + details[1]);
                                       System.out.println("The email address: " + details[2]);
                                       System.out.println("The physical address: " + details[3] + "\n");


                                   }


                                   //Closing the file
                                   br.close();

                                   // Telling the user what to do next
                                   System.out.println("If you wish to change a Contractor's information\n Search for the contractors full name in option 2.");

                                   // This break function is so the case end and does not continue to the next case
                                   break;


                               // This case is if the user wants to edit the information of the searched for contractor
                               case 2:

                                   // Telling the user what option they have chosen
                                   System.out.println("You have chosen to search for a contractor details");

                                   // this is so the program doesn't skip the line below it
                                   sc.nextLine();

                                   // Telling the user what to do
                                   // And storing the input in a String variable
                                   System.out.print("Enter the contractors full name and surname for the search: ");
                                   String fullName = sc.nextLine();

                                   /*
                                    Creating a BufferedReader object with a FileReader as the output object
                                    with the file path in the FileReader
                                   */
                                   BufferedReader buffR = new BufferedReader(new FileReader("C:\\Users\\shaak\\Dropbox\\Shaakir Caroto-50216\\Introduction to Software Engineering\\Task 24\\Capstone_3.java\\src\\Contractors.txt"));

                                   /*
                                   Creating a string array that will store the read information for the text file
                                   And will use a for loop to run through the element to search for the customer profile
                                   */
                                   String[] words;

                                   // This is the string variable that will store the line of the BufferedReader lines
                                   String s;

                                   // This variable will be used to store the line that is equal to the user input
                                   String info = "";

                                   /* This boolean variable is used to check if the item is found or not */
                                   boolean bFound = false;

                                   // This while loop will run until the lines in the text file are all read
                                   // Assigning the line of the text file to "s"
                                   while ((s = buffR.readLine()) != null) {

                                       // Splitting the lines from the text file to make an array of string
                                       words = s.split(",");

                                       // A for loop to run through the element of the array
                                       for (String word : words) {

                                            /*
                                            Using an if statement to see if the user input is equal to an of the lines
                                            elements
                                           */
                                           if (word.equals(fullName)) {

                                               // if any of the element equal the inputted string assign the line of
                                               // string "s" to the storage holder of "info"
                                               info = s;

                                               // Change bFound to true as the profile the user wants is found
                                               bFound = true;

                                               //breaking the while loop
                                               break;
                                           }
                                       }
                                   }

                                   // If bFound is true
                                   if (bFound) {

                                       // Telling the user that the profile was found
                                       System.out.println("The information for " + fullName + " has been found: ");

                                       // Making the splitting str into an array
                                       String[] infoArr = info.split(",");

                                       /*
                                        Assigning the element of the array info to the below variables
                                        for later uses
                                       */
                                       name = infoArr[0];
                                       telNo = infoArr[1];
                                       emailAd = infoArr[2];
                                       phyAddress = infoArr[3];

                                       // Displaying the information in a user-friendly manner
                                       System.out.println("The full name: " + name);
                                       System.out.println("The telephone number: " + telNo);
                                       System.out.println("The email address: " + emailAd);
                                       System.out.println("The physical address: " + phyAddress + "\n");

                                       // Closing the file
                                       buffR.close();

                                       // Telling the user what to input
                                       System.out.println("Please answer Yes or no");

                                       // Asking the user for input
                                       System.out.print("Would you like to update " + fullName + " information: ");

                                       // Storing the input and changing it to lowercase
                                       String ans = sc.nextLine();
                                       ans = ans.toLowerCase();

                                       // If the user inputs "yes"
                                       if (ans.equals("yes")){

                                           // Creating two file objects with the file paths in them
                                           File inputFile = new File("C:\\Users\\shaak\\Dropbox\\Shaakir Caroto-50216\\Introduction to Software Engineering\\Task 24\\Capstone_3.java\\src\\Contractors.txt");
                                           File tempFile = new File("C:\\Users\\shaak\\Dropbox\\Shaakir Caroto-50216\\Introduction to Software Engineering\\Task 24\\Capstone_3.java\\src\\TempDel.txt");

                                           // Created two Buffered object one to read the input file(contractor file) and the other to write to the tempFile
                                           BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                                           BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile,true));

                                           // This is the string variable that will store the line of the BufferedReader lines
                                           String s1;

                                           // This while loop will run until the lines in the text file are all read
                                           // Assigning the line of the text file to "s1"
                                           while((s1 = reader.readLine()) != null) {
                                               // Creating a string object to store the text without the unicode from
                                               // the text file
                                               String trimmedLine = s1.trim();

                                               // The trimmedLine variable string is equal to info then it will be skipped
                                               if(trimmedLine.equals(info)) continue;

                                               //Writing the string valued s1 to the new text file
                                               writer.append(s1 + System.getProperty("line.separator"));
                                           }

                                           // Closing the files
                                           writer.close();
                                           reader.close();

                                           // Deleting the old file
                                           inputFile.delete();

                                           // Renaming the tempFile to the new Contractor file
                                           tempFile.renameTo(new File("C:\\Users\\shaak\\Dropbox\\Shaakir Caroto-50216\\Introduction to Software Engineering\\Task 24\\Capstone_3.java\\src\\Contractors.txt"));

                                           //Splitting the string value of info into an arr
                                           String[] upInfo = info.split(",");

                                           // Storing the user input name that has been found to an attribute in the ConClass
                                           contractorInfo.setName2(fullName);

                                           /*
                                            Asking the user for input and telling them what to input
                                            */
                                           System.out.println("Enter the correct information for the following details.");
                                           System.out.print("The new telephone number: ");
                                           contractorInfo.setTelNo();
                                           System.out.print("The new email address: ");
                                           contractorInfo.setEmail();
                                           System.out.print("The new physical address: ");
                                           contractorInfo.setPhyAddress();

                                           // Storing the values of the classes attribute in locally created variables
                                           upInfo[0] = contractorInfo.getName();
                                           upInfo[1] = contractorInfo.getTelNo();
                                           upInfo[2] = contractorInfo.getEmail();
                                           upInfo[3] = contractorInfo.getPhyAddress();

                                           // Displaying the new information to the user
                                           System.out.println("The updated information: \n");
                                           System.out.println(contractorInfo.toString());

                                           /* Creating a BufferedWriter object to write the updates to the file */
                                           BufferedWriter fileUP = new BufferedWriter(new FileWriter("C:\\Users\\shaak\\Dropbox\\Shaakir Caroto-50216\\Introduction to Software Engineering\\Task 24\\Capstone_3.java\\src\\Contractors.txt",true));

                                           // Writing the information to the file
                                           // And displaying a message to the user
                                           fileUP.append(upInfo[0]).append(",").append(upInfo[1]).append(",").append(upInfo[2]).append(",").append(upInfo[3]).append("\n");
                                           System.out.println("Update complete.");

                                           // Closing the file
                                           fileUP.close();
                                       }
                                       else{
                                           //if the user doesn't want to edit anything
                                           // the message will display
                                           System.out.println("Enter 0 if you wish to go back to the main menu\n");

                                           // Closing the file
                                           buffR.close();
                                       }

                                   } else {
                                       // If the record was not found
                                       // The following messages will display
                                       System.out.println("The information that have been looking for was not found");
                                       System.out.println("Please try the process again \n");
                                   }

                                   // Closing the file
                                   buffR.close();

                                   // This break function is so the case end and does not continue to the next case
                                   break;


                               // This case is if the user wants to add a new contractor to the text file
                               case 3:

                                   // Displaying to the user what option they have picked and what they will need to do
                                   System.out.println("You can now add a new  Contractor's information to the database\nFill in the following information : ");

                                   /*
                                    Telling the user what they will need to input
                                    And calling the setter methods from the ConClass to get the inputs for the user
                                    And checking if the inputs are correct
                                   */
                                   System.out.print("Enter the Contractor's Full Name: ");
                                   contractorInfo.setName();
                                   System.out.print("Enter the Contractor's Telephone Number: ");
                                   contractorInfo.setTelNo();
                                   System.out.print("Enter the Contractor's Email Address: ");
                                   contractorInfo.setEmail();
                                   System.out.print("Enter the Contractor's Physical Address: ");
                                   contractorInfo.setPhyAddress();

                                   /*
                                    Using the getter method to store the values of the attributes from the ConClass
                                    This variable declared in this class
                                   */
                                   name = contractorInfo.getName();
                                   telNo = contractorInfo.getTelNo();
                                   emailAd = contractorInfo.getEmail();
                                   phyAddress = contractorInfo.getPhyAddress();

                                   /*
                                    Creating a BufferedWriter object with an FileWriter as the output object with the text files path
                                    The file writer append function is set to true as it is a boolean and needs to be set to working and not
                                    write over the store information
                                   */
                                   BufferedWriter contractorWriter = new BufferedWriter(new FileWriter("C:\\Users\\shaak\\Dropbox\\Shaakir Caroto-50216\\Introduction to Software Engineering\\Task 24\\Capstone_3.java\\src\\Contractors.txt",true));

                                   // Appending the new information to the text file using the append method
                                   // for the BufferedWriter
                                   contractorWriter.append(name).append(",").append(telNo).append(",").append(emailAd).append(",").append(phyAddress).append("\n");

                                   //Closing the file
                                   contractorWriter.close();

                                   // Telling the user the task is done
                                   System.out.println("The information have been saved");

                                   // Telling the user want to do next
                                   System.out.println("Enter 0 if you wish to go back to the main menu\n");

                                   break;

                               // if the user wants to end the program
                               case 0:
                                   break;

                               //This is if the user input something that is not seen as an option
                               default:

                                   // Displaying messages to the user
                                   System.out.println("The option you have input is incorrect");
                                   System.out.println("Please try again\n");
                           }

                           //if the variable option5in equals 0
                           if (option5in == 0) {

                               // Display the following method and the while loop will break so the user can continue
                               System.out.println("You will go back to the main menu.");
                               break;
                           }
                       }

                       // This break function is so the case end and does not continue to the next case
                       break;

                   // This case is if the user wants to view all of the architect details or add or update information
                   case 6:

                       // Telling the user want they have selected
                       System.out.println("You have chosen the architect's information option.\n");

                       // A while true loop to repeat going through the lines of code
                       // So the program will continue you running until the user want to end the program
                       while(true){
                           // Calling the menu method
                           menuOption6();

                           /*
                            Telling the user what to input
                            And storing the input in a new created integer variable
                           */
                           System.out.print("Enter the option number: ");
                           int option6in = sc.nextInt();

                           /*
                            Creating a switch statement that will call a case based on the user input and allow them to
                            do a task
                            the switch statement is used due to the number of option that can be called
                           */
                           switch (option6in){

                               // This case is if the user wants to view all of the architects details in a user-friendly manner
                               case 1:

                                   // Telling the user what option they have chosen
                                   System.out.println("You have chosen to view all of the architects.");

                                   /*
                                    Creating a string array that will store the read information for the text file
                                    And will use a for loop to run through the element to display the information in a
                                    user-friendly manner
                                   */
                                   String[] details;

                                   // Used to store the lines from the text file
                                   String str;

                                   /*
                                    Creating a BufferedReader object with a FileReader as the output object
                                    with the file path in the FileReader
                                   */
                                   BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\shaak\\Dropbox\\Shaakir Caroto-50216\\Introduction to Software Engineering\\Task 24\\Capstone_3.java\\src\\Architects.txt"));

                                   // This while loop will run until the lines in the text file are all read
                                   // Assigning the line of the text file to "read"
                                   while ((str = br.readLine()) != null) {

                                       // Splitting the lines from the text file to make an array of string
                                       details = str.split(",");

                                       // Displaying the data in a user-friendly manner
                                       System.out.println("The architect's name: " + details[0]);
                                       System.out.println("The telephone number: " + details[1]);
                                       System.out.println("The email address: " + details[2]);
                                       System.out.println("The physical address: " + details[3] + "\n");

                                   }

                                   //Closing the file
                                   br.close();

                                   // Telling the user what to do next
                                   System.out.println("If you wish to change a Architect's information\n Search for the architects full name in option 2.");

                                   // This break function is so the case end and does not continue to the next case
                                   break;


                               // This case is if the user wants to edit the information of the searched for architect
                               case 2:

                                   // Telling the user what option they have chosen
                                   System.out.println("You have chosen to search for a architect details");

                                   // this is so the program doesn't skip the line below it
                                   sc.nextLine();

                                   // Telling the user what to do
                                   // And storing the input in a String variable
                                   System.out.print("Enter the architects full name and surname for the search: ");
                                   String fullName = sc.nextLine();

                                   /*
                                    Creating a BufferedReader object with a FileReader as the output object
                                    with the file path in the FileReader
                                   */
                                   BufferedReader buffR = new BufferedReader(new FileReader("C:\\Users\\shaak\\Dropbox\\Shaakir Caroto-50216\\Introduction to Software Engineering\\Task 24\\Capstone_3.java\\src\\Architects.txt"));

                                   /*
                                   Creating a string array that will store the read information for the text file
                                   And will use a for loop to run through the element to search for the customer profile
                                   */
                                   String[] words;

                                   // This is the string variable that will store the line of the BufferedReader lines
                                   String s;

                                   // This variable will be used to store the line that is equal to the user input
                                   String info = "";

                                   /* This boolean variable is used to check if the item is found or not */
                                   boolean bFound = false;

                                   // This while loop will run until the lines in the text file are all read
                                   // Assigning the line of the text file to "s"
                                   while ((s = buffR.readLine()) != null) {

                                       // Splitting the lines from the text file to make an array of string
                                       words = s.split(",");

                                       // A for loop to run through the element of the array
                                       for (String word : words) {

                                            /*
                                            Using an if statement to see if the user input is equal to an of the lines
                                            elements
                                           */
                                           if (word.equals(fullName)) {

                                               // if any of the element equal the inputted string assign the line of
                                               // string "s" to the storage holder of "info"
                                               info = s;

                                               // Change bFound to true as the profile the user wants is found
                                               bFound = true;

                                               //breaking the while loop
                                               break;
                                           }
                                       }
                                   }

                                   // If bFound is true
                                   if (bFound) {

                                       // Telling the user that the profile was found
                                       System.out.println("The information for " + fullName + " has been found: ");

                                       // Making the splitting str into an array
                                       String[] infoArr = info.split(",");

                                       /*
                                        Assigning the element of the array info to the below variables
                                        for later uses
                                       */
                                       name = infoArr[0];
                                       telNo = infoArr[1];
                                       emailAd = infoArr[2];
                                       phyAddress = infoArr[3];

                                       // Displaying the information in a user-friendly manner
                                       System.out.println("The full name: " + name);
                                       System.out.println("The telephone number: " + telNo);
                                       System.out.println("The email address: " + emailAd);
                                       System.out.println("The physical address: " + phyAddress + "\n");

                                       // Closing the file
                                       buffR.close();

                                       // Telling the user what to input
                                       System.out.println("Please answer Yes or no");

                                       // Asking the user for input
                                       System.out.print("Would you like to update " + fullName + " information: ");

                                       // Storing the input and changing it to lowercase
                                       String ans = sc.nextLine();
                                       ans = ans.toLowerCase();

                                       // If the user inputs "yes"
                                       if (ans.equals("yes")){

                                           // Creating two file objects with the file paths in them
                                           File inputFile = new File("C:\\Users\\shaak\\Dropbox\\Shaakir Caroto-50216\\Introduction to Software Engineering\\Task 24\\Capstone_3.java\\src\\Architects.txt");
                                           File tempFile = new File("C:\\Users\\shaak\\Dropbox\\Shaakir Caroto-50216\\Introduction to Software Engineering\\Task 24\\Capstone_3.java\\src\\TempDel.txt");

                                           // Created two Buffered object one to read the input file(Architect file) and the other to write to the tempFile
                                           BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                                           BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile,true));

                                           // This is the string variable that will store the line of the BufferedReader lines
                                           String s1;

                                           // This while loop will run until the lines in the text file are all read
                                           // Assigning the line of the text file to "s1"
                                           while((s1 = reader.readLine()) != null) {
                                               // Creating a string object to store the text without the unicode from
                                               // the text file
                                               String trimmedLine = s1.trim();

                                               // The trimmedLine variable string is equal to info then it will be skipped
                                               if(trimmedLine.equals(info)) continue;

                                               //Writing the string valued s1 to the new text file
                                               writer.append(s1 + System.getProperty("line.separator"));
                                           }

                                           // Closing the files
                                           writer.close();
                                           reader.close();

                                           // Deleting the old file
                                           inputFile.delete();

                                           // Renaming the tempFile to the new Contractor file
                                           tempFile.renameTo(new File("C:\\Users\\shaak\\Dropbox\\Shaakir Caroto-50216\\Introduction to Software Engineering\\Task 24\\Capstone_3.java\\src\\Architects.txt"));

                                           //Splitting the string value of info into an arr
                                           String[] upInfo = info.split(",");

                                           // Storing the user input name that has been found to an attribute in the ArcClass
                                           architectInfo.setName2(fullName);

                                           /*
                                            Asking the user for input and telling them what to input
                                            */
                                           System.out.println("Enter the correct information for the following details.");
                                           System.out.print("The new telephone number: ");
                                           architectInfo.setTelNo();
                                           System.out.print("The new email address: ");
                                           architectInfo.setEmail();
                                           System.out.print("The new physical address: ");
                                           architectInfo.setPhyAddress();

                                           // Storing the values of the classes attribute in locally created variables
                                           upInfo[0] = architectInfo.getName();
                                           upInfo[1] = architectInfo.getTelNo();
                                           upInfo[2] = architectInfo.getEmail();
                                           upInfo[3] = architectInfo.getPhyAddress();

                                           // Displaying the new information to the user
                                           System.out.println("The updated information: \n");
                                           System.out.println(architectInfo.toString());

                                           /* Creating a BufferedWriter object to write the updates to the file */
                                           BufferedWriter fileUP = new BufferedWriter(new FileWriter("C:\\Users\\shaak\\Dropbox\\Shaakir Caroto-50216\\Introduction to Software Engineering\\Task 24\\Capstone_3.java\\src\\Architects.txt",true));

                                           // Writing the information to the file
                                           // And displaying a message to the user
                                           fileUP.append(upInfo[0]).append(",").append(upInfo[1]).append(",").append(upInfo[2]).append(",").append(upInfo[3]).append("\n");
                                           System.out.println("Update complete.");

                                           // Closing the file
                                           fileUP.close();
                                       }
                                       else{
                                           //if the user doesn't want to edit anything
                                           // the message will display
                                           System.out.println("Enter 0 if you wish to go back to the main menu\n");

                                           // Closing the file
                                           buffR.close();
                                       }

                                   } else {
                                       // If the record was not found
                                       // The following messages will display
                                       System.out.println("The information that have been looking for was not found");
                                       System.out.println("Please try the process again \n");
                                   }

                                   // Closing the file
                                   buffR.close();

                                   // This break function is so the case end and does not continue to the next case
                                   break;

                               // This case is if the user wants to add a new Architect to the text file
                               case 3:

                                   // Displaying to the user what option they have picked and what they will need to do
                                   System.out.println("You can now add a new Architect's information to the database\nFill in the following information : ");

                                   /*
                                    Telling the user what they will need to input
                                    And calling the setter methods from the ArcClass to get the inputs for the user
                                    And checking if the inputs are correct
                                   */
                                   System.out.print("Enter the Architect's Full Name: ");
                                   architectInfo.setName();
                                   System.out.print("Enter the Architect's Telephone Number: ");
                                   architectInfo.setTelNo();
                                   System.out.print("Enter the Architect's Email Address: ");
                                   architectInfo.setEmail();
                                   System.out.print("Enter the Architect's Physical Address: ");
                                   architectInfo.setPhyAddress();

                                   /*
                                    Using the getter method to store the values of the attributes from the ArcClass
                                    This variable declared in this class
                                   */
                                   name = architectInfo.getName();
                                   telNo = architectInfo.getTelNo();
                                   emailAd = architectInfo.getEmail();
                                   phyAddress = architectInfo.getPhyAddress();

                                   /*
                                    Creating a BufferedWriter object with an FileWriter as the output object with the text files path
                                    The file writer append function is set to true as it is a boolean and needs to be set to working and not
                                    write over the store information
                                   */
                                   BufferedWriter architectWriter = new BufferedWriter(new FileWriter("C:\\Users\\shaak\\Dropbox\\Shaakir Caroto-50216\\Introduction to Software Engineering\\Task 24\\Capstone_3.java\\src\\Architects.txt",true));

                                   // Appending the new information to the text file using the append method
                                   // for the BufferedWriter
                                   architectWriter.append(name).append(",").append(telNo).append(",").append(emailAd).append(",").append(phyAddress).append("\n");

                                   //Closing the file
                                   architectWriter.close();

                                   // Telling the user the task is done
                                   System.out.println("The information have been saved");

                                   // Telling the user want  to do next
                                   System.out.println("Enter 0 if you wish to go back to the main menu\n");

                                   break;

                               // if the user wants to end the program
                               case 0:
                                   break;

                               //This is if the user input something that is not seen as an option
                               default:

                                   // Displaying messages to the user
                                   System.out.println("The option you have input is incorrect");
                                   System.out.println("Please try again\n");
                           }

                           //if the variable option6in equals 0
                           if (option6in == 0) {

                               // Display the following method and the while loop will break so the user can continue
                               System.out.println("You will go back to the main menu.");
                               break;
                           }
                       }

                       // This break function is so the case end and does not continue to the next case
                       break;

                   // This case is the statistic options that show the user the number of project and other information
                   // about the projects
                   case 7:

                       // Telling the user want they have selected
                       System.out.println("You have chosen to see the statistics");

                       /*
                        Creating a BufferedReader object with a FileReader as the output object
                        with the file path in the FileReader
                       */
                       cBR = new BufferedReader(new FileReader("C:\\Users\\shaak\\Dropbox\\Shaakir Caroto-50216\\Introduction to Software Engineering\\Task 24\\Capstone_3.java\\src\\Completed.txt"));

                       // Used as a counter to count the number of records
                       int num = 0;

                       //Telling the user want is being displayed
                       System.out.println("List of project the are completed \n");

                       // This while loop will run until the lines in the text file are all read
                       // Assigning the line of the text file to "read"
                       while((read = cBR.readLine()) != null){

                           // Splitting the read lines and storing them in a array
                           String[] arrR = read.split(",");

                           // Displaying in a user-friendly manner
                           System.out.println("The project number: " + arrR[0]);
                           System.out.println("The project name: " + arrR[1]);
                           System.out.println("The type of build: " + arrR[2]);
                           System.out.println("The physical address of the project: " + arrR[3]);
                           System.out.println("The ERF number of the project: " + arrR[4]);
                           System.out.println("The deadline of the project: " + arrR[5]);
                           System.out.println("The total amount of the project: R" + arrR[6]);
                           System.out.println("The previous fee amount paid: R" + arrR[7]);
                           System.out.println("The balance payable : R" + arrR[8]);
                           System.out.println("Finalised: " + arrR[9]);
                           System.out.println("Completed: "+ arrR[10]);
                           System.out.println("The date of completion: " + arrR[11] + "\n");

                           // Increasing the counter by 1
                           num++;

                           // Calling the delay method
                           delay();
                       }

                       // Displaying the information to the user
                       System.out.println("The number of project that are completed are : " +  num + "\n");

                       // Closing the text file
                       cBR.close();

                       //Telling the user want is being displayed
                       System.out.println("The list of project that are past the due date \n");

                       /*
                        Creating a BufferedReader object with a FileReader as the output object
                        with the file path in the FileReader
                       */
                       BufferedReader pastBuff = new BufferedReader(new FileReader("C:\\Users\\shaak\\Dropbox\\Shaakir Caroto-50216\\Introduction to Software Engineering\\Task 24\\Capstone_3.java\\src\\Projects.txt"));

                       // Storing the lines read from the text file
                       String past;

                       // Used as a counter to count the number of records
                       int pastNum = 0;

                       // This while loop will run until the lines in the text file are all read
                       // Assigning the line of the text file to "past"
                       while((past = pastBuff.readLine()) != null){

                           // Splitting the read lines and storing them in a array
                           String[] arr = past.split(",");

                           // If there is a valid input then the program will continue
                           // Creating a SimpleDateFormat object
                           // This is used to set a date pattern for the input
                           SimpleDateFormat dtf = new SimpleDateFormat("dd/MM/yyyy");

                           // Giving the current date to be compare to the project set date
                           Date now = new Date();

                           // Setting the date to the dft pattern set above
                           Date current = dtf.parse(dtf.format(now));

                           // Storing the deadline date
                           String store = arr[5];

                           // Converting string set date to a date and set to pattern
                           Date datePro = dtf.parse(store);

                           // If the date is before the current date the counter will increase
                           if (current.before(datePro)){

                               // Increasing the counter by 1
                               pastNum ++;

                               // Displaying in a user-friendly manner
                               System.out.println("The project number: " + arr[0]);
                               System.out.println("The project name: " + arr[1]);
                               System.out.println("The type of build: " + arr[2]);
                               System.out.println("The physical address of the project: " + arr[3]);
                               System.out.println("The ERF number of the project: " + arr[4]);
                               System.out.println("The deadline of the project: " + arr[5]);
                               System.out.println("The total amount of the project: R" + arr[6]);
                               System.out.println("The previous fee amount paid: R" + arr[7]);
                               System.out.println("The balance payable : R" + arr[8] + "\n");

                               // Calling the delay method
                               delay();
                           }
                       }

                       // Displaying the information to the user
                       System.out.println("The number of project past the due date are : " + pastNum + "\n");

                       // Closing the text file
                       pastBuff.close();

                       // This break function is so the case end and does not continue to the next case
                       break;

                   // if the user wants to end the program
                   case 0:
                       break;

                   //This is if the user input something that is not seen as an option
                   default:

                       // Displaying messages to the user
                       System.out.println("Option not found");
                       System.out.println("Please try again\nYou will go back to the main menu");
                       break;
               }

               /*
                if the user inputs 0
                following message will display and the program will end
               */
               if(input == 0){

                   //The following messages will display
                   System.out.println("All the information have been write to the correct files");
                   System.out.println("You have exited the program.");

                   // The program will end
                   break;
               }

               /*
                This is the catch part of the try catch statement
                if any of these errors are found the program will display the follows messages
                And what error was found
               */
           } catch(IndexOutOfBoundsException | IOException | NoSuchElementException | ParseException | IllegalArgumentException e) {

               // Telling the user what error have been found
               System.out.println("The error is "  + e + "\n");

               //Telling the user that the program will end
               System.out.println("An error was found");
               System.out.println("The project will terminate");

               // Breaking the while true loop
               // and close the program
               break;
           }


        }

    }
}