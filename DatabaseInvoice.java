import java.util.ArrayList;

/**
 * Write a description of class DatabaseInvoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseInvoice
{
    // instance variables - replace the example below with your own
    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<Invoice>();
    private static int LAST_INVOICE_ID = 0;

    public static ArrayList<Invoice> getInvoiceDatabase()
    {
        return INVOICE_DATABASE;
    }

    public static int getLastInvoiceID()
    {
        return LAST_INVOICE_ID;
    }

    public static boolean addInvoice(Invoice invoice)
    {
        try {
            for(Invoice i : INVOICE_DATABASE) {
                if (i.getItem().equals(invoice.getItem())) {
                    throw new InvoiceAlreadyExistsException(invoice);
                }
            }
            INVOICE_DATABASE.add(invoice);
            LAST_INVOICE_ID = invoice.getId();
            return true;
        }

        catch (InvoiceAlreadyExistsException ex)
        {
            System.out.println(ex.getExMessage());
            return false;
        }
    }

    public static Invoice getInvoice(int id)
    {
        for (Invoice invoice: INVOICE_DATABASE
             ) {
            if(invoice.getId()==id){
                return invoice;
            }
        }
        return null;
    }

    public static Invoice getActiveOrder(Customer customer)
    {
        try {
            for (Invoice invoice : INVOICE_DATABASE
            ) {
                if (invoice.getCustomer().equals(customer)) {
                    if (((invoice.getInvoiceStatus().equals(InvoiceStatus.Installment)) || (invoice.getInvoiceStatus().equals(InvoiceStatus.Unpaid))) && (invoice.getIsActive())) {
                        return invoice;
                    }
                }
            }
            throw new CustomerDoesntHaveActiveException(customer);
        }

        catch(CustomerDoesntHaveActiveException ex)
        {
            System.out.println(ex);
            return null;
        }
    }

    public static boolean removeInvoice(int id)
    {
        try {
            for (Invoice invoice : INVOICE_DATABASE
            ) {
                if (invoice.getId() == id) {
                    if (invoice.getIsActive()) {
                        invoice.setIsActive(false);
                    }
                    INVOICE_DATABASE.remove(invoice);
                    return true;
                }
            }
            throw new InvoiceNotFoundException(id);
        }

        catch(InvoiceNotFoundException ex){
            System.out.println(ex.getExMessage());
            return false;
        }
    }

}
