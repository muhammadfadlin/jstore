
/**
 * Enumeration class InvoiceType - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum InvoiceType
{
    Buy("Buy"), Sell("Sell");
    String isi;
    
    InvoiceType(String invoiceS)
    {
        this.isi = invoiceS;
    }
    
    public String toString(){
        return isi;
    }
}
