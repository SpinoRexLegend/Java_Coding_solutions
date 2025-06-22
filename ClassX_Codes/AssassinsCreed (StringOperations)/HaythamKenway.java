//To find the maximum and minimum among user input array of 10 elements
package AssassinsCreed;
import java.util.*;
class HaythamKenway
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int e[]=new int[10];
        int i;
        int min=0,max=0;
        for(i=0;i<10;i++)
        {
            e[i]=sc.nextInt();
            min=e[0];
            if(max<e[i])
            max=e[i];
            if(min>e[i])
            min=e[i];
        }
        System.out.println("The minimum character is "+min+" and maximum character is "+max);
    }
}
