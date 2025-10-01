package ex01bDLL.try01;

public class DLL {
    NodeD root;
    NodeD tail;

    void add(int value){
        if (root == null) {
            root = new NodeD(value);
            tail = root;
        } else {
            NodeD current = root;
            while (current.next != null) {
                current = current.next;
            }
            NodeD newNode = new NodeD(value);
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        }
    }
    void addFirst(int value){
        NodeD newNode = new NodeD(value);
        if (root == null) {
            root = newNode;
            tail = newNode;
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
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    void remove(int value){
        // empty list
        if (root == null) return;

        // value on external node
        if (root.value == value){
            removeFirst(); return;
        }
        if (tail.value == value){
            removeLast(); return;
        }

        // value in the middle
        NodeD current = root.next;
        while (current != null){
            if (current.value == value){
                current.prev.next = current.next;
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                return;
            }
            current = current.next;
        }
        System.out.printf("Could not remove %d. Value not found.\n", value);
    }

    void removeFirst(){
        // empty List
        if (root == null) return;
        // 1 node
        if (root == tail){
            root = null; tail = null; return;
        }
        // >1 nodes
        root = root.next;
        root.prev = null;
    }

    void removeLast(){
        // empty List
        if (tail == null) return;
        // single node
        if (root == tail){
            root = null;
            tail = null;
            return;
        }
        // >1 nodes
        tail = tail.prev;
        tail.next = null;
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

    int getFirst(){
        if (root == null){
            throw new IllegalStateException("List is empty");
        }
        return root.value;
    }

    int getLast(){
        if (tail == null){
            throw new IllegalStateException("List is empty");
        }
        return tail.value;
    }

}
