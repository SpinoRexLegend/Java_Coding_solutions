package AssassinsCreed;
import java.util.*;
class GeorgeWashington
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        double m[]=new double[10];
        int i;
        double tt=0;
        for (i=0;i<10;i++)
        {
            System.out.println("Enter the weight of a student");
            m[i]=sc.nextDouble();
            tt=(tt+m[i]);
        }
        tt=tt/10;
        System.out.println("Average weight is "+tt);
        for(i=0;i<10;i++)
        {
           if(m[i]>tt)
            System.out.println(m[i]);
        }
    }
}
