package AssassinsCreed;
import java.util.*;
class NiccoloMachiavelli
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String cap[]=new String[10];
        String count[]=new String[10];
        int i;
        String tt;
        for (i=0;i<10;i++)
        {
            System.out.println("Enter country and capital");
            count[i]=sc.nextLine();
            cap[i]=sc.nextLine();
        }
        System.out.println("Enter the countries name whose capital is to be found");
        tt=sc.nextLine();
        for(i=0;i<10;i++)
        {
            if(count[i].equalsIgnoreCase(tt)==true)
            {
                System.out.println("Is there; country is "+count[i]+" capital is "+cap[i]);
                break;
            }
        }
    }
}
