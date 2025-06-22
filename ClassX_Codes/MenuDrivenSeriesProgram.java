import java.util.*;
class prpject_8
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int ch,n1=0,n2=1,n3=2,n4,i=0,sum=0,count=10,m,n;
        System.out.println("Press 1 print first 10 numbers of fibonacci series");
        System.out.println("Press 2 find the sum of digits");
        System.out.print("Press 3 to print the tribonacci series");
        System.out.println("Enter your choice");
        ch=sc.nextInt();
        switch (ch)
        {
            case 1: 
            System.out.println(n1);
            System.out.println(n2);
            for(i=2;i<count;++i)
            {
                n4=n1+n2;    
                System.out.println(n4);    
                n1=n2;    
                n2=n4;    
            }    
            break;
            case 2:
            Scanner s = new Scanner(System.in);
            System.out.print("Enter the number:");
            m = s.nextInt();
            while(m > 0)
            {
               n = m % 10;
               sum = sum + n;
               m = m / 10;
            }   
            System.out.println("Sum of Digits: "+sum);
            break;
            case 3: 
            System.out.println(n1);
            System.out.println(n2);
            System.out.println(n3);
            for(i=3;i<count;++i)
            {    
                n4=n1+n2+n3;    
                System.out.println(n4);    
                n1=n2;    
                n2=n3;
                n3=n4;
            }    
            break;
            default :
            System.out.print("Invalid choice");
            break;
        }
    }
}
