import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
/**
 * Write a description of class Transaction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Transaction
{

    public static void orderNewItem(ArrayList<Integer> item)
    {
        Invoice invoice = new Buy_Paid(item);
        DatabaseInvoice.addInvoice(invoice);
        System.out.println(invoice);
        System.out.println(item);
    }
    
    public static void orderSecondItem(ArrayList<Integer> item)
    {
        Invoice invoice = new Buy_Paid(item);
        DatabaseInvoice.addInvoice(invoice);
        System.out.println(invoice);
        System.out.println(item);
    }
    
    public static void orderRefurbishedItem(ArrayList<Integer> item)
    {
        Invoice invoice = new Buy_Paid(item);
        DatabaseInvoice.addInvoice(invoice);
        System.out.println(invoice);
        System.out.println(item);
    }
    
    public static void sellItemPaid(ArrayList<Integer> item, Customer customer)
    {
        Invoice invoice = new Sell_Paid(item, customer);
        DatabaseInvoice.addInvoice(invoice);
        System.out.println(invoice);
        System.out.println(item);
    }
    
    public static void sellItemUnpaid(ArrayList<Integer> item, Customer customer)
    {
        Invoice invoice = new Sell_Unpaid(item, customer);
        DatabaseInvoice.addInvoice(invoice);
        System.out.println(invoice);
        System.out.println(item);
    }
    
    public static void sellItemInstallment(ArrayList<Integer> item, Customer customer, int installmentPeriod)
    {
        Invoice invoice = new Sell_Installment(item, customer,12);
        DatabaseInvoice.addInvoice(invoice);
        System.out.println(invoice);
        System.out.println(item);
    }

    public static boolean finishTransaction(Invoice invoice)
    {
        for (Invoice i: DatabaseInvoice.getInvoiceDatabase()
             ) {
            if (i.equals(invoice)&&invoice.getInvoiceStatus().equals(InvoiceStatus.Installment)&&invoice.getInvoiceStatus().equals(InvoiceStatus.Unpaid))
            {
                i.setIsActive(false);
                System.out.println(i.getIsActive());
                return true;
            }
        }
        return false;
    }

    public static boolean cancelTransaction(Invoice invoice)
    {
        if (DatabaseInvoice.removeInvoice(invoice.getId())&&invoice.getInvoiceStatus().equals(InvoiceStatus.Installment)&&invoice.getInvoiceStatus().equals(InvoiceStatus.Unpaid))
            return true;
        return false;
    }

}
