package AssassinsCreed;
import java.util.*;
class ShaunSomething
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String m[]=new String[10];
        int i,j,l;
        char ch;
        String word="";
        for (i=0;i<10;i++)
        {
            System.out.println("Enter thy nameth");
            m[i]=sc.nextLine();
            l=m[i].length();
            for(j=l-1;j>=0;j--)
            {
                ch=m[i].charAt(j);
                word=word+ch;
            }
            System.out.println("The reversed name is "+word);
        }
    }
}
