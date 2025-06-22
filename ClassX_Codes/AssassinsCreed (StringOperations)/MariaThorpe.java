package AssassinsCreed;
import java.util.*;
class MariaThorpe
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char ch[]=new char[20];
        int i;
        int fd=0,fc=0;
        for(i=0;i<20;i++)
        {
            ch[i]=sc.next().charAt(0);
            if(Character.isDigit(ch[i])==true)
            {
                fd++;
            }
            if(Character.isLetter(ch[i])==true)
            {
                if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
                {
                    continue;
                }
                else
                fc++;
            }
        }
        System.out.println("No. of digits "+fd+" and number of consonants are "+fc);
    }
}

            