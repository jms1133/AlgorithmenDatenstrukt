package AUD01.ex01.ex01dQueue;

public class Queue {
    Node head, tail;

    // enqueue
    void offer(int value){
        Node newNode = new Node();
        newNode.value = value;

        if (tail == null) {
            tail = newNode;
            head = tail;
            return;
        }
        newNode.prev = tail;
        tail = newNode;
        head = tail;
    }

    // dequeue
    Node poll(){
        int res = head.value;
        Node i = head.next;
        head = i;
        if (i == null) tail = null;
        return i;

    }

    int[] toArray(){
        int size = 0;
        Node current = head;
        while (current != null){
            size++;
            current = current.next;
        }
        int[] result = new int[size];
        current = head;
        int i = 0;
        while (current != null){
            result[i++] = current.value;
            current = current.next;
        }
        return result;
    }
}
