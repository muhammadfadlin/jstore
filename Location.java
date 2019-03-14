
/**
 * Sebuah class dengan informasi mengenai lokasi.
 *
 * @author Muhammad Fadli
 * @version 28/02/2019
 * @since 28/02/2019
 */
public class Location
{
    // instance variables - replace the example below with your own
    private String province;
    private String description;
    private String city;

    /**
     * Constructor for objects of class Location
     * @param city is the first paramter to Location method
     * @param province is the second paramter to Location method
     * @param description is the third paramter to Location method
     * @param price is the fourth paramter to Location method
     */
  
    public Location(String city, String province, String description)
    {    
        this.city=city;
        this.province=province;
        this.description=description;
    }
    
     /**
     * mengembalikan nilai provinsi
     * @return nilai province
     */
    public String getProvince()
    {     
        return province;
    }
    
      /**
     * mengembalikan nilai kota
     * @return nilai city
     */
    public String getCity()
    {     
        return city;
    }
    
    
      /**
     * mengembalikan nilai deskripsi
     * @return nilai description
     */
    public String getDescription()
    {     
        return description;
    }
    
      /**
     * melakukan set nilai baru pada provinsi
     * @param nilai province mengganti province
     */
    public void setProvince(String province)
    {     
        this.province=province;
    }
    
    
    /**
     * melakukan set nilai baru pada kota
     * @param nilai city mengganti city
     */
    public void setCity(String city)
    {     
        this.city=city;
    }
    
    /**
     * melakukan set nilai baru pada deskripsi
     * @param nilai description mengganti description
     */
    public void setDescription(String description)
    {     
        this.description=description;
    }
    
    /**
     * melakukan print nilai provinsi
     * 
     */
    public void printData()
    {
        
        System.out.println("=====LOCATION=====");
        System.out.println("Provinsi:"+ getProvince());
        System.out.println("Kota:"+ getCity());
        System.out.println("Deskripsi:"+ getDescription());
    }
    
}
