/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AdminSubWindow;

import databaseConnection.DBConnection;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Laurence
 */
public class CashierAccountRegistration extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement sqlPST = null;
    ResultSet sqlResult = null;
    public CashierAccountRegistration() {
        initComponents();
        conn = DBConnection.connectionDB();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        usernameField = new javax.swing.JTextField();
        cPassField = new javax.swing.JPasswordField();
        passwordField = new javax.swing.JPasswordField();
        Back = new javax.swing.JButton();
        Signup = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CASHIER ACCOUNT REGISTRATION");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo - Coffee Shop(resized).png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Pasword:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Name:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Username:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Confirm");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, -1, -1));

        nameField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jPanel1.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 470, 440, 40));

        usernameField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jPanel1.add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 190, 440, 40));

        cPassField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jPanel1.add(cPassField, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 380, 440, 40));

        passwordField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jPanel1.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 270, 440, 40));

        Back.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Back.setForeground(new java.awt.Color(255, 255, 255));
        Back.setText("BACK");
        Back.setBorderPainted(false);
        Back.setContentAreaFilled(false);
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BackMouseExited(evt);
            }
        });
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel1.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 590, 150, 90));

        Signup.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Signup.setForeground(new java.awt.Color(255, 255, 255));
        Signup.setText("SIGNUP");
        Signup.setBorderPainted(false);
        Signup.setContentAreaFilled(false);
        Signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SignupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SignupMouseExited(evt);
            }
        });
        Signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupActionPerformed(evt);
            }
        });
        jPanel1.add(Signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 590, 170, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cashier and admin account registration.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 800));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="EVENTS"> 
    private void BackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseEntered
        // TODO add your handling code here:
        Back.setContentAreaFilled(true);
        Back.setBackground(new java.awt.Color(111, 68, 54));
        Back.setForeground(Color.white);
    }//GEN-LAST:event_BackMouseEntered

    private void BackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseExited
        // TODO add your handling code here:
        Back.setContentAreaFilled(false);
        Back.setForeground(Color.white);
    }//GEN-LAST:event_BackMouseExited

    private void SignupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignupMouseEntered
        // TODO add your handling code here:
        Signup.setContentAreaFilled(true);
        Signup.setBackground(new java.awt.Color(111, 68, 54));
        Signup.setForeground(Color.white);
    }//GEN-LAST:event_SignupMouseEntered

    private void SignupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignupMouseExited
        // TODO add your handling code here:
        Signup.setContentAreaFilled(false);
        Signup.setForeground(Color.white);
    }//GEN-LAST:event_SignupMouseExited

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        setVisible(false);
        
    }//GEN-LAST:event_BackActionPerformed

    private void SignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignupActionPerformed
        signUp();
    }//GEN-LAST:event_SignupActionPerformed

    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="FUNCTIONALITIES"> 
    
    private void signUp(){
        //RECORDS INFO FOR ACCOUNTS DB
        String sqlQuery;
        String username = usernameField.getText();
        String password = passwordField.getText();
        String cPassword = cPassField.getText();
        String name = nameField.getText();
        
        if (!password.equals(cPassword)){
            JOptionPane.showMessageDialog(null, "Passwords do no match", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        sqlQuery = "INSERT INTO Accounts (Username,Password,Name,AccountType) VALUES (?,?,?,'user')";
        try{
            sqlPST = conn.prepareStatement(sqlQuery);
            sqlPST.setString(1,username);
            sqlPST.setString(2,password);
            sqlPST.setString(3,name);
            int rowsAffected = sqlPST.executeUpdate();

        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Account registered successfully");
        } else {
            JOptionPane.showMessageDialog(null, "Failed to register account. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        }catch (Exception e){
            
            System.out.println("Login Catch Block: " + e.getMessage());
        }
    }
    
    
    // </editor-fold> 
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(CashierAccountRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(CashierAccountRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(CashierAccountRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(CashierAccountRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CashierAccountRegistration().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Signup;
    private javax.swing.JPasswordField cPassField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
