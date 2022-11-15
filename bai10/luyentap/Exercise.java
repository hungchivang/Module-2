package bai10.luyentap;

public class Exercise {

     //dem so nguyen to trong mang
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 5, 5, 9, 12};
        System.out.println("mang co " + dem(arr)+ " phan tu");
    }
        public static int dem(int[] arr){
            int count =0;
            for (int object : arr) {
                if (checkSNT(object)) {
                    count++;
                }
            }
            return count;
        }


    public static boolean checkSNT(int num){
        if(num<2) return false;
        for (int i = 2; i < Math.sqrt(num); i++) {
            if(num % i == 0) return false;
        }
        return true;
    }

}
