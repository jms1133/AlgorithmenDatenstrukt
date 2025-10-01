package ex01.ex01dQueue;

import java.util.Arrays;

class Node{
    Node next, prev;
    int value;
}

public class Main {
    public static void main(String[] args) {
        Queue qu = new Queue();
        qu.offer(0);
        qu.offer(1);
        qu.offer(2);
        qu.offer(3);
        System.out.println(Arrays.toString(qu.toArray()));

    }
}
