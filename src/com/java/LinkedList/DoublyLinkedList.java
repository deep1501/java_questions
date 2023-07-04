package com.java.LinkedList;

public class DoublyLinkedList {
    private Node head;
    public DoublyLinkedList() {
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next=head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        head=node;
    }

    public void display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("End");
    }

    public void displayReverse(){
        Node temp =head;
        Node last =null;
        while (temp!=null){
            System.out.print(temp.value+"->");
            last=temp;
            temp=temp.next;
        }
        System.out.println("End");
        while(last!=null){
            System.out.print(last.value+"->");
            last=last.prev;
        }
        System.out.println("start");
    }

    public void insertLast(int value){
        Node node = new Node(value);
        Node temp=head;
        if(head==null){
            head=node;
            node.prev=null;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        node.prev=temp;
        node.next=null;
    }

    public Node findNode(int value){
        Node temp=head;
        while(temp!=null){
            if(temp.value==value){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }

    public void insertAtIndex(int value, int after){
        Node p = findNode(after);
        if(p==null){
            System.out.println("doesn't exists");
            return;
        }
        Node node = new Node(50);
        node.next=p.next;
        p.next=node;
        node.prev=p;
        if(node.next!=null){
            node.next.prev=node;
        }
    }

    class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
