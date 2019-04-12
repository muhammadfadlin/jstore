import java.util.ArrayList;
/**
 * Write a description of class Sell_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Paid extends Invoice
{
    // instance variables - replace the example below with your own
    private InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private InvoiceStatus INVOICE_STATUS = InvoiceStatus.Paid;
    private Customer customer;
    private boolean isActive = false;

    /**
     * Constructor for objects of class Sell_Paid
     */
    public Sell_Paid(ArrayList<Integer> item)
    {
        super(item);
    }

     public InvoiceStatus getInvoiceStatus(){
        return INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType(){
        return INVOICE_TYPE;
    }
    
    public Customer getCustomer(){
        return customer;
    }

    public void setCustomer(Customer customer){
        this.customer=customer;
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
        "Customer ID = " + customer.getId() + "\n" +
        "Customer Name = " + customer.getName() + "\n" +
        "Status = " + INVOICE_STATUS + "\n" +
        "Sell Success" + "\n");
        }
    return s;
    }
}
