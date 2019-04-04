import java.util.Calendar;
/**
 * Write a description of class Sell_Unpaid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Unpaid extends Invoice
{
    // instance variables - replace the example below with your own
    private InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private InvoiceStatus INVOICE_STATUS = InvoiceStatus.Unpaid;
    private Calendar dueDate;
    private Customer customer;


    public Sell_Unpaid(int id,Item item, int totalItem, Customer customer)
    {
        super(id,item,totalItem);
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
    
    public void printData(){
        System.out.println("=====INVOICE=====");
        System.out.println("ID:"+ getId());
        System.out.println("Date:"+ getDate());
        System.out.println("Item:"+ getItem().getName());
        System.out.println("Total Item:"+ getTotalItem());
        System.out.println("Total Price:"+ getTotalPrice());
        System.out.println("Status:"+ getInvoiceStatus().name());
        System.out.println("Due Date :"+ getDueDate());
    }
    
    public String toString(){
        return "ID = \n" + + this.getId() + "\n" + 
    "Item = " + this.getItem().getName() + "\n" +
    "Amount = "  + this.getTotalItem() + "\n" +
    "Buy date = " + this.getDate() + "\n" +
    "Price = " + this.getItem().getPrice() + "\n" +
    "Price total = " + this.getTotalPrice() + "\n" +
    "Supplier ID = " + this.getItem().getId() + "\n" +
    "Supplier name = " + this.getItem().getName() + "\n" +
    "Customer ID = " + this.customer.getId() + "\n" +
    "Customer name = " + this.customer.getName() + "\n" +
    "Status = " + InvoiceStatus.Unpaid + "\n" + 
    "Due Date= " + getDueDate() + "\n" +
    "Sell Success\n";
    }
}
