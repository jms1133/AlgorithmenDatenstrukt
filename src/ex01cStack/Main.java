package ex01cStack;

import java.util.Arrays;

class Node {
    int value;
    Node next;
}

public class Main {
    public static void main(String[] args) {
        Stack st = new Stack();
        System.out.println(st.isEmpty());
        st.push(0);
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st.isEmpty());
        System.out.println(Arrays.toString(st.toArray()));
        System.out.println(st.pop());
        System.out.println(Arrays.toString(st.toArray()));
        System.out.println(st.pop());
        System.out.println(Arrays.toString(st.toArray()));
        System.out.println(st.pop());
        System.out.println(Arrays.toString(st.toArray()));
        System.out.println(st.pop());
        System.out.println(Arrays.toString(st.toArray()));

    }
}
