

import java.io.File;
import java.util.Scanner;

public class Room {
   private String amenities;
   private int cost;
   private int[][] availability = new int[12][31];

   
   public Room(String name) throws Exception {
      
      Scanner sc = new Scanner(new File(name+".txt"));
      
      cost = sc.nextInt();
      sc.nextLine();
      
      amenities = sc.nextLine();
      
      for(int i = 0; i < 12; i++){
        for(int j = 0; j < 31; j++) {
            availability[i][j] = sc.nextInt();
        }
      }
      }    
      
   public int costGet(){ 
      return cost;
   }
      
   public String amenitiesGet(){
      return amenities;
   }
      
   public void amenitiesSet(String newAmenities){
      amenities = newAmenities;
   }
      
   public int availabilityGet(int month, int day){
      return availability[month][day];
   }
      
   public void availabilitySet(int month, int day, int modifier){
      availability[month][day] += modifier;
   }
}
         
      
      
      
      
      
      
      
      
     