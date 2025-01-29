import java.util.*;
public class LL
{
    private Node head;
    private int length;

    class Node
    {
        double value;
        Node next;
        public Node(double value)
        {
            this.value = value;
        }
    }

    public LL(double value)
    {
        Node newNode = new Node(value);
        length = 1;
        head = newNode;
    }

    public int getLength()
    {
       return length;
    }

    public Node getHead()
    {
        return head;
    }

    public void printLL() {
        Node temp = head;
        while (temp != null)
        {
            System.out.println("The value is "+temp.value);
            temp = temp.next;

        }
    }

    public void printAll()
    {
        System.out.println("The head node is : "+head.value);
        System.out.println("The length is : "+length);
        if(length != 0)
            printLL();
    }

    public void append (double value)
    {
        Node newNode = new Node(value);
        if (head == null)
        {
            head = newNode;
        }
        else
        {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        length++;
    }

    public boolean sort()
    {
        if(head == null) return false;
        Node temp = head;
        Node after = temp.next;
        Node before = new Node(0);
        before.next = temp;
        head = before;
        for(int i = 0; i <= length; i++)
        {
            while (after != null)
            {
                if (temp.value <= after.value)
                {
                    before = temp;
                    temp = after;
                    after = after.next;
                }
                else
                {
                    temp.next = after.next;
                    before.next = after;
                    after.next = temp;

                    before = after;
                    after = temp.next;

                }
            }
            before = head;
            temp = before.next;
            after = temp.next;
        }
        head = head.next;
        before.next = null;
        return true;
    }



    /*public boolean partitionList (int x)
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        if(head == null) return false;
        Node temp = head;
        while(temp != null)
        {
            if (temp.value < x) arr.add(temp.value);
            temp = temp.next;
        }
        temp = head;
        while(temp != null)
        {
            if (temp.value >= x) arr.add(temp.value);
            temp = temp.next;
        }
        makeVoid();
        for (int i = 0; i < arr.size(); i++)
        {
            append(arr.get(i));
        }
        return true;
    }*/

    //Contingency plan
    void makeVoid()
    {
        head = null;
        length = 0;
    }
}
