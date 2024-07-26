import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationProblem{

    public boolean ValidFirstName(String Firstname)
    {
        Pattern p= Pattern.compile("^[A-Z][a-z]{2,}$");
        Matcher m = p.matcher(Firstname);
        return m.matches();
    }
    public boolean ValidLastName(String lastName)
    {
        Pattern p=Pattern.compile("^[A-Z][a-z]{2,}$");
        Matcher m= p.matcher(lastName);
        boolean result=m.matches();
       return result;
    }
    public boolean ValidEmail(String email)
    {
        Pattern p= Pattern.compile("^(?!.*\\.\\.)(?!.*@\\.)(?!.*\\.@)(?!^\\.)([a-zA-Z0-9+._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,})(?!\\.[a-zA-Z]{2,}\\.[a-zA-Z]{2,})$");
        Matcher m= p.matcher(email);
        boolean result= m.matches();
        return result;
    }
    public boolean ValidMobileNumber(String MobileNumber)
    {
        Pattern p = Pattern.compile("^\\+91\\d{10}$");
        Matcher m=p.matcher(MobileNumber);
        boolean result = m.matches();
        return result;
    }

    public boolean ValidPassword(String password)
    {
        Pattern p= Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$");
        Matcher m= p.matcher(password);
        boolean result =m.matches();
        return result;
    }

}