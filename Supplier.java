
/**
 * Sebuah class untuk memasukkan data supplier.
 *
 * @author Muhammad Fadli
 * @version 28/02/2019
 * @since 28/02/2019
 */
public class Supplier
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;


   /**
     * Constructor for objects of class Supplier
     * @param id is the first paramter to Supplier method
     * @param name is the second paramter to Supplier method
     * @param email is the third paramter to Supplier method
     * @param phoneNumber is the fourth paramter to Supplier method
     * @param location is the fifth paramter to Supplier method
     */
    
    public Supplier(int id, String name, String email, String phoneNumber, Location location)
    {
        this.id=id;
        this.name=name;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.location=location;
    }

    public int getId()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    
      public Location getLocation()
    {
        return location;
    }
    
    public void setId(int id)
    {
        this.id=id;
    }
    
    public void setName(String name)
    {
        this.name=name;
    }
    
    public void setEmail(String email)
    {
        this.email=email;
    }
    
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber=phoneNumber;
    }
    
  
      public void setLocation(Location location)
    {
        this.location=location;
    }
    
    
     public void printData()
    {
        
        System.out.println("=====SUPPLIER=====");
        System.out.println("ID:"+ getId());
        System.out.println("Nama:"+ getName());
        System.out.println("Email:"+ getEmail());
        System.out.println("Nomor Telepon:"+ getPhoneNumber());
        System.out.println("Lokasi:"+ getLocation().getCity());
    }
    
     public String toString()
    {
    return "=====SUPPLIER=====" + "\n"+
    "ID = \n" +  this.getId() + "\n" + 
    "Nama = " + this.getName() + "\n" +
    "Email = " + this.getEmail() + "\n" +
    "Nomor Telepon = " + this.getPhoneNumber() + "\n" +
    "Lokasi = "  + this.getLocation().getCity() + "\n";
    }
}
