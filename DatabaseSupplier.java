import java.util.ArrayList;

/**
 * Sebuah class dengan informasi mengenai data-data supplier
 *
 * @author Muhammad Fadli
 * @version 28/02/2019
 * @since 28/02/2019
 */
public class DatabaseSupplier
{
    // instance variables - replace the example below with your own
    private static ArrayList<Supplier> SUPPLIER_DATABASE= new ArrayList<Supplier>();
    private static int LAST_SUPPLIER_ID=0;
    
    
    public static ArrayList<Supplier> getSupplierDatabase(){
        return SUPPLIER_DATABASE;
    }

     /**
     * menambah supplier
     * @return nilai false
     * @param nilai supplier
     */
    public static boolean addSupplier(Supplier supplier)
    {
        for(Supplier orang : SUPPLIER_DATABASE){
            if((supplier.getName()!=orang.getName())&&
            (supplier.getEmail()!=orang.getEmail())&&
            (supplier.getPhoneNumber()!=orang.getPhoneNumber())){
                SUPPLIER_DATABASE.add(supplier);
                LAST_SUPPLIER_ID = supplier.getId();
                return true;
            }
        }
        return false;    
    }
    
    
     /**
     * menghapus supplier
     * @return nilai false
     * @param nilai supplier
     */
    public static boolean removeSupplier(int id)
    {   
        for(Supplier supplier : SUPPLIER_DATABASE){
            if(supplier.getId()==id){
                for(Item item : DatabaseItem.getItemDatabase()){
                    if(item.getSupplier().equals(supplier)){
                        DatabaseItem.getItemDatabase().remove(item);
                    }
                }
                SUPPLIER_DATABASE.remove(supplier);
                return true;
            }
        }
            return false;
    }
    
      /**
     * mengembalikan nilai supplier
     * @return nilai supplier
     */
    public static Supplier getSupplier(int id)
    {     
        for(Supplier supplier : SUPPLIER_DATABASE){
            if(supplier.getId()==id){
                return supplier;
            }
        }
        return null;
    }

}
