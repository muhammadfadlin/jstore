
/**
 * Sebuah class dengan informasi mengenai semua invoice ketika transaksi dilakukan
 *
 * @author Muhammad Fadli
 * @version 28/02/2019
 * @since 28/02/2019
 */
public class Invoice
{
    // instance variables - replace the example below with your own
    private int id;
    private Item item;
    private String date;
    private int totalPrice;

    /**
     * Constructor for objects of class Invoice
     * @param id is the first paramter to Invoice method
     * @param item is the second paramter to Invoice method
     * @param date is the third paramter to Invoice method
     * @param totalPrice is the fourth paramter to Invoice method
     */
    public Invoice(int id, Item item, String date, int totalPrice)
    {
        this.id=id;
        this.item=item;
        this.date=date;
        this.totalPrice=totalPrice;
        
    }

      /**
     * mengembalikan nilai id
     * @return nilai id
     */
    public int getId()
    {
        return id;
    }
    
    
      /**
     * mengembalikan nilai item
     * @return nilai item
     */
    public Item getItem()
    {
        return item;
    }
    
      /**
     * mengembalikan nilai tanggal
     * @return nilai date
     */
    public String getDate()
    {
        return date;
    }
    
      /**
     * mengembalikan nilai total harga
     * @return nilai totalPrice
     */
    public int getTotalPrice()
    {
        return totalPrice;
    }
    
    /**
     * melakukan set nilai baru pada ID
     * @param nila id mengganti id
     */
    public void setId(int id)
    {
        this.id=id;
    }
    
    
    /**
     * melakukan set nilai baru pada item
     * @param nilai item mengganti item
     */
    public void setItem(Item item)
    {
        this.item=item;
    }
    
    /**
     * melakukan set nilai baru pada tanggal
     * @param nilai date mengganti date
     */
    public void setDate(String date)
    {
        this.date=date;
    }
    
    /**
     * melakukan set nilai baru pada total harga
     * @param nilai totalPrice mengganti totalPrice
     */
    public void setTotalPrice(int totalPrice)
    {
        this.totalPrice=totalPrice;
    }
    
       /**
     * melakukan print nilai totalharga
     * 
     */
     public void printData()
    {
           System.out.println(totalPrice);
    }
}
