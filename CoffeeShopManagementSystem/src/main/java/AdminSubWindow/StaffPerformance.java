/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AdminSubWindow;

import AdminBranch.AdminMain;
import databaseConnection.DBConnection;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Laurence
 */
public class StaffPerformance extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement sqlPST = null;
    ResultSet sqlResult = null;
    private String cashier;
    
    public StaffPerformance(String cashier) {
        initComponents();
        conn = DBConnection.connectionDB();
        this.cashier = cashier;
        masterPanel.setBackground(new java.awt.Color(0, 0, 0, 95));
        cashierLabel.setText(cashier);
        String orderCount =  Integer.toString(countbyOrders(cashier));
        String salesAmount = Integer.toString(addByOrders(cashier));
        orderCountLabel.setText(orderCount);
        salesAmountLabel.setText("₱"+ salesAmount);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        masterPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        salesAmountLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cashierLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        orderCountLabel = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        Confirm = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        masterPanel.setBackground(new java.awt.Color(0, 0, 0));
        masterPanel.setForeground(new java.awt.Color(111, 68, 54));
        masterPanel.setPreferredSize(new java.awt.Dimension(550, 30));
        masterPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Total Sales:");
        masterPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, 50));

        salesAmountLabel.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        salesAmountLabel.setForeground(new java.awt.Color(255, 255, 255));
        salesAmountLabel.setText("10");
        masterPanel.add(salesAmountLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cashier:");
        masterPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, 50));

        cashierLabel.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        cashierLabel.setForeground(new java.awt.Color(255, 255, 255));
        cashierLabel.setText("Kwason");
        masterPanel.add(cashierLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setForeground(new java.awt.Color(111, 68, 54));
        jPanel4.setPreferredSize(new java.awt.Dimension(550, 30));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        masterPanel.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 550, 20));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Orders Served:");
        masterPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, 50));

        orderCountLabel.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        orderCountLabel.setForeground(new java.awt.Color(255, 255, 255));
        orderCountLabel.setText("10");
        masterPanel.add(orderCountLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, -1, -1));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setForeground(new java.awt.Color(111, 68, 54));
        jPanel7.setPreferredSize(new java.awt.Dimension(550, 30));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        masterPanel.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 550, 20));

        getContentPane().add(masterPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 550, 590));

        title.setBackground(new java.awt.Color(255, 255, 255));
        title.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("STAFF PERFORMANCE");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        Confirm.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Confirm.setForeground(new java.awt.Color(255, 255, 255));
        Confirm.setText("CONFIRM");
        Confirm.setBorderPainted(false);
        Confirm.setContentAreaFilled(false);
        Confirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ConfirmMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ConfirmMouseExited(evt);
            }
        });
        Confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmActionPerformed(evt);
            }
        });
        getContentPane().add(Confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 740, 190, 70));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/final darkened staff performance bg.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="EVENTS">  
    private void ConfirmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmMouseEntered
        // TODO add your handling code here:
        Confirm.setContentAreaFilled(true);
        Confirm.setBackground(new java.awt.Color(111, 68, 54));
        Confirm.setForeground(Color.white);
    }//GEN-LAST:event_ConfirmMouseEntered

    private void ConfirmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmMouseExited
        // TODO add your handling code here:
        Confirm.setContentAreaFilled(false);
        Confirm.setForeground(Color.white);
    }//GEN-LAST:event_ConfirmMouseExited

    private void ConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmActionPerformed
        // TODO add your handling code here:
        callAdminMain();
        setVisible(false);
    }//GEN-LAST:event_ConfirmActionPerformed
    // </editor-fold>  
    
    
    // <editor-fold defaultstate="collapsed" desc="FUNCTIONALITIES"> 
    
    private int countbyOrders(String cashier){
        int orderCount = 0;
        String sqlQuery = "SELECT Cashier FROM SalesByProducts WHERE Cashier = ?";
        try{
            sqlPST = conn.prepareStatement(sqlQuery);
            sqlPST.setString(1, cashier);
            sqlResult = sqlPST.executeQuery();
            while (sqlResult.next()){
                String categoryString = sqlResult.getString("Cashier");
                if (categoryString.equals(cashier)){
                    orderCount++;
                }
            }
            return orderCount;
        }catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }
    
    private int addByOrders(String cashier){
        int cashierAmount = 0;
        String sqlQuery = "SELECT Cashier, Sales FROM SalesByProducts WHERE Cashier = ?";
        try{
            sqlPST = conn.prepareStatement(sqlQuery);
            sqlPST.setString(1, cashier);
            sqlResult = sqlPST.executeQuery();
            while (sqlResult.next()){
                String cashierString = sqlResult.getString("Cashier");
                int cashierSale = sqlResult.getInt("Sales");
                if (cashierString.equals(cashier)){
                    cashierAmount = cashierAmount + cashierSale;
                }
            }
            return cashierAmount;
        }catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }
    private void callAdminMain(){
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
            java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMain().setVisible(true);
            }
        });
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
//            java.util.logging.Logger.getLogger(StaffPerformance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(StaffPerformance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(StaffPerformance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(StaffPerformance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new StaffPerformance().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Confirm;
    private javax.swing.JLabel background;
    private javax.swing.JLabel cashierLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel masterPanel;
    private javax.swing.JLabel orderCountLabel;
    private javax.swing.JLabel salesAmountLabel;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
