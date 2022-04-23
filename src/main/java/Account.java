/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ryan
 */

import java.io.File;
import java.util.Scanner;

public class Account {
    private String username, password, reservations, notifications;
    private Boolean managerFlag;
    private String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    private String[] roomNames = {"", "Executive Room", "Extravagant Room", "Opulent Room"};
    
    public Account(String name) throws Exception {
        File file = new File((name + ".txt"));
        Scanner sc = new Scanner(file);
        username = name;
        password = sc.nextLine();
        reservations = sc.nextLine();
        notifications = sc.nextLine();
        managerFlag = sc.nextBoolean();
    }
    
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
    
    public String usernameGet(){
        return username;
    }
    
    public String passwordGet(){
        return password;
    }
    
    public String reservationsGet(){
        return reservations;
    }
    
    public void reservationsSet(String newReservations){
        reservations = newReservations;
    }
    
    public String notificationsGet(){
        return notifications;
    }
    
    public void notificationsSet(String newNotifications){
        notifications = newNotifications;
    }
    
    public Boolean managerFlagGet(){
        return managerFlag;
    }
}
