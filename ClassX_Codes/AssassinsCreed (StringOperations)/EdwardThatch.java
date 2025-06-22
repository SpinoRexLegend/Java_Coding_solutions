package AssassinsCreed;
import java.util.*;
class EdwardThatch
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        long m[]=new long[10];
        String name[]=new String[10];
        int i;
        String tt;
        int f=0;
        for (i=0;i<10;i++)
        {
            System.out.println("Enter the name and phn number");
            name[i]=sc.nextLine();
            m[i]=sc.nextLong();
        }
        System.out.println("Enter the name whose number is to be found");
        tt=sc.nextLine();
        for(i=0;i<10;i++)
        {
            if(name[i]==tt)
            {
                System.out.println("Is there; name is "+name[i]+" phn number is "+m[i]);
                break;
            }
        }
    }
}
