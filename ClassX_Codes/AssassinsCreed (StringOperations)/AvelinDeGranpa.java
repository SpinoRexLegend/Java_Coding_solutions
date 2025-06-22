package AssassinsCreed;
import java.util.*;
class AvelinDeGranpa
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s[]=new String[5];
        int i=0;
        char ch;
        int l;
        int v=0;
        for(i=0;i<5;i++)
        {
           s[i]=sc.next();
           l=s[i].length();
           for (int j=0;j<=l;j++)
           {
               ch=s[i].charAt(i);
               if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
               v++;
            }
           if(v==2)
           System.out.print(s[i]);
        }
    }
}
