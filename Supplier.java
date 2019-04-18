
/**
 * Write a description of class Supplier here.
 *
 * @author (Achmad Kripton Nugraha)
 * @version (28/02/2019)
 */
public class Supplier
{
    // instance variables
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;

    /**
     * Constructor for objects of class Supplier
     */
    public Supplier(String name, String email, String phoneNumber, Location location)
    {
        // initialise instance variables
        this.id = DatabaseSupplier.getLastSupplierID()+1;
       this.name = name;
       this.email = email;
       this.phoneNumber = phoneNumber;
       this.location = location;
    }

    /**
     * getter method of getID
     * method for getting the id of the supplier
     * @return int value of id
     */
    public int getId()
    {
        // put your code here
        return id;
    }
    
    /**
     * getter method getName
     * method for getting the name of the supplier
     * @return String value of name
     */
    public String getName()
    {
        // put your code here
        return name;
    }
    
    /**
     * getter method getEmail
     * method for getting the email of the supplier
     * @return String value of email
     */
    public String getEmail()
    {
        // put your code here
        return email;
    }
    
    /**
     * getter method getPhoneNumber
     * method for getting the phone number of supplier
     * @return String of phone number
     */
    public String getPhoneNumber()
    {
        // put your code here
        return phoneNumber;
    }
    
    /**
     * getter method getLocation
     * method for getting the location of supplier
     * @return Location of the supplier
     */
    public Location getLocation()
    {
        // put your code here
        return location;
    }
    
    /**
     * Setter method setId
     * a method for changing the id of supplier
     * @param id that int value
     */
    public void setId(int id)
    {
        // put your code here
        this.id = id;
        
    }
    
    /**
     * Setter method setName
     * a method for changing the Name of supplier
     * @param name is string for new name of supplier
     */
    public void setName(String name)
    {
        // put your code here
        this.name = name;
        
    }
    
    /**
     * Setter method seEmail
     * a method for changing the email of supplier
     * @param email is string for new email of supplier
     */
    public void setEmail(String email)
    {
        // put your code here
        this.email = email;
        
    }
    
    /**
     * Setter method setPhoneNumber
     * a method for changing the Phone number of supplier
     * @param phoneNumber is string for new phone number of supplier
     */
    public void setPhoneNumber (String phoneNumber)
    {
        // put your code here
        this.phoneNumber = phoneNumber;
        
    }
    
    /**
     * Setter method setLocation
     * a method for changing the Location of supplier
     * @param location should be Location type 
     */
    public void setLocation(Location location)
    {
        // put your code here
        this.location = location;
        
    }

    /**
     * printData method 
     * method for printing name of supplier
     */
    @Override
    public String toString(){
        //put your code here
        String ret = ("=============SUPPLIER============");
        ret += "\n"+("ID: " + id);
        ret += "\n"+("Nama: "+name);
        ret += "\n"+("Email: "+email);
        ret += "\n"+("Nomor Telepon: "+phoneNumber);
        ret += "\n"+("Lokasi: "+location.getCity()+", "+location.getProvince());
        ret += "\n";
        return ret;
    }
}
