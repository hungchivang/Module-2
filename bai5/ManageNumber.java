package bai5;

public class ManageNumber {
         static int[] arr = new int[0];

        public static void add(int num) {
            int[] newArr = new int[arr.length+1];
            System.arraycopy(arr, 0, newArr, 0, arr.length);
            newArr[newArr.length-1] = num;
            arr = newArr;
        }

        public static void show() {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "  ");
            }
        }



}
