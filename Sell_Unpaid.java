import java.util.Calendar;
import java.util.ArrayList;
/**
 * Write a description of class Sell_Unpaid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Unpaid extends Invoice
{
    // instance variables - replace the example below with your own
    private static InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private static InvoiceStatus INVOICE_STATUS = InvoiceStatus.Unpaid;
    private Calendar dueDate;
    private Customer customer;
    private boolean isActive = true;


    public Sell_Unpaid(ArrayList<Integer> item)
    {
        super(item);
	dueDate.add(Calendar.DAY_OF_MONTH,1);
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
    
    public Calendar getDueDate(){
        return dueDate;
    }
    
    public void setCustomer(Customer customer){
        this.customer = customer;
    }
    
    public void setDueDate(Calendar dueDate){
        this.dueDate = dueDate;
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
        "Due Date = " + getDueDate() + "\n" +
        "If payment is not received by dueDate, transaction will be cancelled" + "\n");
        }
    return s;
    }
}
