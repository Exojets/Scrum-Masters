
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
   // account and room constructors
    Account accountTemp;
    Room roomTemp;
    
     ReservationSystem(){
        
    }
     //account constructor
     ReservationSystem(Account a){
        accountTemp=a;
    }

     //account will be a string
     //room would be 2 int for month and for day
    public String makeReservation(Room RoomReserve , int month, int day, int roomNumber) throws Exception{
        roomTemp=RoomReserve;
        String returnValue = "No Reservation Made"; // no reservation has been made
       if (roomTemp.availabilityGet(month , day) > 0){
           int MonthPrint=month+1;
           int DayPrint=day+1;
            accountTemp.reservationsSet(accountTemp.reservationsGet() + MonthPrint +" " + DayPrint+" " + roomNumber +"-");
            accountTemp.notificationsSet(accountTemp.notificationsGet()+ "There is a new notification!");
            
            // access the user and room files
            File userfile = new File((accountTemp.usernameGet()+".txt")); 
            File roomfile = new File ("Room"+roomNumber+".txt");
            FileWriter writeUserFile = new FileWriter(accountTemp.usernameGet()+".txt");
            FileWriter writeRoomFile = new FileWriter("Room"+roomNumber+".txt");
            
            // delete and recreate the user and room file
            userfile.delete(); 
            userfile.createNewFile();
            roomfile.delete();
            roomfile.createNewFile();
           
            // write to the new user file
            writeUserFile.write(accountTemp.passwordGet()+"\n"); 
            writeUserFile.write(accountTemp.reservationsGet()+"\n");
            writeUserFile.write(accountTemp.notificationsGet()+"\n");
            writeUserFile.close();
        
           //write to the new room file
            writeRoomFile.write(roomTemp.costGet()+"\n");
            writeRoomFile.write(roomTemp.amenitiesGet()+"\n");
        
            //set the new array for the availability array
            roomTemp.availabilitySet(month,day, -1); 
        
            for (int monthIndex = 0; monthIndex < 12 ;monthIndex++) {
                for (int dayIndex = 0; dayIndex < 31; dayIndex++){
                    writeRoomFile.write(roomTemp.availabilityGet(monthIndex,dayIndex)+" ");
                }
            }
            writeRoomFile.close();
            returnValue = "Reservation Complete!"; // new return value to show revervation method was done
        }
    return returnValue;
    }
       
    public String cancelReservation(Room RoomCancel, int month, int day, int RoomNumber) throws Exception{
        roomTemp = RoomCancel;
        String returnValue;
        String reconstruction = "";
        String target = "";
        String temp;
        boolean cancelled = false;
        
        target = target.concat(Integer.toString(month + 1)+" ");
        target = target.concat(Integer.toString(day +1)+" ");
        target = target.concat(Integer.toString(RoomNumber));
        
        File userfile = new File((accountTemp.usernameGet()+".txt"));
        FileWriter writeUserFile = new FileWriter(accountTemp.usernameGet()+".txt");
        
        File roomfile = new File ("Room"+RoomNumber+".txt");
        FileWriter writeRoomFile = new FileWriter("Room"+RoomNumber+".txt");
        
        Scanner scanner = new Scanner(accountTemp.reservationsGet()); 
        scanner.useDelimiter("-");
        while(scanner.hasNext() ){
        temp = scanner.next();
        if (!target.equals(temp)||(cancelled==true)){
            reconstruction = reconstruction.concat(temp + "-");
        }
        else{
            cancelled = true;
        }
        
        }
        
        accountTemp.reservationsSet(reconstruction);
        
        
        
         userfile.delete(); 
         userfile.createNewFile();
         roomfile.delete();
         roomfile.createNewFile();
            
         writeUserFile.write(accountTemp.passwordGet()+"\n"); 
         writeUserFile.write(accountTemp.reservationsGet()+"\n");
         writeUserFile.write(accountTemp.notificationsGet()+"\n");
         writeUserFile.close();
         
         writeRoomFile.write(roomTemp.costGet()+"\n");
         writeRoomFile.write(roomTemp.amenitiesGet()+"\n");
        
        
        //String cancel = accountTemp.reservationsGet().replaceAll(cancelMonth,"");
         
          roomTemp.availabilitySet(month,day, 1); 
        
            for (int monthIndex = 0; monthIndex < 12 ;monthIndex++) {
                for (int dayIndex = 0; dayIndex < 31; dayIndex++){
                    writeRoomFile.write(roomTemp.availabilityGet(monthIndex,dayIndex)+" ");
                }
            }
            writeRoomFile.close();
            if ( cancelled == false)
            returnValue = "Reservation Does not exist!";
            else {
            returnValue ="Reservation cancelled"; 
            accountTemp.notificationsSet(accountTemp.notificationsGet()+ "There is a new notification!");
            }   
            return returnValue;
    }
    

    
    /* user text password, reservation, notifications
    room text cost amenities, availabilities
    */

}
