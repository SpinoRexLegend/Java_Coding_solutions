package AssassinsCreed;
import java.util.*;
class AnneBonnie
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String sx=sc.next();
        String st=sx+" ",sf=" ";
        int i, l=st.length();
        char ch,c;
        for(i=0;i<=l;i++)
        {
            ch=st.charAt(i);
            c=Character.toLowerCase(ch);
            sf=sf+c;
            if(c==' ')
            {
                if(st.charAt(0)==st.charAt(i-1))
                System.out.println("special word");
            }
        }
        System.out.println("In lower case "+sf);
    }
}
