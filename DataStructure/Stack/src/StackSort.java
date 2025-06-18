<<<<<<< HEAD
import java.util.*;
public class StackSort
{
    ArrayList<Integer> stack = new ArrayList<Integer>();
    public boolean sortStack()
    {
        int len = stack.size() - 1;
        int temp;
        System.out.println(len);
        if(len == -1) return false;
        for (int i = 0; i < stack.size(); i++)
        {
            while(len >= 1)
            {
                if(stack.get(len) > stack.get(len -1))
                {
                    temp = stack.get(len-1);
                    stack.remove(len-1);
                    stack.add(temp);
                    //System.out.println("Coming here");
                }
                len--;
            }
            len = stack.size()-1;
        }
        return true;
    }
    public void print()
    {
        int i = stack.size() -1;
        while(!stack.isEmpty())
        {
            System.out.println("The Node is: "+ stack.get(i));
            stack.remove(i);
            i--;
        }
    }

    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        StackSort stack = new StackSort();
        stack.stack.add(5);
        stack.stack.add(0);
        stack.stack.add(1);
        stack.stack.add(8);
        stack.stack.add(7);
        stack.stack.add(7);
        stack.stack.add(10);
        stack.stack.add(3);
        System.out.println();
        System.out.println(stack.sortStack());
        stack.print();
    }
}
=======
import java.util.*;
public class StackSort
{
    ArrayList<Integer> stack = new ArrayList<Integer>();
    public boolean sortStack()
    {
        int len = stack.size() - 1;
        int temp;
        System.out.println(len);
        if(len == -1) return false;
        for (int i = 0; i < stack.size(); i++)
        {
            while(len >= 1)
            {
                if(stack.get(len) > stack.get(len -1))
                {
                    temp = stack.get(len-1);
                    stack.remove(len-1);
                    stack.add(temp);
                    //System.out.println("Coming here");
                }
                len--;
            }
            len = stack.size()-1;
        }
        return true;
    }
    public void print()
    {
        int i = stack.size() -1;
        while(!stack.isEmpty())
        {
            System.out.println("The Node is: "+ stack.get(i));
            stack.remove(i);
            i--;
        }
    }

    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        StackSort stack = new StackSort();
        stack.stack.add(5);
        stack.stack.add(0);
        stack.stack.add(1);
        stack.stack.add(8);
        stack.stack.add(7);
        stack.stack.add(7);
        stack.stack.add(10);
        stack.stack.add(3);
        System.out.println();
        System.out.println(stack.sortStack());
        stack.print();
    }
}
>>>>>>> 2d316a7af7ea333feb890f3525fe3ed7dfd848d5
