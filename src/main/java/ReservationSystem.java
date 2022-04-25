
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */



/**
 * A class that is takes a month, day, and room type, and can create, cancel, or change a reservation, modifying the user's text file with the dates selected, and modifying the room text file with the availability of the room.  
 * @author Daniel
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;
 

public class ReservationSystem {
   // account and room constructors
    Account accountTemp;
    Room roomTemp;
    private String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    private String[] roomNames = {"", "Executive Room", "Extravagant Room", "Opulent Room"};
    
     ReservationSystem(){
        
    }
     //account constructor
     ReservationSystem(Account a){
        accountTemp=a;
    }


    /**
     * Takes a date the user inputs and modifies the user text file as well as change the availability in the room text file.
     * @param RoomReserve the specific room type that the user wants to reserve 
     * @param month The month that the user wants to make a reservation in
     * @param day The specific day that the user wants to reserve
     * @param roomNumber The available room of the specific room type that the user wants to reserve
     * @return A message stating that either the reservation was made or the room was not available in that specific date.
     * @throws Exception states that the text file does not exist 
     */
     public String makeReservation(Room RoomReserve , int month, int day, int roomNumber) throws Exception{
        roomTemp=RoomReserve;
        String returnValue = "No Reservation Made"; // no reservation has been made
       if (roomTemp.availabilityGet(month , day) > 0){
           int MonthPrint=month+1;
           int DayPrint=day+1;
            accountTemp.reservationsSet(accountTemp.reservationsGet() + MonthPrint +" " + DayPrint+" " + roomNumber +"-");
            accountTemp.notificationsSet(accountTemp.notificationsGet() + roomNames[roomNumber] + " reserved for " + months[month + 1] + " " + Integer.toString(day + 1) +  ".-");
            
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
            writeUserFile.write(String.valueOf(accountTemp.managerFlagGet()));
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
       
   /**
    * Takes an existing reservation in the user text file and deletes it, changing the availability in the room text file
    * @param RoomCancel the specific type of room that the user's existing reservation is linked to
    * @param month the month that the reservation is in that the user wants to cancel
    * @param day the specific day of the reservation that the user wants to cancel
    * @param RoomNumber the room that the reservation was linked to that the user wants to cancel
    * @return A message stating that either the reservation did not exist or that the reservation was canceled
    * @throws Exception states that the text file does not exist
    */
     public String cancelReservation(Room RoomCancel, int month, int day, int RoomNumber) throws Exception{
        roomTemp = RoomCancel;
        String returnValue;
        String reconstruction = "";
        String target = "";
        String temp;
        boolean cancelled = false;
        
        //convert integers to strings and combimes the different variables into a single string
        target = target.concat(Integer.toString(month + 1)+" ");
        target = target.concat(Integer.toString(day +1)+" ");
        target = target.concat(Integer.toString(RoomNumber));
        
        
       // search the file for the correct string 
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
       
        if ( cancelled == false)
        returnValue = "Reservation Does not exist!";
        else {
        returnValue ="Reservation cancelled"; 
        accountTemp.notificationsSet(accountTemp.notificationsGet() + "Cancelled reservation for " + roomNames[RoomNumber] + " on " + months[month + 1] + " " + Integer.toString(day + 1) +  ".-");
        accountTemp.reservationsSet(reconstruction);
        
        // delete and recreate user and room text files
        File userfile = new File((accountTemp.usernameGet()+".txt"));
        FileWriter writeUserFile = new FileWriter(accountTemp.usernameGet()+".txt");
        
        File roomfile = new File ("Room"+RoomNumber+".txt");
        FileWriter writeRoomFile = new FileWriter("Room"+RoomNumber+".txt");
        
         userfile.delete(); 
         userfile.createNewFile();
         roomfile.delete();
         roomfile.createNewFile();
            
         writeUserFile.write(accountTemp.passwordGet()+"\n"); 
         writeUserFile.write(accountTemp.reservationsGet()+"\n");
         writeUserFile.write(accountTemp.notificationsGet()+"\n");
         writeUserFile.write(String.valueOf(accountTemp.managerFlagGet()));
         writeUserFile.close();
         
         writeRoomFile.write(roomTemp.costGet()+"\n");
         writeRoomFile.write(roomTemp.amenitiesGet()+"\n");
        
        
        
         // adjust the room availability
          roomTemp.availabilitySet(month,day, 1); 
        
            for (int monthIndex = 0; monthIndex < 12 ;monthIndex++) {
                for (int dayIndex = 0; dayIndex < 31; dayIndex++){
                    writeRoomFile.write(roomTemp.availabilityGet(monthIndex,dayIndex)+" ");
                }
            }
            writeRoomFile.close();
            } 
            
            return returnValue;
    }
    
    /**
     * Takes an existing reservation and deletes the old date from the user file, replacing it with a new date and updating the availabilities in the room text file
     * @param RoomCancel the specific type of room the reservation is linked to that the user wants to delete
     * @param RoomReserve the specific type of room that the user wants the reservation to be made on
     * @param MonthCancel the month the reservation is in that the user wants to cancel
     * @param MonthReserve the month the user wants the new reservation to be in
     * @param DayCancel the specific day of the old reservation that the user wants to cancel
     * @param DayReserve the specific day that the user wants the new reservation to be
     * @param RoomNumberCancel the room the old reservation was linked to that the user wants to cancel 
     * @param RoomNumberReserve the room that the user wants the new reservation to be linked to 
     * @return message stating that either reservation does not exist, room is not available, or that the reservation was successfully changed
     * @throws Exception states that the text file does not exist
     */
     public String changeReservation (Room RoomCancel, Room RoomReserve, int MonthCancel, int MonthReserve, int DayCancel, int DayReserve, int RoomNumberCancel, int RoomNumberReserve) throws Exception {
        
        String target = "";
        String temp;
        Boolean reservationExists = false;
        String returnValue;
        
        //
        target = target.concat(Integer.toString(MonthCancel + 1)+" ");
        target = target.concat(Integer.toString(DayCancel +1)+" ");
        target = target.concat(Integer.toString(RoomNumberCancel));
        
        Scanner scanner = new Scanner(accountTemp.reservationsGet()); 
        scanner.useDelimiter("-");
        while(scanner.hasNext() ){
        temp = scanner.next();
            if (target.equals(temp)){
                reservationExists = true;
         
            }
        }
        if (reservationExists == true){
            roomTemp = RoomReserve;
            if (roomTemp.availabilityGet(MonthReserve , DayReserve) > 0) {
              cancelReservation(RoomCancel, MonthCancel,DayCancel,RoomNumberCancel);
              makeReservation(RoomReserve,MonthReserve,DayReserve,RoomNumberReserve);
              returnValue = "Reservation successfully changed!";
            }
            else
                returnValue = "No availablity for date selected";
        }
        else
            returnValue = "Reservation does not exist!";
        
        return returnValue;
    }
}