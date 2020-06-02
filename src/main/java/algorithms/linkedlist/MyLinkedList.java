package algorithms.linkedlist;

import java.util.StringJoiner;

public class MyLinkedList {


   static class Node {
       final int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node(int data) {
            this.data = data;
        }
    }
    Node head = null;

    public void prepend(int new_data) {
        Node node = new Node(new_data);
        node.next = head;
        head = node;
    }

    public void prepend1(int new_data) {
        head = new Node(new_data).next;
    }

    public void append(int new_data) {
        Node node = new Node(new_data);
        if (head == null) {
            head = node;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next=node;
        }
    }

    public void insertAfter(int position,int new_data){        //start from 1 not 0
        Node node=new Node(new_data);
        Node curr=head;
        while (position>1){
            curr=curr.next;
            position--;
        }
        node.next=curr.next;
        curr.next=node;
    }

    public void insertBefore(int position,int new_data){
       insertAfter( position-1, new_data);
    }


    public boolean containsData(int dataİn){
        Node curr=head;
        while (curr!=null){
           if(curr.data==dataİn) return true;
           curr=curr.next;
        }
        return false;
    }

    public void deleteWithValue(int data){
        if(head==null) return;
        if (head.data==data){
            head=head.next;
            return;
        }
        Node curr=head;
        while (curr.next!=null){
            if (curr.next.data==data){
                curr.next=curr.next.next;
                return;
            }
            curr=curr.next;
        }
    }

    public void deleteWithPosition(int position) {
        if (head==null) return;
        if (position==0){
           head= head.next;
           return;
        }
        Node curr=head;
        while (position>1){
            curr=curr.next;
            position--;
        }
        curr.next=curr.next.next;
        return;
    }

    public  int length(){
        Node curr=head;
        int count=0;
        while (curr!=null){
            curr=curr.next;
            count++;
        }
        return count;
    }
    String represent(){
        StringJoiner stringJoiner=new StringJoiner(",","(",")");
        Node curr=head;
        while (curr!=null){
            stringJoiner.add(String.valueOf(curr.data));
            curr=curr.next;
        }
        return stringJoiner.toString();
    }

}
