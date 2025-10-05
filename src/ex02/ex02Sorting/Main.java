package ex02.ex02Sorting;

import java.util.Arrays;

public class Main {

    static int kleast(int[] array, int k){
        if (k<1 || k > array.length){
            throw new IllegalArgumentException("k out of range");
        }
        Arrays.sort(array);
        return array[k-1];
    }

    public static void main(String[] args) {
        int[] array = {5,1,3,2,4};
        System.out.println(kleast(array, 3));
    }
}
