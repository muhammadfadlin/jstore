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
    // instance variables - replace the example below with your own
      DatabaseItem db = new DatabaseItem();
      
    public void orderNewItem(Supplier supplier){
        Item item = new Item(12,"Laptop",10,ItemStatus.New,1000000,supplier,ItemCategory.Electronics);
        db.addItem(item);
        String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        Invoice invoice = new Invoice(10,item,date,item.getPrice());
        item.setStatus(ItemStatus.New);
        invoice.setInvoiceStatus(InvoiceStatus.Paid);
        
        System.out.println("=====Order New Item=====");
        item.printData();
        invoice.printData();
 
    }
    
       public void orderSecondItem(Supplier supplier){
        Item item = new Item(12,"Laptop",10,ItemStatus.Second,1000000,supplier,ItemCategory.Electronics);
        db.addItem(item);
        String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        Invoice invoice = new Invoice(10,item,date,item.getPrice());
        item.setStatus(ItemStatus.Second);
        invoice.setInvoiceStatus(InvoiceStatus.Paid);
        
        System.out.println("=====Order Second Item=====");
        item.printData();
        invoice.printData();
    }
    
       public void orderRefurbishedItem(Supplier supplier){
        Item item = new Item(12,"Laptop",10,ItemStatus.Refurbished,1000000,supplier,ItemCategory.Electronics);
        db.addItem(item);
        String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        Invoice invoice = new Invoice(10,item,date,item.getPrice());
        item.setStatus(ItemStatus.Refurbished);
        invoice.setInvoiceStatus(InvoiceStatus.Paid);
        
        System.out.println("=====Order Refurbished Item=====");
        item.printData();
        invoice.printData();
 
    }
    
    public void sellItemPaid(Item item){
   
        String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        Invoice invoice = new Invoice(10,item,date,item.getPrice());
        invoice.setInvoiceStatus(InvoiceStatus.Paid);
        item.setStatus(ItemStatus.Sold);
        
        System.out.println("=====Sell Item Paid=====");
        item.printData();
        invoice.printData();
        
    }
    
       public void sellItemUnpaid(Item item){
           
        String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        Invoice invoice = new Invoice(10,item,date,item.getPrice());
        invoice.setInvoiceStatus(InvoiceStatus.Unpaid);
        item.setStatus(ItemStatus.Sold);
        
        System.out.println("=====Sell Item Unpaid=====");
        item.printData();
        invoice.printData();
        
    }
    
       public void sellItemInstallment(Item item){
        
        String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        Invoice invoice = new Invoice(10,item,date,item.getPrice());
        invoice.setInvoiceStatus(InvoiceStatus.Installment);
        item.setStatus(ItemStatus.Sold);
        
        System.out.println("=====Sell Item Installment=====");
        item.printData();
        invoice.printData();
    }
    
}
