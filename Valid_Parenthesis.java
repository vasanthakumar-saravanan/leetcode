import java.util.*;
public class Valid_Parenthesis{
    private static boolean is_parenthesis(char c, char t){
        return (t=='(' &&  c==')')||(t == '{'&& c=='}')||(t== '[' && c==']');
    }
    private static boolean Is_valid(String s){
        Stack<Character> stack = new Stack<>();
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if(!stack.isEmpty()){
                char t =stack.peek();
                if(is_parenthesis(c,t)){
                    stack.pop();
                    continue;
                }
            }
                stack.push(c);            
        }
        return stack.isEmpty();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(Is_valid(s));
        sc.close();
    }
}
// Automation Test