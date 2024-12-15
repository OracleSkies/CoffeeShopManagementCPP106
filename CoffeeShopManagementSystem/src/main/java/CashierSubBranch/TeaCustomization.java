/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CashierSubBranch;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class TeaCustomization extends javax.swing.JFrame {

    /**
     * Creates new form TeaCustomization
     */
    public TeaCustomization() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        TeaLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        QTy = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        MildRad = new javax.swing.JRadioButton();
        MedRad = new javax.swing.JRadioButton();
        ConcerRad = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        NoMilkRad = new javax.swing.JRadioButton();
        OatRad = new javax.swing.JRadioButton();
        AlmondRad = new javax.swing.JRadioButton();
        FreshRad = new javax.swing.JRadioButton();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        PearlRad = new javax.swing.JRadioButton();
        SweetRad = new javax.swing.JRadioButton();
        Confirm = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(206, 148, 97));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("TEA CUSTOMIZATION");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("BEVERAGE:");

        TeaLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("QUANTITY:");

        QTy.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("CONCENTRATION");

        MildRad.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        MildRad.setText("Mild");
        MildRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MildRadActionPerformed(evt);
            }
        });

        MedRad.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        MedRad.setText("Medium");
        MedRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedRadActionPerformed(evt);
            }
        });

        ConcerRad.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ConcerRad.setText("Concentrated");
        ConcerRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConcerRadActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("MILK TYPE");

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        NoMilkRad.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        NoMilkRad.setText("No Milk");
        NoMilkRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoMilkRadActionPerformed(evt);
            }
        });

        OatRad.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        OatRad.setText("Oat");
        OatRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OatRadActionPerformed(evt);
            }
        });

        AlmondRad.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        AlmondRad.setText("Almond");
        AlmondRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlmondRadActionPerformed(evt);
            }
        });

        FreshRad.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        FreshRad.setText("Fresh Milk");
        FreshRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FreshRadActionPerformed(evt);
            }
        });

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setText("EXTRAS");

        PearlRad.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        PearlRad.setText("Pearls");
        PearlRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PearlRadActionPerformed(evt);
            }
        });

        SweetRad.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        SweetRad.setText("Sweetener");
        SweetRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SweetRadActionPerformed(evt);
            }
        });

        Confirm.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Confirm.setText("CONFIRM");
        Confirm.setBorderPainted(false);
        Confirm.setContentAreaFilled(false);
        Confirm.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator3))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(NoMilkRad)
                        .addGap(43, 43, 43)
                        .addComponent(AlmondRad)
                        .addGap(43, 43, 43)
                        .addComponent(OatRad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FreshRad)
                        .addGap(40, 40, 40))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator4)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(TeaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(QTy, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PearlRad)
                            .addComponent(SweetRad))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(MildRad)
                .addGap(96, 96, 96)
                .addComponent(MedRad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(ConcerRad)
                .addGap(38, 38, 38))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(130, 130, 130))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(Confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator5)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TeaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addComponent(QTy, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MildRad)
                    .addComponent(MedRad)
                    .addComponent(ConcerRad))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NoMilkRad)
                    .addComponent(AlmondRad)
                    .addComponent(OatRad)
                    .addComponent(FreshRad))
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(12, 12, 12)
                .addComponent(PearlRad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SweetRad)
                .addGap(18, 18, 18)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    // <editor-fold defaultstate="collapsed" desc="Events"> 
    private void MildRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MildRadActionPerformed
        groupButtons();
    }//GEN-LAST:event_MildRadActionPerformed

    private void MedRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedRadActionPerformed
        groupButtons();
    }//GEN-LAST:event_MedRadActionPerformed

    private void ConcerRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConcerRadActionPerformed
        groupButtons();
    }//GEN-LAST:event_ConcerRadActionPerformed

    private void NoMilkRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoMilkRadActionPerformed
        groupButtons();
    }//GEN-LAST:event_NoMilkRadActionPerformed

    private void OatRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OatRadActionPerformed
        groupButtons();
    }//GEN-LAST:event_OatRadActionPerformed

    private void AlmondRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlmondRadActionPerformed
        groupButtons();
    }//GEN-LAST:event_AlmondRadActionPerformed

    private void FreshRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FreshRadActionPerformed
        groupButtons();
    }//GEN-LAST:event_FreshRadActionPerformed

    private void PearlRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PearlRadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PearlRadActionPerformed

    private void SweetRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SweetRadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SweetRadActionPerformed

    private void ConfirmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmMouseEntered
        // TODO add your handling code here:
        Confirm.setContentAreaFilled(true);
        Confirm.setBackground(new java.awt.Color(111, 68, 54));
        Confirm.setForeground(Color.white);
    }//GEN-LAST:event_ConfirmMouseEntered

    private void ConfirmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmMouseExited
        // TODO add your handling code here:
        Confirm.setContentAreaFilled(false);
        Confirm.setForeground(Color.black);
    }//GEN-LAST:event_ConfirmMouseExited

    private void ConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmActionPerformed
        ConfirmFunction();
    }//GEN-LAST:event_ConfirmActionPerformed
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Functionalitis">
    public void updateLabel(String text){
       TeaLabel.setText(text);
   }
    
    private void groupButtons() {
        ButtonGroup strengthGroup = new ButtonGroup();
        strengthGroup.add(MildRad);
        strengthGroup.add(MedRad);
        strengthGroup.add(ConcerRad);

        ButtonGroup milkGroup = new ButtonGroup();
        milkGroup.add(NoMilkRad);
        milkGroup.add(OatRad);
        milkGroup.add(AlmondRad);
        milkGroup.add(FreshRad);
    }
    
    private void ConfirmFunction(){
       // Get the selected coffee customization details
        String Type = TeaLabel.getText();
        String quantity = QTy.getText();

        // Validate that quantity is entered
        if (quantity.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a quantity.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Get selected coffee strength
        String strength = "";
        if (MildRad.isSelected()) {
            strength = "Mild";
        } else if (MedRad.isSelected()) {
            strength = "Medium";
        } else if (ConcerRad.isSelected()) {
            strength = "Conecrtrated";
        } else {
            JOptionPane.showMessageDialog(this, "Please select a coffee strength.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Get selected milk type
        String milkType = "";
        if (NoMilkRad.isSelected()) {
            milkType = "No Milk";
        } else if (OatRad.isSelected()) {
            milkType = "Oat";
        } else if (AlmondRad.isSelected()) {
            milkType = "Almond";
        } else if (FreshRad.isSelected()) {
            milkType = "Fresh Milk";
        } else {
            JOptionPane.showMessageDialog(this, "Please select a milk type.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Get selected extras (if any)
        StringBuilder extras = new StringBuilder();
        if (PearlRad.isSelected()) {
            extras.append("Expresso Shot ");
        }
        if (SweetRad.isSelected()) {
            extras.append("Sweetener ");
        }

        // Check if at least one extra is selected
        if (extras.length() == 0) {
            extras.append("No Extras");
        }

        // Prepare data to be written to the CSV file
        String data = Type + "," + quantity + "," + strength + "," + milkType + "," + extras.toString().trim();

        // Write the data to a CSV file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Current_orders.csv", true))) {
            writer.write(data);
            writer.newLine();  // Add a new line for the next record
            JOptionPane.showMessageDialog(this, "Coffee customization saved!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error writing to file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Optionally close the window after confirmation
        setVisible(false);
   }
   
    //</editor-fold> 
    
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
            java.util.logging.Logger.getLogger(TeaCustomization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeaCustomization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeaCustomization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeaCustomization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeaCustomization().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AlmondRad;
    private javax.swing.JRadioButton ConcerRad;
    private javax.swing.JButton Confirm;
    private javax.swing.JRadioButton FreshRad;
    private javax.swing.JRadioButton MedRad;
    private javax.swing.JRadioButton MildRad;
    private javax.swing.JRadioButton NoMilkRad;
    private javax.swing.JRadioButton OatRad;
    private javax.swing.JRadioButton PearlRad;
    private javax.swing.JTextField QTy;
    private javax.swing.JRadioButton SweetRad;
    private javax.swing.JLabel TeaLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    // End of variables declaration//GEN-END:variables
}
