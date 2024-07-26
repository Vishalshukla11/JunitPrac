

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexGmail
{
 public boolean validGmail(String mail)
 {
    
Pattern p = Pattern.compile("^(?!.*\\.\\.)(?!.*@\\.)(?!.*\\.@)(?!^\\.)([a-zA-Z0-9+._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,})(?!\\.[a-zA-Z]{2,}\\.[a-zA-Z]{2,})$");

    Matcher m = p.matcher(mail);
    boolean result= m.matches();
    return result;
 }
}