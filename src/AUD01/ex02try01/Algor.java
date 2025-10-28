package AUD01.ex02try01;

import java.util.Arrays;

public class Algor {

    //2c Returns the k-th smallest element in array.
    static int kleast(int[] array, int k){
        if (k<1 || k>array.length){
            throw new IllegalArgumentException("k out of range");
        }
        Arrays.sort(array);
        return array[k-1];
    }

    //2d returns if the array contains duplicates
    static boolean duplicates(int[] arr){
        Arrays.sort(arr);
        boolean dup = false;
        for (int i=0; i<arr.length-1; i++){
            if (arr[i]==arr[i+1]){
                dup= true;
                break;
            }
        }
        return dup;
    }

    public static void main(String[] args) {
        int[] array = {5,1,3,2,4,4};
        System.out.println(duplicates(array));
    }
}
