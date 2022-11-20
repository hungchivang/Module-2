package bai13.thuchanh1;

import java.util.Arrays;

public class Deque {
    public static void main(String[] args) {
        int[] arr = {5, 2, 40, -9, 53, 1, 4, 3, 3, 8, -1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int left = 0;
        int right = arr.length-1;
        System.out.println(binarySearch(arr, left, right, 40));
        System.out.println(binarySearch(arr, left, right, -1));
        System.out.println(binarySearch(arr, left, right, 0));
    }

    public static int binarySearch(int[] arr, int left, int right, int value) {
        int middle = (left + right) / 2;
        if (left > right) {
            return -1;
        }
        if (value == arr[middle]) {
            return middle;
        } else if (value < arr[middle]) {
            return binarySearch(arr, left, middle - 1, value);
        } else {
            return binarySearch(arr, middle + 1, right, value);
        }
    }
}
