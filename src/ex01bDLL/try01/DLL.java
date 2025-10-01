package ex01bDLL.try01;

public class DLL {
    NodeD root;

    void add(int value){
        if (root == null) {
            root = new NodeD(value);
        } else {
            NodeD current = root;
            while (current.next != null) {
                current = current.next;
            }
            NodeD newNode = new NodeD(value);
            current.next = newNode;
            newNode.prev = current;
        }
    }
    void addFirst(int value){
        NodeD newNode = new NodeD(value);
        if (root == null) {
            root = newNode;
        } else {
            newNode.next = root;
            root.prev = newNode;
            root = newNode;
        }
    }
    void addLast(int value){
        NodeD newNode = new NodeD(value);
        // empty List
        if (root == null){
            root = newNode;
        } else {
            NodeD current = root;
            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

    void remove(int value){
        // empty list
        if (root == null) return;
        // value in root
        if (root.value == value){
            root = root.next;
            if (root != null) root.prev = null;
            return;
        }
        // search deeper
        NodeD current = root;
        while (current != null){
            if (current.value == value){
                if (current.prev != null){
                    current.prev.next = current.next;
                }
                if (current.next != null){
                    current.next.prev = current.prev;
                }
                return;
            }
            current = current.next;
        }

        System.out.printf("Could not remove %d. Value not found.\n", value);
    }

    boolean isEmpty(){
        return root == null;
    }

    int[] toArray(){
        int size = 0;
        NodeD current = root;
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
        NodeD current = root;
        while (current != null){
            if (current.value == value) return true;
            current = current.next;
        }
        return false;
    }


}
