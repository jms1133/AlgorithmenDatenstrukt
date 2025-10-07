package AUD02.ex01aHanoi;

public class ex02c {
    //H.A.
    int search(int[] arr, int element){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == element) return i;
        }
        return -1;
    }

}
