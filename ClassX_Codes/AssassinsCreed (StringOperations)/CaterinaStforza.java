package AssassinsCreed;
import java.util.*;
class CaterinaStforza
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String sx=sc.nextLine();
        int l=sx.length();
        char ch;
        int i;
        for(i=0;i<l;i++)
        {
            ch=sx.charAt(i);
            if(Character.isWhitespace(ch)==false)
            {
                if(Character.isDigit(ch)==false)
                {
                    if(Character.isLetter(ch)==true)
                    {
                        if(Character.isUpperCase(ch)==true)
                        System.out.print(Character.toLowerCase(ch));
                        else
                        System.out.print(Character.toUpperCase(ch));
                    }
                }
            }
        }
    }
}

                    