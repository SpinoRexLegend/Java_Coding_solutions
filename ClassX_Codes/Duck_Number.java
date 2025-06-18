import java.util.*;
class c6usp15
{
    public static void main ()
    {
        Scanner sc=new Scanner (System.in);
        int a,i,f=0;
        System.out.println("Enter the number");
        a=sc.nextInt();
        while (a>0)
        {
          i=a%10;
          if (i==0||a==0)
          {
            f=f+1;
          }
          a=a/10;
         }
         if (f>0)
         System.out.println("duck number");
         else
         System.out.println("not duck number");
        }
    }
    