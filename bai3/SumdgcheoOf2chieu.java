package bai3;

public class SumdgcheoOf2chieu {
    public static void main(String[] args) {
        int[][] arr = {{5, 5, 2, 4},
                {7, -5, -3, 1},
                {1, 4, 9, 3},
                {7, 10, -4, -7}};

        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i==j) {
                    sum += arr[i][j];
                }

            }
        }
        System.out.println("tong cua dg cheo la :" + sum);
    }

}
