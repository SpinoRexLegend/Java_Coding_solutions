package AssassinsCreed;
import java.util.*;
class CleopatraVII
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        s=sc.nextLine();
        int l=s.length();
        int i;
        char ch;
        int fd=0,fs=0,fc=0,fv=0;
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(Character.isDigit(ch)==true)
            fd++;
            if(Character.isWhitespace(ch)==true)
            fs++;
            if(Character.isLetter(ch)==true)
            {
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                fv++;
                else
                fc++;;
            }
         } 
        System.out.println("No. of digits "+fd+" spaces "+fs+" consonants "+fc+" vowels "+fv);
    }
}
