

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
        Item item1 = new Item (120,"Laptop",10,100000,"Elektronik",supp1);
        Invoice invo1 = new Invoice (1,item1,"27/08/2019",200000);
        supp1.printData();
        supp1.setName("Khairi");
        supp1.printData();
        item1.printData();
        
    }
}
