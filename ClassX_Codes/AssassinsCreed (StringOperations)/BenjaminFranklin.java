package AssassinsCreed;
import java.util.*;
class BenjaminFranklin
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int k[]=new int[10];
        int i;
        int sum=0;
        for(i=0;i<10;i++)
        {
            k[i]=sc.nextInt();
            if(k[i]%3==0 && k[i]%5==0)
            sum=sum+k[i];
        }
        System.out.println("The sum is "+sum);
    }
}
