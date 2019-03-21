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
        item.setStatus(ItemStatus.New);
        Invoice bp = new Buy_Paid(20,item,date,10,item.getPrice());
        
        System.out.println("=====Order New Item=====");
        item.printData();
        bp.printData();
        if(bp instanceof Sell_Paid){
        System.out.println("Benar Invoice Type adalah Sell_Paid");
        }else{
        System.out.println("Salah Invoice Type bukan Sell_Paid");
        }
    }
    
       public void orderSecondItem(Supplier supplier){
        Item item = new Item(12,"Laptop",10,ItemStatus.Second,1000000,supplier,ItemCategory.Electronics);
        db.addItem(item);
        String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
       
        item.setStatus(ItemStatus.Second);
        Invoice bp = new Buy_Paid(20,item,date,10,item.getPrice());
        
        System.out.println("=====Order Second Item=====");
        item.printData();
        bp.printData();
         if(bp instanceof Sell_Paid){
        System.out.println("Benar Invoice Type adalah Sell_Paid");
        }else{
        System.out.println("Salah Invoice Type bukan Sell_Paid");
        }
    }
    
       public void orderRefurbishedItem(Supplier supplier){
        Item item = new Item(12,"Laptop",10,ItemStatus.Refurbished,1000000,supplier,ItemCategory.Electronics);
        db.addItem(item);
        String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
      
        item.setStatus(ItemStatus.Refurbished);
        Invoice bp = new Buy_Paid(20,item,date,10,item.getPrice());
        
        System.out.println("=====Order Refurbished Item=====");
        item.printData();
        bp.printData();
         if(bp instanceof Sell_Paid){
        System.out.println("Benar Invoice Type adalah Sell_Paid");
        }else{
        System.out.println("Salah Invoice Type bukan Sell_Paid");
        }
 
    }
    
    public void sellItemPaid(Item item){
   
        String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
  
        item.setStatus(ItemStatus.Sold);
        Invoice bp = new Sell_Paid(20,item,date,10,item.getPrice());
        
        System.out.println("=====Sell Item Paid=====");
        item.printData();
        bp.printData();
        
    }
    
       public void sellItemUnpaid(Item item){
           
        String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        
        item.setStatus(ItemStatus.Sold);
        Invoice bp = new Sell_Unpaid(20,item,date,10,item.getPrice(),"20-08-2090");
        
        System.out.println("=====Sell Item Unpaid=====");
        item.printData();
        bp.printData();
        
    }
    
       public void sellItemInstallment(Item item){
        
        String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
       
        item.setStatus(ItemStatus.Sold);
        Invoice bp = new Sell_Installment(20,item,date,10,item.getPrice(),50);

        System.out.println("=====Sell Item Installment=====");
        item.printData();
        bp.printData();
    }
    
}
