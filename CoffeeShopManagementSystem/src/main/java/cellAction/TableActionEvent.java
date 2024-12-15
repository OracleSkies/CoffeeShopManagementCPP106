package cellAction;


public interface TableActionEvent {
    
   public void onRestock(int row);
    


    public void onDelete(int row);
    
    public void currentOrderOnView(int row);
    
    public void searchOnView(int row);

}
