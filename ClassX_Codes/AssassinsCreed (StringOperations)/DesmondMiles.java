package AssassinsCreed;
import java.util.*;
class DesmondMiles
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String password;
        System.out.println("Enter thy password");
        password=sc.nextLine();
        int l=password.length();
        int i;int f=0,s=0;
        if((l>4)&&(l<16))
        {
            for(i=0;i<l;i++)
            {
                char ch=password.charAt(i);
                if (Character.isWhitespace(ch)==true)
                {
                    s++;
                }
                else if(Character.isLetterOrDigit(ch)==false)
                {
                    f++;
                }
                else
                    f=f;
            }
        }
        else
        System.out.println("Exceeding the number of digits");
        if(s!=0)
            System.out.println("Invalid; space included");
        if(f!=0)
            System.out.println("Invalid; special digit included");
        if(f==0&&s==0)
            System.out.println("Grazie! password set");
    }
}
    