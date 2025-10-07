package AUD02.ex01aHanoi;

public class Hanoi {
    // rekursiv: strukturen zu verstehen
    void hanoi(int numOfDiscs){
        solve(numOfDiscs, 1, 2,3);
    }

    void solve(int n, int from, int mid, int to){
        if (n==1) {
            move(from, to);
        } else {
            solve(n-1, from, to, mid);
            move(from, to);
            solve(n-1, mid, to, from);
        }

    }

    void move(int from, int to){

    }

    public static void main(String[] args) {

    }
}
