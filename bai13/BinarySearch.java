package bai13.thuchanh1;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] list ={2,3,5,-1,56,78,54,2,3,4};
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        System.out.println(binarySearch(list,-1));
        System.out.println(binarySearch(list,2));
        System.out.println(binarySearch(list,4));
        System.out.println(binarySearch(list,0));
    }


    public static int binarySearch(int[] list, int value){
        int start = 0;
        int stop = list.length-1;
        while (stop>=start){
            int middle = (start+stop)/2;
            if(value == list[middle])
                return middle;
            else if(value< list[middle]){
                stop = middle-1;
            }else {
                start = middle+1;
            }
        }
        return -1;
    }
}
