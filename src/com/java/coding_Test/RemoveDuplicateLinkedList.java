package com.java.coding_Test;

public class RemoveDuplicateLinkedList {
    public Node head;
    class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        if(head==null){
            head=node;
            return;
        }
        node.next=head;
        head=node;
    }

    public void removeDuplicate() {
        Node curr = head;
        while (curr != null) {
            Node temp = curr;
            while (temp != null && temp.val == curr.val) {
                temp = temp.next;
            }
            curr.next = temp;
            curr = curr.next;
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

    public static void main(String[] args) {
        RemoveDuplicateLinkedList ll = new RemoveDuplicateLinkedList();
        ll.insertFirst(12);
        ll.insertFirst(12);
        ll.insertFirst(14);
        ll.insertFirst(14);
        ll.insertFirst(13);
        ll.insertFirst(13);
        ll.display();
        ll.removeDuplicate();
        ll.display();
    }
}
