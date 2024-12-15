package CashierSubBranch;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

public class FrappeCustomization extends javax.swing.JFrame {

    
    public FrappeCustomization() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        FrappeLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        QTy = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        TwentyFiveRad = new javax.swing.JRadioButton();
        FiftyRad = new javax.swing.JRadioButton();
        SeventyFiveRad = new javax.swing.JRadioButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        SyrupRad = new javax.swing.JRadioButton();
        Confirm = new javax.swing.JButton();
        OnehundoRad = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(206, 148, 97));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("FRAPPE CUSTOMIZATION");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("BEVERAGE:");

        FrappeLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        FrappeLabel.setText("Frappe");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("QUANTITY:");

        QTy.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("SUGAR LEVEL");

        TwentyFiveRad.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TwentyFiveRad.setText("25%");
        TwentyFiveRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TwentyFiveRadActionPerformed(evt);
            }
        });

        FiftyRad.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        FiftyRad.setText("50%");
        FiftyRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiftyRadActionPerformed(evt);
            }
        });

        SeventyFiveRad.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        SeventyFiveRad.setText("75%");
        SeventyFiveRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeventyFiveRadActionPerformed(evt);
            }
        });

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setText("EXTRAS");

        SyrupRad.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        SyrupRad.setText("Syrup");
        SyrupRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SyrupRadActionPerformed(evt);
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

        OnehundoRad.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        OnehundoRad.setText("100%");
        OnehundoRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnehundoRadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(FrappeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(QTy, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel5)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(TwentyFiveRad)
                        .addGap(77, 77, 77)
                        .addComponent(FiftyRad)
                        .addGap(77, 77, 77)
                        .addComponent(SeventyFiveRad)
                        .addGap(77, 77, 77)
                        .addComponent(OnehundoRad))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(SyrupRad))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(Confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 97, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(97, 97, 97))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(FrappeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addComponent(QTy, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TwentyFiveRad)
                    .addComponent(FiftyRad)
                    .addComponent(SeventyFiveRad)
                    .addComponent(OnehundoRad))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SyrupRad)
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    
    // <editor-fold defaultstate="collapsed" desc="Evants"> 
    private void TwentyFiveRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TwentyFiveRadActionPerformed
        groupButtons();
    }//GEN-LAST:event_TwentyFiveRadActionPerformed

    private void FiftyRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiftyRadActionPerformed
        groupButtons();
    }//GEN-LAST:event_FiftyRadActionPerformed

    private void SeventyFiveRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeventyFiveRadActionPerformed
        groupButtons();
    }//GEN-LAST:event_SeventyFiveRadActionPerformed

    private void SyrupRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SyrupRadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SyrupRadActionPerformed

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

    private void OnehundoRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnehundoRadActionPerformed
        groupButtons();
    }//GEN-LAST:event_OnehundoRadActionPerformed

    private void ConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmActionPerformed
        ConfirmFunction();
    }//GEN-LAST:event_ConfirmActionPerformed
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Functionalitis"> 
    public void updateLabel(String text){
       FrappeLabel.setText(text);
   }
    
    
    private void groupButtons(){
        ButtonGroup strengthGroup = new ButtonGroup();
        strengthGroup.add(TwentyFiveRad);
        strengthGroup.add(FiftyRad);
        strengthGroup.add(SeventyFiveRad);
        strengthGroup.add(OnehundoRad);
    }
    
    private void ConfirmFunction(){
       // Get the selected coffee customization details
        String Type = FrappeLabel.getText();
        String quantity = QTy.getText();

        // Validate that quantity is entered
        if (quantity.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a quantity.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Get selected coffee strength
        String strength = "";
        if (TwentyFiveRad.isSelected()) {
            strength = "25%";
        } else if (FiftyRad.isSelected()) {
            strength = "50%";
        } else if (SeventyFiveRad.isSelected()) {
            strength = "75%";
        } else if (OnehundoRad.isSelected()) {
            strength = "100%";
        }else {
            JOptionPane.showMessageDialog(this, "Please select a coffee strength.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }


        // Get selected extras (if any)
        StringBuilder extras = new StringBuilder();
        if (SyrupRad.isSelected()) {
            extras.append("Expresso Shot ");
        }
        
        // Check if at least one extra is selected
        if (extras.length() == 0) {
            extras.append("No Extras");
        }

        // Prepare data to be written to the CSV file
        String data = Type + "," + "Frappe" + "," + quantity + "," + strength + "," + " " + "," + extras.toString().trim();

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
            java.util.logging.Logger.getLogger(FrappeCustomization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrappeCustomization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrappeCustomization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrappeCustomization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrappeCustomization().setVisible(true);
            }
        });
    }
    
    // <editor-fold defaultstate="collapsed" desc="PAnggulo"> 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Confirm;
    private javax.swing.JRadioButton FiftyRad;
    private javax.swing.JLabel FrappeLabel;
    private javax.swing.JRadioButton OnehundoRad;
    private javax.swing.JTextField QTy;
    private javax.swing.JRadioButton SeventyFiveRad;
    private javax.swing.JRadioButton SyrupRad;
    private javax.swing.JRadioButton TwentyFiveRad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}//</editor-fold>
