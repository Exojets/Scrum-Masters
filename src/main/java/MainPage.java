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
     room Room1;
     room Room2;
     room Room3;
     
    public MainPage() {
        initComponents();
    }
    public MainPage(String Username) throws Exception {
        initComponents();
        Room1 = new room("room1");
        Room2 = new room("room2");
        Room3 = new room("room3");
        //////////////temporary until buttons will be used
        CheckReservationsAndNotifications.setVisible(false);
        ChangeReservationDate.setVisible(false);
        RoomCancelButton.setVisible(false);
        MonthCancelInput.setVisible(false);
        DayCancelInput.setVisible(false);
        RoomSelectCancelInput.setVisible(false);
        User=new Account(Username);
        //code snippet to show managers their special button
        //need to find a place to put the flag for managerliness
        Boolean ManagerAccount=false;
        if (ManagerAccount!=true){
          ManagerRoomReportButton.setVisible(false);
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

        jLabel1 = new javax.swing.JLabel();
        SearchRoomButton = new javax.swing.JButton();
        CheckReservationsAndNotifications = new javax.swing.JButton();
        ManagerRoomReportButton = new javax.swing.JButton();
        SearchCost = new javax.swing.JTextField();
        RoomReserveButton = new javax.swing.JButton();
        MonthReserveInput = new javax.swing.JTextField();
        DayReserveInput = new javax.swing.JTextField();
        MonthCancelInput = new javax.swing.JTextField();
        DayCancelInput = new javax.swing.JTextField();
        RoomCancelButton = new javax.swing.JButton();
        ChangeReservationDate = new javax.swing.JButton();
        RoomSelectCancelInput = new javax.swing.JTextField();
        RoomSelectInput = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Welcome");

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

        ManagerRoomReportButton.setText("Generate room report");

        SearchCost.setText("Budget Per Night");
        SearchCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchCostActionPerformed(evt);
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

        RoomSelectInput.setText("RoomNumber");
        RoomSelectInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomSelectInputActionPerformed(evt);
            }
        });

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
                                .addComponent(MonthReserveInput, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DayReserveInput))
                            .addComponent(RoomSelectInput)
                            .addComponent(ChangeReservationDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(MonthCancelInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DayCancelInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SearchCost)
                            .addComponent(SearchRoomButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CheckReservationsAndNotifications, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ManagerRoomReportButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RoomReserveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(RoomCancelButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                .addComponent(RoomSelectCancelInput, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(RoomReserveButton))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SearchRoomButton)
                            .addComponent(MonthReserveInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DayReserveInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SearchCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(RoomSelectInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CheckReservationsAndNotifications)
                        .addGap(103, 103, 103)
                        .addComponent(ManagerRoomReportButton)
                        .addContainerGap(16, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ChangeReservationDate)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MonthCancelInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DayCancelInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RoomSelectCancelInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RoomCancelButton)
                        .addGap(51, 51, 51))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//searches for rooms that cost less than budget given
    private void SearchRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchRoomButtonActionPerformed
      //converts text to an integer
       String text = SearchCost.getText();
       int Budget = Integer.parseInt(text);
       //compares price of each room to budget, opens a page for each room which is within nightly budget
       if (Room1.priceGet()<=Budget){
       new OpulentRoom(Room1, 1).setVisible(true);
       }
       if (Room2.priceGet()<=Budget){
       new OpulentRoom(Room2, 2).setVisible(true);
       }
       if (Room3.priceGet()<=Budget){
       new OpulentRoom(Room3, 3).setVisible(true);
       }
    }//GEN-LAST:event_SearchRoomButtonActionPerformed
//opens the current reservations and notifications for account, then clears notifications
    private void CheckReservationsAndNotificationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckReservationsAndNotificationsActionPerformed
        //doesn't exist yet, is here for organization purposes
         new Notifications(User.notificationsGet(), User.reservationsCheck()).setVisible(true);
        
    }//GEN-LAST:event_CheckReservationsAndNotificationsActionPerformed

    private void SearchCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchCostActionPerformed

    private void RoomReserveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomReserveButtonActionPerformed
        // TODO add your handling code here:
        
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

    private void RoomCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomCancelButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoomCancelButtonActionPerformed

    private void ChangeReservationDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeReservationDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChangeReservationDateActionPerformed

    private void RoomSelectCancelInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomSelectCancelInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoomSelectCancelInputActionPerformed

    private void RoomSelectInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomSelectInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoomSelectInputActionPerformed

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
    private javax.swing.JTextField DayCancelInput;
    private javax.swing.JTextField DayReserveInput;
    private javax.swing.JButton ManagerRoomReportButton;
    private javax.swing.JTextField MonthCancelInput;
    private javax.swing.JTextField MonthReserveInput;
    private javax.swing.JButton RoomCancelButton;
    private javax.swing.JButton RoomReserveButton;
    private javax.swing.JTextField RoomSelectCancelInput;
    private javax.swing.JTextField RoomSelectInput;
    private javax.swing.JTextField SearchCost;
    private javax.swing.JButton SearchRoomButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
