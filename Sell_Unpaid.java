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
    private java.util.Calendar dueDate;
    private Customer customer;
    private boolean isActive;
    
    /**
     * Constructor for objects of class Buy_Paid
     */
   public Sell_Unpaid(ArrayList<Integer> item, Customer customer)
    {
        // initialise instance variables
        super(item);
        this.customer = customer;
        dueDate = java.util.Calendar.getInstance();
        dueDate.add(java.util.Calendar.DATE, 1);
        isActive = true;
    }

    public InvoiceStatus getInvoiceStatus()
    {
        // put your code here
        return INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType()
    {
        // put your code here
        return INVOICE_TYPE;
    }
    
    public java.util.Calendar getDueDate()
    {
        return dueDate;
    }
    
    public Customer getCustomer()
    {
        return customer;
    }
    
    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }
    
    public void setDueDate(java.util.Calendar dueDate)
    {
        this.dueDate = dueDate;
    }
    
    public String toString()
    {
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd MMM yyyy");
        String cetak = sdf.format(getDate().getTime());
        String cetak2 = sdf.format(dueDate.getTime());
        String str = "===== Invoice =====";
        str += "\n" + "ID: " + this.getId();
        str += "\n" + "Buy Date: " +cetak;
        for (Integer i: getItem()
        ) {
            Item item = DatabaseItem.getItemFromID(i.intValue());
            str += "\n" + "Item: " + item.getName();
            str += "\n" + "Amount: " + getItem().size();
            str += "\n" + "Price: " + item.getPrice();
            str += "\n" + "Supplier ID: " + item.getSupplier().getId();
            str += "\n" + "Supplier Name: " + item.getSupplier().getName();
        }
        str += "\n" + "Price Total: " + getTotalPrice();
        str += "\n" + "Customer ID: " + customer.getId();
        str += "\n" + "Customer Name: " + customer.getName();
        str += "\n" + "Status: " + INVOICE_STATUS;
        str += "\n" + "Due Date: " +cetak2;
        str += "\n" + "Status Active: "+getIsActive();
        str += "\n" + "If payment is not received by dueDate, transaction will be canceled" + "\n";
        return str;
    }
}
