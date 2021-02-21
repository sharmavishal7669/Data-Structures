package linkedList.singlyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insertAtFirst(10);
        sll.display();
        sll.insertAtFirst(20);
        sll.display();
        sll.insertAtFirst(30);
        sll.display();
        sll.getLength();
        sll.insertAtLast(40);
        sll.display();
        sll.insertAtLast(50);
        sll.display();
        sll.getLength();
        sll.insertAtPos(3,60);
        sll.display();
        sll.insertAtPos(2,70);
        sll.display();
        sll.insertAtPos(7,80);
        sll.display();
        sll.getLength();
        sll.insertAtPos(1,90);
        sll.display();
        sll.insertAtPos(10,100);
        sll.display();
        sll.insertAtPos(12,110);
        sll.getLength();
        sll.deleteFirst();
        sll.display();
        sll.deleteLast();
        sll.display();
        sll.getLength();
        sll.deleteFromPos(3);
        sll.display();
        sll.deleteFromPos(2);
        sll.display();
        sll.getLength();
    }
}
