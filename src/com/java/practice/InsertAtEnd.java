package com.java.practice;

public class InsertAtEnd {
    public static void main(String[] args) {
//        List<Integer> num= Arrays.asList(12,14,54);
//        insert();
        InsertAtEnd ll = new InsertAtEnd();
        ll.insertAtEnd(23);
        ll.insertAtEnd(24);
        ll.insertAtEnd(25);
        ll.display();
    }

    public Node head;

    class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next=null;
        }

    }
    public void insertAtEnd(int val){
        Node node = new Node(val);
        if(head==null){
            head=node;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
            temp.next=node;
        }
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("End");
    }
}
