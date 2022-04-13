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
        String output = "", concatTemp;
        Scanner sc = new Scanner(reservations);
        int temp;
        while(sc.hasNext()){
            temp = sc.nextInt();
            concatTemp = months[temp - 1];
            output.concat(concatTemp + " ");
            concatTemp = sc.next();
            output.concat(concatTemp);
            temp = sc.nextInt();
            concatTemp = switch (temp) {
                case 1 -> ", Executive Room";
                case 2 -> ", Extravagant Room";
                default -> ", Opulent Room";
            };
            output.concat(concatTemp + "\n");
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
