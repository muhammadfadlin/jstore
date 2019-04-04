
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

    /**
     * Constructor for objects of class Sell_Paid
     */
    public Sell_Paid(int id, Item item,int totalItem, Customer customer)
    {
        super(id,item,totalItem);
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
    
    public void printData(){
        System.out.println("=====INVOICE=====");
        System.out.println("ID:"+ getId());
        System.out.println("Date:"+ getDate());
        System.out.println("Item:"+ getItem().getName());
        System.out.println("Total Item:"+ getTotalItem());
        System.out.println("Total Price:"+ getTotalPrice());
        System.out.println("Status:"+ getInvoiceStatus().name());
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
    "Status = " + InvoiceStatus.Paid + "\n" + 
    "Sell Success\n";
    }
}
