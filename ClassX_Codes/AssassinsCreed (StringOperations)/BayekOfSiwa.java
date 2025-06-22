package AssassinsCreed;
import java.util.*;
class BayekOfSiwa
{
    public static void main()
    {
        Scanner sc=new Scanner (System.in);
        String st;
        st=sc.nextLine();
        st=st.trim();
        int l=st.length();
        int i;
        char ch;
        for(i=0;i<l;i++)
        {
            ch=st.charAt(i);
            if(ch==' ')
            {
                System.out.println(st.charAt(0)+"."+st.indexOf(i,l));
                break;
            }
        }
    }
}
// I hope the logic is correct but the program is showing incorrect outtput.