/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * A class that stores information from the user's account text file and generates neat-looking paragraphs listing reservations and notifications. 
 * @author Ryan
 */

import java.io.File;
import java.util.Scanner;

public class Account {
    private String username, password, reservations, notifications;
    private Boolean managerFlag;
    private String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    private String[] roomNames = {"", "Executive Room", "Extravagant Room", "Opulent Room"};
    
 /**
  * A constructor that scans each line of the user's account text file and stores the corresponding Strings as class attributes.
  * @param name
  * User's username
  * @throws Exception
  * Indicates that a file for the inputted username does not exist
  */   
    public Account(String name) throws Exception {
        File file = new File((name + ".txt"));
        Scanner sc = new Scanner(file);
        username = name;
        password = sc.nextLine();
        reservations = sc.nextLine();
        notifications = sc.nextLine();
        managerFlag = sc.nextBoolean();
    }
    
    /**
     * Parses the reservations class attribute and generates a list of reservations that will look nice in a text box
     * @return
     * The multi-line String that will be displayed in a text box
     */
    
    public String checkReservations(){
        String output = "", concatTemp, tempString;
        int tempInt;
        Scanner sc = new Scanner(reservations);
        Scanner sc2;
        sc.useDelimiter("-");
        while(sc.hasNext()){
            tempString = sc.next();
            sc2 = new Scanner(tempString);
            tempInt = sc2.nextInt();
            concatTemp = months[tempInt - 1];
            output = output.concat(concatTemp + " ");
            concatTemp = Integer.toString(sc2.nextInt());
            output = output.concat(concatTemp);
            tempInt = sc2.nextInt();
            concatTemp = roomNames[tempInt];
            output = output.concat(", " + concatTemp + "\n");
        }
        return output;
    }
    
    /**
     * Parses the notifications class attribute and generates a list of notifications that will look nice in a text box
     * @return
     * A multi-line String that will be displayed in the text box
     */
    
    public String checkNotifications(){
        String output = "", temp;
        Scanner sc = new Scanner(notifications);
        sc.useDelimiter("-");
        while(sc.hasNext()){
            temp = sc.next();
            output = output.concat(temp + "\n");
        }
        return output;
    }
    
    /**
     * Getter method for account username
     * @return 
     * Account's username as a String
     */
    
    public String usernameGet(){
        return username;
    }
    
    /**
     * Getter method for account password
     * @return 
     * Account's password as a String
     */
    
    public String passwordGet(){
        return password;
    }
    
    /**
     * Getter method for account reservations
     * @return 
     * Reservations as a String, scanned directly from the user's account text file. Reservations are in the format "[Month] [Day] [Room code]-".
     */
    
    public String reservationsGet(){
        return reservations;
    }
    
    /**
     * Setter method for account reservations
     * @param newReservations 
     * New reservations String
     */
    
    public void reservationsSet(String newReservations){
        reservations = newReservations;
    }
    
    /**
     * Getter method for account notifications
     * @return 
     * Notifications as a String, scanned directly from the user's account text file. Notifications are in the format "[Notification text]-"
     */
    
    public String notificationsGet(){
        return notifications;
    }
    
    /**
     * Setter method for account notifications
     * @param newNotifications 
     * New notifications String
     */
    
    public void notificationsSet(String newNotifications){
        notifications = newNotifications;
    }
    
    /**
     * Getter method for account manager flag
     * @return 
     * Boolean indicating account manager status. "true" if the account belongs to a manager and "false" if the account does not belong to a manager.
     */
    
    public Boolean managerFlagGet(){
        return managerFlag;
    }
}
