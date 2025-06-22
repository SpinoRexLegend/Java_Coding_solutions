import java.util.*;
class c6usp24
{
    void main()
     {
         Scanner sc=new Scanner (System.in);
         int a,c,i,x=0,fa=0,fact=1;
         System.out.println("enter the number");
         a=sc.nextInt();
         while (a>0)
         {
             c=a%10;
             fa=fact;
             for(i=1;i<=a;i++)
             {    
                 fact=fact*i;    
              }    
             a=a/10;
             x=fact+fa;
           }
          if (a==x)
          System.out.println("special number");
          else
          System.out.println("not a special number");
        }
    }
    