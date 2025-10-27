package AUD02.ex01aHanoi;

public class ex02c {
    //H.A.
    static int search1(int[] array, int element){
        for (int i = 0; i < array.length; i++){
            if (array[i] == element) return i;
        }
        return -1;
    }
    static int searchR(int[] arr, int element){
        return searchR(arr, element, 0);
    }

    private static int searchR(int[] arr, int element, int idx) {
        if (arr[idx] == element) return idx;
        if (idx == arr.length-1) return -1;
        return searchR(arr, element, idx + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(search1(arr, 5));
    }

}
