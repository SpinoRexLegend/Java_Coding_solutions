//All source code of chapter 6 question 16
import java.util.*;
class c6usp16
{
    public static void c6usp16a ()
    {
      Scanner sc = new Scanner(System.in);
      int a=9,b=99,s=0,n,c;
      System.out.println("Enter the range");
      n=sc.nextInt();
      for(int i=1;i<n;i++)
       {
         c=a+b;
         s=s+c;
         a=a-1;
         b=b-10;
       }
      System.out.println("value is ="+s);
    }
    public static void c6usp16b()
    {
     Scanner sc = new Scanner(System.in);
     int a=0;
     int b=1;
     int s=0;
     int c=0;
     int i,n;
     s=s+a+b;
     System.out.print("enter the value of n");
     n=sc.nextInt();
     for(i=3;i<=n;i++)
     {
         c=a+b;
         System.out.println(c+" ");        
         a=b;
         b=c;
         s=s+c;
      }
     System.out.println("the value is "+s);
    }
    public static void c6usp16c()
    {
        Scanner sc = new Scanner(System.in);
        int i, n, s=0;
        System.out.print("enter the value of n");
        n=sc.nextInt();
        for(i=2;i<=n;i=i+2)
         {
           if (i%4==0)
            s=s+i;
            else
            s=s-i;
            System.out.println("The sum is"+s);
         }
    }
    public static void c6usp16d()
    {
        Scanner sc = new Scanner(System.in);
        int i,j;
        int c=1;
        for (i=1;i<=19;i++)
        {
            j=2;
            c=i*j;
            j++;
        }
         System.out.println("The sum is" +c);
    }
    public static void c6usp16e()
     {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the range ");
          int n = sc.nextInt();
          int sum = 0, i = 0;
          for (int j = 1; j <= n; j++) 
           {
           for (i = 1; i <= j; i++) 
             {
               sum = sum + i;
              }
           i = 1;
            }
          System.out.println("Sum of series = " + sum);
    }
    public static void c6usp16f()
    {
      Scanner sc = new Scanner(System.in);
      double sum = 0; 
      int n;
      System.out.println("Enter the range ");
      n = sc.nextInt();
      for (int i = 1; i <= n; i++) 
      { 
           if (i % 2 == 1)
           { 
            sum += (double)i / (i + 1); 
            } 
        else 
            { 
               sum -= (double)i / (i + 1); 
            } 
     } 
      System.out.print(sum +"\n"); 
    } 
     public static void c6usp16g()
    {
        Scanner sc = new Scanner(System.in);
        int i,fact=1,x=1;  
         int n;   
         int sum=0;
         System.out.println("enter the range");  
         n = sc.nextInt();
         while (x<=n)
         {
             fact=1;
                   for(i=1;i<=x;i++)
          {    
            fact=fact*i;    
          }    
          System.out.println(fact);
           sum=sum+fact;
           x++;
        }
          System.out.println("sum of Factorial "+sum);    
         
    }
    public static void c6usp16h()
     {
        Scanner sc = new Scanner(System.in);
        int n;
        int sum = 0; 
        System.out.println("Enter the range ");
        n = sc.nextInt();
        for (int i = 1 ; i <= n ; i++) 
        {
            for (int j = 1 ; j <= i ; j++) 
            {
                sum += j; 
               
                }
            }      
        System.out.println("Sum of series is : "+sum);  
      }
      public static void  c6usp16j()
     {
        Scanner sc = new Scanner(System.in);
        int i,d=1,x=2,n=1;  
         int a;   
         double sum=0;
         System.out.println("enter the range");  
         a = sc.nextInt();
         while (x<=a+1)
         {
             d=1;
             n=0;
                   for(i=1;i<=x;i++)
          {    
            d=d*i;
            n=n+i;
          }    
          System.out.println((double)n/d);
           sum=sum+(double)n/d;
           x++;
        }
          System.out.println("sum of series "+sum);    
         
        }
        
}
     
