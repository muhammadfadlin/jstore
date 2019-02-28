
/**
 * Write a description of class Item here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Item
{
    // instance variables - replace the example below with your own
    private int id;
    private String name ;
    private int stock;
    private int price;
    private String category;
    private Supplier supplier;
    

    /**
     * Constructor for objects of class Item
     */
    public Item(int id,String name,int stock,int price, String category, Supplier supplier)
    {
      this.id=id;
      this.name=name;
      this.stock=stock;
      this.price=price;
      this.category=category;
      this.supplier=supplier;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getId()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getStock()
    {
        return stock;
    }
    
    public int getPrice()
    {
        return price;
    }
    
    public String getCategory()
    {
        return category;
    }
    
    public Supplier getSupplier(){
        return supplier;
    }
    
    public void setId(int id)
    {
        this.id=id;
    }
    
    public void setName(String name)
    {
        this.name=name;
    }
    
    public void setStock(int stock)
    {
        this.stock=stock;
    }
    
    public void setPrice(int price)
    {
        this.price=price;
    }
    
    public void setCategory(String category)
    {
        this.category=category;
    }
    
    public void setSupplier(String category)
    {
        this.supplier=supplier;
    }
    
    public void printData()
    {
        System.out.println(name);
    }
}
