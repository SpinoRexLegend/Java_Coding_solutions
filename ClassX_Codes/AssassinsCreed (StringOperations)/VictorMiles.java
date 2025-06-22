package AssassinsCreed;
import java.util.*;
class VictorMiles
{
    public void antiracist()
    {
        Scanner sc=new Scanner(System.in);
        String st;
        st=sc.nextLine();
        st=" "+st;
        int p=st.lastIndexOf(" ");
         String sn=st.substring(p);
         int i;
         char ch;
         String st1=" ";
         for (i=0; i<p;i++)
         {
             ch=st.charAt(i);
             if(ch==' ')
             {
                 st1=st1+st.charAt(i+1)+' ';
                }
            }
         String st2=st1+sn;
         System.out.println(st2);
        }
    public void Racist()
    {
        Scanner sc=new Scanner(System.in);
        //Scanner sc=new Scanner(System.in);
        String st;
        st=sc.nextLine();
        st=" "+st;
        int p=st.lastIndexOf(" ");
        int l=st.length();
        String st2=st.substring(p,l);
        String st3=st.substring(0,p);
        String st4=st2+" "+st3;
        System.out.print(st4);
    }
}
    