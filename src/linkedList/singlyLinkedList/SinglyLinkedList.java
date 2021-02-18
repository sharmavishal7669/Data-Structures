package linkedList.singlyLinkedList;

public class SinglyLinkedList {
    private ListNode head;
    private static int length = 0;

    public SinglyLinkedList()
    {
        this.head = null;
    }

    public void insertAtFirst(int data)
    {
        ListNode newNode = new ListNode(data);

        if(head == null)
        {
            head = newNode;
        }
        else
        {
            newNode.next = head;
            head = newNode;
        }

        length++;
    }

    public void display()
    {
        ListNode current = head;
        while(current!=null)
        {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
