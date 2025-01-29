import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        LL linkedlist = new LL(0);
        double sgpa = 5.0;
        Scanner sc = new Scanner(System.in);
        char ch = ' ';
        do
        {
            System.out.print("Enter scgpa: ");
            sgpa = sc.nextDouble();
            linkedlist.append(sgpa);
        } while(sgpa != 0);

        linkedlist.printAll();
        System.out.println(linkedlist.sort());
        linkedlist.printAll(); 

    }
}