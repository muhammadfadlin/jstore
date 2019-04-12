import java.util.ArrayList;
/**
 * Write a description of class Sell_Installment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Installment extends Invoice
{
    private static InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private static InvoiceStatus INVOICE_STATUS = InvoiceStatus.Installment;
    private int installmentPeriod;
    private int installmentPrice;
    private Customer customer;
    private boolean isActive = true;

    public Sell_Installment(ArrayList<Integer> item)
    {
        super(item);
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
    
    public String toString(){
         for(Item item : DatabaseItem.getItemDatabase()){
        System.out.println("ID = " + getId());
        System.out.println("Name = " + item.getName());
        System.out.println("Buy date= " + getDate());
        System.out.println("Price = " + item.getPrice());
        System.out.println("Price Total = " + getTotalPrice());
        System.out.println("Supplier ID = " + item.getSupplier().getId());
        System.out.println("Supplier Name = " + item.getSupplier().getName());
        System.out.println("Customer ID = " + customer.getId());
        System.out.println("Customer Name = " + customer.getName());
        System.out.println("Status = " + INVOICE_STATUS);
        System.out.println("Sell Success");
        }
    return "";
    }   
}
