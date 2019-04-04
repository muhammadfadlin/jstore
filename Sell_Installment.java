
/**
 * Write a description of class Sell_Installment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Installment extends Invoice
{
    private InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private InvoiceStatus INVOICE_STATUS = InvoiceStatus.Installment;
    private int installmentPeriod;
    private int installmentPrice;
    private Customer customer;

    public Sell_Installment(int id, Item item, int totalItem, int installmentPeriod,Customer customer)
    {
        super(id,item,totalItem);
    }

    public int getInstallmentPeriod(){
        return installmentPeriod;
    }
    
    public int getInstallmentPrice(){
        return installmentPrice;
    }
    
    public Customer getCustomer(){
        return customer;
    }
    
     public InvoiceStatus getInvoiceStatus(){
        return INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType(){
        return INVOICE_TYPE;
    }
    
    public void setInstallmentPrice(){
        installmentPrice = ((getTotalPrice() / installmentPeriod) * (102/100)) ;
    }
    
     public void setTotalPrice(){
        super.setTotalPrice(installmentPrice * installmentPeriod);
    }
    
    public void setCustomer(Customer customer){
        this.customer = customer;
    }
    
    public void printData(){
        System.out.println("=====INVOICE=====");
        System.out.println("ID:"+ getId());
        System.out.println("Date:"+ getDate());
        System.out.println("Item:"+ getItem().getName());
        System.out.println("Total Item:"+ getTotalItem());
        System.out.println("Total Price:"+ getTotalPrice());
        System.out.println("Status:"+ getInvoiceStatus().name());
        System.out.println("Installment price : " + getInstallmentPrice());
    }
    
    public String toString(){
        return "ID = \n" + + this.getId() + "\n" + 
    "Item = " + this.getItem().getName() + "\n" +
    "Amount = "  + this.getTotalItem() + "\n" +
    "Buy date = " + this.getDate() + "\n" +
    "Price = " + this.getItem().getPrice() + "\n" +
    "Price total = " + this.getTotalPrice() + "\n" +
    "Installment price = " + this.getInstallmentPrice() + "\n" +
    "Supplier ID = " + this.getItem().getId() + "\n" +
    "Supplier name = " + this.getItem().getName() + "\n" +
    "Customer ID = " + this.customer.getId() + "\n" +
    "Customer name = " + this.customer.getName() + "\n" +
    "Status = " + InvoiceStatus.Installment + "\n" + 
    "Sell Success\n";
    }
    
}
