/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cellAction;

/**
 *
 * @author Jayjay
 */
public interface TableActionEvent {
    
//    public void onRestock(int row);
    
//    public void onEdit(int row);

    public void onDelete(int row);
    
    public void currentOrderOnView(int row);
    
    public void searchOnView(int row);
}
