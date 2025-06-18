import java.util.*;
public class Stacks
{
    ArrayList<Character> stack = new ArrayList<Character>();
    public boolean checkParenthesis (String parenthesis)
    {
        for (int i = parenthesis.length() - 1; i >= 0; i--)
        {
            stack.add(parenthesis.charAt(i));
        }

        int nOpen = 0, nClose = 0;
        int len;

        while(stack.size() != 1)
        {
            len = stack.size() - 1;

            if(stack.get(len) == '(')
                nOpen++;
            if(stack.get(len) == ')')
                nClose++;
            stack.remove(len);

            if(nOpen < nClose) return false;
        }
        return true;
    }
}
