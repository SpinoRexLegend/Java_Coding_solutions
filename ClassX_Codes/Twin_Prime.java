import java.util.*;
class c6usp14
{
    public static void main()
    {
        Scanner sc=new Scanner (System.in);
        int a,a1,n,n1,c=0,c1=0,diff;
        System.out.println("Enter the number");
        n=sc.nextInt();
        n1=sc.nextInt();
        for (a=1;a<=n;a++)
             {
            if(n%a==0)
            c=c+1;
              } 
        for (a1=1;a1<=n1;a1++)
         {
            if(n1%a1==0)
            c1=c1+1;
         } 
        
        if (c==2 && c1==2)
        {
             diff=n-n1;
            if ((diff==2)||(diff==-2))
            System.out.println("twin prime");
            else
            System.out.println("not twin prime");
            
        }
        else
        System.out.println("one or two numbers are not prime");
}
}
