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
    
    public Account(String Username) throws Exception {
        File file = new File((Username + ".txt"));
        Scanner sc = new Scanner(file);
        sc.nextLine();
        reservations = sc.nextLine();
        sc.nextLine();
        notifications = sc.nextLine();
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
}
