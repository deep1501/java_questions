package com.java.LinkedList;

public class CLLMain {
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.insert(10);
        cll.insert(12);
        cll.insert(14);
        cll.insert(16);
        cll.delete(12);
        cll.display();
    }
}
