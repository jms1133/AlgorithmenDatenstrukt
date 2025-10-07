package AUD02.ex02cSearch;

public class ex02c {
    //H.A.
    static int searchL(int[] arr, int element){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == element) return i;
        }
        return -1;
    }

    static int search(int[] arr, int element){
        return recursiveSearchHelper(arr, element, 0);
    }

    private static int recursiveSearchHelper(int[] arr, int element, int i) {
        if (arr[i] == element) return i;
        if (i == arr.length-1) return -1;

        return recursiveSearchHelper(arr, element, i+1);
    }

    public static void main(String[] args) {
        int[] data = { 5, 10, 15, 20, 25 };

        System.out.println("Search for 15: " + search(data, 15)); // Output: 2
        System.out.println("Search for 25: " + search(data, 25)); // Output: 4
        System.out.println("Search for 8: " + search(data, 8));   // Output: -1
    }

}
