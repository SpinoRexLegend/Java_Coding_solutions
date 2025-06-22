package AssassinsCreed;
import java.util.*;
class AltairIbnLaahad
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
            if (m[i]%3==0||m[i]%5==0)
            tt=tt+m[i];
            else if(m[i]%3==0&&m[i]%5==0)
            tt=tt+m[i];
        }
        System.out.println("Desired output in "+tt);
    }
}
