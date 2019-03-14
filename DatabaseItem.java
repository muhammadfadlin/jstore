

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
    private String[] listItem;
    public static Item itemDB;

     /**
     * menambah item
     * @return nilai false
     * @param nilai item
     */
    public static boolean addItem(Item item)
    {
        itemDB = item;
        return false;
    }
    
     /**
     * menghapus item
     * @return nilai false
     * @param nilai item
     */
    public static boolean removeItem(Item item)
    {     
        itemDB = null;
        return false;
    }
    
    public Item getItem()
    {     
        return itemDB;
    }
    
     /**
     * mengembalikan list database
     * @return nilai listItem
     */
    public String[] getItemDatabase()
    {     
        return listItem;
    }
    
    
}
