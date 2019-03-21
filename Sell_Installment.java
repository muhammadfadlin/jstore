
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

    public Sell_Installment(int id, Item item, String date,int totalItem, int totalPrice, int installmentPeriod)
    {
        super(id,item,date,totalItem,totalPrice);
    }

    public int getInstallmentPeriod(){
        return installmentPeriod;
    }
    
    public int getInstallmentPrice(){
        return installmentPrice;
    }
    
     public InvoiceStatus getInvoiceStatus(){
        return INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType(){
        return INVOICE_TYPE;
    }
    
    public void setInstallmentPrice(){
        installmentPrice = ((totalPrice / installmentPeriod) * (102/100)) ;
    }
    
     public void setTotalPrice(){
        totalPrice = installmentPrice * installmentPeriod;
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
    
}
