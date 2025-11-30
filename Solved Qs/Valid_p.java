//Valid parenthesis: every open bracket must have a closed bracket
import java.util.*;
public class Valid_p {
    public static boolean isValid(String s){
        Stack<Character> stack=new Stack<Character>();
        for(char c : s.toCharArray()){
            if(c=='(')
            stack.push(')');
            else if(c=='{')
            stack.push('}');
            else if(c=='[')
            stack.push(']');
            else if(stack.isEmpty()||stack.pop()!=c) 
            return false;
        }
        return stack.isEmpty();

    }
    public static void main(String[] args) {
        String s="({})[]{}[]{{{{}}}}[]";
        boolean isValid = isValid(s);
        System.out.println("the parenthesis is valid or not?????? the answer is "+isValid);
    }
}
