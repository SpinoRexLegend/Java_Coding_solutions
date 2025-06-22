
package AssassinsCreed;
import java.util.*;
class AchillesDavenport
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("Enter the sentence");
        s=sc.nextLine();
        String st=" "+s;
        int l=st.length();
        int i;
        char ch,chomu;
        String str=" ";
        String sm=" ";
        for(i=l;i>=0;i++)
        {
            ch=st.charAt(i);
            if(i==' ')
            {
             sm=st.substring(0,i-1);
             break;
            }
            else
            str=str+ch;
        }
        String sml=str.trim();
        String sl=" "+sml;
        for(i=0;i<l;i++)
        {
            chomu=sl.charAt(i);
            if(chomu==' ')
            System.out.print(sm.charAt(i+1)+".");
        }
        System.out.print(str);
    }
}

        