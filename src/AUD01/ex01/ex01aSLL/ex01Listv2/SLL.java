package AUD01.ex01.ex01aSLL.ex01Listv2;

public class SLL {
    ListNode root;

    void add(int value){
        if (root == null){
            root = new ListNode(value);
        } else {
            ListNode current = root;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new ListNode(value);
        }
    }

    boolean isEmpty(){
        return root == null;
    }

    int[] toArray(){
        int size = 0;
        ListNode current = root;
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

    boolean contains(int value){
        ListNode current = root;
        while (current != null){
            if(current.value == value) return true;
            current = current.next;
        }
        return false;
    }

    void remove(int value){
        //empty list
        if (root == null) return;
        //value in root
        if (root.value == value) root = root.next;
        //dig for value
        ListNode current = root;
        while (current.next != null){
            if(current.next.value == value) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
        System.out.printf("Could not remove %d. Value not found.\n", value);
    }



}
