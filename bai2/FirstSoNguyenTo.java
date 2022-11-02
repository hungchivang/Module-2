package bai2;

public class FirstSoNguyenTo {
    public static void main(String[] args) {
        int count = 0;
        for (int a = 2; count <= 19; a++) {
            boolean check = true;
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                count++;
                System.out.println(a);
            }
        }

    }
}
