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
    private boolean isActive;
    /**
     * Constructor for objects of class Buy_Paid
     */
    public Buy_Paid(ArrayList<Integer> item)
    {
        // initialise instance variables
        super(item);
        isActive = false;
        
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
    
    public String toString()
    {
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd MMM yyyy");
        String cetak = sdf.format(getDate().getTime());
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
        str += "\n" + "Status: " + INVOICE_STATUS;
        str += "\n" + "Buy Success" + "\n";
        return str;
    }
}
