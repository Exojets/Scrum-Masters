

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Room {
   private String amenities, codeName;
   private int Cost;
   private int[][] availability = new int[12][31];

   public Room(){}
   public Room(String name) throws Exception {
      
      codeName = name;
      Scanner sc = new Scanner(new File(name+".txt"));
      
      Cost = sc.nextInt();
      sc.nextLine();
      
      amenities = sc.nextLine();
      
      for(int i = 0; i < 12; i++){
        for(int j = 0; j < 31; j++) {
            availability[i][j] = sc.nextInt();
        }
      }
      }    
      
   public int costGet(){ 
      return Cost;
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
   
 public int roomReport(File FileInput) throws IOException{ 
     int CurrentValue=0;
     FileWriter myWriter = new FileWriter(FileInput, true);
     BufferedWriter bw = new BufferedWriter(myWriter);
     bw.write("Unsold rooms: ");
     for(int i = 0; i < 12; i++){
        for(int j = 0; j < 31; j++) {
            bw.write(availability[i][j]+" ");
            CurrentValue+=(Cost*(5-availability[i][j]));
        }
     }
     CurrentValue-=Cost*35;
     bw.newLine();
     bw.write("Total profit from "+codeName+": "+CurrentValue);
     bw.newLine();
     bw.close();
     return CurrentValue;
   
    }
}

         
      
      
      
      
      
      
      
      
     
