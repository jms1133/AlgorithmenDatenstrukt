package AUD01.ex01.ex01bDLL.try01;

import java.util.Arrays;

class NodeD {
    int value;
    NodeD prev, next;

    NodeD(int value){
        this.value = value;
    }

}

public class Main {
    public static void main(String[] args) {

        DLL dll = new DLL();
        System.out.println("Is list empty? " + dll.isEmpty());

        dll.add(1);
        dll.add(2);
        dll.add(3);
        dll.add(4);

        System.out.println("Is list empty? " + dll.isEmpty());
        System.out.println(Arrays.toString(dll.toArray()));
        int digit = 5;
        System.out.printf("Contains: %d? %b\n", digit, dll.contains(digit));
        dll.remove(3);
        System.out.println(Arrays.toString(dll.toArray()));
        dll.addLast(5);
        dll.addFirst(-1);
        System.out.println(Arrays.toString(dll.toArray()));
        dll.removeFirst();
        dll.removeLast();
        System.out.println(Arrays.toString(dll.toArray()));
        System.out.println(dll.getFirst());

    }
}
