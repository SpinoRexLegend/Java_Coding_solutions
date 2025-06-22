package AssassinsCreed;
import java.util.*;
class RichardTheLionHeart
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String city[]=new String[10];
        int uid[]=new int[10];
        int i,f=0,j;
        for(i=0,j=0;i<10;i++,j++)
        {
            System.out.println("Enter name of the city ");
            city[j]=sc.nextLine();
            System.out.println("the uid number ");
            uid[i]=sc.nextInt();
        }
        String citsear;
        System.out.println("Enter the city name u want to find");
        citsear=sc.nextLine();
        for (i=0;i<10;i++)
        {
            if(city[i].equalsIgnoreCase(citsear)==true)
            f++;
            if(f!=0)
            {
                System.out.println("Is present, city name is "+citsear+" UID is "+uid);
                break;
            }
        }
    }
}

        