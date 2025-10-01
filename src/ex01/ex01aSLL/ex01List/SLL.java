package ex01.ex01aSLL.ex01List;

public class SLL {
    private ListNode root;

    public SLL(){
        this.root = null;
    }
    public void add(int value){
        if (root == null){
            root = new ListNode(value);
        } else {
            ListNode current = root;
            while(current.next != null){
                current = current.next;
            }
            current.next = new ListNode(value);
        }
    }

    public void remove(int value){
        // empty list
        if(root == null) return;
        // value at root
        if(root.value==value) {
            root = root.next;
            return;
        }
        // digging for value
        ListNode current = root;
        while (current.next != null){
            if (current.next.value == value) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
        System.out.println("Value not found.");
    }

    public boolean contains(int value){
        ListNode current = root;
        while (current != null){
            if (current.value == value) return true;
            current = current.next;
        }
        return false;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public int[] toArray(){
        int size = 0;
        ListNode current = root;
        while (current != null){
            size++;
            current = current.next;
        }
        int[] result = new int[size];
        current = root;
        for (int i=0; i<size; i++){
            result[i] = current.value;
            current = current.next;
        }
        return result;
    }
}
