import java.util.*;
class binary_to_decimal
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        long n;
        int c=0;
        double d=0,r;
        System.out.println("Enter the number");
        n=sc.nextLong();
        while(n!=0)
        {
            r=n%10;
            d=d+r*Math.pow(2,c);
            n=n/10;
            c=c+1;
        }
        System.out.println("The decimal equivalent is "+(int)d);
    }
}
