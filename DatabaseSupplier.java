
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
    private Supplier[] listSupplier;
    private Supplier supplier;

     /**
     * menambah supplier
     * @return nilai false
     * @param nilai supplier
     */
    public boolean addSupplier(Supplier supplier)
    {    
        return false;
    }
    
    
     /**
     * menghapus supplier
     * @return nilai false
     * @param nilai supplier
     */
    public void removeSupplier(Supplier supplier)
    {     
    }
    
      /**
     * mengembalikan nilai supplier
     * @return nilai supplier
     */
    public Supplier getSupplier()
    {     
        return supplier;
    }
    
    /**
     * mengembalikan nilai listsupplier
     * @return nilai listSupplier
     */
    public Supplier[] getListSupplier()
    {     
        return listSupplier;
    }
    
        public void printData()
    {
    }
}
