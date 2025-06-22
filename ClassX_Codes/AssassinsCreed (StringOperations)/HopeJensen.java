package AssassinsCreed;
import java.util.*;
class HopeJensen
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        int i,l;
        int a,b;
        char ch;
        l=st.length();
        for(i=0;i<=l;i++)
        {
            ch=st.charAt(i);
            a=(int)ch;
            if(a>=65 && a<=90)
            System.out.print((char)(i+32));
            else
            System.out.print(ch);
        }
    }
}
