
import java.util.ArrayList;
/**
 * Write a description of class Buy_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Buy_Paid extends Invoice
{
    // instance variables - replace the example below with your own
    private static InvoiceType INVOICE_TYPE = InvoiceType.Buy;
    private static InvoiceStatus INVOICE_STATUS = InvoiceStatus.Paid;
    private boolean isActive = false;

    /**
     * Constructor for objects of class Buy_Paid
     */
    public Buy_Paid(ArrayList<Integer> item)
    {
        super(item);
    }

    public InvoiceStatus getInvoiceStatus(){
        return INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType(){
        return INVOICE_TYPE;
    }

    public String toString(){
      String s = "";
      for(Item item : DatabaseItem.getItemDatabase()){
        s=s.concat("ID = " + getId() + "\n" +
        "Name = " + item.getName() + "\n" +
        "Buy date= " + getDate() + "\n" +
        "Price = " + item.getPrice() + "\n" +
        "Price Total = " + getTotalPrice() + "\n" +
        "Supplier ID = " + item.getSupplier().getId() + "\n" +
        "Supplier Name = " + item.getSupplier().getName() + "\n" +
        "Status = " + INVOICE_STATUS + "\n" +
        "Sell Success" + "\n");
        }
    return s;
    }
    
}

