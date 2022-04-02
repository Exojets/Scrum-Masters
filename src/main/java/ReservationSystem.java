
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
import java.io.FileWriter;
import java.util.Scanner;
 
    /*modifying text files
    makeReservation(roomType,date,username,availability)
    */
public class ReservationSystem {
    Account accountTemp;
    Room roomTemp;
    
     ReservationSystem(){
        
    }
     ReservationSystem(Account a){
        a = accountTemp;
    }

     //account will be a string
     //room would be 2 int for month and for day
    public void makeReservation(Room r) throws Exception{
        r=roomTemp;
        String name = accountTemp.reservationsGet();
        File userfile = new File((accountTemp.usernameGet()+".txt"));
        FileWriter writeUserfile = new FileWriter(accountTemp.usernameGet()+".txt");
        userfile.delete();
        userfile.createNewFile();
        writeUserfile.write(roomTemp.roomType()+""+roomTemp.getMonth()+""+roomTemp.getDay());
        writeUserfile.close();
       
    }
    
    //public static void main(String[] args) {

       
    
    //}
}
