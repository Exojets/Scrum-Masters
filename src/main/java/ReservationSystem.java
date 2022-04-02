package com.mycompany.makereservation;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */



/**
 *
 * @author Daniel
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
 
    /*modifying text files
    makeReservation(roomType,date,username,availability)
    */
public class ReservationSystem {
    
    private String username, availability, hotelRoom;
    private int cost;
    
    public String usernameGet(){
        return username;
    }
    
    public String availabilityGet(){
        return availability;
    }
    
    public String hotelroomGet(){
        return hotelRoom;
    }
    
    public int costGet(){
        return cost;
    }
    
    public void makeReservation() throws Exception{
        String name = username;
        String room = hotelRoom;
        File userfile = new File((name +".txt"));
        File roomfile = new File (room+".txt");
        Scanner userScan = new Scanner(userfile);
        Scanner roomScan = new Scanner(roomfile);
        
        
    }
    
    public static void main(String[] args) {

       
    
    }
}
