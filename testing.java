import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
/**
 * Write a description of class testing here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class testing 
{
    // instance variables - replace the example below with your own

    public static void main(String args[])
    {
       Customer customer1 = new Customer("Fadli","testing","testing","testing",10, 1998,10,21);
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd");
       System.out.printf("Birth date: "+ sdf.format(customer1.getBirthDate().getTime()));
       System.out.println("Birth date: "+ sdf.format(customer1.getBirthDate().getTime()));
       System.out.println(ItemStatus.New.toString());
    }
}
