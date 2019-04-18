import java.util.ArrayList;

/**
 * Write a description of class Sell_Installment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Installment extends Invoice
{
    // instance variables - replace the example below with your own
    private static InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private static InvoiceStatus INVOICE_STATUS = InvoiceStatus.Installment;
    private int installmentPeriod;
    private int installmentPrice;
    private Customer customer;
    private boolean isActive;

    /**
     * Constructor for objects of class Buy_Paid
     */
   public Sell_Installment(ArrayList<Integer> item, Customer customer, int installmentPeriod)
    {
        // initialise instance variables
        super(item);
        this.installmentPeriod = installmentPeriod;
        setInstallmentPrice();
        setTotalPrice();
        this.customer = customer;
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
    
    public int getInstallmentPeriod()
    {
        return installmentPeriod;
    }
    
    public int getInstallmentPrice()
    {
        return installmentPrice;
    }
    
    public Customer getCustomer()
    {
        return customer;
    }
    
    public void setInstallmentPrice()
    {
        installmentPrice = getTotalPrice()/installmentPeriod*102/100;
    }
    
    public void setTotalPrice()
    {

        super.setTotalPrice(installmentPrice*installmentPeriod);
    }
    
    public void setCustomer(Customer customer)
    {
        this.customer = customer;
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
        str += "\n" + "Installment Price: " + installmentPrice;
        str += "\n" + "Customer ID: " + customer.getId();
        str += "\n" + "Customer Name: " + customer.getName();
        str += "\n" + "Status: " + INVOICE_STATUS;
        str += "\n" + "Installment Period: " +installmentPeriod;
        str += "\n" + "Status Active: "+getIsActive();
        str += "\n" + "Sell Success" + "\n";
        return str;
    }
}
