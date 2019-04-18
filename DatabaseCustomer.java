import java.util.ArrayList;

public class DatabaseCustomer {

    private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<Customer>();
    private static int LAST_CUSTOMER_ID = 0;

    public static ArrayList<Customer> getCustomerDatabase()
    {
        return CUSTOMER_DATABASE;
    }

    public static int getLastCustomerID()
    {
        return LAST_CUSTOMER_ID;
    }

    public static boolean addCustomer(Customer customer)
    {
        try {
            for (Customer i : CUSTOMER_DATABASE
            ) {
                if ((i.getName().equals(customer.getName())) || (i.getEmail().equals(customer.getEmail()))
                ) {
                    throw new CustomerAlreadyExistsException(customer);
                }
            }
            CUSTOMER_DATABASE.add(customer);
            LAST_CUSTOMER_ID = customer.getId();
            return true;
        }

        catch(CustomerAlreadyExistsException ex)
        {
            System.out.println(ex.getExMessage());
            return false;
        }
    }

    public static Customer getCustomer(int id)
    {
        for (Customer i: CUSTOMER_DATABASE
        ) {
            if (i.getId()==id)
            {
                return i;
            }
        }
        return null;
    }

    public static boolean removeCustomer(int id) {
        try {
            for (Customer i : CUSTOMER_DATABASE
            ) {
                if (i.getId() == id) {
                    CUSTOMER_DATABASE.remove(i);
                    return true;
                }
            }
            throw new CustomerNotFoundException(id);
        }

        catch (CustomerNotFoundException ex){
            System.out.println(ex.getExMessage());
            return false;
        }
    }


}

