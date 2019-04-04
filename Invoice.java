import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
/**
 * Sebuah class dengan informasi mengenai semua invoice ketika transaksi dilakukan
 *
 * @author Muhammad Fadli
 * @version 28/02/2019
 * @since 28/02/2019
 */
public abstract class Invoice
{
    // instance variables - replace the example below with your own
    private int id;
    private Item item;
    private Calendar date = new GregorianCalendar().getInstance();
    private int totalPrice;
    private int totalItem;
    private InvoiceStatus status;
    private InvoiceType type;

    /**
     * Constructor for objects of class Invoice
     * @param id is the first paramter to Invoice method
     * @param item is the second paramter to Invoice method
     * @param date is the third paramter to Invoice method
     * @param totalPrice is the fourth paramter to Invoice method
     */
    public Invoice(int id, Item item,int totalItem)
    {
        this.id=id;
        this.item=item;
        this.totalItem=totalItem;
        setTotalPrice(totalItem * item.getPrice());      
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
    public Calendar getDate()
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
    
     public int getTotalItem()
    {
        return totalItem;
    }
    
     public InvoiceStatus getInvoiceStatus()
    {
        return status;
    }
    
    public InvoiceType getInvoiceType()
    {
        return type;
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
    public void setDate(Calendar date)
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
    
    public void setTotalItem(int totalItem)
    {
        this.totalItem=totalItem;
    }
    
    public void setInvoiceStatus(InvoiceStatus status)
    {
        this.status=status;
    }
    
    public String toString(){
        return "";
    }
    
       /**
     * melakukan print nilai totalharga
     * 
     */
    
    public abstract void printData();
     
}
