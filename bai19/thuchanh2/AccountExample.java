package bai19.thuchanh2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {

    public boolean validate(String regex){
         Pattern pattern = Pattern.compile("^[a-z0-9_]{6,}$");
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
