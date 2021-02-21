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

    public void insertAtLast(int data)
    {
        ListNode newNode = new ListNode(data);

        if(head == null)
        {
            head = newNode;
        }
        else
        {
            ListNode current = head;

            while(current.next != null)
                current = current.next;

            current.next = newNode;
        }

        length++;
    }

    public void getLength()
    {
        System.out.println("Length : "+length);
    }

    public void display()
    {
        ListNode current = head;
        while(current != null)
        {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
