package cellAction;


import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;


public class CurrentOrderTableActionCellEditor extends DefaultCellEditor {

    private TableActionEvent event;

    public CurrentOrderTableActionCellEditor(TableActionEvent event) {//
        super(new JCheckBox());
        this.event = event;
    }

    @Override
    public Component getTableCellEditorComponent(JTable jtable, Object o, boolean bln, int row, int column) {
        currentOrderPanelAction action = new currentOrderPanelAction();
        action.initEvent(event, row);
        action.setBackground(jtable.getSelectionBackground());
        return action;
    }
}
