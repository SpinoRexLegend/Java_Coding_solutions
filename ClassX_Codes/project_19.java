import java.util.*;
import java.math.*;
class project_19
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,d,e,f,g,h=0,i=0;
        while (true)
        {
            System.out.println("1.to print the sum of series");
            System.out.println("2.series");
            System.out.println("3.exit");
            System.out.println("enter the choice");
            a=sc.nextInt();
            switch (a)
            {
                case 1:
                    int x = 2;
                    double term,sum = 0;
                    for (i=1; i<=20; i++)
                    {
                        if (i%2==0)
                        {
                            term = - Math.pow(x,i);
                        }
                        else
                        {
                            term = Math.pow(x,i);
                        }
                        sum = sum + term;
                    }   
                    System.out.println (sum);                
                    break;
                case 2:
                    System.out.print("Enter n: ");
                    int n = sc.nextInt();
                    for ( i = 1; i <= n; i++)
                    {
                        for (int j = 1; j <= i; j++)
                        {
                            if (j % 2 == 1)
                            {
                                System.out.print("1 ");
                            }
                            else
                            {
                                System.out.print("1 ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    i=1;
                    break;
                default:
                    System.out.println("Invalid entry");
            }
            if (i==1)
               break;
        }
    }
}