package bai7.baithuchanh2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ComparableCircle[] compare = new ComparableCircle[3];
        compare[0] = new ComparableCircle();
        compare[1] = new ComparableCircle(3.6);
        compare[2] = new ComparableCircle("red",true,5.6);

        System.out.println("truoc khi sap xep :");
        for (ComparableCircle comparableCircle : compare) {
            System.out.println(comparableCircle);
        }

        Arrays.sort(compare);

        System.out.println("sau khi sap xep :");
        for (ComparableCircle comparableCircle : compare) {
            System.out.println(comparableCircle);
        }
    }
}
