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

        if (head != null) {
            newNode.next = head;
        }
        head = newNode;

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

    public void deleteFirst()
    {
        if(head == null)
            System.out.println("Oops! Your list is empty.");
        else
        {
            head = head.next;
            length--;
        }
    }

    public void deleteLast()
    {
        if(head == null)
            System.out.println("Oops! Your list is empty.");
        else if(head.next == null)
        {
            head = null;

            length--;
        }
        else
        {
            ListNode current = head;

            while(current.next.next != null)
                current = current.next;

            current.next = null;

            length--;
        }
    }

    public void deleteFromPos(int pos)
    {
        if(pos < 1 || pos > length)
        {
            System.out.println("Oops! You're trying to delete from invalid position. Please review your list below and try again.");
            display();
        }
        else if(pos == 1)
        {
            deleteFirst();
        }
        else if(pos == length)
        {
            deleteLast();
        }
        else
        {
            ListNode current = head;

            int pointer = 1;
            while(pointer < pos-1)
            {
                current = current.next;
                pointer++;
            }

            current.next = current.next.next;

            length--;
        }
    }

    public void deleteData(int data)
    {
        if(head == null)
            System.out.println("Oops! You're trying to delete from an empty list.");
        else
        {
            ListNode current = head;
            ListNode prev = null;
            if(current.data == data) {
                head = head.next;
                length--;
            }
            else {
                int flag = 0;
                while (current != null) {
                    if (current.data == data) {
                        prev.next = current.next;
                        flag = 1;
                        length--;
                        break;
                    }
                    else {
                        prev = current;
                        current = current.next;
                    }
                }
                if(flag == 0)
                    System.out.println("Oops! You have entered an invalid key.");
            }
        }
    }

    public void clearList()
    {
        head = null;
        length = 0;
    }

    public void getNthNodeFromEnd(int n)
    {
        if(head == null)
            System.out.println("Your list is Empty!!");
        else if(n<=1 || n>length)
        {
            System.out.println("You have entered an invalid position. Please review your list!");
            display();
        }
        else
        {
            ListNode mainPtr = head;
            ListNode current = head;
            int count = 0;
            while(count < n)
            {
                current = current.next;
                count++;
            }
            while(current != null)
            {
                mainPtr = mainPtr.next;
                current = current.next;
            }

            System.out.println(n + " node from last is : " + mainPtr.data);
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
