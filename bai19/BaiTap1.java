package bai19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BaiTap1 {

    public static boolean validate(String regex){
        Pattern pattern = Pattern.compile("^[CAP][0-9]{4}[GHIKLM]$");
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] validClass = {"C0318G","M0318G","P0323A"};
        for (String lop:validClass) {
            boolean isValid = validate(lop);
            System.out.println("Class is " + lop +" is valid: "+ isValid);
        }
    }
}
