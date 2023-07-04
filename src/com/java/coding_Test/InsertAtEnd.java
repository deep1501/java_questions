package com.java.coding_Test;

public class InsertAtEnd {
    public static void main(String[] args) {
        InsertAtEnd lt = new InsertAtEnd();

        lt.insertAtEnd(10);
        lt.insertAtEnd(35);
        lt.insertAtEnd(40);
        lt.display();
    }
Node head;
    class Node{
        int data;
        Node next;
        Node(int x)
        {
            data = x;
            next = null;
        }
    }

    public void insertAtEnd(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head = newNode;
            System.out.println(newNode.data + " inserted");
            return;
        }
        Node temp = head;
        while(temp.next!=null)
            temp = temp.next;
        temp.next = newNode;
        System.out.println(newNode.data + " inserted");
    }
    public void display()
    {
        System.out.println();
        Node node = head;
        while(node!=null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
}


