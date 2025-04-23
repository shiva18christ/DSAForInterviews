import java.util.Stack;

public class ValidString {
    public boolean isValid(String string) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (stack.isEmpty()) {
                return false;
            } else {
                char top = stack.pop();
                if ((ch == ')' && top != '(')
                        || (ch == '}' && top != '{')
                        || (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidString valid = new ValidString();
        String s = "[{()}]";
        String f = "[}[";
        System.out.println(valid.isValid(s));
    }
}
