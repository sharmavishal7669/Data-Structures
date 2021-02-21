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

    public void insertAtPos(int pos, int data)
    {
        if(pos < 1 || pos >length+1)
        {
            System.out.println("Oops! You're trying to insert at invalid position. Please review your list below and try again.");
            display();
        }
        else if(pos == 1)
        {
            insertAtFirst(data);
        }
        else if(pos == length+1)
        {
            insertAtLast(data);
        }
        else
        {
            ListNode newNode = new ListNode(data);
            ListNode current = head;
            ListNode currentNext = current.next;

            int pointer = 1;
            while(pointer < pos-1)
            {
                current = current.next;
                currentNext = current.next;
                pointer++;
            }


            current.next = newNode;
            newNode.next = currentNext;

            length++;
        }
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
