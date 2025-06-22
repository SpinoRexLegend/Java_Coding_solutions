import java.util.*;
class project_18
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int v=0;
        int m,n;
        System.out.println("Enter the 2 numbers");
        n=sc.nextInt();
        m=sc.nextInt();
        int k=Math.min(n,m);
        for(int a=1;a<=k;a++)
        {
            if(n%a==0&&m%a==0)
            {
                v++;
            }
        }
        if(v==1)
        {
            System.out.println("co-prime number");
        }   
        else
        {
            System.out.println("Not a co-prime number");
        }
    }
}
