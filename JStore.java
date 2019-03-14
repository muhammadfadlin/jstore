

/**
 * Sebuah class sebagai fungsi main dari semua class
 *
 * @author Muhammad Fadli
 * @version 28/02/2019
 * @since 28/02/2019
 */
public class JStore
{
 
    /**
     * Constructor for objects of class JStore
     */
    public JStore()
    {
    }

    public static void main(String[] args)
    {
        Location loc1 = new Location("Kabanjahe","Sumatera Utara","Sebuah Kota");
        Supplier supp1 = new Supplier (1001,"Muhammad Fadli","muhammadfadli27@gmail.com","087799007979",loc1);
        supp1.printData();
        supp1.setName("Khairi");
        supp1.printData();
        
    }
}
