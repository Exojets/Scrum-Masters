import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
public class LoginPage extends javax.swing.JFrame {
    /**
     * Creates new form login
     */
    public LoginPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UsernameField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JTextField();
        LoginButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        RegisterButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        UsernameField.setText("Username");
        UsernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameFieldActionPerformed(evt);
            }
        });

        PasswordField.setText("Password");

        LoginButton.setText("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Login and Registration");

        RegisterButton.setText("Register");
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(RegisterButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addComponent(LoginButton)
                .addGap(54, 54, 54))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1))
                    .addComponent(UsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(108, 108, 108))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addComponent(UsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginButton)
                    .addComponent(RegisterButton))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        // retrieves username and password from fields
         String Username=UsernameField.getText();
        String Password=PasswordField.getText();
        //ensures that username and password fields weren't empty
        if (Username.length()>0&&Password.length()>0){
           String Filer=Username+".txt";
           File TempFileStorage;
           TempFileStorage=new File(Filer);
           //checks if the username exists in database
           // If it does, compares password given to database. If it matches, opens main window and sends username as parameter
           //if either fail, do nothing
           if (TempFileStorage.isFile())
           {
                BufferedReader Buff = null;
                 try {
                     //open the file
                     Buff = new BufferedReader(new FileReader(Filer)); 
                     String text = Buff.readLine();
                     if(text.equals(Password)){
                         //close window and instantiate mainpage with parameter username
                         dispose();
                         try {
                             new MainPage(Username).setVisible(true); 
                         } catch (Exception ex) {
                             Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
                         }
                     }
                 } catch (FileNotFoundException ex) {
                     Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
                 } catch (IOException ex) {
                     Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
                 } finally {
                     try {
                         Buff.close();
                     } catch (IOException ex) {
                         Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
                     }
                 }

            }
        }
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void UsernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameFieldActionPerformed
       
    }//GEN-LAST:event_UsernameFieldActionPerformed

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed

        //gets the username and password fields 
        String Username=UsernameField.getText();
        String Password=PasswordField.getText();
        //
        if (Username.length()>0&&Password.length()>0){
            try {
              File myObj = new File(Username+".txt");
              //attempts to create the username file. if it succeeds, account created. If it fails, user already exists
              if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
                FileWriter myWriter = new FileWriter(Username+".txt");
                //writes the password to the first line and initializes the following lines to an empty newline for later use by account class
              BufferedWriter bw = new BufferedWriter(myWriter);
              bw.write(Password);
              bw.newLine();
              bw.newLine();
              bw.newLine();
              bw.write("false");
              bw.close();
              } else {
                System.out.println("File already exists.");
              }
            } catch (IOException e) {
              System.out.println("An error occurred.");
            }
        }
    }//GEN-LAST:event_RegisterButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginButton;
    private javax.swing.JTextField PasswordField;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JTextField UsernameField;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
