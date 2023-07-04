package com.java.coding_Test;

public class ReverseLinkedList {
    static Node head;
    static class Node {
        int data;
        Node next;
        Node(int x)
        {
            data = x;
            next = null;
        }
    }
    static void push(int data)
    {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }
    static Node reverse(Node head)
    {
        if (head == null || head.next == null)
            return head;
        Node rest = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return rest;
    }
    static void display()
    {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        push(87);
        push(65);
        push(15);

        System.out.println("Given linked list");
        display();
        head = reverse(head);
        System.out.println("Reversed linked list");
        display();
    }
}
