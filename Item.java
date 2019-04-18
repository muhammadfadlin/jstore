
/**
 * <h1>Class Item</h1>
 * A simple class for creating Item object
 * For using this class, you need the Supplier class too
 * @author (Achmad Kripton Nugraha)
 * @version (28/02/2019)
 */
public class Item
{
    // instance variables 
    private int id;
    private String name;
    private int price;
    private ItemCategory category;
    private Supplier supplier;
    private ItemStatus status;

    /**
     * Constructor for objects of class Item
     * constructor should initiate the variables from parameter
     */
    public Item(String name, ItemStatus status, int price, Supplier supplier , ItemCategory category)
    {
        // initialise instance variables
        this.id = DatabaseItem.getLastItemID()+1;
        this.name = name;
        this.status = status;
        this.price = price;
        this.category = category;
        this.supplier = supplier;
    }

    /**
     * getID method
     * this method used as getter function of id variables
     * @return value of id as integer
     */
    public int getId()
    {
        
        return id;
    }
    
    /**
     * getName method
     * this method used as getter function of name variables
     * @return value of name as String
     */
    public String getName()
    {
        
        return name;
    }
    
    /**
     * getStock method
     * this method used as getter function of stock variables
     * @return value of stock as integer
     */

    
    /**
     * getPrice method
     * this method used as getter function of Price variables
     * @return value of price as integer
     */
    public int getPrice()
    {
        
        return price;
    }
    
    /**
     * getCategory method
     * this method used as getter function of category variables
     * @return value of category as String
     */
    public ItemCategory getCategory()
    {
       
        return category;
    }
    
    /**
     * getSupplier method
     * this method used as getter function of supplier variables
     * @return value of name as supplier
     */
    public Supplier getSupplier()
    {
        
        return supplier;
    }
    
    public ItemStatus getStatus()
    {
        
        return status;
    }

    /**
     * setId method
     * this method used as setter function of id variables
     * @param id a parameter for changing the values of id variable with int types
     */
    public void setId(int id)
    {
        
        this.id = id; //use this cause the name of variable and parameter is same
    }
    
    /**
     * setName method
     * this method used as setter function of name variables
     * @param name a parameter for changing the values of name variable with String types
     */
    public void setName(String name)
    {
       
        this.name = name; //use this cause the name of variable and parameter is same
    }
    
    /**
     * setStock method
     * this method used as setter function of stock variables
     * @param stock a parameter for changing the values of stock variable with int types
     */

    /**
     * setPrice method
     * this method used as setter function of price variables
     * @param price parameter for changing the values of price variable with int types
     */
    public void setPrice(int price)
    {
       
        this.price = price; //use this cause the name of variable and parameter is same
    }
    
    /**
     * setCategory method
     * this method used as setter function of category variables
     * @param category a parameter for changing the values of category variable with String types
     */
    public void setCategory(ItemCategory category)
    {
        
        this.category = category; //use this cause the name of variable and parameter is same
    }

    /**
     * setSupplier method
     * this method used as setter function of supplier variables
     * @param supplier a parameter for changing the values of supplier variable with Supplier types
     */
    public void setSupplier(Supplier supplier)
    {
        
        this.supplier = supplier; //use this cause the name of variable and parameter is same
    }
    
    public void setStatus(ItemStatus status)
    {
        
        this.status = status; //use this cause the name of variable and parameter is same
    }

    /**
     * printData method
     * this method used to print name of the Item
     */
    public String toString()
    {
        String ret = "=============ITEM===========";
        ret += "\n";
        ret += ("ID: " + id);
        ret += "\n";
        ret +=("Nama Item: " + name);
        ret += "\n";
        ret +=("Kategori: " + category);
        ret += "\n";
        ret +=("Status: " + status);
        ret += "\n";
        ret +=("Supplier: " + supplier.getName());
        ret += "\n";
        return ret;
    }
}
