package com.java.LinkedList;

public class DLLMain {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertFirst(10);
        dll.insertFirst(12);
        dll.insertFirst(14);
        dll.insertFirst(16);
        dll.insertLast(20);
        dll.insertAtIndex(50,12);
        dll.display();
//        dll.displayReverse();
    }
}
