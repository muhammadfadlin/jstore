
/**
 * Write a description of class Buy_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Buy_Paid extends Invoice
{
    // instance variables - replace the example below with your own
    private InvoiceType INVOICE_TYPE = InvoiceType.Buy;
    private InvoiceStatus INVOICE_STATUS = InvoiceStatus.Paid;

    /**
     * Constructor for objects of class Buy_Paid
     */
    public Buy_Paid(int id, Item item,int totalItem)
    {
        super(id,item,totalItem);
    }

    public InvoiceStatus getInvoiceStatus(){
        return INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType(){
        return INVOICE_TYPE;
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
    "Status = " + InvoiceStatus.Paid + "\n" + 
    "Sell Success\n";
    }
    
}

