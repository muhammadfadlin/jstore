import java.util.ArrayList;
/**
 * Write a description of class DatabaseInvoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseInvoice
{
    // instance variables - replace the example below with your own
    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<Invoice>();
    private static int LAST_INVOICE_ID;

    /**
     * Constructor for objects of class DatabaseInvoice
     */
    public static ArrayList<Invoice> getInvoiceDatabase(){
        return INVOICE_DATABASE;
    }
    
    public static int getLastInvoiceID(){
        return LAST_INVOICE_ID;
    }
    
    public static boolean addInvoice(Invoice invoice)
    {
        INVOICE_DATABASE.add(invoice); 
        return true;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
  
     public static boolean removeInvoice(int id)
    {   
        for(Invoice invoice : INVOICE_DATABASE){
            if(invoice.getId()==id){
                if(invoice.getIsActive()==true){
                    invoice.setIsActive(false);
                }
                INVOICE_DATABASE.remove(invoice);
            }
        }
        return false;
    }
    
      /**
     * mengembalikan nilai supplier
     * @return nilai supplier
     */
    public static Invoice getInvoice(int id)
    {     
        for(Invoice invoice : INVOICE_DATABASE){
            if(invoice.getId()==id){
                return invoice;
            }
        }
        return null;
    }
    
    
    /**
     * mengembalikan nilai listsupplier
     * @return nilai listSupplier
     */
    public static Invoice getActiveOrder(Customer customer)
    {     
        for(Invoice invoice : INVOICE_DATABASE){
            if(invoice.getInvoiceStatus()==InvoiceStatus.Unpaid){
                return invoice;
            }
        }
        return null;
    }
}
