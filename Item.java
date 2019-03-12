
/**
 * Sebuah class untuk memasukan item baru
 *
 * @author Muhammad Fadli
 * @version 28/02/2019
 * @since 28/02/2019
 */
public class Item
{
    // instance variables - replace the example below with your own
    private int id;
    //string untuk nama
    private String name ;
    /*
     * Melakukan pemasukan untuk nilai stock
     * agar dapat digunakan kembali
     */
    private int stock;
    private int price;
    private String category;
    private Supplier supplier;
    

    /**
     * Constructor for objects of class Item
     * @param id is the first paramter to Item method
     * @param name is the second paramter to Item method
     * @param stock is the third paramter to Item method
     * @param price is the fourth paramter to Item method
     * @param category is the fifth paramter to Item method
     * @param supplier is the sixth paramter to Item method
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
     * mengembalikan id
     * @return nilai id 
     */
    public int getId()
    {
        return id;
    }
    
    /**
     * mengembalikan nama
     * @return nilai name
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * mengembalikan stock
     * @return nilai stock
     */
    public int getStock()
    {
        return stock;
    }
    
    /**
     * mengembalikan price
     * @return nilai price
     */
    public int getPrice()
    {
        return price;
    }
    
    /**
     * mengembalikan category
     * @return nilai category
     */
    public String getCategory()
    {
        return category;
    }
    
    /**
     * mengembalikan supplier
     * @return nilai supplier
     */
    public Supplier getSupplier(){
        return supplier;
    }
    
    /**
     * melakukan set nilai baru pada id
     * @param nilai id mengganti id
     */
    public void setId(int id)
    {
        this.id=id;
    }
    
    /**
     * melakukan set nilai baru pada nama
     * @param nilai name mengganti name
     */
    public void setName(String name)
    {
        this.name=name;
    }
    
    /**
     * melakukan set nilai baru pada stock
     * @param nilai stock mengganti stock
     */
    public void setStock(int stock)
    {
        this.stock=stock;
    }
    
    /**
     * melakukan set nilai baru pada harga
     * @param nilai price mengganti price
     */
    public void setPrice(int price)
    {
        this.price=price;
    }
    
    /**
     * melakukan set nilai baru pada kategori
     * @param nilai category mengganti category
     */
    public void setCategory(String category)
    {
        this.category=category;
    }
    
    /**
     * melakukan set nilai baru pada supplier
     * @param nilai supplier mengganti supplier
     */
    public void setSupplier(Supplier supplier)
    {
        this.supplier=supplier;
    }
    
    /**
     * melakukan print nilai nama
     * 
     */
    public void printData()
    {
        System.out.println(name);
    }
}
