import java.util.ArrayList;

/**
 * Write a description of class DatabaseCustomer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseCustomer
{
    private static ArrayList<Customer> CUSTOMER_DATABASE= new ArrayList<Customer>();;
    private static int LAST_CUSTOMER_ID=0;
    
    
    public static ArrayList<Customer> getCustomerDatabase(){
        return CUSTOMER_DATABASE;
    }
    
    public static boolean addCustomer(Customer customer)
    {
         for(Customer orang : CUSTOMER_DATABASE){
            if((customer.getName()!=orang.getName())&&
            (customer.getEmail()!=orang.getEmail())){
                CUSTOMER_DATABASE.add(customer);
                LAST_CUSTOMER_ID = customer.getId();
                return true;
            }
        }
            return false;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
  
     public boolean removeCustomer(int id)
    {  
         for(Customer customer : CUSTOMER_DATABASE){
            if(customer.getId()==id){
                CUSTOMER_DATABASE.remove(customer);
            }
        }
        return false;
    }
    
      /**
     * mengembalikan nilai supplier
     * @return nilai supplier
     */
    public static Customer getCustomer(int id)
    {     
        for(Customer customer : CUSTOMER_DATABASE){
            if(customer.getId()==id){
                return customer;
            }
        }
        return null;
      
    }
}
