package AUD02.ex01aHanoi;

public class Hanoi {

    static void hanoi(int n){
        hanoi(n, 1, 3);
    }

    static void hanoi(int n, int start, int end) {
        if (n == 1) {
            pm(start, end);
        } else {
            int other = 6 - (start + end);
            hanoi(n-1, start,other);
            pm(start, end);
            hanoi(n-1, other, end);
        }
    }

    private static void pm(int start, int end) {
        System.out.printf("%d -> %d\n", start, end);
    }

    public static void main(String[] args) {
        hanoi(3);
    }

}
