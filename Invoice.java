import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

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
    private ArrayList<Integer> item;
    private Calendar date = new GregorianCalendar().getInstance();
    private int totalPrice;
    private boolean isActive;
    private Customer customer;

    /**
     * Constructor for objects of class Invoice
     * @param id is the first paramter to Invoice method
     * @param item is the second paramter to Invoice method
     * @param date is the third paramter to Invoice method
     * @param totalPrice is the fourth paramter to Invoice method
     */
    public Invoice(ArrayList<Integer> item)
    {
        item = new ArrayList<Integer>(); 
        id = DatabaseInvoice.getLastInvoiceID()+1;
       // setTotalPrice(totalItem * item.getPrice());      
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
    public ArrayList<Integer> getItem()
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
    
    public abstract InvoiceStatus getInvoiceStatus();
    public abstract InvoiceType getInvoiceType();
  
    
    public boolean getIsActive(){
        return isActive;
    }
    
    public Customer getCustomer(){
        return customer;
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
    public void setItem(ArrayList<Integer> item)
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
        for(Item item : DatabaseItem.getItemDatabase()){
        this.totalPrice+=item.getPrice();
        }
    }
    
    public void setInvoiceStatus(InvoiceStatus status)
    {
        status=status;
    }
    
    public void setIsActive(boolean isActive)
    {
        this.isActive=isActive;
    }
    
    public abstract String toString();  
     
}
