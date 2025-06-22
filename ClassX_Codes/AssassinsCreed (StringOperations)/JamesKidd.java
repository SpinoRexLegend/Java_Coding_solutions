package AssassinsCreed;
import java.util.*;
class JamesKidd
 {
    public static void main()
     {
        Scanner sc=new Scanner(System.in);
        String str="",st1=" ",st2=" ";
        int i;
        char chr;
        str=sc.nextLine();
        for(i=0;i<str.length();i++)
        {
            chr=str.charAt(i);
            if(Character.isLetter(chr)&&chr==' ')
            {
                System.out.println("invalid");
                System.exit(0);
            }
            if(chr==' ')
            {
                st1=st1.length()>st2.length()?st1:st2;
                st2=" ";
            }
            st2+=chr;
        }
        System.out.println("Longest word is "+st1+" with length "+st1.length());    
     }
 }
                