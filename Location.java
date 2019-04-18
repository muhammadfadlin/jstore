
/**
 * Location Class
 * This class is describing location of a place, with ther city, province, and description of the place
 * @author (Achmad Kripton Nugraha)
 * @version (28/02/2019)
 */
public class Location
{
    // instance variables
    private String province;
    private String description;
    private String city;

    /**
     * Constructor for objects of class Location
     */
    public Location(String city, String province, String description)
    {
        // initialise instance variables
        this.city = city;
        this.province = province;
        this.description = description;
    }

    /**
     * getter Method getProvince
     * method to return province as String 
     * @return name of province of the location
     */
    public String getProvince()
    {
        
        return province;
    }
    
    /**
     * getter Method getCity
     * method for getting City's Value of location
     * @return  name of the city of location
     */
    public String getCity()
    {
        
        return city;
    }
    
    /**
     * getter method Description
     * method for getting the description of the location
     * @return  the description's value of the location
     */
    public String getDescription()
    {
        
        return description;
    }
    
    /**
     * Setter method setProvince
     * a method for changing the province's value of location
     * @param  province is a parameter containing province that will change the province's variable
     */
    public void setProvince(String province)
    {
        
        this.province = province; // use this as the name of parameter and instance variables is same
    }
    
    /**
     * Setter method setCity
     * method for changing city of location
     * @param  city a parameter to replace the variables of city
     */
    public void setCity(String city)
    {
        
        this.city = city;  // use this as the name of parameter and instance variables is same
    }
    
    /**
     * setter method of setDescription
     * method for changing description of location
     * @param  description a parameter to replace description variable
     */
    public void setDescription(String description)
    {
        
        this.description = description;  // use this as the name of parameter and instance variables is same
    }
    
    /**
     * printData method 
     * method for printing name province in terminal
     */
    @Override
    public String toString()
    {
        String ret = ("===========LOCATION===========");
        ret += "\n"+("Provinsi: " + province);
        ret += "\n"+("Kota: " + city);
        ret += "\n"+("Deskripsi: " + description);
        ret += "\n";
        return ret;
    }
}
