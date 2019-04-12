import java.util.ArrayList;
/**
 * Write a description of class Transaction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Date;
import java.text.SimpleDateFormat;

public class Transaction
{
    
    public static void orderNewItem(Item item){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        DatabaseItem.addItem(item);
        String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        item.setStatus(ItemStatus.New);
        temp.add(item.getId());
        Invoice bp = new Buy_Paid(temp);
    }
    
       public static void orderSecondItem(Item item){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        DatabaseItem.addItem(item);
        String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        item.setStatus(ItemStatus.Second);
        temp.add(item.getId());
        Invoice bp = new Buy_Paid(temp);
    }
    
       public static void orderRefurbishedItem(Item item){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        DatabaseItem.addItem(item);
        String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        temp.add(item.getId());
        item.setStatus(ItemStatus.Refurbished);
        Invoice bp = new Buy_Paid(temp); 
    }
    
    public static void sellItemPaid(Item item, Customer customer){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        temp.add(item.getId());
        item.setStatus(ItemStatus.Sold);
        Invoice bp = new Sell_Paid(temp);
        
        System.out.println("=====Sell Item Paid=====");
        item.printData();
        
    }
    
       public static void sellItemUnpaid(Item item, Customer customer){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        temp.add(item.getId());
        item.setStatus(ItemStatus.Sold);
        Invoice bp = new Sell_Unpaid(temp);
        
        System.out.println("=====Sell Item Unpaid=====");
        item.printData();
        
    }
    
       public static void sellItemInstallment(Item item, Customer customer){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        temp.add(item.getId());
        item.setStatus(ItemStatus.Sold);
        Invoice bp = new Sell_Installment(temp);

        System.out.println("=====Sell Item Installment=====");
        item.printData();
    }
    
    public boolean finishTransaction(Invoice invoice){
        for(Invoice barang : DatabaseInvoice.getInvoiceDatabase()){
            if(barang.equals(invoice)){
                invoice.setIsActive(false);
                System.out.println(invoice.getIsActive());
            }
        }
        return false;
    }
    
    public boolean cancelTransaction(Invoice invoice){
        for(Invoice barang : DatabaseInvoice.getInvoiceDatabase()){
            if(barang.equals(invoice)){
                DatabaseInvoice.getInvoiceDatabase().remove(invoice);
                return true;
            }
        }
        return false;
    }
}
