package AssassinsCreed;
import java.util.*;
class AlMualim
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
       int l=str.length();
        str += " "; 
       String word = "", lWord = "";
       int len = str.length();
       for (int i = 0; i < len; i++) 
       {
           char ch = str.charAt(i);
           if (ch == ' ')
           {
               if (word.length() > lWord.length())
                    lWord = word;
               word = "";
           }
           else 
           {
               word += ch;
           }
        }
       System.out.println("The longest word: " + lWord + ": The length of the word: " + lWord.length());
    }
    
}