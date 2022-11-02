package bai2;

import java.util.Scanner;

public class Songuyento {
    public static void main(String[] args) {
        System.out.println("nhap so bat ki tu ban phim :");
        Scanner Input = new Scanner(System.in);
        int number = Input.nextInt();
        if (number < 2) {
            System.out.println(number + " khong la so nguyen to");
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(number + " la so nguyen to");
            } else {
                System.out.println(number + " khong la so nguyen to");
            }
        }
    }
}
