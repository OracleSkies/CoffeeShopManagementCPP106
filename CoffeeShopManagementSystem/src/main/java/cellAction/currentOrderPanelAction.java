package cellAction;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import CashierSubBranch.*;
import javax.swing.JOptionPane;


public class currentOrderPanelAction extends javax.swing.JPanel {

    
    public currentOrderPanelAction() {
        initComponents();
    }

    public void initEvent(TableActionEvent event, int row) {
        // Initialize the "View" button action listener
        cmdView.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                // Trigger the event to open the window based on the row value
                event.currentOrderOnView(row);  // This method will handle opening the appropriate window
            }
        });

        // Initialize the "Delete" button action listener
        cmdDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                event.onDelete(row);  // Handle delete action
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmdDelete = new cellAction.ActionButton();
        cmdView = new cellAction.ActionButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        add(cmdDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 40, 30));

        cmdView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/view.png"))); // NOI18N
        cmdView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdViewActionPerformed(evt);
            }
        });
        add(cmdView, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 30, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void cmdViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdViewActionPerformed
        
    }//GEN-LAST:event_cmdViewActionPerformed

    // <editor-fold defaultstate="collapsed" desc="Functionalitis">
    public void openWindowBasedOnRow(int row) {
        // Based on the row value, decide which window to open
        switch (row) {
            case 1:
                // Open CoffeeCurrentCustomization for row 1
                CoffeeCurrentCustomization cc1 = new CoffeeCurrentCustomization();
                cc1.setVisible(true);
                break;
            case 2:
                
                TeaCurrentCustomization window2 = new TeaCurrentCustomization();
                window2.setVisible(true);
                break;
            case 3:
                // Example: Another window for row 3
                FrappeCurrentCustomization window3 = new FrappeCurrentCustomization();
                window3.setVisible(true);
                break;
            case 4: 
                PastryCurrentCustomization window4 = new  PastryCurrentCustomization();
                window4.setVisible(true);
            default:
                // Handle other cases or show an unknown item dialog
                JOptionPane.showMessageDialog(null, "Unknown Item for this row");
                break;
        }
    }
    
    
    //</editor-fold>

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private cellAction.ActionButton cmdDelete;
    private cellAction.ActionButton cmdView;
    // End of variables declaration//GEN-END:variables

    
}
