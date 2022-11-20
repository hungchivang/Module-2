package bai13.thuchanh1;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("mhap chuoi");
        String input = scanner.nextLine();

        int[] frequentCha = new int[255];
        for (int i = 0; i < input.length(); i++) {
            int ascii = input.charAt(i);
            frequentCha[ascii] +=1;
        }

        int max =0;
        char character = (char) 255;
        for (int j = 0; j < 255; j++) {
            if(frequentCha[j] > max){
                max = frequentCha[j];
                character = (char) j;
            }
        }
        System.out.println("The most appearing letter is '" + character + "' with a frequency of " + max + " times");
    }
}
