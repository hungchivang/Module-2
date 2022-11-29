package bai19.thuchanh1;

public class EmailExampleTest {
    static EmailExample  emailExample = new EmailExample();
    public static final String[] validEmail = new String[] { "a@gmail.com", "ab@yahoo.com", "abc@hotmail.com" };
    public static final String[] invalidEmail = new String[] { "@gmail.com", "ab@gmail.", "@#abc@gmail.com" };

    public static void main(String[] args) {
        for (String email:validEmail) {
            boolean isValid = emailExample.validate(email);
            System.out.println("Email is " + email +" is valid: "+ isValid);
        }

        for (String email:invalidEmail) {
            boolean isValid = emailExample.validate(email);
            System.out.println("Email is " + email +" is valid: "+ isValid);
        }
    }
}
