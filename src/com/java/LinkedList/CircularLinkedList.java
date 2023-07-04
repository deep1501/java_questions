package com.java.LinkedList;

public class CircularLinkedList {

    private Node head;
    private Node tail;
    public CircularLinkedList() {
        this.head=null;
        this.tail=null;
    }
    public void insert(int value){
        Node node = new Node(value);
        if(head==null){
            head=node;
            tail=node;
            return;
        }
        node.next=head;
        tail.next=node;
        tail=node;
    }
    public void display(){
        Node temp = head;
        if(head!=null){
            do {
                System.out.print(temp.value+"->");
                temp=temp.next;
            }while (temp!=head);
        }
        System.out.println("Head");
    }

    public void delete(int val){
        Node temp = head;
        if(temp.value==val){
            head=head.next;
            tail.next=head;
            return;
        }
        do{
            Node n = temp.next;
            if(n.value==val){
                temp.next=n.next;
                break;
            }
        }while (temp!=head);
    }
    class Node{
        int value;
        Node next;
        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
