package bai19.thuchanh1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
    private Pattern pattern;
    private Matcher matcher;

    public EmailExample() {
        pattern = Pattern.compile("^[a-zA-Z0-9]+[a-zA-Z0-9]*@+[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)$");
    }

    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
