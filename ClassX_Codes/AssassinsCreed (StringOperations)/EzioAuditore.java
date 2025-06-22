package AssassinsCreed;
import java.util.*;
class EzioAuditore
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int m[]=new int[10];
        int i;
        int tt=0;
        for (i=0;i<10;i++)
        {
            System.out.println("Enter the number in the cells");
            m[i]=sc.nextInt();
        }
        int max=0,min=0;
        for(i=0;i<10;i++)
        {
            if(max<m[i])
            max=m[i];
            min=m[0];
            if(min>m[i])
            min=m[i];
        }
        System.out.println("maximum element is "+max);
        System.out.println("minimum element is "+min);
    }
}
