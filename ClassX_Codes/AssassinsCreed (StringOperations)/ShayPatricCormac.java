package AssassinsCreed;
import java.util.*;
class ShayPatricCormac
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int m[]=new int[10];
        int i;
        int f=0;
        for (i=0;i<10;i++)
        {
            System.out.println(" number");
            m[i]=sc.nextInt();
        }
        f=sc.nextInt();
        for (i=0;i<10;i++)
        {
         if(f==m[i])
          {
            System.out.println("Fount it noggin");
           }
        }
        System.out.println("Not found ");
    }
}       