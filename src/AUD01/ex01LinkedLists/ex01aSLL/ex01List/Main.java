package AUD01.ex01LinkedLists.ex01aSLL.ex01List;

import java.util.Arrays;

class ListNode {
    int value;
    ListNode next;

    ListNode(int value){
        this.value = value; this.next = null;
    }

    public ListNode(int value, ListNode next){
        this.value = value; this.next = next;
    }
    void setValue(int value) {
        this.value = value;
    }
}

public class Main {
    public static void main(String[] args) {
        SLL sll = new SLL();
        sll.add(0);
        sll.add(1);
        sll.add(2);
        sll.add(3);
        int rem = 2;
        sll.remove(rem);
        int[] arr = sll.toArray();
        int cont = 3;
        /*ListNode current = sll.root;
        while (current != null){
            System.out.println(current.value + "");
            current = current.next;
        }
        for (int n : arr){
            System.out.println(n + "");
        }*/
        System.out.println("Is the list empty? " + sll.isEmpty());
        System.out.println("Value removed: " + rem);
        System.out.println("Array: " +  Arrays.toString(arr));
        System.out.printf("Contains %d: %b\n",cont, sll.contains(cont));
    }
}
