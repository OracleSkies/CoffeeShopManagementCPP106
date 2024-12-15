/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package cellAction;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Jayjay
 */
public class restockPanelAction extends javax.swing.JPanel {

    /**
     * Creates new form PanelAction
     */
    public restockPanelAction() {
        initComponents();
    }

    public void initEvent (TableActionEvent event, int row){
        cmdRestock.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent ae){
                event.onRestock(row);
            }
        });
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmdRestock = new cellAction.ActionButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdRestock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add to stock 35x35.png"))); // NOI18N
        cmdRestock.setPreferredSize(new java.awt.Dimension(35, 35));
        add(cmdRestock, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, -1, 41));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private cellAction.ActionButton cmdRestock;
    // End of variables declaration//GEN-END:variables

    
}
