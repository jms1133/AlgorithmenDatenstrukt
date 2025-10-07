package AUD01.ex01.ex01cStack;

public class Stack {
    Node root;

    // add
    void push(int value){
        Node newNode = new Node();
        newNode.value = value;
        if (root == null) {
            root = newNode;
        } else {
            newNode.next = root;
            root = newNode;
        }
    }

    // remove
    int pop(){
        if (root == null) {
            throw new IllegalStateException("List is empty.");
        }
        int toPop = root.value;
        root = root.next;
        return toPop;
    }

    boolean isEmpty(){
        return root == null;
    }

    int[] toArray(){
        int size = 0;
        Node current = root;
        while (current != null){
            size++;
            current = current.next;
        }
        int[] result = new int[size];
        current = root;
        int i = 0;
        while (current != null){
            result[i++] = current.value;
            current = current.next;
        }
        return result;
    }
}
