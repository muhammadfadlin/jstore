import java.util.ArrayList;

/**
 * Invoice class
 * a class for creating invoice object. This class need Item class to be used.
 * @author (Achmad Kripton Nugraha)
 * @version (28/02/2019)
 */
public abstract class Invoice
{
    // instance variables - replace the example below with your own
    private int id;
    private ArrayList<Integer> item;
    private java.util.Calendar date;
    private int totalPrice;
    private boolean isActive;
    private Customer customer;
    
    /**
     * Constructor for objects of class Invoice
     */
    public Invoice(ArrayList<Integer> item)
    {
        // initialise instance variables
        this.id = DatabaseInvoice.getLastInvoiceID()+1;
        this.item = item;
        int temp = 0;
        for (Integer i: item
        ) {
            temp += DatabaseItem.getItemFromID(i.intValue()).getPrice();
        }
        setTotalPrice(temp);
        date = java.util.Calendar.getInstance();
    }

    /**
     * getId getter method
     * a method to get value of id of invoice
     * @return   the value of id variables as integer
     */
    public int getId()
    {
        
        return id;
    }
    
    /**
     * getItem getter method
     * a method to get value of item of invoice
     * @return   the value of item variables as Item types
     */
    public ArrayList<Integer> getItem()
    {

        return item;
    }
    
    /**
     * getDate getter method
     * a method to get value of date of invoice
     * @return   the value of date variables as String types
     */
    public java.util.Calendar getDate()
    {
        
        return date;
    }
    
    /**
     * getTotalPrice getter method
     * a method to get value of total price of invoice
     * @return   the value of totalPrice variables as int types
     */
    public int getTotalPrice()
    {
        
        return totalPrice;
    }
    
    public abstract InvoiceStatus getInvoiceStatus();
    
    public abstract InvoiceType getInvoiceType();
    


    public boolean getIsActive()
    {
        return isActive;
    }

    public Customer getCustomer()
    {
        return customer;
    }

    /**
     * setId setter method
     * a method to set value of id of invoice
     * @param id as integer for replacing id number
     */
    public void setId(int id)
    {
        
        this.id = id; // use this as the variables name is same
    }
    
    /**
     * setItem setter method
     * a method to set value of item of invoice
     * @param item as Item types for replacing the item
     */
    public void setItem(ArrayList<Integer> item)
    {
        
        this.item = item; // use this as the variables name is same
    }
    
    /**
     * setDate setter method
     * a method to set value of date of invoice
     * @param date as String for replacing date of invoice
     */
    public void setDate(java.util.Calendar date)
    {
        
        this.date = date; // use this as the variables name is same
    }
    
    /**
     * setTotalPrice setter method
     * a method to set value of totalPrice variable of invoice
     * @param totalPrice as integer for replacing totalPrice number
     */
    public void setTotalPrice(int totalPrice)
    {

        this.totalPrice= totalPrice ; // use this as the variables name is same
   
    }

    
    public void setInvoiceStatus(InvoiceStatus status)
    {
        
        //this.status= status; // use this as the variables name is same
   
    }

    public void setIsActive(boolean isActive)
    {
        this.isActive = isActive;
    }

    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }
    /**
     * printData method
     * a method to print totalPrice to terminal
     */
    public abstract String toString();

}
