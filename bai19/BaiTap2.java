package bai19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BaiTap2 {
    public static boolean validate(String regex){
        Pattern pattern = Pattern.compile("^\\([0-9][0-9]\\)-\\([0-9][0-9]{9}\\)$");
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] validClass = {"(84)-(0978489648)","(a8)-(22222222)","(10)-(12345)"};
        for (String phone:validClass) {
            boolean isValid = validate(phone);
            System.out.println("Phone is " + phone +" is valid: "+ isValid);
        }
    }
}
