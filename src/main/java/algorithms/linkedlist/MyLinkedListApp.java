package algorithms.linkedlist;

public class MyLinkedListApp {
    public static void main(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.append(5);
        myLinkedList.prepend(1);
        myLinkedList.prepend(2);
        myLinkedList.prepend(7);
        myLinkedList.insertBefore(4,77);   //I just use insertAfter (with position-1)
        myLinkedList.prepend(9);
        myLinkedList.insertAfter(4,45);
        System.out.println(myLinkedList.represent());
        System.out.println(myLinkedList.containsData(77));
        myLinkedList.deleteWithPosition(5);
        System.out.println(myLinkedList.represent());
        System.out.println(myLinkedList.length());
    }
}
