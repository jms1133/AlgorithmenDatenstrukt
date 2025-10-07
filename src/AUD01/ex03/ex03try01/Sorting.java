package AUD01.ex03.ex03try01;

import java.util.Arrays;

public class Sorting {

    // 3a Selection Sort
    public static int[] selectionSort(int[] array){
        System.out.println("");
        System.out.println(Arrays.toString(array));
        System.out.println("Selection Sort:");
        int[] arr = array.clone();

        for (int i=0; i<arr.length-1;i++){
            int min_idx = i;
            for (int j=i; j<arr.length;j++){
                if (arr[j]<arr[min_idx]){
                    min_idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }

    // Bubble Sort
    public static int[] bubbleSort(int[] array){
        System.out.println("");
        System.out.println(Arrays.toString(array));
        System.out.println("Bubble Sort:");
        int[] arr = array.clone();
        int n =arr.length;
        boolean swapped;
        for (int i=0; i<n-1; i++){
            swapped = false;
            for (int j=0; j<n-i-1; j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                    System.out.println(Arrays.toString(arr));
                }
            }
            if (!swapped) break;
        }
        return arr;
    }

    static int[] insertionSort(int[] array){
        System.out.println("");
        System.out.println(Arrays.toString(array));
        System.out.println("Insertion Sort:");
        int[] arr = array.clone();
        int n = arr.length;
        for (int i=1; i<n; i++){
            int key = arr[i];
            int j = i-1;

            while (j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] ex03a = {2,4,5,1,8,6};
        int[] ex03b = {8,6,4,3,9,8};


/*        System.out.println("ex03a selectionSort");
        selectionSort(ex03a);

        System.out.println("ex03b selectionSort");
        selectionSort(ex03b);*/

        selectionSort(ex03a);
        // bubbleSort(ex03a);
        // insertionSort(ex03a);

    }
}
