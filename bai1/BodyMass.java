package bai1;

import java.util.Scanner;

public class BodyMass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter weight :");
        float weight = scanner.nextFloat();

        System.out.println("Enter height :");
        float height = scanner.nextFloat();

        float bmi = weight/(height*height);
        System.out.println("chi so :" + bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi < 25.0) {
            System.out.println("Normal");
        } else if (bmi >= 25.0 && bmi < 30.0) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
