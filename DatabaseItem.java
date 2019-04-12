import java.util.ArrayList;

/**
 * Sebuah class sebagai tempat penyimpanan data-data semua item
 *
 * @author Muhammad Fadli
 * @version 28/02/2019
 * @since 28/02/2019
 */
public class DatabaseItem
{
    // instance variables - replace the example below with your own
    private static ArrayList<Item> ITEM_DATABASE = new ArrayList<Item>();
    private static int LAST_ITEM_ID=0;

     /**
     * menambah item
     * @return nilai false
     * @param nilai item
     */
    
    public static ArrayList<Item> getItemDatabase(){
        return ITEM_DATABASE;
    }
    
    public static boolean addItem(Item item)
    {
        for(Item barang : ITEM_DATABASE){
            if((item.getName()!=barang.getName())&&
            (item.getStatus()!=barang.getStatus())&&
            (item.getSupplier()!=barang.getSupplier())){
                ITEM_DATABASE.add(item);
                return true;
        }
    }
        return false;
    }
    
     /**
     * menghapus item
     * @return nilai false
     * @param nilai item
     */
    
    public static Item getItemFromID(int id)
    {     
        for(Item item : ITEM_DATABASE){
            if(item.getId()==id){
                return item;
            }
        }
        return null;
    }
    
    public static ArrayList<Item> getItemFromSupplier(Supplier supplier)
    {     
        ArrayList<Item> temparr = null;
        for(Item item : ITEM_DATABASE){
            if(item.getSupplier()==supplier){
                temparr.add(item);
                return temparr;
            }
        }
            return null;
    }
    
    public static ArrayList<Item> getItemFromCategory(ItemCategory category)
    {     
        ArrayList<Item> temparr = null;
        for(Item item : ITEM_DATABASE){
            if(item.getCategory()==category){
                temparr.add(item);
                return temparr;
            }
        }
            return null;
    }
    
    public static ArrayList<Item> getItemFromStatus(ItemStatus status)
    {     
        ArrayList<Item> temparr = null;
        for(Item item : ITEM_DATABASE){
            if(item.getStatus()==status){
                temparr.add(item);
                return temparr;
            }
        }
            return null;
    }
    
    public static boolean removeItem(Item item)
    {   
          for(Item barang : ITEM_DATABASE){
            if(barang.getName()==item.getName()){
                ITEM_DATABASE.remove(item);
                return true;
            }
        }
            return false;
    }
}
