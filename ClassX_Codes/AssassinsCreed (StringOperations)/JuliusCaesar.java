package AssassinsCreed;
import java.util.*;
class JuliusCaesar
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String st;
        System.out.println("Enter thy first name");
        st=sc.next();
        char ch,ch1,ch2;
        int i;
        int l;
        l=st.length();
        int n;
        char c;
        if(l%2!=0)
         {
            n=(l+1)/2;
            
        }
        else
        {
            n=l/2;
            
        }
        for(i=0;i<l;i++)
         {
            c=st.charAt(i);
            if(c!=ch||c!=ch1||c!=ch2)
            System.out.print(c);
        }
    }
}
