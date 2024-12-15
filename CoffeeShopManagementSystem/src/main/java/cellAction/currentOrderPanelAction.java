package cellAction;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import CashierSubBranch.*;


public class currentOrderPanelAction extends javax.swing.JPanel {

    
    public currentOrderPanelAction() {
        initComponents();
    }

    public void initEvent (TableActionEvent event, int row){
        cmdView.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent ae){
                event.currentOrderOnView(row);
            }
        });
        cmdDelete.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent ae){
                event.onDelete(row);
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
        CoffeeCurrentCustomization CC = new CoffeeCurrentCustomization();
        CC.setVisible(true);
    }//GEN-LAST:event_cmdViewActionPerformed

    // <editor-fold defaultstate="collapsed" desc="Functionalitis">
    
    
    //</editor-fold>

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private cellAction.ActionButton cmdDelete;
    private cellAction.ActionButton cmdView;
    // End of variables declaration//GEN-END:variables

    
}
