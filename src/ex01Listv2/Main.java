package ex01Listv2;

import java.util.Arrays;
import java.util.List;

class ListNode{
    int value;
    ListNode next;

    public ListNode(int value){
        this.value = value;
        next = null;
    }
}

public class Main {
    public static void main(String[] args) {
        // empty List
        SLL sll = new SLL();
        System.out.println("Is list empty? " + sll.isEmpty());
        sll.add(1);
        sll.add(2);
        sll.add(3);
        System.out.println("Is list empty? " + sll.isEmpty());
        System.out.println(Arrays.toString(sll.toArray()));
        int digit = 3;
        System.out.printf("Contains: %d? %b\n", digit, sll.contains(digit));
        sll.remove(4);
    }
}
