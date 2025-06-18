import java.util.*;
class c6usp12
{
 public static void main()
{
Scanner sc=new Scanner (System.in);
int a,c,sum=0,prod=1;
System.out.println("enter the number");
a=sc.nextInt();
while (a>0)
{
    c=a%10;
    sum=sum+c;
    prod=prod*c;
    a=a/10;
}
if (sum==prod)
System.out.println("sum product number");
else
System.out.println("not a sum product number");
}
}
