
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Groe
 */
public class MainPage extends javax.swing.JFrame {
     Account User;
     Room Room1;
     Room Room2;
     Room Room3;
     ReservationSystem Reserver;
     
    public MainPage() {
        initComponents();
    }
    public MainPage(String Username) throws Exception {
        initComponents();
        User=new Account(Username);
        Room1 = new Room("room1");
        Room2 = new Room("room2");
        Room3 = new Room("room3");
        Reserver=new ReservationSystem(User);
        //makes sure the user is a manager before revealing the report creator button
        if (!User.managerFlagGet()){
          ManagerReportButton.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        WelcomeLabel = new javax.swing.JLabel();
        SearchRoomButton = new javax.swing.JButton();
        CheckReservationsAndNotifications = new javax.swing.JButton();
        ManagerReportButton = new javax.swing.JButton();
        RoomReserveButton = new javax.swing.JButton();
        MonthReserveInput = new javax.swing.JTextField();
        DayReserveInput = new javax.swing.JTextField();
        MonthCancelInput = new javax.swing.JTextField();
        DayCancelInput = new javax.swing.JTextField();
        RoomCancelButton = new javax.swing.JButton();
        ChangeReservationDate = new javax.swing.JButton();
        RoomSelectCancelInput = new javax.swing.JTextField();
        RoomSelectInput = new javax.swing.JTextField();
        ReservationSuccessorFail = new javax.swing.JLabel();
        CreditCardEntry = new javax.swing.JTextField();
        RoomDetailChoiceBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        WelcomeLabel.setText("Welcome");

        SearchRoomButton.setText("Find a room");
        SearchRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchRoomButtonActionPerformed(evt);
            }
        });

        CheckReservationsAndNotifications.setText("Check my status");
        CheckReservationsAndNotifications.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckReservationsAndNotificationsActionPerformed(evt);
            }
        });

        ManagerReportButton.setText("Generate room report");
        ManagerReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManagerReportButtonActionPerformed(evt);
            }
        });

        RoomReserveButton.setText("Reserve a Room");
        RoomReserveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomReserveButtonActionPerformed(evt);
            }
        });

        MonthReserveInput.setText("Month");
        MonthReserveInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonthReserveInputActionPerformed(evt);
            }
        });

        DayReserveInput.setText("Day");
        DayReserveInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DayReserveInputActionPerformed(evt);
            }
        });

        MonthCancelInput.setText("Month to Cancel");
        MonthCancelInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonthCancelInputActionPerformed(evt);
            }
        });

        DayCancelInput.setText("Day to Cancel");
        DayCancelInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DayCancelInputActionPerformed(evt);
            }
        });

        RoomCancelButton.setText("Cancel Reservation");
        RoomCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomCancelButtonActionPerformed(evt);
            }
        });

        ChangeReservationDate.setText("ChangeReservation");
        ChangeReservationDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeReservationDateActionPerformed(evt);
            }
        });

        RoomSelectCancelInput.setText("NumbertoCancel");
        RoomSelectCancelInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomSelectCancelInputActionPerformed(evt);
            }
        });

        RoomSelectInput.setText("Room Reservation Code");
        RoomSelectInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomSelectInputActionPerformed(evt);
            }
        });

        ReservationSuccessorFail.setText(" ");

        CreditCardEntry.setText("Credit card number. no spaces or -");
        CreditCardEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreditCardEntryActionPerformed(evt);
            }
        });

        RoomDetailChoiceBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Executive Room($500)", "Extravagant Room($1000)", "Opulent Room($1500)" }));
        RoomDetailChoiceBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomDetailChoiceBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Please input all dates numerically");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(MonthReserveInput, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(DayReserveInput, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(MonthCancelInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(DayCancelInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 315, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(RoomSelectInput, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ChangeReservationDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CreditCardEntry, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                                .addComponent(ReservationSuccessorFail, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SearchRoomButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CheckReservationsAndNotifications, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ManagerReportButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RoomDetailChoiceBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(RoomCancelButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                .addComponent(RoomSelectCancelInput, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RoomReserveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(WelcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WelcomeLabel)
                    .addComponent(RoomReserveButton))
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SearchRoomButton)
                            .addComponent(MonthReserveInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DayReserveInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RoomSelectInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RoomDetailChoiceBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CheckReservationsAndNotifications)
                        .addGap(103, 103, 103)
                        .addComponent(ManagerReportButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ChangeReservationDate)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MonthCancelInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DayCancelInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RoomSelectCancelInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(RoomCancelButton)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ReservationSuccessorFail)
                            .addComponent(CreditCardEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//searches for rooms that cost less than budget given
    private void SearchRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchRoomButtonActionPerformed
      //converts text to an integer
      
       String Text = RoomDetailChoiceBox.getSelectedItem().toString();
       //int Budget = Integer.parseInt(text);
       //compares price of each room to budget, opens a page for each room which is within nightly budget
       if ("Executive Room($500)".equals(Text)){
       new RoomDetails(Room1, 1).setVisible(true);
       }
       if ("Extravagant Room($1000)".equals(Text)){
        new RoomDetails(Room2, 2).setVisible(true);
       }
       if ("Opulent Room($1500)".equals(Text)){
         new RoomDetails(Room3, 3).setVisible(true);
       }
    }//GEN-LAST:event_SearchRoomButtonActionPerformed
//opens the current reservations and notifications for account, then clears notifications
    private void CheckReservationsAndNotificationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckReservationsAndNotificationsActionPerformed
        //doesn't exist yet, is here for organization purposes
        new Notifications(User.checkNotifications(), User.checkReservations()).setVisible(true);
        User.notificationsSet("");
        File Userfile = new File (User.usernameGet()+".txt");
         try {
             FileWriter writeUserFile = new FileWriter(Userfile);
             BufferedWriter bw = new BufferedWriter(writeUserFile);
             bw.write(User.passwordGet());
             bw.newLine();
             bw.write(User.reservationsGet());
             bw.newLine();
             bw.write(User.notificationsGet());
             bw.newLine();
             bw.write(User.managerFlagGet().toString());
             bw.close();
         } catch (IOException ex) {
             Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }//GEN-LAST:event_CheckReservationsAndNotificationsActionPerformed
/**
 * Makes sure dates exist, and if so, calls function to reserve a room with those as parameters
 
 
 */
    private void RoomReserveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomReserveButtonActionPerformed

        int MonthtoReserve=Integer.parseInt(MonthReserveInput.getText());
        int DaytoReserve=Integer.parseInt(DayReserveInput.getText());
        int RoomtoReserve=Integer.parseInt(RoomSelectInput.getText());
        BigInteger CreditCardCheck=new BigInteger(CreditCardEntry.getText());
        //checks whether the credit card is the proper length, and whether the day, month and room a reservation is desired for exists
        //if so, attempts to reserve the room
        //MonthtoReserve and DaytoReserve are passed as value -1 to account for arrays starting at [0][0]
        if(MonthtoReserve>0&&MonthtoReserve<=12&&DaytoReserve>0&&DaytoReserve<=31&&(CreditCardCheck.toString().length()==16||CreditCardCheck.toString().length()==15)){
            switch (RoomtoReserve) {
                case 1:
                    try {
                        ReservationSuccessorFail.setText(Reserver.makeReservation(Room1, MonthtoReserve-1, DaytoReserve-1, RoomtoReserve));
                    } catch (Exception ex) {
                        Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
                    }       break;
                case 2:
                    try {
                        ReservationSuccessorFail.setText(Reserver.makeReservation(Room2, MonthtoReserve-1, DaytoReserve-1, RoomtoReserve));
                    } catch (Exception ex) {
                        Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
                    }       break;
                case 3:
                    try {
                        ReservationSuccessorFail.setText(Reserver.makeReservation(Room3, MonthtoReserve-1, DaytoReserve-1, RoomtoReserve));
                    } catch (Exception ex) {
                        Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
                    }       break;
                default:
                    ReservationSuccessorFail.setText("This room code does not exist.");
                    break;
            }
                
        } 
        else
            ReservationSuccessorFail.setText("Card invalid or date does not exist");
    }//GEN-LAST:event_RoomReserveButtonActionPerformed

    private void MonthReserveInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonthReserveInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MonthReserveInputActionPerformed

    private void MonthCancelInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonthCancelInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MonthCancelInputActionPerformed

    private void DayCancelInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DayCancelInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DayCancelInputActionPerformed

    /**
     * RoomCancelButtonActionPerformed
     * cancels a reservation based on the inputs from the text boxes
     *  
     */
    private void RoomCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomCancelButtonActionPerformed
       int RoomToCancel=Integer.parseInt(RoomSelectCancelInput.getText());
       int DayToCancel=Integer.parseInt(DayCancelInput.getText());
       int MonthToCancel=Integer.parseInt(MonthCancelInput.getText());
       BigInteger CreditCardCheck=new BigInteger(CreditCardEntry.getText());
       //checks to ensure the date exists
       if (MonthToCancel>0&&MonthToCancel<=12&&DayToCancel>0&&DayToCancel<=31){
           //check credit card validity
           if(CreditCardCheck.toString().length()==16||CreditCardCheck.toString().length()==15){
           //if it does, attempts to cancel a reservation. Converts date into an index to pass for the cancel function
                switch (RoomToCancel) {
                        case 1:
                            try {
                                ReservationSuccessorFail.setText(Reserver.cancelReservation(Room1, MonthToCancel-1, DayToCancel-1, RoomToCancel));
                            } catch (Exception ex) {
                                Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
                            }       break;
                        case 2:
                            try {
                               ReservationSuccessorFail.setText(Reserver.cancelReservation(Room1, MonthToCancel-1, DayToCancel-1, RoomToCancel));
                            } catch (Exception ex) {
                                Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
                            }       break;
                        case 3:
                            try {
                                ReservationSuccessorFail.setText(Reserver.cancelReservation(Room1, MonthToCancel-1, DayToCancel-1, RoomToCancel));
                            } catch (Exception ex) {
                                Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
                            }       break;
                        default:
                        //notifies if the room doesn't exist
                            ReservationSuccessorFail.setText("This room code does not exist.");
                            break;
                    }
           }
           else{
               ReservationSuccessorFail.setText("Invalid card");
           }
       }
       else{
           //notifies if the date does not exist
           ReservationSuccessorFail.setText("This date does not exist");
       }
    }//GEN-LAST:event_RoomCancelButtonActionPerformed
    /**
     *  ChangeReservationDateActionPerformed
     * checks to make sure both reservation date and cancel date, as well as associated rooms, exist
     * if they do, makes sure the card exists.
     * if all exist, sends the values as indices to the function


     */
    private void ChangeReservationDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeReservationDateActionPerformed
       int RoomToCancel=Integer.parseInt(RoomSelectCancelInput.getText());
       int DayToCancel=Integer.parseInt(DayCancelInput.getText());
       int MonthToCancel=Integer.parseInt(MonthCancelInput.getText());
       int MonthtoReserve=Integer.parseInt(MonthReserveInput.getText());
       int DaytoReserve=Integer.parseInt(DayReserveInput.getText());
       int RoomtoReserve=Integer.parseInt(RoomSelectInput.getText());
       Boolean ValidRooms=true;
       Room ReserveRoomRequest=new Room();
       //check to set room to pass
         switch (RoomtoReserve) {
             case 1 -> ReserveRoomRequest=Room1;
             case 2 -> ReserveRoomRequest=Room2;
             case 3 -> ReserveRoomRequest=Room3;
             default -> {
                     ValidRooms=false;
             }
         }
         Room CancelRoomRequest=new Room();
         switch (RoomToCancel) {
             case 1 -> CancelRoomRequest=Room1;
             case 2 -> CancelRoomRequest=Room2;
             case 3 -> CancelRoomRequest=Room3;
             default -> {
                     ValidRooms=false;
             }
         }
        //check to make sure the cancel dates and rooms exist
       BigInteger CreditCardCheck=new BigInteger(CreditCardEntry.getText());
        if (MonthToCancel>0&&MonthToCancel<=12&&DayToCancel>0&&DayToCancel<=31&&ValidRooms==true){
            //check if the reserve date exists
            if(MonthtoReserve>0&&MonthtoReserve<=12&&DaytoReserve>0&&DaytoReserve<=31){
                //check to see if card exists
                if(CreditCardCheck.toString().length()==16||CreditCardCheck.toString().length()==15){
                    try {
                        //sends dates as index for changereservation function
                        System.out.print(DaytoReserve+"  "+MonthtoReserve+" "+RoomtoReserve);
                        ReservationSuccessorFail.setText(Reserver.changeReservation(CancelRoomRequest, ReserveRoomRequest, MonthToCancel-1, MonthtoReserve-1, DayToCancel-1, DaytoReserve-1, RoomToCancel, RoomtoReserve));
                    } catch (Exception ex) {
                        Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                //notify of relevant error
                else{
                    ReservationSuccessorFail.setText("Invalid Card");
                }
            }
            else{
                 ReservationSuccessorFail.setText("Reserve date invalid");
            }
        }
        else{
            ReservationSuccessorFail.setText("Room or Cancel date invalid");
        }
    }//GEN-LAST:event_ChangeReservationDateActionPerformed

    private void RoomSelectCancelInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomSelectCancelInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoomSelectCancelInputActionPerformed

    private void RoomSelectInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomSelectInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoomSelectInputActionPerformed

    private void CreditCardEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreditCardEntryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CreditCardEntryActionPerformed

    private void DayReserveInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DayReserveInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DayReserveInputActionPerformed

    private void RoomDetailChoiceBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomDetailChoiceBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoomDetailChoiceBoxActionPerformed
/**
 * Produces available rooms during each day of year, as well as total profits from rooms both total and individually.
 */
    private void ManagerReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManagerReportButtonActionPerformed
        //deletes and recreates the report file, then calculates the total value of reserved rooms
        //prints that value after each room has reported its value
        try {                                                        
             int Total=0;
             File ReportFile= new File("Report.txt");
             ReportFile.createNewFile();
             ReportFile.delete();
             Total+=Room1.roomReport(ReportFile);
             Total+=Room2.roomReport(ReportFile);
             Total+=Room3.roomReport(ReportFile);
             FileWriter myWriter = new FileWriter(ReportFile, true);
             BufferedWriter bw = new BufferedWriter(myWriter);
             //appends total profits
             myWriter.write("The total profits are: $"+Total);
             myWriter.close();
         } catch (IOException ex) {
             Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_ManagerReportButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChangeReservationDate;
    private javax.swing.JButton CheckReservationsAndNotifications;
    private javax.swing.JTextField CreditCardEntry;
    private javax.swing.JTextField DayCancelInput;
    private javax.swing.JTextField DayReserveInput;
    private javax.swing.JButton ManagerReportButton;
    private javax.swing.JTextField MonthCancelInput;
    private javax.swing.JTextField MonthReserveInput;
    private javax.swing.JLabel ReservationSuccessorFail;
    private javax.swing.JButton RoomCancelButton;
    private javax.swing.JComboBox<String> RoomDetailChoiceBox;
    private javax.swing.JButton RoomReserveButton;
    private javax.swing.JTextField RoomSelectCancelInput;
    private javax.swing.JTextField RoomSelectInput;
    private javax.swing.JButton SearchRoomButton;
    private javax.swing.JLabel WelcomeLabel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
