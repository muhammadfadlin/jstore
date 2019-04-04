import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.regex.*;

public class Customer
{
    private String name;
    private String email;
    private String username;
    private String password;
    private int id;
    private Calendar birthDate;
    
    public Customer (String name, String email, String username, String password, int id, Calendar birthDate)
    {
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
        this.id = id;
        birthDate = new GregorianCalendar();
    }

    public Customer (String name, String email, String username, String password, int id, int year, int month, int dayOfMonth)
    {
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
        this.id = id;
        birthDate = new GregorianCalendar(year,month,dayOfMonth);
    }
    
    public String getName(){
        return name;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getUsername(){
        return username;
    }
    
    public String getPassword(){
        return password;
    }
    
    public int getId(){
        return id;
    }
    
    public Calendar getBirthDate(){
	birthDate.add(Calendar.DAY_OF_MONTH,1);
        return birthDate;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public void setEmail(String email){
        if(Pattern.matches("(([a-zA-Z0-9&\\*_~]+(\\.?))+)[@]((\\w+)([\\.\\-]?))+",email)){
        this.email=email;
    }else{
        this.email=null;
    }
}
    
    public void setUsername(String username){
        this.username=username;
    }
    
    public void setPassword(String password){
        if(Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{6,}$",password))
        {
            this.password=password;
        }else{
            this.password=null;
        }
    }
    
    public void setId(int id){
        this.id=id;
    }
    
    public void setBirthDate(Calendar birthDate){
        this.birthDate=birthDate;
    }
    
    public void setBirthDate(int year, int month, int dayOfMonth){
        Calendar birthDate = new GregorianCalendar(year,month,dayOfMonth);
    } 
    
    public String toString(){
        return "";
    }
    
}
