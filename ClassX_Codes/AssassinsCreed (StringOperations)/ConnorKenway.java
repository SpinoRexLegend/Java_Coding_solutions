package AssassinsCreed;
import java.util.*;
class ConnorKenway
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int m[]=new int[10];
        int i;
        int f=0,tt;
        for (i=0;i<10;i++)
        {
            System.out.println("Enter the number in the cells");
            m[i]=sc.nextInt();
        }
        System.out.println("Enter the number to be found");
        tt=sc.nextInt();
        int lm=0,up=9;
        int mp1=(0+9)/2;
        for (i=0;i<10;i++)
        {
            if(i<lm)
            {
                for(int j=0;j<lm;j++)
                {
                    if(m[j]==tt)
                    {
                        f=1;
                        break;
                    }
                }
            }
            else
            {
                for(int j=9;j>lm;j--)
                {
                    if(m[j]==tt)
                    {
                        f=1;
                        break;
                    }
                }
            }
        }
        if(f==1)
        System.out.println("Is there");
        else
        System.out.println("Not there");
    }
}

            