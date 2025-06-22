package AssassinsCreed;
import java.util.*;
class EdwardKenway
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int m[]=new int[10];
        int i;
        int tt,f=0;
        for (i=0;i<10;i++)
        {
            System.out.println("Enter the number in the cells");
            m[i]=sc.nextInt();
        }
        System.out.println("Enter the number to be found");
        tt=sc.nextInt();
        for(i=0;i<10;i++)
        {
            if(m[i]==tt)
            {
                f=1;
                break;
            }
        }
        if (f==1)
        System.out.println("Is there");
        else
        System.out.println("Not there");
    }
}
