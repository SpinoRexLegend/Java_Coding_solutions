import java.util.*;
class c6usp11
{
public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int r1, r2, n, num1, num2, c = 0;
        System.out.println("Enter number");
        n = sc.nextInt();
        num1 = n;
        num2 = n;
        while (num1 > 0)
        {
            r1 = num1 % 10;
            while (num2 > 0)
            {
                r2 = num2 % 10;
                if (r1 == r2)
                {
                    c++;
                }
                num2 = num2 / 10;
            }
            num1 = num1 / 10;
        }
        if (c == 1)
        {
            System.out.println("Unique Number");
        }
        else
        {
            System.out.println("Not Unique Number");
        }
    }
}