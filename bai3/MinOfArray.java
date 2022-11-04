package bai3;

public class MinOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, -8, -9, 2};
int min= minValue(arr);
        System.out.println("gia tri nho nhat trong mang la :" + min);
    }

    public static int minValue(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

}
