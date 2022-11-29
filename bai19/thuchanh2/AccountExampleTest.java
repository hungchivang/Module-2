package bai19.thuchanh2;

public class AccountExampleTest {
    static AccountExample accountExample = new AccountExample();
    static String[] validAccount = { "123abc_", "_abc123", "______", "123456","abcdefgh" };
    static String[] invalidAccount = new String[] { ".@", "12345", "1234_", "abcde" };

    public static void main(String[] args) {
        for (String account: validAccount) {
            boolean isValid = accountExample.validate(account);
            System.out.println("Account is " + account +" is valid: "+ isValid);
        }

        for (String account: invalidAccount) {
            boolean isValid = accountExample.validate(account);
            System.out.println("Account is " + account +" is valid: "+ isValid);
        }
    }
}
