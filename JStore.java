import java.util.ArrayList;

/**
 * Write a description of class JStore here.
 *
 * @author (Achmad Kripton Nugraha)
 * @version (23/02/2019)
 */
public class JStore
{
    
    
    /**
     * Constructor for objects of class JStore
     */
    public JStore()
    {
        //put code in here
    }


    public static void main(String args[])
    {
        // put your code here
        Location location = new Location("Depok", "Jawa Brat", "sebuah kota bukan kata");
        DatabaseSupplier.addSupplier(new Supplier("Bambang", "bambang@email.com", "085866669999",location));
        System.out.println("====Supplier Already Exist====");
        DatabaseSupplier.addSupplier(new Supplier("Bambang", "bambang2@email.com", "085966669999",location));
//        for (Supplier i: DatabaseSupplier.getSupplierDatabase()
//             ) {
//            System.out.println(i);
//        }
        DatabaseItem.addItem(new Item("Ian", ItemStatus.Refurbished, 10000, DatabaseSupplier.getSupplier(1), ItemCategory.Stationery));
        System.out.println("====Customer Already Exist====");
        DatabaseItem.addItem(new Item("Ian", ItemStatus.New, 10000, DatabaseSupplier.getSupplier(1), ItemCategory.Stationery));
//        for (Item i: DatabaseItem.getItemDatabase())
//        {
//            System.out.println(i);
//        }

        DatabaseCustomer.addCustomer(new Customer("Shiroe", "Shiroe@gmail.com", "shiroe69", "Shiroe2019", 2010, 10, 1));
        System.out.println("====Supplier Item Exist====");
        DatabaseCustomer.addCustomer(new Customer("Shiroe", "Shiroe1@gmail.com", "shiroe70", "Shiroe2019", 2010, 10, 2));
//        for (Customer i: DatabaseCustomer.getCustomerDatabase())
//        {
//            System.out.println(i);
//        }
        ArrayList<Integer> item = new ArrayList<Integer>();
        item.add(1);

        DatabaseInvoice.addInvoice(new Sell_Unpaid(item, DatabaseCustomer.getCustomer(1)));
        System.out.println("====Invoice Already Exist====");
        DatabaseInvoice.addInvoice(new Sell_Unpaid(item, DatabaseCustomer.getCustomer(1)));

        System.out.println("====Invoice Not Found====");
        DatabaseInvoice.removeInvoice(100);
        System.out.println("====Customer Not Found====");
        DatabaseCustomer.removeCustomer(100);
        System.out.println("====Supplier Not Found====");
        DatabaseSupplier.removeSupplier(100);
        System.out.println("====Item Not Found====");
        DatabaseItem.removeItem(100);
        Customer customer2 = new Customer("Shiroe7", "Shiroe1@gma77il.com", "sh77iroe70", "Shiroe20i19", 2010, 10, 2);
        System.out.println("====Dont Have Active====");
        DatabaseInvoice.getActiveOrder(customer2);
        DatabaseCustomer.addCustomer(customer2);

        System.out.println("====Result====");
        for (Supplier i: DatabaseSupplier.getSupplierDatabase())
        {
            System.out.println(i);
        }

        for (Customer i: DatabaseCustomer.getCustomerDatabase())
        {
            System.out.println(i);
        }

        for (Item i: DatabaseItem.getItemDatabase())
        {
            System.out.println(i);
        }

        for (Invoice i: DatabaseInvoice.getInvoiceDatabase())
        {
            System.out.println(i);
        }



        //        for (Invoice i: DatabaseInvoice.getInvoiceDatabase())
//        {
//            System.out.println(i);
//        }
        Transaction.finishTransaction(DatabaseInvoice.getInvoice(1));
        Transaction.finishTransaction(DatabaseInvoice.getInvoice(3));
//        for (Invoice i: DatabaseInvoice.getInvoiceDatabase())
//        {
//            System.out.println(i);
//        }
//        Transaction.cancelTransaction(DatabaseInvoice.getInvoice(1));
//        for (Invoice i: DatabaseInvoice.getInvoiceDatabase())
//        {
//            System.out.println(i);
//        }
    }
}
