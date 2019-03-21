
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
    private String dueDate;


    public Sell_Unpaid(int id, Item item, String date,int totalItem, int totalPrice,String dueDate)
    {
        super(id,item,date,totalItem,totalPrice);
    }

    public InvoiceStatus getInvoiceStatus(){
        return INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType(){
        return INVOICE_TYPE;
    }
    
    public String getDueDate(){
        return dueDate;
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
    
}
