

import java.io.File;
import java.util.Scanner;

public class Room {
   private String amenities;
   private int cost;
   private int[] availability = new int[365];

   
   public Room(String name) throws Exception {
      
      Scanner sc = new Scanner(new File(name+".txt"));
      
      cost = sc.nextInt();
      sc.nextLine();
      
      amenities = sc.nextLine();
      
      
      for(int i = 0; i < 365; i++) {
         availability[i] = sc.nextInt();
        }          
      }    
      
   public String costGet(){ 
      return cost;
   }
      
   public String sizeGet(){
      return size;
   }
      
   public String amenitiesGet(){
      return amenities;
   }
      
   public void amenitiesSet(String newAmenities){
      amenities = newAmenities;
   }
      
   public int[] availabilityGet(){
      return availability;
   }
      
   public void availabilitySet(String newAvailability){
      availability = newAvailability;
   }
         
      
      
      
      
      
      
      
      
     