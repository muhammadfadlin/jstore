
/**
 * Write a description of class Customer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Customer
{
    // instance variables - replace the example below with your own
    private String name;
    private String email;
    private String username;
    private String password;
    private int id;
    private java.util.Calendar birthDate;

    /**
     * Constructor for objects of class Customer
     */
    public Customer(String name, String email, String username, String password, java.util.Calendar birthdate)
    {
        // initialise instance variables
        this.id = DatabaseCustomer.getLastCustomerID()+1;

        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;

        this.birthDate = birthdate;
    }

    public Customer(String name, String email, String username, String password, int year, int month, int dayOfMonth)
    {
        // initialise instance variables
        this.id = DatabaseCustomer.getLastCustomerID()+1;
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;

        birthDate = new java.util.GregorianCalendar(year, month-1, dayOfMonth);
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public String getUsername()
    {
        return username;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public int getId()
    {
        return id;
    }
    
    public java.util.Calendar getBirthDate()
    {
//        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd MMM yyyy");
//        String cetak = sdf.format(birthDate.getTime());
//        //System.out.println("Birth date : "+ cetak);
        return birthDate;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setEmail(String email)
    {
        //
        if (java.util.regex.Pattern.matches("(([a-zA-Z0-9&\\*_~]+(\\.?))+)[@]((\\w+)([\\.\\-]?))+", email))
        {
            this.email = email;
            
        }
        else{
            this.email = null;
        }
    }
    
    public void setUsername(String username)
    {
        this.username = username;
    }
    
    public void setPassword(String password)
    {
         if (java.util.regex.Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{6,}$", password))
        {
            this.password = password;
            
        }
        else{
            this.password = null;
        }
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public void setBirthDate(java.util.Calendar birthdate)
    {
        this.birthDate = birthdate;
    }
    
    public void setBirthDate(int year, int month, int dayOfMonth)
    {
        birthDate.set(java.util.Calendar.YEAR, year);
                birthDate.set(java.util.Calendar.MONTH, month);
                        birthDate.set(java.util.Calendar.DAY_OF_MONTH, dayOfMonth);
    }
    
    public String toString()
    {
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd MMM yyyy");
        String cetak = sdf.format(birthDate.getTime());
        cetak = "\nBirth date: "+ cetak;
        return "Customer\nId: "+id+"\nNama: "+name+"\nUsername: "+username+"\nEmail: "+email+"\nPassword: "+password+cetak;
    }
}
