

/**
 * Sebuah class sebagai tempat penyimpanan data-data semua item
 *
 * @author Muhammad Fadli
 * @version 28/02/2019
 * @since 28/02/2019
 */
static public class DatabaseItem
{
    // instance variables - replace the example below with your own
    private String[] listItem;
    private Item item;

     /**
     * menambah item
     * @return nilai false
     * @param nilai item
     */
    public boolean addItem(Item item)
    {
        return false;
    }
    
     /**
     * menghapus item
     * @return nilai false
     * @param nilai item
     */
    public boolean removeItem(Item item)
    {     
        return false;
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
