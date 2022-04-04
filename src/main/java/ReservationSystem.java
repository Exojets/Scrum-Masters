
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
    public void makeReservation(Room r, int month, int day, int roomNumber) throws Exception{
        r=roomTemp;

       if (roomTemp.availabilityGet() > -1){
            accountTemp.reservationsSet(accountTemp.reservationsGet()+ " "+ roomNumber +" "+month +" / "+ day+"");
            File userfile = new File((accountTemp.usernameGet()+".txt"));
            File roomfile = new File ("Room"+roomNumber+".txt");
            FileWriter writeUserFile = new FileWriter(accountTemp.usernameGet()+".txt");
            FileWriter writeRoomFile = new FileWriter("Room"+roomNumber+".txt");
            userfile.delete();
            userfile.createNewFile();
            roomfile.delete();
            roomfile.createNewFile();
            writeUserFile.write(accountTemp.passwordGet()+"\n");
            writeUserFile.write(accountTemp.reservationsGet()+"\n");
            writeUserFile.write(accountTemp.notificationsGet()+"\n");
            writeUserFile.close();
        
            writeRoomFile.write(roomTemp.costGet()+"\n");
            writeRoomFile.write(roomTemp.amenititesGet()+"\n");
        
            roomTemp.availabilitySet(month,day, -1);
        
            for (int monthIndex = 0; monthIndex < 12 ;monthIndex++) {
                for (int dayIndex = 0; dayIndex < 31; dayIndex++){
                    writeRoomFile.write(roomTemp.availabilityGet(monthIndex,dayIndex)+" ");
                }
            }
            writeRoomFile.close();
       
        }
    }
       
    
    /* user text password, reservation, notifications
    room text cost amenities, availabilities
    */

}
